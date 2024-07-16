package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable {
	
    private double width;
    private double height;
    
    
	public Rectangle() {
		super();
	}
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
    
    public void resize(double s) {	//기존 width와 height를 해당 인자를 곱한 값으로 변경합니다. (예: width = width * s; )
    	this.width=this.width*s;
    	this.height=this.height*s;
    }
    
    public double getArea() {		//넓이
    	return width*height;
    }
	
    public double getPerimeter() {	//둘레
    	return (width+height)*2;
    }

}