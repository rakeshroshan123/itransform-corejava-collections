package collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ContactMain 
{
	public static void main(String[] args) {
		TreeMap<Long, Contact> tree = new TreeMap<>();
		Contact s1 = new Contact(1,"roshan","roshan@gmail.com","male");
		Contact s2 = new Contact(2,"rakesh","raki@gmail.com","male");
		Contact s3 = new Contact(3,"manoj","manoj@gmail.com","male");
		Contact s4 = new Contact(4,"meghana","megha@gmail.com","female");
		
		tree.put((long) 1, s1);
		tree.put((long) 2,s2);
		tree.put((long) 3,s3);
		tree.put((long) 4,s4);
		
		Set keys = tree.keySet();
		System.out.println(keys);
		
		Collection<Contact> values = tree.values();
		System.out.println(values);
		
		Set<Map.Entry<Long, Contact>> entries = tree.entrySet();
		System.out.println(entries);
		
	}

}