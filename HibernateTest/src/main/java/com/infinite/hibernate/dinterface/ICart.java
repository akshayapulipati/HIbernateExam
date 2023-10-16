package com.infinite.hibernate.dinterface;

import com.infinite.hibernate.pojo.Cart;

public interface ICart {
	public void create(String Productname, int amount, int qunatity, float total,Cart pr );
	public void update();
	public void delete();
	

}
