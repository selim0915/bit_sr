import java.util.StringTokenizer;

//String 클래스
//클래스는 다양한 함수를 가지고 있다.
//개발에서 정말 많이 사용 된다. (우리가 사용한 데이터는 대부분 문자열 데이터)

public class Ex06_String_Function {

	public static void main(String[] args) {
		String str = ""; // 문자열 초기화

		String[] strarr = { "aaa", "bbb", "ccc" };

		for (String s : strarr) {
			System.out.println(s);
		}

		// String 클래스(함수)
		String ss = "hello";
		String concatstr = ss.concat("world"); // 문자열 이어 쓰기
		System.out.println(concatstr);

		boolean bo = ss.contains("el"); // 같은 문자열이 있는지 확인 true, false
		System.out.println(bo);

		String ss2 = "a b c d"; // [a] [] [b] [] [c] [] [d]
		System.out.println(ss2.length());

		String filename = "hello java, world";
		filename.indexOf(","); // 입력한 문자가 몇번째 인덱스인지 알려줌
		System.out.println(filename.indexOf(","));
		System.out.println(filename.indexOf("java")); // 통 문자가 있다면 첫 단어의 시작 위치를 알려줌

		// 활용 : 문장내에서 내가 원하는 단어가 포함 되어 있는지를 검증
		// 0보다 큰값을 반환하는 거라면.. 최소한 하나의 단어가 문장에 포함되어있는것.. 그걸 검증 할 때 사용
		filename.lastIndexOf("a");
		System.out.println("=----");
		System.out.println(filename.lastIndexOf("a")); // 인덱스에 마지막으로 사용된 첨자를 반환
		System.out.println(filename.lastIndexOf("di"));
		// * 배열에서 값이 없다는 표시는 -1이라고 표시한다.

		// *주로 많이 쓰는 함수
		// length():길이
		// indexof():첨자순서찾기
		// substring():문자열나누기
		// replace():치환
		// split():구분자기준 문자 나누기

		String result = "superman";
		System.out.println(result.substring(5)); // 내가 추출할 문자 시작번호를 주시면 .. 뒷부분을 반환
		System.out.println(result.substring(2, 7)); // 시작인덱스, 끝나는 인덱스 //인덱스는 항상 0부터 시작한다.

		// Quiz
		String filename2 = "홍길동.jpg"; // 파일명을 바꿔질 수 있다.
		// aaa.mpeg , ab.hwp
		int num = filename2.indexOf(".");
		String str1 = filename2.substring(0, num);
		String str2 = filename2.substring(++num);
		System.out.println(str1);
		System.out.println(str2);

		// replace
		String s2 = "ABCD";
		String result4 = s2.replace("A", "안녕"); // 바꾸고 싶은 문자, 바꿀 문자
		System.out.println(result4);

		s2.charAt(0); // 인덱스에 해당하는 문자를 반환한다.
		System.out.println(";;;");
		System.out.println(s2.charAt(0));
		System.out.println(s2.charAt(3));

		s2.endsWith("cd"); // 끝에서 문자를 가지고 잇나?
		System.out.println(s2.endsWith("D")); // 맨뒤에 문자가.. 맨뒤에 문자기준 단어수는 상관 없다.
		System.out.println(s2.equalsIgnoreCase("abCD")); // 대소문자 구분없이 같은 문자 확인.

		// **POINT
		String s6 = "슈퍼맨,,팬티,,노랑색,,우하하,,우하하";
		String[] strarr2 = s6.split(",,");
		for (String val : strarr2) {
			System.out.println(val);
		}

		String filename3 = "bit.hwp";
		String[] arry = filename3.split("\\."); // 정규표현 문자열
		for (String val : arry) {
			System.out.println(val);
		}

		// java, javascript, DB >> 정규표현식
		// 000-{\d4}-0000
		// 000-1234-0000 >> true
		// 000-11-111-0000 >> false

		// 과제(정규표현식 5개 만들어오기 ) 조별당
		// 이메일
		// 주민번호
		// 우편번호
		// 전화번호

		// 그냥 여러가지 값도 분리할 수 잇다 배워보려고 한것,,,
		String s7 = "a/b,c.d-f";
		StringTokenizer sto = new StringTokenizer(s7, "/,.-"); // 내가 가진 문자에 구분자를 입력하면 알아서 빼준다.
		while (sto.hasMoreTokens()) {
			System.out.println(sto.nextToken());
		}

		// Quiz
		String s8 = "홍            길    동";
		// 저장 "홍길동"
		StringTokenizer sto2 = new StringTokenizer(s8, " "); // 내가 가진 문자에 구분자를 입력하면 알아서 빼준다.
		while (sto2.hasMoreTokens()) {
			System.out.print(sto2.nextToken());
		}

		System.out.println(s8.replace(" ", ""));

		String s9 = "        홍         길동      ";
		System.out.println(">" + s9 + "<");
		// 공백을 제거하는 함수
		System.out.println(s9.trim()); // trim() 양쪽의 공백제거

		String s10 = "        홍          길        동           ";
		String re = s10.trim();
		String re2 = re.replace(" ", "");
		System.out.println("re2: " + re2);
		// => 문제점
		// 여러개의 함수를 사용할 경우 (method chain)
		String re3 = s10.trim().replace(" ", ""); // 리턴값이 타입이 같으면 계속 이어서 쓸 수 있다. (체인기법)
		System.out.println("re3: " + re3);

		// Quiz
		int sum = 0;
		String[] numarr = { "1", "2", "3", "4", "5" };
		// 배열에 있는 문자값의 합을 sum변수에 담아서 출력하세요.

		for (int i = 0; i < numarr.length; i++) {
			sum += Integer.parseInt(numarr[i]);
		}
		System.out.println(sum);

//		for(String s : numarr) {
//			sum += Integer.parseInt(s);
//		}
//		System.out.println(sum);

		System.out.println();

		// Quiz2
		String jumin = "123456-1234567";
		String jumin2 = jumin.replace("-", "");
		// System.out.println(jumin2);

		int num2 = 0;

		for (int i = 0; i < jumin2.length(); i++) {
			num2 += Integer.parseInt(jumin2.substring(i, i + 1));
		}
		System.out.println(num2);
	}

}
