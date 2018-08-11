package handy;
class Shape{}
class Square extends Shape{}

	
	public class CheckingAccount {



public static void main(String[] args) {
	Shape shape1=null;
	Square square2=null;
	shape1=(Square)new Square();
	//shape1=(Square)new Shape();
;shape1=new Shape();
square2=new Square();
shape1=square2;
}
}

