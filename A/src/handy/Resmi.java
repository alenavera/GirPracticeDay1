package handy;

import java.util.Arrays;
 class MyException extends RuntimeException {}
public class Resmi{
	 int sum = 0;
	 public void doCheck(int number) {
	 if (number % 2 == 0) {
	 break;
	 } else {
	 for (int i = 0; i < number; i++) {
	 sum += i;
	 }
	 }
	 }
	 public static void main(String[] args) {
	 Resmi obj = new Resmi();
	 System.out.println("Red " + obj.sum);
	 obj.doCheck(2);
	 System.out.println("Orange " + obj.sum);
	 obj.doCheck(3);
	 System.out.println("Green " + obj.sum);
	 }
	}
	
//	private int i=0;
//void disp() {
//		while(i<=5)
//		{for (int i = 1; i <=5;) {
//			
//		
//			System.out.print(i+"  ");
//		i++;
//			}
//		i++;
//		}}public static void main(String[] args) {
//			new Resmi().disp();
//		}
//	
//	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//		try{
//		method1();
//		}
//		catch (MyException ne) {
//			System.out.print("A");
//		}
//	}
//	public static void method1() {
//		try{
//			throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
//		}
//		catch (RuntimeException re) {
//			System.out.print("B");
//
//		}
//	}
//}


//
//	public static void main(String[] args) {
//		Boolean[] bool = new Boolean[2];
//		bool[0] = new Boolean(Boolean.parseBoolean("true"));
//		bool[1] = new Boolean(null);
//		System.out.println(bool[0] + " " + bool[1]);
//				
//	}
//}
