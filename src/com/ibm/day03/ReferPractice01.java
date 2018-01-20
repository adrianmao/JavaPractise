package com.ibm.day03;

/**
 * java中的String是传值调用，而对象全部都是传引用调用
 * @author Adrian
 *
 */
class Ref1{
	int temp = 10;
	String tmpstr = "Hello";
}

public class ReferPractice01 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ref1 ref = new Ref1();
		ref.temp = 20;
		System.out.println(ref.temp);
		System.out.println(ref.tmpstr);
		tell(ref);
		System.out.println(ref.temp);
		System.out.println(ref.tmpstr);
		tell(ref.tmpstr);
		System.out.println(ref.tmpstr); 
	}
	
	public static void tell(Ref1 ref){
		ref.temp = 30;
		ref.tmpstr = "World";
	}
	
	public static void tell(String str){
		str = "NEW";
	}

}
