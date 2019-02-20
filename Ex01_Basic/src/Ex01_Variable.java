// Tip) c#: public static void Main()

public class Ex01_Variable {
	
	// 메인함수 = 프로그램의 시작점.
	// 메인함수안에 작성한 코드는 객체생성이 필요없다.
	public static void main(String[] args) {
		
		// 변수:variable
		// 변수: Scope(유효범위): 선언되는 위치에 따라서
		// 1. instance variable : 객체변수 class Test 
		//  ex) {private int age;}
		// 2. local variable : 지역변수 (*함수안에 선언 된 변수)
		//  ex) class Test{ public void run(){int speed=0;} }지역변수는 반드시 초기값을 가진다.
		// 3. static variable : 공유변수 (객체간의 공유자원)
		
		//설계도 ==클래스 ==타입(사용자 정의 타입)
		
		int iv; //지역변수
		Test t = new Test();
		t.iv = 10;
		System.out.println(t.iv); 
		
		Test t2 = new Test();
		System.out.println(t2.iv); 
		
		int s =5; // 선언과 동시에 초기화
		System.out.println("지역변수: s는? "+s);
		
		// 선 선언 후 초기화
		int s2;
		s2 =100;
		System.out.println("1. 지역변수: s2는? "+s2);
		
		// 새로 초기화(오버라이트: 값을 덮어 버리는 것)
		s2 =300;
		System.out.println("2. 지역변수: s2는? "+s2);
		
		
		Test t1 = new Test();
		t1.print();
		t1.write();
		t.print2(0);
	}

}

class Test{
	int iv; // 객체변수 (전역변수) //객체변수에는 초기값을 넣지 않는다.
	// 객체변수는 초기화를 하지 않아도 된다. (기본값:default)를 가진다.
	// 초기화를 하지 않아도 되는 이유?
	// : 객체변수의 목적은 *다양한 값으로 다루기 위함이다.
	
	void print() {
		// (): 파라미터가 들어가는 가로 // 빈칸일때?
		// void: 반환값이 없다.
		int i = 0; //함수안에 들어있는 변수: 지역변수
		
		// 지역변수는 함수가 호출될떄 스텍에 쌓인다.
		// 전역변수(객체변수)는 힙 메모리에 생긴다.
		System.out.println(i);
		// *지역변수는 반드시 사용시 초기화 되야한다.
	}
	
	void write() {
		System.out.println("iv 전역변수(객체):" + iv);
		// System.out.println(i);
		// error원인
		// -i변수는 scope: print() 함수의 내부이기 때문에
		int i =200;
		// 지역변수는 다른 지역애 같은 이름으로 해도 됨
		int iv = 200;
		System.out.println("iv 전역변수(객체):" + iv);
		// 안에가 상위가 에러는 나지않지만 두번 선언하는건 의미가 없다.
		// iv =200; 으로 수정
	}
	
	String print2(int i) {
		return "포켓몬 이상해씨";
		// 리턴값이 필요.
	}
}



