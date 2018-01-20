package com.ibm.day04;
import java.util.Random;



/**
 * 重写是在继承中在子类中将父类中的方法重新定义（函数名，参数类型，个数，返回类型相同）
 * 如果在子类中需要强制执行父类中的同名方法，使用super关键字
 * 被重写的方法不能有比父类中的方法更严格的访问权限 private<default<public
 * private 当前类
 * default 同一包下访问
 * public 整个工程
 * 
 * @author Adrian
 *
 */

class A{
	private int test01;
	private String str01;
	public int getTest01() {
		return test01;
	}
	public void setTest01(int test01) {
		this.test01 = test01;
	}
	public String getStr01() {
		return str01;
	}
	public void setStr01(String str01) {
		this.str01 = str01;
	}
	
	public void tell(){
		System.out.println("I'm in class A");
	}
	
}

class B extends A{
	
	public void tell(){
		super.tell();
		System.out.println("I'm in Class B");
	}
	
}

public class SuperPractise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		B b = new B();
//		b.tell();
		new B().tell();
        int max=20;
        int min=10;
        Random random = new Random();

        int s = random.nextInt(max)%(max-min+1) + min;
        System.out.println(s);		
		
	}

}
