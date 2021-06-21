package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import pojo.LoginInfo;
import util.DBUtil;

public class LoginDao {

	public static boolean isValidUser(LoginInfo loginDetails) 
	{
		boolean validUser = false;
		
		try {
			Connection conn=DBUtil.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from login_info where userName ='"+loginDetails.getUserName()+"' AND password ='"+loginDetails.getPassword()+"'");
			while (rs.next()) {
				validUser = true;
			}
			DBUtil.closeConnection(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return validUser;
	}
}
