package com.eshare.bridge.example1;
/**
 * ��Email�ķ�ʽ������ͨ��Ϣ
 */
public class CommonMessageEmail implements Message{

	public void send(String message, String toUser) {
		System.out.println("ʹ��Email�ķ�ʽ��������Ϣ'"+message+"'��"+toUser);
	}

}