/*
스타크레프트

유닛(unit)
unit 공통기능 (이동좌표, 이동(끼능), 멈추는 기능)
unit이동방법이 다르다. 

팀장: unit클래스를 만들어서 조원들에세 배표할건데..
각각의 유닛을 만들라고 하고싶다..
 */

abstract class Unit {
	int x, y;

	void stop() {
		System.out.println("Unit Stop");
	}

	// 모든 유닛은 이동을 가지고 있지만,, 유닛마다 방법이 다르다.
	abstract void move(int x, int y); // 날아간다. 걸어간다.

	// 추상자원은 -> 구체화, 특수화, 실체화 되어야 한다.
}

class Tank extends Unit {

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Tank 이동: " + this.x + ", " + this.y);
	}

	// Tank만이 가지는 구체화, 특수화 된 기능
	void changeMode() {
		System.out.println("탱크 변환 모드 실행//");
	}
}

class Marine extends Unit {

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Marine 걸어서 이동: " + this.x + ", " + this.y);
	}

	void stimpack() {
		System.out.println("스팀팩 기능 사용//");
	}
}

class DropShip extends Unit {

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("DropShip 공중 이동: " + this.x + ", " + this.y);
	}

	void load() {
		System.out.println("Unit 태우다.");
	}

	void unload() {
		System.out.println("Unit 내려놓다.");
	}
}

public class Ex02_abstract_class {

	public static void main(String[] args) {
		Tank t = new Tank();
		t.move(100, 200);
		t.stop();
		t.changeMode();

		Marine m = new Marine();
		m.move(300, 200);
		m.stop();
		m.stimpack();

		// 탱크 3대를 만들고 같은 좌표로 이동시켜라
		Tank[] tg = { new Tank(), new Tank(), new Tank() };

		for (Tank t1 : tg) {
			t1.move(10, 200);
		}

		for (int i = 0; i < tg.length; i++) {
			tg[i].move(11, 22);
		}

		
		Marine[] mr = {new Marine(), new Marine(), new Marine()};
		for(Marine val : mr) {
			val.move(20, 90);
		}
		
		
		// Tank, Marine, DropShip 3개의 unit를 같은 좌표로 이동 하세요.
		Unit[] un = { new Tank(), new Marine(), new DropShip() };
		// 객체지향은 서로 다른걸 묶어 주는것
		for (Unit u1 : un) {
			u1.move(33, 44); // 자식들이 구현 했기 때문에 Unit 부모가 쓸 수 있다.
		}

		// TOday Point
		// 서로다른 것들을 같은 부모로 맺어주므로서 같이 사용한다. =>다형성

	}

}
