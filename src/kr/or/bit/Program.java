package kr.or.bit;

public class Program {

	public static void main(String[] args) {
		//사원 1명을 생성하고 싶다.
		Emp emp = new Emp();
		emp.empno = 7788;
		emp.ename = "smith";
		emp.job = "manager";
		
		emp.setSal(8000);
		
//		int sal = emp.getSal();
//		System.out.println("급여정보: " +sal); //리턴하면 초기값 0이 떨어진다.
		
		String result = emp.getEmpInfo();
		System.out.println(result);
		
	}

}
