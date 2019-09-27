package com.yq.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BaseDao {
	private Connection conn=null;
	private Statement stmt=null;
	private ResultSet rs=null;
	//初始化数据库连接，并创建Statement对象
	private void init(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/myatm","root","1234");
			stmt=conn.createStatement();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("数据库连接失败！");
		}
	}
	//增删改
	public int update(String sql){
		try {
			this.init();
			return stmt.executeUpdate(sql);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}finally{
			this.close();
		}
	}
	//查询
	public ResultSet query(String sql){
		try {
			this.init();
			rs=stmt.executeQuery(sql);
			return rs;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	//关闭资源
	public void close(){
		try {
			if(rs!=null)
				rs.close();
			if(stmt!=null)
				stmt.close();
			if(conn!=null)
				conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
