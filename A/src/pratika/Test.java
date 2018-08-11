package pratika;

public class Test {
public static void main(String[] args) {
double discount = 0;
int qty = Integer.parseInt(args[0]);
//line 1
//A: True
if (qty >= 90) {discount = 0.5;}
if (qty > 80 && qty >= 90) ? 0.5 : 0;
discount = (qty > 80) ? 0.2 : 0; 

System.out.println(discount);




}}

//https://read.amazon.com/?asin=B00TVERES2







////	public class Test {
//	 	 void readCard(int cardNo) throws Exception {
//	 	 	 System.out.println("Reading card");
//	 	 }
//	void checkCard(int cardNo)throws RuntimeException{
//	 	 	 System.out.println("Checking card");
//	 	 }
//	 	 public static void main(String[] args) {
//	 	 Test ex = new Test();
//	 	 int cardNo = 12344;
//	 	 ex.checkCard(cardNo);	 	 //line n2
//	 	 ex.readCard(cardNo);		 //line n3
//	 	 }
////}
//class A{
//	 	 public A(){
//	 	 	 System.out.print("A ");
//	 	 }}
//	 	 
//	 	 
//	 	 
//	 	 
//
//class B extends A{
//	 	 public B(){	 	 	 	 // line n1
//	 	 	 System.out.print("B ");
//	 	 
//}}
//public class Cr extends B{
//	 	 public Cr(){ // line n2
//	 	 	 System.out.print("C ");
//	 	 }
//	 	 public static void main(String [] args){
//	 	 	 Cr c = new Cr();
//	 	 }
//}