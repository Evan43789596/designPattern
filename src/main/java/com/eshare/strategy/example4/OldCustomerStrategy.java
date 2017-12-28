package com.eshare.strategy.example4;
/**
 * �����㷨ʵ�֣�Ϊ�Ͽͻ�����Ӧ���ļ۸�
 */
public class OldCustomerStrategy implements Strategy{
	public double calcPrice(double goodsPrice) {
		System.out.println("�����Ͽͻ���ͳһ�ۿ�5%");
		return goodsPrice*(1-0.05);
	}
}
