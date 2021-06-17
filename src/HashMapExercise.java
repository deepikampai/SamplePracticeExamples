import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Map<String, Integer> studentInfo = new HashMap<>();
	
	studentInfo.put("Vishal", 10);
	studentInfo.put("Rushal", 20);
	studentInfo.put("Trishal", 10);
	
//	System.out.println("Size of map:" +studentInfo.size());
//	System.out.println(studentInfo);
	
	for(Map.Entry<String, Integer> info: studentInfo.entrySet()) {
		System.out.println("Key:" +info.getKey() +"," +"value:" +info.getValue());
	}
	
	for(String name:studentInfo.keySet()) {
		System.out.println("Key:" +name);
	}

	for(Integer no:studentInfo.values()) {
		System.out.println("value :" +no);
	}
	
	Iterator<Map.Entry<String,Integer>> itr = studentInfo.entrySet().iterator();
	while(itr.hasNext()) {
		Map.Entry<String,Integer> entry = itr.next();
		System.out.println("key= " +entry.getKey() +"," +"value = " +entry.getValue());
	}
	
	studentInfo.forEach((k,v) -> System.out.println("key =" +k+ ", value =" +v));
 }

}
