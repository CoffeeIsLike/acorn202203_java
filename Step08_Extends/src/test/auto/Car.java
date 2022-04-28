package test.auto;
/*
 *  - ���� ������ ���ٹ���
 *  
 *  public : ��𿡼��� ���� ���� 
 *  protected : ������ package Ȥ�� ��Ӱ��迡�� �ڽĿ��� ���� ���� 
 *  default : ���Ͼ� package �ȿ����� ���� ����
 *  private : ������ Ŭ���� Ȥ�� ������ ��ü �ȿ����� ���ٰ��� 
 *  
 *  - ���� �����ڸ� ���̴� ��ġ
 *  
 *  1. Ŭ������ ���� �Ҷ�
 *  2. ������
 *  3. �ʵ�
 *  4. �޼ҵ� 
 *  
 *  Ŭ������ default �� public �ΰ����� ���� �����ڸ� ���� �����ϴ�
 *  ���� �����ڸ� �����Ѱ��� default ���� �����ڴ� 
 */
public class Car {
	//�ʵ�
	protected Engine engine;
	
	//Engine ��ü�� ���ڷ� ���� �޴� ������
	public Car(Engine engine) {
		this.engine=engine;
	}
	
	//�޼ҵ�
	public void drive() {
		if(this.engine==null) {
			System.out.println("Engine ��ü�� ��� �޸����� �����");
			return; //�޼ҵ� ������
		}
		System.out.println("�޷���~");
	}
	
}
