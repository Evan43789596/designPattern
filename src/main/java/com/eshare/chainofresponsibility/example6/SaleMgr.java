package com.eshare.chainofresponsibility.example6;
/**
 * �����������۵�ҵ���ܵ�ְ�����
 */
public class SaleMgr extends SaleHandler{
	public boolean sale(String user, String customer, SaleModel saleModel) {
		//����������ҵ���߼�����
		System.out.println(user+"������"+customer+"���� "+saleModel+" ����������");
		return true;
	}
}
