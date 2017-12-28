package com.eshare.bridge.example3;

public class UrgencyMessageEmail implements UrgencyMessage{
	public void send(String message, String toUser) {
		message = "�Ӽ���"+message;
		System.out.println("ʹ��Email�ķ�ʽ��������Ϣ'"+message+"'��"+toUser);
	}

	public Object watch(String messageId) {
		//��ȡ��Ӧ�����ݣ���֯�ɼ�ص����ݶ���Ȼ�󷵻�		
		return null;
	}	
}
