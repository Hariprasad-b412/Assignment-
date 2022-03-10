package demo;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
	List<String> list = new LinkedList<>();
		
		list.add("Hari");
		list.add("Prasad");
		list.add("Rohan");
		list.add("Ankith");
		list.add("Rocky");
		list.add("Aman");
		list.add("Vishnu");
		list.add("Vinod");
		list.add("Dinesh");
		
		
		  Collection.sort(list, (a, b) -> a.name.compareToIgnoreCase(b.name));
	        System.out.println(list);

	}

}
