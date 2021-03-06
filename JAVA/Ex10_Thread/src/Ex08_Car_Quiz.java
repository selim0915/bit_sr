import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class time2 extends Thread {

	@Override
	public void run() {
		for (int i = 10; i > 0; i--) {
			try {
				Thread.sleep(1000);
				System.out.println("남은시간: "+i);
					if(i==1) {
						System.out.println("땡");
						return;
					}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
	}
}

class QuizInfo2 {
	HashMap<String, String> quiz; // 해쉬맵 사용
	Scanner sc; // 스케너
	String question; // 문제 key
	String answer; // 답 value
	int score; // 점수
	static int count = 1; // 번호
	String[] ox;
	int index = 0;

	QuizInfo2() {
		this.quiz = new HashMap<>(); // 해쉬맵 객체생성
		this.sc = new Scanner(System.in); // 스캐너 객체생성
		this.score = 0; // 점수 초기화
		quiz.put("2의 제곱은", "4");
		quiz.put("3의 제곱은", "9");
		quiz.put("4의 제곱은", "16");
		quiz.put("5의 제곱은", "25");
		quiz.put("6의 제곱은", "36");
		quiz.put("7의 제곱은", "49");
		quiz.put("8의 제곱은", "64");
		quiz.put("9의 제곱은", "81");
		this.ox = new String[quiz.size()]; // ox
	}

	void quiz() {
		Set<String> set = quiz.keySet(); // quiz의 key값 다 가져오기
		List<String> li = new ArrayList<String>(quiz.keySet());
		// List(복수 값만 담음) key값들을 담아서 Collections.sort로 정렬

		Collections.sort(li); // 컬렉션 sort는 list만 된다..
		Iterator<String> it = li.iterator(); // 멋져보이는 출력 (한번에 가져와 준다)

		while (it.hasNext()) {
			question = it.next(); // 변수에 담아서.Quiz key를 하나씩 출력
			//System.out.println("**");
			System.out.println((count++) + "번 문제: " + question);

			System.out.println("답은? ");
			this.answer = sc.nextLine();

			if (quiz.get(question).equals(answer)) {
				System.out.println("정답입니다.");
				ox[index++] = "O";
				++score;
			} else {
				System.out.println("틀립니다.");
				ox[index++] = "X";
			}
		}
		
		System.out.println(Arrays.toString(ox));
		System.out.printf("당신의 점수는 %d/2 입니다.", score);
	}
}

public class Ex08_Car_Quiz {

	public static void main(String[] args) {
		
		time2 t2 = new time2();
		t2.setDaemon(true);
		t2.start();
		
		QuizInfo2 q = new QuizInfo2();
		q.quiz();		
	}

}
