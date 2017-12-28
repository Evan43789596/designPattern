package com.eshare.strategy.example5;
/**
 * ������ֽ�֧��
 */
public class RMBCash implements PaymentStrategy{
	
	public void pay(PaymentContext ctx) {
		System.out.println("���ڸ�"+ctx.getUserName()+"������ֽ�֧��"+ctx.getMoney()+"Ԫ");
	}

}
