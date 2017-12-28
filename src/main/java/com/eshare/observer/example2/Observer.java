package com.eshare.observer.example2;
/**
 * �۲��ߣ����籨ֽ�Ķ���
 */
public interface Observer {
	/**
	 * ��֪ͨ�ķ���
	 * @param subject �����Ŀ����󣬿��Ի�ȡ��ֽ������
	 */
	public void update(Subject subject);
}
