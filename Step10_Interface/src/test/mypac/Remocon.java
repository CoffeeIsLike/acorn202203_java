package test.mypac;
/*
 *  [ interface ]
 *  
 *  - �����ڰ� ���� (�ܵ� ��ü ���� �Ұ�)
 *  - ������ �޼ҵ�� ������ ���� ( �߻� �޼ҵ常 ������ �ִ� )
 *  - �ʵ�� static final ����� ������ �ִ�.
 *  - data type  �� ��Ȱ�� �Ҽ� �ִ�.
 *  - interface type �� �������� �ʿ��ϸ� ����(implements) Ŭ������ ����
 *    ��ü�� �����ؾ� �Ѵ�.
 *  - Ŭ���� ����� ���� ���������, �������̽��� ���� ������ �����ϴ� 
 */
public interface Remocon {
	//�ʵ�� static final �ʵ常 ������ �ִ�
	public static final String COMPANY="LG";
	
	//�޼ҵ�� �߻� �޼ҵ常 ���� �Ҽ� �ִ�. 
	public void up();
	public void down();
	
}
