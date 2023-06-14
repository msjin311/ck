package net.hb.day0614;

public class User {
	//ㄴ 필드 int pwd, String email, int count=0;
	//ㄴ 생성자
	//ㄴ public void check(){ pwd자릿수4~8,메일데이터@ }
    private int pwd, count=0;
	private String email;

	public int getPwd() {
		return pwd;
	}

	public void setPwd(int pwd) {
		this.pwd = pwd;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
	public void check() {
		if(4<=pwd && pwd<=8) {
			
		}
		
	}
	

}
