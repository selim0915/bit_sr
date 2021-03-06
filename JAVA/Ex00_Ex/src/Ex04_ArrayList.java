import java.util.ArrayList;

class Student{
	String name;
	int num;
	String major;
	private ArrayList alist;
	
	public Student(String name, int num, String major) {
		super();
		this.name = name;
		this.num = num;
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", num=" + num + ", major=" + major + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
}

public class Ex04_ArrayList {

	public static void main(String[] args) {

		// 1.Arraylist를 사용해 (generic사용 X)
		// int값 string값을가진 객체를 2개씩 생성하여 개선된 for문으로 값을 출력하시오.
//		ArrayList arr = new ArrayList();
//		arr.add(1);
//		arr.add(2);
//		for (Object obj : arr) {
//			int num = (int) obj;
//			System.out.println(num);
//		}
//
//		ArrayList arr2 = new ArrayList();
//		arr2.add("가");
//		arr2.add("나");
//		for (Object obj : arr2) {
//			String num = (String) obj;
//			System.out.println(num);
//		}
		
		ArrayList arr = new ArrayList();
		arr.add("1");
		arr.add(2);
		for (Object obj : arr) {
			System.out.println(obj);
		}
		

		
		// 2. 방금 만든 Arraylist의 1번째 2번째의 방의 값을 지우고 출력하시오.
		System.out.println(arr.toString());
		arr.remove(0);
		System.out.println(arr);
		arr.remove(0);
		System.out.println(arr);
		
		
		
		// 3. 값이 지워진 Arraylist의 값 중간에 hello, would를 넣어보세요.
		arr.add("1");
		arr.add(2);
		System.out.println(arr);
		arr.add(1, "hello");
		arr.add(2, "would");
		System.out.println(arr);
		
		
		
		//4. 새로운 class를 만들어 이름 학번 전공 변수를 넣고  
		//Arraylist<generic>을 사용하여 출력하시오.
		ArrayList<Student> s = new ArrayList<Student>();
		s.add(new Student("우",1234,"it"));
		s.add(new Student("강",2345,"it"));
		for(Object obj : s) {
			System.out.println(obj);
		}
		
		for(int i=0; i<s.size(); i++) {
			System.out.println(s.get(i));
		}
		
		
		
		// 5. 이름하고 전공만 출력하시오.
		for(Student obj : s) {
			System.out.println(obj.getName()+"/"+obj.getMajor());
		}
		
		
	}

}
