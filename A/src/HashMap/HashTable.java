package HashMap;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTable {
public static void main(String[] args) {
	Hashtable h=new Hashtable();
	h.put("A","Gulshan");
	h.put("B","Atakan");
	h.put("C","Raushan");
	h.put("D","Aizhan");
	h.put("E","Yusuf");
	//print all valus from hashtable using    ENUMARATION ---ELEMENTS
	Enumeration e=h.elements();
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
	//GET ALL THE VALUES FROM HASHTABLE USING --entrySet()------set of hashtable values
	Set s=h.entrySet();
	System.out.println(s);
	
	///check both hashtable are equal or not
	
	Hashtable h1=new Hashtable();
	h1.put("A","Gulshan");
	h1.put("B","Atakan");
	h1.put("C","Raushan");
	h1.put("D","Aizhan");
	h1.put("E","Yusuf");
	if(h.equals(h1)) {
		System.out.println("Both are equal");
		//get the value from key
		System.out.println(h1.get("A"));
		System.out.println(h1.hashCode());
	}
}
}
