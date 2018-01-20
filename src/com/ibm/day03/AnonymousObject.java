package com.ibm.day03;


/**
 * 匿名对象练习
 * @param args
 */
	class Person{
		private String name;
		private int age;
		private int score;
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
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
		public Person(String name, int age, int score) {
			super();
			this.name = name;
			this.age = age;
			this.score = score;
			System.out.print("Hello World!\n");
		}
		
		
		
		public Person(int age, int score) {
			super();
			this.age = age;
			this.score = score;
			this.name = "";
		}
		public Person(String name, int score) {
			super();
			this.name = name;
			this.score = score;
			this.age = 0;
		}
		public void show(){
			System.out.print("name:"+this.name+"\nage:"+this.age+"\nscore:"+this.score);
		}
		
		
	}

public class AnonymousObject {

	
	public static void main(String[] args) {
		
//		Person per = new Person("Adrian",28,100);
//		per.show();
		
		new Person("Allen",28,100).show();
		
		
	}

}
