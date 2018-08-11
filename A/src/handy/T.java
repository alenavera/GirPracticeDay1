package handy;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
class MissingInfoException extends Exception { }
class AgeOutofRangeException extends Exception { }
class Candidate {
 String name;
 int age;
 Candidate(String name, int age) throws Exception {
 if (name == null) {
 throw new MissingInfoException();
 } else if (age <= 10 || age >= 150) {
 throw new AgeOutofRangeException();
 } else {
 this.name = name;
 this.age = age;
 }
 }
 public String toString() {
 return name + " age: " + age;
 }
}


//
//class X{
//	 X(){}
////	 private void one() {System.out.println("hi");}
////}
//class Star{
//	public void doStuff() {
//		System.out.println("Twinkling star");
//	}
//}
//interface Universe{
//	public void doStuff();
//	
//}
//class Sun extends Star implements Universe{
//	public void doStuff() {
//		System.out.println("Shining Sun");
//	}
//}

public class T {
	

//		
//		LocalDate date1 = LocalDate.now();
//		LocalDate date2 = LocalDate.of(2014, 6, 20);
//		LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
//		System.out.println("date1 = " + date1);
//		System.out.println("date2 = " + date2);
//		System.out.println("date3 = " + date3);
		
		
//	Sun obj2=new Sun();
//	Star ob3=obj2;
//	((Sun)obj3).doStuff();
//	((Star)obj2).doStuff();
//	((Universe).obj2).doStuff();
//	
//	
//	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//
//	public static void main(String[] args)  {
//		try {
//			doSomething();
//		} catch (IOException  e) {
//			System.out.println(e);
//		}
//	}
//
//	static void doSomething() throws IOException {
//		if (Math.random() > 0.5)
//			throw new IOException();
//		throw new RuntimeException();
//	}
//}

// String str="default";
// Y(String s){str=s;}
// void print() {System.out.println(str);}
// public static void main(String[] args) {
// new Y("hello").print();
// }

// abstract class ABS extends Y{}

// Y(){}
// void two() {one();}
// public static void main(String[] args) {
// new Y().two();
// }
// }
// public static void main(String[] args) {
//
//
// String message1="Wham ham";
//
// String message2="Wham ham";
// if(message1==message2)
// System.out.println("They match");
// if(message1.equals(message2))
// System.out.println("They really match");
// }}

//// import handy.dandy.*;
// import handy.dandy.Keystroke;
// public class Greet {
// public static void main(String[] args) {
// String greeting="Hello";
// System.out.println(greeting);
//// handy.dandy.Keystroke stroke=new handy.dandy.Keystroke();
// Keystroke stroke=new Keystroke();
//
//
//
//
// stroke.typeExclamation();
