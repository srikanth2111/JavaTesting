package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.OrderManagementDao;
import pojo.Order;

public class UpdateAction extends ActionSupport{

	private String orderId;
	private String orderName;
	private String orderQuality;
	private Integer orderPrice;
	
	
	@Override
	public String execute() throws Exception {
		String statusCode ="";
		Order order = new Order(orderId, orderName, orderQuality, orderPrice);
		int dataUpdated = OrderManagementDao.updateOrder(order);
		if(dataUpdated == 1)
		{
			statusCode = "success";
		}else
		{
			statusCode = "error";
		}
		return statusCode;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderQuality() {
		return orderQuality;
	}
	public void setOrderQuality(String orderQuality) {
		this.orderQuality = orderQuality;
	}
	public Integer getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(Integer orderPrice) {
		this.orderPrice = orderPrice;
	}
	
	
}
