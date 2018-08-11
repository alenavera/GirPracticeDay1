import java.util.ArrayList;
import java.util.List;

interface Contract{}
class Super implements Contract{}
class Sub extends Super{}
public class Refa {
public static void main(String[] args) {
	List obj=new ArrayList();
	Contract c1=new Super();
	Contract c2=new Sub();
	Super c3=new Sub();
	obj.add(c1);
	obj.add(c2);
	obj.add(c3);
	for (Object k : obj) {
		System.out.println(k.getClass().getName());
	}
;}
}
