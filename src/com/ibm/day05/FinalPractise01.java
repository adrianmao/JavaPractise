package com.ibm.day05;
/**
 * final关键字，完结器
 * final申明的类不能被继承
 * 		申明的的方法不能被重写
 * 		申明的变量为常量，不可以被修改
 * 
 * @author Adrian
 *
 */

class A{
	public int a = 0;
	public final void tell(){}
}

class  B extends A{
	final private int a=0;
//	public final void tell(){}
	//error!
}

public class FinalPractise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.a=1;
		System.out.println(a.a);
		
		final A aa=new A();
		aa.a=2;
//		aa=a;//error
		a=aa;
		System.out.println(aa.a);
		
		final int b;
		b=2;
//		b=3;
		System.out.println(b);		
		
	}

}
