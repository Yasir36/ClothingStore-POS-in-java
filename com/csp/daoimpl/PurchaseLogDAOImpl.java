/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csp.daoimpl;

import com.csp.dao.PurchaseLogDAO;
import com.csp.dbc.DBConnection;
import com.csp.model.PurchaseLogBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class PurchaseLogDAOImpl implements PurchaseLogDAO{
    
    private final Connection con = DBConnection.getConnection();
    
    @Override
    public Stack<PurchaseLogBean> getAllLogs() {
        Stack<PurchaseLogBean> logs = new Stack<>();
        PurchaseLogBean log;
        PreparedStatement pst;
        try {
            pst = con.prepareStatement("SELECT * FROM purchaselog");
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                log = new PurchaseLogBean();
                log.setLogID(rs.getInt("log_id"));
                log.setEmpID(rs.getInt("emp_id"));
                log.setDateSold(rs.getString("date_sold"));
                log.setItemsSold(rs.getString("items_sold"));
                log.setCashRecieved(rs.getInt("cash_recieved"));
                log.setCashBack(rs.getInt("cash_back"));
                logs.push(log);
            }
            return logs;
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseLogDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return logs;
    }

    @Override
    public PurchaseLogBean getLog(int id) {
        PurchaseLogBean log;
        PreparedStatement pst;
        try {
            pst = con.prepareStatement("SELECT * FROM purchaselog WHERE log_id = ?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                log = new PurchaseLogBean();
                log.setLogID(rs.getInt("log_id"));
                log.setEmpID(rs.getInt("emp_id"));
                log.setDateSold(rs.getString("date_sold"));
                log.setItemsSold(rs.getString("date_sold"));
                log.setCashRecieved(rs.getInt("date_sold"));
                log.setCashBack(rs.getInt("date_sold"));
                return log;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseLogDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public int addLog(PurchaseLogBean logBean) {
        PreparedStatement pst;
        try {
            pst = con.prepareStatement("INSERT INTO purchaselog(emp_id,date_sold,items_sold,cash_recieved,cash_back) VALUES(?,?,?,?,?)");
            pst.setInt(1, logBean.getEmpID());
            pst.setString(2, logBean.getDateSold());
            pst.setString(3, logBean.getItemsSold());
            pst.setInt(4, logBean.getCashRecieved());
            pst.setInt(5, logBean.getCashBack());
            return pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseLogDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int updateLog(PurchaseLogBean logBean) {
        PreparedStatement pst;
        try {
            pst = con.prepareStatement("UPDATE purchaselog SET emp_id=?,date_sold=?,items_sold=?,cash_recieved=?,cash_back=? WHERE log_id = ?");
            pst.setInt(1, logBean.getEmpID());
            pst.setString(2, logBean.getItemsSold());
            pst.setString(3, logBean.getDateSold());
            pst.setInt(4,logBean.getCashRecieved());
            pst.setInt(5, logBean.getCashBack());
            pst.setInt(6, logBean.getLogID());
            return pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseLogDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int removeLog(int id) {
        PreparedStatement pst;
        try {
            pst = con.prepareStatement("DELETE FROM purchaselog WHERE log_id = ?");
            pst.setInt(1, id);            
            return pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseLogDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }   
}