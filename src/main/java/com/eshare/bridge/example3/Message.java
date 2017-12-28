package com.eshare.bridge.example3;
/**
 * ��Ϣ��ͳһ�ӿ�
 */
public interface Message {
	/**
	 * ������Ϣ
	 * @param message Ҫ���͵���Ϣ����
	 * @param toUser ����Ϣ���͵�Ŀ����Ա
	 */
	public void send(String message, String toUser);
}
