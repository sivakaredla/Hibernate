package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class orders {
	@Id
	private long orderid;
	@NotNull
	@Size(min = 4)
	private String orderName;
	@NotNull
	private String orderAddress;
	@NotNull
	@Size(min = 6,max = 6)
	private Long orderPincode;
	
	public orders(long orderid, String orderName, String orderAddress, Long orderPincode) {
		super();
		this.orderid = orderid;
		this.orderName = orderName;
		this.orderAddress = orderAddress;
		this.orderPincode = orderPincode;
	}
	public orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public long getOrderid() {
		return orderid;
	}
	public void setOrderid(long orderid) {
		this.orderid = orderid;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderAddress() {
		return orderAddress;
	}
	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}
	public Long getOrderPincode() {
		return orderPincode;
	}
	public void setOrderPincode(Long orderPincode) {
		this.orderPincode = orderPincode;
	}
	

}
