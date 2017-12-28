package com.eshare.decorator.example3;

/**
 * װ�����ӿڣ�ά��һ��ָ���������Ľӿڶ���
 * ������һ��������ӿ�һ�µĽӿ�
 */
public abstract class Decorator extends Component {
	/**
	 * �����������
	 */
	protected Component component;

	/**
	 * ���췽���������������
	 * @param component �������
	 */
	public Decorator(Component component) {
		this.component = component;
	}

	public void operation() {
		//ת�������������󣬿�����ת��ǰ��ִ��һЩ���Ӷ���
		component.operation();
	}


}

