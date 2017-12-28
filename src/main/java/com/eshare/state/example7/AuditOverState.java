package com.eshare.state.example7;

import java.util.Scanner;
/**
 * ������˽�������
 */
public class AuditOverState implements LeaveRequestState{
	public void doWork(StateMachine request) {
		//�Ȱ�ҵ��������ͻ���
		LeaveRequestModel lrm = (LeaveRequestModel)request.getBusinessVO();

		//ҵ���������������¼�������̽���		
	}
}
