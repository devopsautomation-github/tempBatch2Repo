package exercise;

import java.util.ArrayList;
import java.util.Collections;

//import java.util.ArrayList;
//import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		
		
		
		//ctrl+shift+O   ----- add import / remove unused import statement
		
		
		//indexed
		//duplicate
		
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Toyota");
	    cars.add("Mazda");
//	    System.out.println(cars);
//		
//	    System.out.println("-------------Insert element at the beginning of the list (0)-------------------");
//	    cars.add(0, "Mazda.......");
//	    System.out.println(cars);
//	    
//	    
//	    cars.set(0, "updatedValueMazda");
//	    System.out.println("-------------modified the index 0 value-------------------");
//	    System.out.println(cars);
//	    
//	    
//		System.out.println("Index 0:  " + cars.get(0));
//		
//		
//		
//		System.out.println("element count: " + cars.size());
		
//		
//		for (int i = 0; i < cars.size(); i++) {
//			
//			
//			System.out.println("element are: " + i + " : " + cars.get(i));
//			
//			
//		}
		
//	    Collections.sort(cars);  // Sort cars
	    
	    System.out.println("==================before sort=============================");
	    
	    for (String ele : cars) {
	    	
	        System.out.println(ele);
	        
	      }
		
	    System.out.println("==================after sort=============================");
	    
	    Collections.sort(cars);  // Sort cars
	    
	    
	    
	    for (String ele : cars) {
	    	
	        System.out.println(ele);
	        
	      }
		

	}

}
