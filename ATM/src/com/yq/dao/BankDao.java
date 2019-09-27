package com.yq.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.yq.entity.BankInfo;
public class BankDao extends BaseDao {
	public int regist(BankInfo user){
		String sql="insert into userinfo values(0,'"+user.getAccountid()+"','"+user.getUsername()+"','"+user.getPassword()+"',now(),'"+user.getAge()+"','"+user.getBanlence()+"')";
		return super.update(sql);
	}
	public boolean login(BankInfo bank){
		String sql="select * from userinfo where accountid='"+bank.getAccountid()+"' and password='"+bank.getPassword()+"'";
		ResultSet rs=super.query(sql);
		try {
			if(rs.next())
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			super.close();
		}
		return false;
	}
	
	public double find(String accountid){
		String sql="select banlence from userinfo where accountid='"+accountid+"'";
	    ResultSet rs=super.query(sql);
	    Double num=0.0;
	    	try {
	    		if(rs.next()){
				 num =  rs.getDouble("banlence");
	    		}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	    	return num;
	    }
	
	public int update(BankInfo bank){
		int j=0;
		if(find(bank.getAccountid())-bank.getBanlence()>0){
			String sql="update userinfo set banlence='"+find(bank.getAccountid())+"-"+bank.getBanlence()+"' where accountid='" +bank.getAccountid()+"'";
			j=super.update(sql);
			return j;
		}
		return 	j;
	}
	
	public double add(BankInfo bank){
		int j=0;
		String sql="update userinfo set banlence='"+find(bank.getAccountid())+"-"+bank.getBanlence()+"' where accountid='" +bank.getAccountid()+"'";
		j=super.update(sql);
		return j;	
	}
}
