//추상 클래스

/*
 추상 클래스 (설계입장에서 바라보기..) = 미완성 설계도 = 미완성 클래스(미완성 코드+완성된 코드)
 미완성코드? : 미완성 함수(함수가 {실행 블록}을 가지고 있지 않은 것)
 ex) public void print()   >> {} 없는 것
 미완성 클래스? : new를 통해서 객체생성이 불가능 한 클래스
 ..
 
 1. 추상클래스는 스스로 객체생성이 불가합니다.
 추상클래스: 최소한 1개의 미완성 함수를 가지고 있다.
 사용방법?
 2. 완성 된 클래스로 만들어서 사용해야 한다. (상속을 통해서) 
 >> 상속 관계에서 미완성 클래스를 가져다 완성하는것
 미완성 자원(추상 함수)를 완성해라 => (구현, 재정의) => 오버라이드
 
 
 왜 사용할까??
 why?
 추상 클래스를 왜 만들었을까?
 : 강제적 구현을 목적 (설계자의 입장에서 )
 겅제적 구현을 목적으로 하여..
 다양한 기능을 하게 만든다.
 */

abstract class abclass{
	int pos;
	void run() {
		pos++;
	} //위에 코드는 완성 된 코드입니다.
	
	//추상함수, 추상자원
	abstract void stop(); //실행 블록이 없다.
	//void stop2();
}

class Child extends abclass{

	@Override
	void stop() { //stop이라는 함수를 재정의 한것
		this.pos =0;
		System.out.println("stop 재정의 : " + this.pos);
	}
	
}

public class Ex01_abstract_class {

	public static void main(String[] args) {
		//abclass a = new abclass(); 
		Child ch = new Child();
		ch.run();
		ch.stop();
		
		//abclass a = new abclass(); 
		// 되지 않지만
		// 자식은 재정의 해서 자식은 생성할 수있다.
		// 부모는 자식의 타입을 받을 수 있다. 
		// ???????
		abclass ab = ch;
		ab.run();
		ab.run();
		System.out.println("현재 pos: " +ab.pos);
		ab.stop(); //재정의가 자식쪽에 있는 stop 함수를 호출할 수 있다.
	}

}
