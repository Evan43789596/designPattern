package com.eshare.abstractfactory.example6.business;


import com.eshare.abstractfactory.example6.dao.MyDaoFactory;
import com.eshare.abstractfactory.example6.dao.dao.DAOFactory;
import com.eshare.abstractfactory.example6.dao.impl.OrderDetailDAO;
import com.eshare.abstractfactory.example6.dao.impl.OrderMainDAO;

public class BusinessObject {
	public static void main(String[] args) {
		//����DAO�ĳ��󹤳�
		DAOFactory df = MyDaoFactory.createDAOFactory(2);
		
		//ͨ�����󹤳�����ȡ��Ҫ��DAO�ӿ�
		OrderMainDAO mainDAO = df.createOrderMainDAO();
		OrderDetailDAO detailDAO = df.createOrderDetailDAO();
		//����DAO��������ݴ洢�Ĺ���
		mainDAO.saveOrderMain();
		detailDAO.saveOrderDetail();
	}
}
