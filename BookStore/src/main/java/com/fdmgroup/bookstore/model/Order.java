package com.fdmgroup.bookstore.model;

public class Order extends Book {
    private int OrderId;
    private Book bookOrdered;
    private int userId;
    //private localDataTime orderDateTime;
    
    
	public Order() {
		super();
	}

	public Order(int orderId, Book bookOrdered, int userId) {
		super();
		OrderId = orderId;
		this.bookOrdered = bookOrdered;
		this.userId = userId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + OrderId;
		result = prime * result + ((bookOrdered == null) ? 0 : bookOrdered.hashCode());
		result = prime * result + userId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (OrderId != other.OrderId)
			return false;
		if (bookOrdered == null) {
			if (other.bookOrdered != null)
				return false;
		} else if (!bookOrdered.equals(other.bookOrdered))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

    
	public int getOrderId() {
		return OrderId;
	}

	public void setOrderId(int orderId) {
		OrderId = orderId;
	}

	public Book getBookOrdered() {
		return bookOrdered;
	}

	public void setBookOrdered(Book bookOrdered) {
		this.bookOrdered = bookOrdered;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Order [OrderId=" + OrderId + ", bookOrdered=" + bookOrdered + ", userId=" + userId + "]";
	}
}
