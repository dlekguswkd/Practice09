package com.javaex.ex03;

public class Goods {
	
	//java.util.Scanner 클래스를 이용하여 상품을 입력받아 Goods 객체를 생성하고 이들을 ArrayList 에 저장하세요.
	//상품입력은 상품명,가격,개수 형태로 콤마(,)로 구분하여 입력합니다.
	//“q”가 입력되면 입력이 종료되며 등록된 상품 리스트 모두가 출력됩니다.

	private String name;
	private int price;
	private int count;
	
	
	public Goods() {
		super();
	}
	public Goods(String name, int price, int count) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", count=" + count + "]";
	}

	public void showInfo() {
		System.out.println(name+ "(가격:"+price+"원)이 "+count+ " 개 입고 되었습니다.");
	}
	

}
