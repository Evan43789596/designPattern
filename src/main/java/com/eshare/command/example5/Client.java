package com.eshare.command.example5;

public class Client {
	public static void main(String[] args) {
		//ֻ�Ǹ��������Ա��˾ͺ���
		//��������Ա
		Waiter waiter = new Waiter();
		
		//����������󣬾���Ҫ��Ĳ�
		Command chop = new ChopCommand();
		Command duck = new DuckCommand();
		Command pork = new PorkCommand();
		
		//��ˣ����ǰ���Щ���÷���Ա��¼����
		waiter.orderDish(chop);
		waiter.orderDish(duck);
		waiter.orderDish(pork);
		
		//������
		waiter.orderOver();
	}
}