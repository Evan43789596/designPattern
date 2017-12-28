package com.eshare.bridge.example3;
/**
 * �Ӽ���Ϣ�ĳ���ӿ�
 */
public interface UrgencyMessage extends Message{
	/**
	 * ���ĳ��Ϣ�Ĵ������
	 * @param messageId ����ص���Ϣ�ı��
	 * @return ������ص������ݶ�������ʾ��һ�£���������Object
	 */
	public Object watch(String messageId);
}
