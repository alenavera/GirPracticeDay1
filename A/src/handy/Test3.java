package handy;




// 
//    void readCard(int carNo) throws Exception {
//        System.out.println("Reading Card");
//    }
// 
//    void checkCard(int carNo)  throws RuntimeException {
//        System.out.println("Checking Card");
//    }
// 
//    public static void main(String[] args) { // line n1
//        Test ex = new Test();
//        int carNo = 12344;
//        ex.checkCard(carNo); // line n2
//        ex.readCard(carNo); // line n3
//    }
//}
public class Test3 {
	 
    void readCard() throws Exception {
        System.out.println("Reading Card");
    }
 
    void checkCard(int carNo) throws Exception {
        System.out.println("Checking Card");
    }
 
    public static void main(String[] args) throws RuntimeException { // line n1
        Test3 ex = new Test3();
        int carNo = 12344;
        ex.checkCard(carNo); // line n2
        ex.readCard(carNo); // line n3
    }
}
//public static void main(String[] args) throws Exception {
// Candidate c = new Candidate("James", 20);
// Candidate c1 = new Candidate("Williams", 32);
// System.out.println(c);
// System.out.println(c1);
// }
// }

//	 public static void main(String[] args) {
//	 Test ts = new Test();
//	 System.out.print(isAvailable + " ");
//	 isAvailable = ts.doStuff();
//	 System.out.println(isAvailable);
//	 }
//	 public static boolean doStuff() {
//	 return !isAvailable;
//	 }
//	 static boolean isAvailable = false;
//	}
