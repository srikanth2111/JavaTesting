package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pojo.Order;
import util.DBUtil;

public class OrderManagementDao {
	
	
	public static List<Order> getAllOrders()
	{
		List<Order> orderList = new ArrayList<>();
		
		try {
			Connection conn=DBUtil.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from order_details ORDER BY order_id");
			while (rs.next()) {
				Order order = new Order(rs.getString("order_id"), rs.getString("order_name"), rs.getString("order_quality"), rs.getInt("order_price"));
				orderList.add(order);
				
			}
			DBUtil.closeConnection(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return orderList; 
	}
	
	public static int addOrder(Order order)
	{
		int status = 0;
		
		try {
			
			Connection conn = DBUtil.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(" insert into order_details values(?,?,?,?)");
			pstmt.setString(1, order.getOrderId());
			pstmt.setString(2, order.getOrderName());
			pstmt.setString(3, order.getOrderQuality());
			pstmt.setInt(4, order.getOrderPrice());
			status = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

	public static int updateOrder(Order order)
	{
		int updateStatus = 0;
		
		try {
			Connection conn = DBUtil.getConnection();
			PreparedStatement pstmt = conn.prepareStatement("update order_details set order_name=?,order_quality=?,order_price=? where order_id=?");
			pstmt.setString(1, order.getOrderName());
			pstmt.setString(2, order.getOrderQuality());
			pstmt.setInt(3, order.getOrderPrice());
			pstmt.setString(4, order.getOrderId());
			updateStatus = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return updateStatus;
	}
}
