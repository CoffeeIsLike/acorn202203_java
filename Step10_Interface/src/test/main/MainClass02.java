package test.main;

import test.mypac.Remocon;
import test.mypac.TVRemocon;

public class MainClass02 {
	public static void main(String[] args) {
		//���� Ŭ������ test.mypac ��Ű���� ���Ϸ� ���� useRemocon() �޼ҵ带 ���⼭ ȣ���� ������.
		Remocon r1=new TVRemocon();
		useRemocon(r1);
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
