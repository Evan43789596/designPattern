package com.eshare.command.example3;
/**
 * �������������ʵ�֣�ʵ��Command�ӿڣ�
 * ���������������������ʵ�֣�ͨ�����ý����ߵķ�����ʵ������
 */
public class ResetCommand implements Command{
	/**
	 * ��������ʵ������Ľ����ߡ����������
	 */
	private MainBoardApi mainBoard = null;
	/**
	 * ���췽���������������
	 * @param mainBoard �������
	 */
	public ResetCommand(MainBoardApi mainBoard) {
		this.mainBoard = mainBoard;
	}
	
	public void execute() {
		//����������󣬸�����֪�����������������ת���������
		//������ȥ������������Ĺ���
		this.mainBoard.reset();
	}
}
