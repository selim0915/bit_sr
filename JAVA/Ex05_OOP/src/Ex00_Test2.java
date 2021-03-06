/*
 * 카페의 매출을 관리하는 솔루션 개발
* =================================
* 카페는 2종류의 커피와 2종류의 차를 팔고 있습니다.
*
* 커피와 차는 각각 고유의 가격을 가지고 있습니다.
* 커피는 Americano, CaffeLatte라는 이름을 가지고 있습니다.
* 차는 Chamomile, MilkTea라는 이름을 가지고 있습니다.
* Coffee 클래스와 Tea 클래스가 존재한다.
* 커피 2종류와 차 2종류는 Coffee 클래스와 Tea 클래스를 상속한다.
* ex) Americano - 2000원, MilkTea - 3000원
*
* 시뮬레이션 시나리오
* 카페 : 매출 정보를 가지고 있다.
* 예 : 현재까지 매출 5000원
* 카페는 음료(Drink)를 판다. 음료를 팔면 매출이 증가한다.
* 매출은 0으로 시작한다.
* 음료를 파는 함수는 sell 하나만 만들어 사용한다.
* 음료를 팔면 어떤 음료를 판매했는지 출력하고
현재 매출이 얼마인지 출력한다.
 */

class Coffee extends drink {
	Coffee(int price) {
		super(price);
	}
}

class Americano extends Coffee {
	public Americano() {
		super(2000);
	}

	@Override
	public String toString() {
		return "아메리카노";
	}
}

class CaffeLatte extends Coffee {
	public CaffeLatte() {
		super(3000);
	}
	
	@Override
	public String toString() {
		return "카페라떼";
	}
}

class tea extends drink {

	tea(int price) {
		super(price);
	}
	
	
}

class Chamomile extends tea {
	public Chamomile() {
		super(4000);
	}
	@Override
	public String toString() {
		return "카라멜";
	}
}

class MilkTea extends tea {
	public MilkTea() {
		super(5000);
	}
	@Override
	public String toString() {
		return "밀크티";
	}
}

class drink {
	int price;

	public drink(int price) {
		this.price = price;
	}
}

class cafe {
	/*
	 * 시뮬레이션 시나리오 카페 : 매출 정보를 가지고 있다.
	 *  예 : 현재까지 매출 5000원 카페는 음료(Drink)를 판다.
	 *   음료를 팔면매출이 증가한다. 
	 *   매출은 0으로 시작한다.
	 *    음료를 파는 함수는 sell 하나만 만들어 사용한다. 
	 *    음료를 팔면 어떤 음료를 판매했는지 출력하고 현재 매출이 얼마인지 출력한다.
	 */

	int sales = 0;

	public void sell(drink d) {
		this.sales += d.price;
		System.out.println(d.toString()+"을 "+d.price+"팔았다!");
	}

}

public class Ex00_Test2 {

	public static void main(String[] args) {
		Americano a = new Americano();
		CaffeLatte c = new CaffeLatte();
		Chamomile c2 = new Chamomile();
		MilkTea m = new MilkTea();
		
		cafe p = new cafe();
		p.sell(a);
		p.sell(c);
		p.sell(c2);
		p.sell(m);
		
	}

}
