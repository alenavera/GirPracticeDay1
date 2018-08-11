package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HasMapp {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Gulzhan");
		hm.put(2, "Aizhan");
		hm.put(3, "Raushan");
		hm.put(4, "Kuban");
		System.out.println(hm.get(3));

		for (Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println(hm);

		HashMap<Integer, Employee> mp = new HashMap<Integer, Employee>();
		Employee t1 = new Employee("Lena", 20, "USA");
		Employee t2 = new Employee("Vera", 30, "France");
		Employee t3 = new Employee("Tom", 40, "Japan");
		Employee t4 = new Employee("Alex", 50, "Turkey");

		mp.put(1, t1);
		mp.put(2, t2);
		mp.put(3, t3);
		mp.put(4, t4);
		for (Entry<Integer, Employee> p : mp.entrySet()) {

			int key = p.getKey();
			Employee w = p.getValue();
			System.out.println(key + " " + "Info");
			System.out.println(w.name + " " + w.age + " " + w.place);
		}
	}

}
