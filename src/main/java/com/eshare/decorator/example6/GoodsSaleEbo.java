package com.eshare.decorator.example6;

public class GoodsSaleEbo implements GoodsSaleEbi{
	
	public boolean sale(String user,String customer, SaleModel saleModel) {
		System.out.println(user+"������"+customer+"���� "+saleModel+" ����������");
		return true;
	}
}
