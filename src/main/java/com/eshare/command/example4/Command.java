package com.eshare.command.example4;
/**
 * ����ӿڣ�����ִ�еĲ�����֧�ֿɳ�������
 */
public interface Command {
	/**
	 * ִ�������Ӧ�Ĳ���
	 */
	public void execute();
	/**
	 * ִ�г��������Ӧ�Ĳ���
	 */
	public void undo();
}
