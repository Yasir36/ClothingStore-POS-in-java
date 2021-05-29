/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csp.dao;

import com.csp.model.EmployeeBean;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface EmployeeDao {
    public List<EmployeeBean> getAllEmployees();
    public EmployeeBean getEmployee(String username);
    public int getEmployeeID(String username);    
    public boolean checkEmployeeCredentials(String username,String password);
    public int addEmployee(EmployeeBean eb);
    public int updateEmployee(EmployeeBean eb);
    public int removeEmployee(int emp_id);
}
