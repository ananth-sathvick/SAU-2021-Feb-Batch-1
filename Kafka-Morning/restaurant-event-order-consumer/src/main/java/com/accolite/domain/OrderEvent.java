package com.accolite.domain;


public class OrderEvent {

	private Integer orderEventId;
	private Order order;
	//private LibraryEventType libraryEventType;


	public Integer getOrderEventId() {
		return this.orderEventId;
	}

	public void setOrderEventId(Integer orderEventId) {
		this.orderEventId = orderEventId;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	

	/*
	 * public LibraryEventType getLibraryEventType() { return libraryEventType; }
	 * 
	 * public void setLibraryEventType(LibraryEventType libraryEventType) {
	 * this.libraryEventType = libraryEventType; }
	 */


	@Override
	public String toString() {
		return "Restaurant Event [orderEventId=" + orderEventId + ", order =" + order + "]";
	}	
	
}
