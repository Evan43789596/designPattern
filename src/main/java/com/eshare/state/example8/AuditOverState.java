package com.eshare.state.example8;

/**
 * ������˽�������
 */
public class AuditOverState implements LeaveRequestState{
	public void doWork(StateMachine request) {
		//�Ȱ�ҵ��������ͻ���
		LeaveRequestModel lrm = (LeaveRequestModel)request.getBusinessVO();
		System.out.println(lrm.getUser()+"�������������Ѿ���˽���������ǣ�"+lrm.getResult());
	}
}
