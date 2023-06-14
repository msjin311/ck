package net.hb.day0614;

public class Test7var {
	private String kind;     //일반전역변수=필드=멤버변수=자동초기화 non-static
	private int count=7800;   //일반전역변수=필드=멤버변수=자동초기화 non-static
	
	public static void main(String[] args) {
		//지역변수, 전연변수, 매개인자=parameter=argument. static변수,
		System.out.println("Test7var.java 10:05");
		Test7var t7 = new Test7var();
		t7.display(4100);
	}//main end
	
	public void display(int count) {
		System.out.println("매개변수 count = " + count); //4100
		System.out.println("전역변수 count = " + this.count);	//7800
	}
}//class End
