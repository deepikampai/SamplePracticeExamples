package com.precision.assessment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Employee{
	int empId;
	String name;
	
	Employee(int i, String s){
		this.empId = i;
		this.name = s;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}
	
	
}
public class setExercise {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Chikku");
		Employee e2 = new Employee(1, "Chikku");
		
		Set<Employee> eSet = new HashSet<>();
				
				eSet.add(e1);
				eSet.add(e2);
				
				Iterator<Employee> itr = eSet.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
				
				
				Set<String> names = new HashSet<>();
				names.add("AAA");
				names.add("AAA");
				
				Iterator<String> sItr = names.iterator();
				while(sItr.hasNext()) {
					System.out.println(sItr.next());
				}
	}		

}
