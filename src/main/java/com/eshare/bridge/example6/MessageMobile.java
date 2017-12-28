package com.eshare.bridge.example6;
/**
 * ���ֻ�����Ϣ�ķ�ʽ������Ϣ
 */
public  class MessageMobile implements MessageImplementor{

	public void send(String message, String toUser) {
		System.out.println("ʹ���ֻ�����Ϣ�ķ�ʽ��������Ϣ'"+message+"'��"+toUser);
	}
}
