
public class Ex04_DataType {

	public static void main(String[] args) {
		//메서드 안쪽에 적는 변수는 지역변수
		
		byte b = 100;
		System.out.println(b);
		
		int i = 12345;
		System.out.println(i);
		
		long l = 10000000001L;
		System.out.println(l);
		
		float f = 3.14f;
		System.out.println(f);
		
		double d = 3.14159265358979323;
		System.out.println(d);
		
		boolean bo = true;
		System.out.println(bo);
		
		String str = "홍길동";
		System.out.println(str);
		
		char ch = 'A';
		System.out.println(ch);
		
		char sing = '\''; //내가 입력한 값을 출력하고 싶을 때 특수문자 이용
		// JAVA: 특수문자로 문자를 인지 시킬 수 있다. \로
		System.out.println(sing);
		
		// 홍"길"동 을 표현하고 싶다.
		String name = "홍\"길\"동";
		System.out.println(name); //'= 쿼테이션, "=더블쿼테이션
		
		//C://Temp 문자열 출력
		String s = "C:\\Temp";
		System.out.println(s);
	}

}
