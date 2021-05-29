/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csp.dao;

import com.csp.model.PurchaseLogBean;
import java.util.Stack;

/**
 *
 * @author Lenovo
 */
    public interface PurchaseLogDAO {
    public Stack<PurchaseLogBean> getAllLogs();
    public PurchaseLogBean getLog(int id);
    public int addLog(PurchaseLogBean logBean);
    public int updateLog(PurchaseLogBean logBean);
    public int removeLog(int id);
}
