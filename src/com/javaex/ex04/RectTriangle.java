package com.javaex.ex04;

public class RectTriangle extends Shape{
	
    private double width;
    private double height;
    
    
	public RectTriangle() {
		super();
	}
	public RectTriangle(double width, double height) {
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
		return "RectTriangle [width=" + width + ", height=" + height + "]";
	}
	
	public double getArea() {
		return width*height*(0.5);
	}
    
	public double getPerimeter() {
		return width+height+Math.sqrt(width*width+height*height);
	}
    

    
}