package sampleExercises;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class SerializationExample {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1232423, "Test");
		 String data2 = "This is programiz";
		try {
		// TODO Auto-generated method stub
		   
//			FileOutputStream fout = new FileOutputStream("emp.txt");
			FileOutputStream fout = new FileOutputStream("employee.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
//			out.writeObject(data2);		
			out.writeObject(emp1);	
			out.flush();
			out.close();
			System.out.println("Successfully created");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
