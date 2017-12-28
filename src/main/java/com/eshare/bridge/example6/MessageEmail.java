package com.eshare.bridge.example6;
/**
 * ��Email�ķ�ʽ������Ϣ
 */
public class MessageEmail implements MessageImplementor{

	public void send(String message, String toUser) {
		System.out.println("ʹ��Email�ķ�ʽ��������Ϣ'"+message+"'��"+toUser);
	}

}