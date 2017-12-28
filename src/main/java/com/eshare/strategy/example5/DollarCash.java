package com.eshare.strategy.example5;
/**
 * ��Ԫ�ֽ�֧��
 */
public class DollarCash implements PaymentStrategy{
	
	public void pay(PaymentContext ctx) {
		System.out.println("���ڸ�"+ctx.getUserName()+"��Ԫ�ֽ�֧��"+ctx.getMoney()+"Ԫ");
	}
}