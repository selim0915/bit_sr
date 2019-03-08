/*
 �������� ���̸� �ְ� �����ϴ� �ַ�� ����

[A �������� �䱸����]
�������� ���̸� �Դ� ���� ���������� ������ �ֽ��ϴ�.
������ �������� ������ �̸��� ������ �ֽ��ϴ�.
ex)
������ ������ �̸��� ������ �ִ�(Monkey, Lion, Tiger)
������ ������ �ٸ� ���� ���̸� �Դ´�(Monkey : 300, Lion : 500)

�ùķ��̼� �ó�����
������ : �������� �ִ� ������ �� ������ ������ �ִ�.
�� : ���� 1000g
������� ���̸� �� �� �ִ�. ���̸� �ָ� ������ �ִ� ���̴� �����Ѵ�
������� �ʱ� ���̸� ���� �� �ִ�.
���� ���������� ������(Monkey), ����(Lion), ȣ����(Tiger) 3������ ��� �ִ�
3�������� ���̸� �ִ� �Լ��� ����
3�������� ��� ���̸� �־�� �Ѵ�.
 */

class Animal {
	String name;
	int eat;

	Animal(int eat) {
		this.eat = eat;
	}
}

class Monkey extends Animal {
	Monkey(){
		super(300);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Monkey";
	}
}

class Lion extends Animal {
	Lion(){
		super(500);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Lion";
	}
}

class Tiger extends Animal {
	Tiger(){
		super(200);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Tiger";
	}
}

class pp{
	int peat=1000;
	
	public void eatm(Animal a) {
		if(this.peat < a.eat) {
			System.out.println("���̰� �����ϴ�.");
			return;
		}
		this.peat -= a.eat;
		System.out.println(a.toString()+"����"+ a.eat+"��ŭ ���� ��");
	}
	
}

public class Ex00_Test {

	public static void main(String[] args) {
		Monkey m = new Monkey();
		Lion l = new Lion();
		Tiger t = new Tiger();
		
		pp p =new pp();
		p.eatm(m);
		p.eatm(l);
		p.eatm(t);
		p.eatm(t);
		p.eatm(t);
	}

}