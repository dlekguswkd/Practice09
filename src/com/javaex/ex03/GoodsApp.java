package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("상품을 입력해주세요(종료 q)");
    	
    	
    	ArrayList<Goods> gArr=new ArrayList<Goods>();

    	int sum=0;
    	
    	while (true) {
    		String info=sc.nextLine();
    		
    		if(info.equals("q")) {
    			System.out.println("[입력완료]");
    			System.out.println("=============");
    			break;
    		}
    		
    		String[] iArr= info.split(",");
    		
    		String name = iArr[0];
			int price = Integer.parseInt(iArr[1]);
			int count = Integer.parseInt(iArr[2]);
			
			Goods goods = new Goods();
			goods.setName(name);
			goods.setPrice(price);
			goods.setCount(count);

			gArr.add(goods);
			sum=sum+count;
    	}
    	
    	for(int i=0; i<gArr.size(); i++) {
    		gArr.get(i).showInfo();
    	}
       System.out.println("모든 상품의 갯수는 "+sum+"개 입니다.");
    	
    	sc.close();
    }

}
