package listInterfaceexercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FruitList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Grapes");
		fruits.add("Banana");
		fruits.add("Kiwi");
		
		String[] fruit = fruits.toArray(new String[fruits.size()]);
		System.out.println(Arrays.toString(fruit));
		
		for(String f : fruits) {
			System.out.println(f);
		}
		
		String[] dryfruits = {"walnuts", "cashew","pista"};
		System.out.println(dryfruits);
		System.out.println(Arrays.asList(dryfruits));
	}

}
