package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("친구를 3명 등록해 주세요");
    	
    	ArrayList<Friend> fArr=new ArrayList<Friend>();
    	
    	for(int i=0; i<3; i++) {
    		String info= sc.nextLine();
    		String[] iArr=info.split(" ");
    		
    		String name=iArr[0];
    		String hp=iArr[1];
    		String school=iArr[2];
    		
    		Friend friend=new Friend();
    		
    		friend.setName(name);
    		friend.setHp(hp);
    		friend.setSchool(school);
    		
    		fArr.add(friend);
    		
    	}
    	
    	for(int i=0; i<fArr.size(); i++) {
    		fArr.get(i).showInfo();
    	}
    	
    	sc.close();
    }

}
