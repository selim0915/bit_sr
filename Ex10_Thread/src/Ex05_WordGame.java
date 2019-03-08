import java.awt.im.InputContext;

import javax.swing.JOptionPane;

/*
 문제
 main함수를 제와한 쓰레드2개를 만들고 생성,
 첫번째 쓰레드는 시간을 제어하는 쓰레드,
 두번째 스레기는 단어입력을 처리하는 쓰레드,
 
  그리고 main함수에서 두개의 쓰레드를 실행해라.
  
 단, 단어를 하나라도 입력해서 확인버튼을 누르면 시간을 멈추고 프로그램 종료.
 
  hint 공유자원 static자원의 활용
  
 */

public class Ex05_WordGame {
	static boolean Inputcheck = false;

	public static void main(String[] args) {
		time t = new time();
		Thread t2 = new Thread(t);
		t2.start();

		word w = new word();
		Thread w2 = new Thread(w);
		w2.start();

		System.out.println("main END...");

	}

}

	
class time implements Runnable { //시간
	@Override
	public void run() {
		for (int i = 10; i > 0; i--) {
			if (Ex05_WordGame.Inputcheck == true) {
				return;
			}
			System.out.println("남은시간: " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

class word implements Runnable { //입력값

	@Override
	public void run() {
		String input = JOptionPane.showInputDialog("값을 입력하세요");
		System.out.println("입력값: " + input);
		Ex05_WordGame.Inputcheck = true;
	}
}

