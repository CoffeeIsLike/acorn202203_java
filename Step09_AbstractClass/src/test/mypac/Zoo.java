package test.mypac;

//������ Ŭ���� 
public class Zoo {
	/*
	 *  Ŭ���� �ȿ� ���� �Ҽ� �ִ°� ���� ������?
	 *  
	 *  ������, �ʵ�, �޼ҵ�, Ŭ����
	 */
	
	//Ŭ���� �ȿ� Ŭ����(���� Ŭ����)
	public class Monkey{
		public void say() {
			System.out.println("�ȳ�! ���� �����̾�");
		}
	}
	//���� Ŭ���� 
	public class Tiger{
		public void say() {
			System.out.println("�ȳ�! ���� ȣ���̾�");
		}
	}
	
	//�޼ҵ�
	public Monkey getMonkey() { //���� Ŭ������ ��ü�� �����ؼ� �������ִ� �޼ҵ� 
		return new Monkey();
	}
	public Tiger getTiger() {
		return new Tiger();
	}	
}













