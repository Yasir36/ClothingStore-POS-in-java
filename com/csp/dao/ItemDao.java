/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csp.dao;

import com.csp.model.ItemBean;
import java.util.Stack;

/**
 *
 * @author Lenovo
 */
public interface ItemDao {
    public Stack<ItemBean> getAllItems();
    public ItemBean getItem(int id);
    public int updateItem(ItemBean ib);
    public int removeItem(int itemId);
    public int addItem(ItemBean ib);
}
