package net.hb.day0614;

public class Test2var {
	private String kind;     //일반전역변수=필드=멤버변수=자동초기화 non-static
	public int count=7800;   //일반전역변수=필드=멤버변수=자동초기화 non-static
	
	public static void main(String[] args) {
		//지역변수, 전연변수, static변수, 매개인자
		//static키워드 있는곳에서는 static키워드만 접근가능
		int count=0; //local variable=지역변수 초기화 직접 할당
		count = count  + 1500;
		System.out.println("지역변수 count = " + count);
		System.out.println("전역변수 count = " + count);
		//현재클래스 필드,메소드, 접근지정자 this인데 static문맥에서 사용불가
		Test2var tv = new Test2var();
		tv.display();
	}//main end
	
	//새로운 non-static메서드 생성, 새로운메서드를 display()를 main함수에서호출 new키워드
	public void display() {
		int count=0; //local variable=지역변수 초기화 직접 할당
		count = count  + 1500;
		System.out.println("지역변수 count = " + count); //1500
		System.out.println("전역변수 count = " + this.count);	//7800	
	}
}//class End
