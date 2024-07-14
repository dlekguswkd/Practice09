package com.javaex.ex02;

public class Friend {
	
	//java.util.Scanner 클래스를 이용하여 친구정보를 입력받아 Friend 객체를 생성하고 이들을 Friend 객체 배열에 저장하세요.
	//친구 즉, 친구(Friend)객체를 3개 입력 받으면 이들을 모두 화면에 출력하세요.

    private String name;
    private String hp;
    private String school;
    
    
	public Friend() {
		super();
	}
	public Friend(String name, String hp, String school) {
		super();
		this.name = name;
		this.hp = hp;
		this.school = school;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	
	@Override
	public String toString() {
		return "Friend [name=" + name + ", hp=" + hp + ", school=" + school + "]";
	}

	public void showInfo() {
		System.out.println("이름: "+name+ "  핸드폰: "+ hp+ "  학교: "+ school);
	}

}
