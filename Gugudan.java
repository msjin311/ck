package net.hb.day0614;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		System.out.println("Gugudan.java11:03");
		new Gugudan().display(); //익명의개체
		System.out.println("수요일 ");
		System.out.println("목요일 ");
	}//main end
	
	public void display() {
		int dan = 0;
		try {
			//Scanner sc = null; // new Scanner(System.in);
//			Scanner sc = new Scanner(System.in)
//			sc.nextInt();
			System.out.println("원하는 단 입력>>>");
//			dan = sc.nextInt();
		    dan = new Scanner(System.in).nextInt();
		} catch (Exception e) {

		}
		for (int i = 1; i < 10; i = i + 1) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
		}
		//sc.close();
	}
}//class End
