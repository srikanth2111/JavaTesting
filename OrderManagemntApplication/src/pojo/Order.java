package pojo;

public class Order {

	private String orderId;
	private String orderName;
	private String orderQuality;
	private Integer orderPrice;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(String orderId, String orderName, String orderQuality, Integer orderPrice) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.orderQuality = orderQuality;
		this.orderPrice = orderPrice;
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

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderName=" + orderName + ", orderQuality=" + orderQuality
				+ ", orderPrice=" + orderPrice + "]";
	}


	
}
