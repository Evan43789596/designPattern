package com.eshare.command.example8;

public class Client {
	public static void main(String[] args) {
		//׼��Ҫ����������
		Command cmd = new PrintService("�˻�������ģʽʾ��");
		//���������������
		Invoker invoker = new Invoker();
		invoker.setCmd(cmd);
		
		//���°�ť����������ִ������
		invoker.startPrint();
	}
}