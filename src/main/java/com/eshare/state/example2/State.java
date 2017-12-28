package com.eshare.state.example2;


/**
 * ��װ��Context��һ���ض�״̬��ص���Ϊ
 */
public interface State {
	/**
	 * ״̬��Ӧ�Ĵ���
	 * @param sampleParameter ʾ��������˵�����Դ�����������崫��
	 *             ʲô���Ĳ��������뼸���������ɾ���Ӧ�����������
	 */
	public void handle(String sampleParameter);
}