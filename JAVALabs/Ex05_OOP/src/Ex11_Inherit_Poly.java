//��� ���迡�� ������

class Pbase{
	int p =100;
}

class Cbase extends Pbase{
	int c =200;
}

class Dbase extends Pbase{
	
}
//Cbase==DbseŬ������ ���� �θ��̴�
public class Ex11_Inherit_Poly {

	public static void main(String[] args) {
		Cbase c = new Cbase();
		System.out.println(c.toString());
		//������: �θ�Ÿ���� ���������� �ڽ�Ÿ���� �ּҰ��� ���� �� �ִ�(��, ��� ���迡��)
		//�׷����� �޸𸮿� �ִ� ��� �ڿ��� ���� �ϴ� ���� �ƴ϶�
		//�ڽ��� Ÿ��(�θ�)���� ������ �����ϴ�.
		
		Pbase p =c; //������
		System.out.println("p�θ�Ÿ�� ����: "+p);
		System.out.println("p�� ����� cŸ�� ����: "+c);
		
		System.out.println(c.c +"/" +c.p);
		System.out.println("�ڽ��� �ּҸ� ���� �θ�� �ڽ��� �͸� ����: "+p.p);
		
		Dbase d = new Dbase();
		p = d;
		System.out.println("p�� ����� dŸ�� ����: "+d);
		System.out.println("p�θ�Ÿ�� ����: "+p);
		
		//p��� �θ�Ÿ���� ������ d�� �ּҵ� ������, c�� �ּҵ� ���� �� �ִ�.
		//c,d�� ���� �θ� ������ �ִ�
		
		/////////////////////////////////////////
		
		
		
		Dbase dd = (Dbase)p; // �θ�� (����Ÿ��)=>(����Ÿ��)�� �ڽĿ��� ..
		//�θ�Ÿ���� �ּҰ��� �ڽ�Ÿ�Կ��� ���� �� ���� (����=>����) �϶� ĳ�����Ͽ��� �Ѵ�.
		//�ݵ�� ���� Ÿ�Կ� �´� ĳ������ �Ͽ��� �Ѵ�.
	}

}