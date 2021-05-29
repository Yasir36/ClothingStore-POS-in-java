/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csp.model;

/**
 *
 * @author Lenovo
 */
public class PurchaseLogBean {
    private int logID;
    private int empID;
    private String dateSold;
    private String itemsSold;
    private int cashRecieved;
    private int cashBack;

    /**
     * @return the logID
     */
    public int getLogID() {
        return logID;
    }

    /**
     * @param logID the logID to set
     */
    public void setLogID(int logID) {
        this.logID = logID;
    }

    /**
     * @return the dateSold
     */
    public String getDateSold() {
        return dateSold;
    }

    /**
     * @param dateSold the dateSold to set
     */
    public void setDateSold(String dateSold) {
        this.dateSold = dateSold;
    }

    /**
     * @return the itemsSold
     */
    public String getItemsSold() {
        return itemsSold;
    }

    /**
     * @param itemsSold the itemsSold to set
     */
    public void setItemsSold(String itemsSold) {
        this.itemsSold = itemsSold;
    }

    /**
     * @return the cashRecieved
     */
    public int getCashRecieved() {
        return cashRecieved;
    }

    /**
     * @param cashRecieved the cashRecieved to set
     */
    public void setCashRecieved(int cashRecieved) {
        this.cashRecieved = cashRecieved;
    }

    /**
     * @return the cashBack
     */
    public int getCashBack() {
        return cashBack;
    }

    /**
     * @param cashBack the cashBack to set
     */
    public void setCashBack(int cashBack) {
        this.cashBack = cashBack;
    }

    /**
     * @return the empID
     */
    public int getEmpID() {
        return empID;
    }

    /**
     * @param empID the empID to set
     */
    public void setEmpID(int empID) {
        this.empID = empID;
    }
}
