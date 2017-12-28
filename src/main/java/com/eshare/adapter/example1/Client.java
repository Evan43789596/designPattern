package com.eshare.adapter.example1;
/**
 * ʹ���������Ŀͻ���
 */
public class Client {	
	public static void main(String[] args) {
		//�����豻����Ķ���
		Adaptee adaptee = new Adaptee();
		//�����ͻ�����Ҫ���õĽӿڶ���
		Target target = new Adapter(adaptee);
		//������
		target.request();
	}
}
