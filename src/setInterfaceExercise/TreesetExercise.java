package setInterfaceExercise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreesetExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> names = new TreeSet<>();
		   names.add("Peena");
			names.add("Meena");
			names.add("Veena");
//			names.add(null);
			names.add("Jeena");
			Iterator ascItr = names.iterator();
				while(ascItr.hasNext()) {
					System.out.println(ascItr.next());
				}
			System.out.println("--------------------");
			Iterator itr = names.descendingIterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
			TreeSet<Integer> set=new TreeSet<Integer>();  
	         set.add(24);  
	         set.add(66);  
	         set.add(12);  
	         set.add(15); 
	         System.out.println(set.pollFirst());
	         System.out.println(set.pollLast());
	         
	         
			
	}

}
