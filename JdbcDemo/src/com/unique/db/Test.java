/**
 * @filename Test.java
 * @author lg
 * @date 2019年3月18日 上午10:03:24
 * @version 1.0
 * Copyright (C) 2019 
 */

package com.unique.db;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class Test {
@org.junit.Test	
public void insert() {
	String sql="insert into role(role_name,role_desc) values('董事长','暂无')";
	System.out.println(DBcrud.baseSaveOrUpdate(sql));
	
}
@org.junit.Test	
public void add() {
	String sql="insert into role(role_name,role_desc) values(?,?)";
	System.out.println(DBcrud.saveOrUpdate(sql, new Object[]{"ceo","ceo"}));
}
@org.junit.Test	
public void delete() {
	String sql="delete from role where role_id=7";
	System.out.println(DBcrud.baseSaveOrUpdate(sql));
	
}
@org.junit.Test	
public void del() {
	String sql="delete from role where role_id=?";
	System.out.println(DBcrud.saveOrUpdate(sql, new Object[]{8}));
}

@org.junit.Test
public void find() throws SQLException {
	String sql="select *  from role";
	Connection con=JdbcUtil.getMysqlConnection();
	Statement st=null;
	ResultSet rs=null;
	 st=con.createStatement();
	 rs=st.executeQuery(sql);
	while(rs.next()){
		System.out.println(rs.getInt("role_id")+"："+rs.getString("role_name"));
	}
	JdbcUtil.close(con, st, rs);
	
	
}

@org.junit.Test
public void findAll() throws SQLException {
	String sql="select *  from role where role_name like ?";
	Connection con=null;
	PreparedStatement st=null;
	ResultSet rs=null;
		 con=JdbcUtil.getMysqlConnection();
		 st=con.prepareStatement(sql);
		 Object[]args= new Object[]{"%o%"};
		for (int i = 0; i < args.length; i++) {
			st.setObject(i+1,args[i]);
		}
		 rs=st.executeQuery();
	while(rs.next()){
		System.out.println(rs.getInt("role_id")+"："+rs.getString("role_name"));
	}
	JdbcUtil.close(con, st, rs);
}

public static void main(String[] args) throws IOException, SQLException {
	new Test().find();
	//new Test().add();
	
/*	int a[]={2,1,4,3,6,5,7,8,9};
	for (int i = 0; i < a.length-1; i++) {
		for (int j = 0; j < a.length-i-1; j++) {
			int temp=0;
			if(a[j]>a[j+1]){
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		
	}	
	for (int j = 0; j < a.length; j++) {
		System.out.println(a[j]);
	}*/
	
	

}
}
