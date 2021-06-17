package sampleExercises;

public class Employee {
	int regNo;
	String name;
	
	Employee(int regNo, String name){
		this.regNo = regNo;
		this.name = name;
	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
//	@Override  
//	public boolean equals(Object obj)   
//	{  
//	if (obj == null)   
//	return false;  
//	if (obj == this)  
//	return true;  
//	return this.getRegNo() == ((Employee) obj). getRegNo();  
//	}  
}
