package com.eshare.bridge.example2;
/**
 * ��վ�ڶ���Ϣ�ķ�ʽ������ͨ��Ϣ
 */
public  class CommonMessageSMS implements Message{

	public void send(String message, String toUser) {
		System.out.println("ʹ��վ�ڶ���Ϣ�ķ�ʽ��������Ϣ'"+message+"'��"+toUser);
	}
}
