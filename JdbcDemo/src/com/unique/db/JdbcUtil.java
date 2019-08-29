/**
 * @filename JdbcConnect.java
 * @author lg
 * @date 2019年3月18日 上午9:16:05
 * @version 1.0
 * Copyright (C) 2019 
 */

package com.unique.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
	
	public static Connection getMysqlConnection(){
        Connection conn=null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获得连接
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/auth_info?useUnicode=true&characterEncoding=utf8","root","root");
        } catch (Exception e) {
           e.printStackTrace();
        }
        return conn;
    }
	
        public static Connection getOracleConnection(){
             Connection conn=null;
             try {
                 //1.注册驱动
                 Class.forName("oracle.jdbc.driver.OracleDriver");
                 //2.获得连接
                 conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
            } catch (Exception e) {
                e.printStackTrace();
             }
             return conn;
         }
         
         public static void close(Connection con,Statement st,ResultSet rs){
             if(rs!=null){
                 try {
                     rs.close();
                 } catch (SQLException e) {
                     e.printStackTrace();
                 }
             }
             if(st!=null){
                 try {
                     st.close();
                 } catch (SQLException e) {
                     e.printStackTrace();
                 }
             }
             if(con!=null){
                 try {
                     con.close();
                 } catch (SQLException e) {
                     e.printStackTrace();
                 }
            }        
         }
}
