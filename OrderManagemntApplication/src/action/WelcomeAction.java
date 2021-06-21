package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dao.OrderManagementDao;
import pojo.Order;

public class WelcomeAction extends ActionSupport{

	List<Order> orders;
	
	public void initializeOrders()
	{
		orders = OrderManagementDao.getAllOrders();
	}

	@Override
	public String execute() throws Exception {
		initializeOrders();
		return "success";
	}
		public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	
}
