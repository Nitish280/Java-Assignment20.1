import java.util.HashMap;
import java.util.Map;

/*
 * here we are creating an application of generic HashMap
 * with employee code as key and employee name as value
 */
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// here we are Using hash map function
		// here we takes integer = key and String =value
		HashMap<Integer, String> emp = new HashMap<Integer, String>();
		// here we are Putting the value
		emp.put(101, "Nitish");
		emp.put(103, "Vishal");
		emp.put(105, "Abhishek");
		emp.put(102, "Bhwani");
		emp.put(104, "Vikash");
		emp.put(100, "Rahul");
		// here we are Mapping key with the value
		for (Map.Entry m : emp.entrySet()) {
			// here we are printing the value
			System.out.println(m.getValue());
		}
	}
}
