package com.eshare.chainofresponsibility.example6;

public class Client {
	public static void main(String[] args) {
		//����ҵ�����
		GoodsSaleEbo ebo = new GoodsSaleEbo();
		//׼����������
		SaleModel saleModel = new SaleModel();
		saleModel.setGoods("��ѧ�ѻ��ɾ���");
		saleModel.setSaleNum(10);
		
		//����ҵ����
		ebo.sale("С��", "����", saleModel);
		ebo.sale("С��", "����", saleModel);
	}
}
