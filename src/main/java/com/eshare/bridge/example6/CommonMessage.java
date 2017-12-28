package com.eshare.bridge.example6;
/**
 * ��ͨ��Ϣ
 */
public class CommonMessage extends AbstractMessage{
	public CommonMessage(MessageImplementor impl) {
		super(impl);
	}

	public void sendMessage(String message, String toUser) {
		//������ͨ��Ϣ��ʲô�����ɣ�ֱ�ӵ��ø���ķ���������Ϣ���ͳ�ȥ�Ϳ�����
		super.sendMessage(message, toUser);
	}	
}
