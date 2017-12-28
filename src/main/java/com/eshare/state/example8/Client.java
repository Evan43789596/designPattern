package com.eshare.state.example8;

public class Client {
	public static void main(String[] args) {
		//����ҵ����󣬲�����ҵ������
		LeaveRequestModel lrm = new LeaveRequestModel();
		lrm.setUser("С��");
		lrm.setBeginDate("2010-02-08");
		lrm.setLeaveDays(5);
		
		//���������Ķ���
		LeaveRequestContext request = new LeaveRequestContext();
		//Ϊ�����Ķ�������ҵ�����ݶ���
		request.setBusinessVO(lrm);
		//���������ģ���Ϊ��ʼ��״̬���Ժ�Ͳ�����
		request.setState(new ProjectManagerState());
		
		//���������ģ��������Ŀ�ʼ������
		request.doWork();
	}
}
