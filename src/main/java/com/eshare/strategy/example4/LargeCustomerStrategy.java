package com.eshare.strategy.example4;
/**
 * �����㷨ʵ�֣�Ϊ��ͻ�����Ӧ���ļ۸�
 */
public class LargeCustomerStrategy implements Strategy{
	public double calcPrice(double goodsPrice) {
		System.out.println("���ڴ�ͻ���ͳһ�ۿ�10%");
		return goodsPrice*(1-0.1);
	}
}
