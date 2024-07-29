package exercise;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		
		
		Set<String> cars = new HashSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");
	    cars.add("Mazda");
	    cars.add("Mazda");
	    System.out.println(cars);
	    
	    System.out.println("element count: " + cars.size());
		
		
//	    for( String ele : cars) {
//	    	
//	    	System.out.println("element are: " + ele);
//	    	
//	    }
		
	    
	    System.out.println(cars.contains("Mazda"));
	    
	    
	    
	    

	}

}
