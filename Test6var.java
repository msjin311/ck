package net.hb.day0614;

public class Test6var {
	private String kind;     //일반전역변수=필드=멤버변수=자동초기화 non-static
	private int count=7800;   //일반전역변수=필드=멤버변수=자동초기화 non-static
	
	public static void main(String[] args) {
		//지역변수, 전연변수, static변수, 매개인자
		System.out.println("Test6var.java 9:37");
		Test6var t6 = new Test6var();
		t6.display();
	}//main end
	
	public void display() {
		//지역변수없고, 전역변수만 있을때 this생략해도 전역변수접근
		System.out.println("지역변수 count = " + count); //7800
		System.out.println("전역변수 count = " + this.count);	//7800	
	}
}//class End
