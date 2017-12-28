package com.eshare.bridge.example6;
/**
 * ʵ�ַ�����Ϣ��ͳһ�ӿ�
 */
public interface MessageImplementor {
	/**
	 * ������Ϣ
	 * @param message Ҫ���͵���Ϣ����
	 * @param toUser ����Ϣ���͵�Ŀ����Ա
	 */
	public void send(String message, String toUser);
}
