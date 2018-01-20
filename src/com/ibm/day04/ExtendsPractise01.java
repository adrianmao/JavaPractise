package com.ibm.day04;

/**
 * java是单继承
 * 子类不可以直接访问父类私有成员，需要通过get和set方法实现
 * @author Adrian
 *
 */

class Person{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void tell(){
		System.out.println("Name:"+this.name);
		System.out.println("Age:"+this.age);
	}

}

class Student extends Person{
	private int score;
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	class Worker extends Person{
		
	}



	public void show(){
		System.out.println("Score:"+this.score);
	}
	
}



public class ExtendsPractise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
