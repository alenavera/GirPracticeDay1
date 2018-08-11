import java.util.ArrayList;
import java.util.List;

class Alpha{
		public String doStuff(String msg) {
			return msg;
		}
	}
class Beta extends Alpha{
	public String doStuff(String msg) {
		return msg.replace('a', 'e');
}}
	class Gamma extends Beta{
		public String doStuff(String msg) {
			return msg.substring(2);
	}}
	public class Test9 {

		public static void main(String[] args) {
		
					List<Alpha>t=new ArrayList<Alpha>();
							t.add(new Alpha());
							t.add(new Beta());
							t.add(new Gamma());
							for (Alpha a: t) {
								System.out.println(a);
								System.out.println(a.doStuff("Java"));
							}	
				}
}