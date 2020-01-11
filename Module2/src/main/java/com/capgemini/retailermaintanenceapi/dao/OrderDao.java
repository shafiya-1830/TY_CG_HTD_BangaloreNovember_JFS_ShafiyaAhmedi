package com.capgemini.retailermaintanenceapi.dao;

import com.capgemini.retailermaintanenceapi.dto.OrderInfo;
import com.capgemini.retailermaintanenceapi.dto.ProductInfo;

public interface OrderDao {

	public boolean addOrder(OrderInfo bean);
}
