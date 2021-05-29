/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csp.daoimpl;

import com.csp.dbc.DBConnection;
import com.csp.model.EmployeeBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import com.csp.dao.EmployeeDao;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class EmployeeDaoImpl implements EmployeeDao{
    
    Connection con = DBConnection.getConnection();
    
    @Override
    public List<EmployeeBean> getAllEmployees() {
        EmployeeBean eb;
        List<EmployeeBean> emps = new ArrayList<>();
        PreparedStatement pst;
        try{
            pst = con.prepareStatement("SELECT emp_id,emp_username,emp_password,salary from employee WHERE emp_type = 'employee'");
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                eb = new EmployeeBean();
                eb.setId(rs.getInt("emp_id"));
                eb.setUsername(rs.getString("emp_username"));
                eb.setPassword(rs.getString("emp_password"));
                eb.setSalary(rs.getInt("salary"));
                emps.add(eb);
            }
            return emps;
        }
        catch(SQLException ex){
            System.out.println("Exception in EmployeeDaoImpl.getAllEmployees() "+ex.getMessage());
        }
        return emps;
    }
    ///have to change this to getEmployeeType
    @Override
    public EmployeeBean getEmployee(String username) {
        EmployeeBean ab = new EmployeeBean();
        PreparedStatement pst;
        try{
            pst = con.prepareStatement("SELECT emp_username,emp_type from employee WHERE emp_username = ?");
            pst.setString(1,username);
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                ab.setUsername(rs.getString("emp_username"));
                ab.setType(rs.getString("emp_type"));
                
            }
            return ab;
        }
        catch(SQLException ex){
            System.out.print("Exception in getAdmin \n"+ex.getMessage());
        }
        return ab;
    }

    @Override
    public boolean checkEmployeeCredentials(String username, String password) {
        PreparedStatement pst;
        try{
            pst = con.prepareStatement("SELECT * from employee WHERE emp_username = ? AND emp_password = ?");
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            return rs.next();
        }
        catch(SQLException ex){
            System.out.print("Exception in checkAdmin \n"+ex.getMessage());
        }
        return false;
    }

    @Override
    public int addEmployee(EmployeeBean eb) {
        PreparedStatement pst;
        
        try {
            pst = con.prepareStatement("INSERT INTO employee(emp_username,emp_password,salary,emp_type) VALUES(?,?,?,?)");
            pst.setString(1, eb.getUsername());
            pst.setString(2, eb.getPassword());
            pst.setInt(3, eb.getSalary());
            pst.setString(4, eb.getType());
            
            return pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int updateEmployee(EmployeeBean eb) {
        PreparedStatement pst;
        
        try {
            pst = con.prepareStatement("UPDATE employee SET emp_username=?,emp_password=?,salary=?,emp_type=? WHERE emp_id = ?");
            pst.setString(1, eb.getUsername());
            pst.setString(2, eb.getPassword());
            pst.setInt(3, eb.getSalary());
            pst.setString(4, eb.getType());
            pst.setInt(5,eb.getId());
            return pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return 0;
    }

    @Override
    public int removeEmployee(int emp_id) {
        PreparedStatement pst;
        try{
            pst = con.prepareStatement("DELETE FROM employee WHERE emp_id = ?");
            pst.setInt(1, emp_id);
            return pst.executeUpdate();
        }
        catch(SQLException ex){
            System.out.print("Exception in RemoveEmployee \n"+ex.getMessage());
        }
        return 0;
    }

    @Override
    public int getEmployeeID(String username) {
        PreparedStatement pst;
        
        try {
            pst = con.prepareStatement("SELECT emp_id FROM employee WHERE emp_username = ?");
            pst.setString(1, username);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
               return rs.getInt("emp_id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return -1;        
    }
    
    
}
