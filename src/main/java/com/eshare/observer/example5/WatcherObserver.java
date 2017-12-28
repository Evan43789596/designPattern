package com.eshare.observer.example5;
/**
 * ˮ�ʹ۲��߽ӿڶ���
 */
public interface WatcherObserver {
	/**
	 * ��֪ͨ�ķ���
	 * @param subject ���뱻�۲��Ŀ�����
	 */
	public void update(WaterQualitySubject subject);
	/**
	 * ���ù۲���Ա��ְ��
	 * @param job �۲���Ա��ְ��
	 */
	public void setJob(String job);
	/**
	 * ��ȡ�۲���Ա��ְ��
	 * @return �۲���Ա��ְ��
	 */
	public String getJob();
}