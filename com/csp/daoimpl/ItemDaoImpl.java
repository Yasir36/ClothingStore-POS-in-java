/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csp.daoimpl;

import com.csp.dao.ItemDao;
import com.csp.dbc.DBConnection;
import com.csp.model.ItemBean;
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
public class ItemDaoImpl implements ItemDao{

    private static Connection con = DBConnection.getConnection();
    
    @Override
    public Stack<ItemBean> getAllItems() {
        PreparedStatement pst;
        Stack<ItemBean> items = new Stack<>();
        ItemBean ib;
        try {
            pst = con.prepareStatement("SELECT * FROM item");
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                ib = new ItemBean();
                ib.setItemId(rs.getInt("item_id"));
                ib.setName(rs.getString("item_name"));
                ib.setCategory(rs.getString("category"));
                ib.setColor(rs.getString("item_color"));
                ib.setSize(rs.getString("item_size"));
                ib.setQuantity(rs.getInt("quantity"));
                ib.setPrice(rs.getInt("item_price"));
                items.push(ib);
            }
            return items;            
        } catch (SQLException ex) {
            Logger.getLogger(ItemDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return items;
    }

    @Override
    public int updateItem(ItemBean ib) {
        PreparedStatement pst;
        try{
            pst = con.prepareStatement("UPDATE item SET item_name=?,category=?,item_size=?,item_color=?,quantity=?,item_price=? WHERE item_id = ?");
            pst.setString(1,ib.getName());
            pst.setString(2,ib.getCategory());
            pst.setString(3,ib.getSize());
            pst.setString(4,ib.getColor());
            pst.setInt(5,ib.getQuantity());
            pst.setInt(6,ib.getPrice());
            pst.setInt(7,ib.getItemId());
            return pst.executeUpdate();
        }
        catch(SQLException e)
        {
            System.out.println("Exception in ItemDAOImpl/UpdateItem"+ e.getMessage());
        }
        return 0;
    }

    @Override
    public int removeItem(int itemId) {
        PreparedStatement pst;
        try{
            pst = con.prepareStatement("DELETE FROM item WHERE item_id = ?");
            pst.setInt(1,itemId);
            return pst.executeUpdate();
        }
        catch(SQLException e)
        {
            System.out.println("Exception in ItemDAOImpl/UpdateItem"+ e.getMessage());
        }
        return 0;
    }

    @Override
    public int addItem(ItemBean ib) {
        PreparedStatement pst;
        try{
            pst = con.prepareStatement("INSERT INTO item(item_name,category,item_size,item_color,quantity,item_price) VALUES(?,?,?,?,?,?)");
            pst.setString(1,ib.getName());
            pst.setString(2,ib.getCategory());
            pst.setString(3,ib.getSize());
            pst.setString(4,ib.getColor());
            pst.setInt(5,ib.getQuantity());
            pst.setInt(6,ib.getPrice());
            return pst.executeUpdate();            
        }
        catch(SQLException e)
        {
            System.out.println("Exception in ItemDAOImpl/AddItem"+ e.getMessage());
        }
        
        return 0;
    }

    @Override
    public ItemBean getItem(int id) {
        PreparedStatement pst;
        ItemBean ib;
        try {
            pst = con.prepareStatement("SELECT * FROM item WHERE item_id = ?");
            pst.setInt(1,id);
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                ib = new ItemBean();
                ib.setItemId(rs.getInt("item_id"));
                ib.setName(rs.getString("item_name"));
                ib.setCategory(rs.getString("category"));
                ib.setColor(rs.getString("item_color"));
                ib.setSize(rs.getString("item_size"));
                ib.setPrice(rs.getInt("item_price"));
                ib.setQuantity(rs.getInt("quantity"));
                return ib;
            }            
        } catch (SQLException ex) {
            Logger.getLogger(ItemDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
