package kr.or.bit;

import java.util.Scanner;

public class Movie2 {

	public static void main(String[] args) {
		Movie2 m = new Movie2();
		//m.selectMovieMenu();
		m.moviePrint();
	}

	private String[][] arr;
	private Scanner sc;
	private String movieSe;
	private boolean test;

	public Movie2() {
		this.arr = new String[6][12];
		this.sc = new Scanner(System.in);
	}

	private String showMenu() {
		System.out.println("*********************");
		System.out.println("1. �¸� �����ϱ�");
		System.out.println("2. �����ڸ� Ȯ��");
		System.out.println("3. ���α׷� ����");
		System.out.println("*********************");
		System.out.print("���ϴ� �޴� ����(1~3) : ");
		String selectnum = sc.nextLine();
		return selectnum;
	}

	public void selectMovieMenu() {
		movieSelect();
		// �޴� ����....
		escape: while (true) {
			switch (showMenu()) {
			case "1":
				moviePrint();
				movieReservation();
				break;
			case "2":
				moviePrint();
				break;
			case "3":
				System.out.println("���α׷� ����");
				break escape; // escape �������� Ż��..
			}
		}
	}

	public void movieSelect() {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				temp++;
				arr[i][j] = String.valueOf(temp);
			}
		}
	}

	public void movieReservation() {

		Scanner sc = new Scanner(System.in);

		System.out.print("���� �¼� ������ �����ϼ���(ex. 3���̸� [3�Է�]) : ");

		int temp = Integer.parseInt(sc.nextLine());

		System.out.printf("[%d]���� �¼��� �����մϴ�.\n", temp);
		System.out.print("�¼��� �Է��ϼ���(ex.11,12,13) : ");
		String temp2 = sc.nextLine();
		String[] temp3 = null;

		int myRow = 0;
		int myCol = 0;
		temp3 = temp2.split(",");
		/*
		 * for (int i = 0; i < temp3.length; i++) { for (int j = 0; j < temp3.length-1;
		 * j++) { if(Integer.parseInt(temp3[j]) > Integer.parseInt(temp3[j+1])) { String
		 * result=""; result = temp3[j]; temp3[j] = temp3[j+1]; temp3[j+1] = result; } }
		 * }
		 */
		for (int i = 0; i < temp3.length; i++) {
			myRow = (Integer.parseInt(temp3[i]) % arr[0].length == 0) ? Integer.parseInt(temp3[i]) / arr[0].length - 1
					: Integer.parseInt(temp3[i]) / arr[0].length;

			myCol = (Integer.parseInt(temp3[i]) % arr[0].length == 0) ? arr[0].length - 1
					: Integer.parseInt(temp3[i]) % arr[0].length - 1;

			if (arr[myRow][myCol].equals("X")) {
				System.out.printf("�̹� ����� �¼��Դϴ�.\n", temp3[i]);
				return;
			}
		}

		for (int i = 0; i < temp3.length; i++) {
			myRow = (Integer.parseInt(temp3[i]) % arr[0].length == 0) ? Integer.parseInt(temp3[i]) / arr[0].length - 1
					: Integer.parseInt(temp3[i]) / arr[0].length;

			myCol = (Integer.parseInt(temp3[i]) % arr[0].length == 0) ? arr[0].length - 1
					: Integer.parseInt(temp3[i]) % arr[0].length - 1;

			System.out.printf("[%s]�� �¼��� ����Ǿ����ϴ�.\n", arr[myRow][myCol]);
			arr[myRow][myCol] = "X";
		}

	}

	public void moviePrint() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("[%2s]", arr[i][j]);
			}
			System.out.println();
		}
	}

}