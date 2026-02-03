package com.example.demo;

public class Rush {
	private int a,b;
	private int result;
	public void setA(int a) {
		this.a=a;
	}
	public void setB(int a) {
		this.b=a;
	}
	public void setResult(){
		  this.a=a;
		  this.b=b;
	      this.result = a*2+b*10;
	   }
	   public void getResult(){
	      System.out.println("Your Message : " + this.result);
	   }
}
