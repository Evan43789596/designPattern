package com.eshare.factorymethod.example3;

public class Client {
	public static void main(String[] args) {
		//������Ҫʹ�õ�Creator����
		ExportOperate operate = new ExportDBOperate();
		//����������ݵĹ��ܷ���
		operate.export("��������");
	}
}
