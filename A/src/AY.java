
public class AY {
public static void main(String[] args) {
	int ax=10,az=30;
	int aw=1,ay=1;
	try {
		aw=ax%2;
		ay=az/aw;
	}catch(ArithmeticException e1) {
		System.out.println("Invalid Divisor");
	}catch(Exception e2) {
		aw=1;
		System.out.println("Divisor changed");
	}ay=az/aw;
	System.out.println("successful division"+ay);
}
}
//https://www.amazon.com/gp/css/order-history/ref=nav_nav_orders_first