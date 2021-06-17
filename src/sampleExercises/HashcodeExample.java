package sampleExercises;

public class HashcodeExample {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(1, "Vikranth");
		Employee emp2 = new Employee(2, "Chikku");
		
		int a = emp1.hashCode();
		int b = emp2.hashCode();
		
		System.out.println("Hashcode value of a:" +a);
		System.out.println("Hashcode value of b:" +b);
	
		boolean value = emp1.equals(emp2);
		System.out.println(value);
	}

}
