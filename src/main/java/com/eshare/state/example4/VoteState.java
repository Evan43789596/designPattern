package com.eshare.state.example4;
/**
 * ��װһ��ͶƱ״̬��ص���Ϊ
 */
public interface VoteState {
	/**
	 * ����״̬��Ӧ����Ϊ
	 * @param user ͶƱ��
	 * @param voteItem ͶƱ��
	 * @param voteManager ͶƱ�����ģ�������ʵ��״̬��Ӧ�Ĺ��ܴ����ʱ��
	 *                    ���Իص������ĵ�����
	 */
	public void vote(String user, String voteItem, VoteManager voteManager);
}