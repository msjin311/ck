package net.hb.day0614;

public class Test {

	public static void main(String[] args) {
		String a="apple";
		String b="blue";
		String c="cherry";
		
		String[] fruit = {"수박", "블베", "참외"} ;
		System.out.println(fruit[0] );
		System.out.println(fruit[1]);
		System.out.println(fruit[2]);
		System.out.println();
		
//		String[][] name = new String[3][5]; //2차원
//		String[]my =new String[3];
//		my[0]="orange" ; my[1]="kiwi" ; my[2]="toamto " ;
//		for(int i=0; i<3; i++) {
//			System.out.println(my[i]);
//		}
		
		System.out.println();
		String data1 = args[0]; //0.1%활용도
		String data2 = args[1]; //0.1%활용도
		System.out.println("베스트셰프" + data1);
		System.out.println("베스트셰프" + data2);
		
//		String[][] name = new String[3][5]; //2차원
		String[] my =new String[3];
		my[0]="orange" ; my[1]="kiwi" ; my[2]="toamto " ;
		for(int i=0; i<3; i++) {
			System.out.println(my[i]);
		}
		
	}//main end
}//class End
