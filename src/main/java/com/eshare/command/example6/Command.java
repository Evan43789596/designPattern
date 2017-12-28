package com.eshare.command.example6;
/**
 * ����ӿڣ�����ִ�еĲ���
 */
public interface Command {
	/**
	 * ִ�������Ӧ�Ĳ���
	 */
	public void execute();
	/**
	 * ��������Ľ�����
	 * @param cookApi ����Ľ����� 
	 */
	public void setCookApi(CookApi cookApi);
	/**
	 * ���ط�����������ţ����ǵ�˵�����
	 * @return �������������
	 */
	public int getTableNum();
}