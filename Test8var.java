package net.hb.day0614;

import java.util.Scanner;

public class Test8var {
	private String kind;     //일반전역변수=필드=멤버변수=자동초기화 non-static
	private int count;   //일반전역변수=필드=멤버변수=자동초기화 non-static
	
	private static int pwd;
	private static Scanner sc;
	public static boolean[] book = new boolean[5];
	
	public static void main(String[] args) {
		//지역변수, 전연변수, 매개인자=parameter=argument. static전역변수,
		//블럭지역변수 for{ } while{ } if(){ }
		System.out.println("Test8var.java 10:23 static전역변수 ");
		//Test8var tt8 = new Test8var();
		//tt8.display(4700);
		pwd =1234;
		System.out.println("비번 " + pwd);
		for(int i=0; i<book.length; i++) {
			System.out.println(book[0] + " ");
		}
		
	}//main end
	
	public void display(int count) {
		this.count = count;
		System.out.println("전역변수 count = " + this.count);	//전역변수에 매개변수 넣기
	}
}//class End
