package com.eshare.bridge.example6;

public class Client {
	public static void main(String[] args) {
		//���������ʵ�ֶ���
		MessageImplementor impl = new MessageSMS();

		//����һ����ͨ��Ϣ����
		AbstractMessage m = new CommonMessage(impl);
		m.sendMessage("���һ����", "С��");
		
		//����һ��������Ϣ����
		m = new UrgencyMessage(impl);
		m.sendMessage("���һ����", "С��");
		
		//����һ���ؼ���Ϣ����
		m = new SpecialUrgencyMessage(impl);
		m.sendMessage("���һ����", "С��");
		
		//��ʵ�ַ�ʽ�л����ֻ�����Ϣ��Ȼ����ʵ��һ��
		impl = new MessageMobile();
		
		m = new CommonMessage(impl);
		m.sendMessage("���һ����", "С��");
		
		m = new UrgencyMessage(impl);
		m.sendMessage("���һ����", "С��");
		
		m = new SpecialUrgencyMessage(impl);
		m.sendMessage("���һ����", "С��");
	}
}
