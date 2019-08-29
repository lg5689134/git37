/**
 * @filename DBcrud.java
 * @author lg
 * @date 2019年3月18日 上午9:31:23
 * @version 1.0
 * Copyright (C) 2019 
 */

package com.unique.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBcrud {
	/**
	 * 添加、修改、删除
	 */
	public static int baseSaveOrUpdate(String sql) {
		Connection con=null;
		Statement st=null;
		try {
			 con=JdbcUtil.getMysqlConnection();
			 st=con.createStatement();
			return st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JdbcUtil.close(con, st, null);
		}
		return 0;
	}
	
   /**
    * 查询结果
    */
	public static ResultSet baseFind(String sql){
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			 con=JdbcUtil.getMysqlConnection();
			 st=con.createStatement();
			 rs=st.executeQuery(sql);
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	/**
	 * 预编译，添加、修改、删除
	 */
	public static int saveOrUpdate(String sql,Object[] args){
		Connection con=null;
		PreparedStatement st=null;
		try {
			 con=JdbcUtil.getMysqlConnection();
			 st=con.prepareStatement(sql);
			for (int i = 0; i < args.length; i++) {
				st.setObject(i+1,args[i]);
			}
			return st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JdbcUtil.close(con, st, null);
		}
		return 0;
	}
	
   /**
    * 预编译，查询结果
    */
	public static ResultSet find(String sql,Object[] args){
		Connection con=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		try {
			 con=JdbcUtil.getMysqlConnection();
			 st=con.prepareStatement(sql);
			for (int i = 0; i < args.length; i++) {
				st.setObject(i+1,args[i]);
			}
			 rs=st.executeQuery();
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JdbcUtil.close(con, st, rs);
		}
		return null;
	}
}
