/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jdbc;
import java.sql.*;
import com.mycompany.jdbc.jdbc;

/**
 *
 * @author Андрей
 */
public class main {
    public static void main(String[] args) {
        try{
        jdbc test = new jdbc();
        test.usrAndMsg();
        System.out.println("Number of users: " +test.count());
        //System.out.println("Top ten: "+test.topTen("Desc"));
        //System.out.println("Top ten: "+test.topTen("Asc"));
        System.out.println("Auth: "+test.auth("BigStan", "1234"));
        test.setMessage("New message");
       
        }
        catch (SQLException e)
        {
        System.out.println(e);
        }
        
    }
}
