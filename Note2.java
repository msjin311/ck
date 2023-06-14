package net.hb.day0614;

public class Note2 {
	private String title="수요일";
	
	private void Method() {
		System.out.println(this.title);
	}
	
	public static void main(String[] args) {
		System.out.println("Note2var.java 10:39 블럭 title전역변수");
		Note2 wow = new Note2();
		wow.Method();
		
		
		// 1번 static키워 static 넣기
		// 2번 메서드사용 
		// 3번 개체생성 Note2 wow = new Note2();
		//            System.out.println(wow.title);
		

	}//main end
}//class End
