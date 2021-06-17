package listInterfaceexercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> names = new LinkedList<>();
		names.add("Sita");
		names.add("Rita");
		names.add("Mita");
		
		System.out.println("names: "+names);
		
		Iterator<String> itr = names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.sort(names);
		System.out.println("names: "+names);
		
		String[] str = names.toArray(new String[names.size()]);
		Arrays.sort(str);
		System.out.println("str:" +Arrays.toString(str));
		
		
	}

}
