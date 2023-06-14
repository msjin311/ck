package net.hb.day0614;

public class Test9var {

	public static void main(String[] args) {
		//지역변수, 전연변수, 매개인자=parameter=argument. static전역변수,
		//블럭지역변수 for{ } while{ } if(){ }
		System.out.println("Test8var.java 10:36 블럭 su지역변수 ");

		for(int i=0; i<10; i++) {
			int su=0;
			su=su+3;
			System.out.print(su + "7c ");
		}//i end
		
		System.out.println();
		System.out.println("대한민국");
		System.out.println("화려강산");
		//System.out.println("su " + su); 블럭지역변수
		
	}//main end
	
}//class End
