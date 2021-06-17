package setInterfaceExercise;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> names = new HashSet<>();
			names.add("Meena");
			names.add("Veena");
			names.add("Jeena");
			names.add(null);

			Iterator itr = names.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
//				System.out.println(names);
			}
	}

}
