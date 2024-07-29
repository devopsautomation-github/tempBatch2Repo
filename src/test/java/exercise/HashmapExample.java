package exercise;

import java.util.HashMap;

//import org.junit.Test;

//import org.junit.jupiter.api.Test;

public class HashmapExample {

	//unit testing framework ----- JUNIT/TESTNG
	//execution ------ @Test
	
	
	public static void main(String[] args) {
		
		HashMap<String , String> IBM_project = new HashMap<String , String>();
		
		IBM_project.put("project_id", "ABC123");
		IBM_project.put("orgName", "IBM");
		IBM_project.put("clientName", "XYZ.com");
		IBM_project.put("budget", "1231231");
		IBM_project.put("isLive", "True");
		
		
		String x = IBM_project.get("project_id");
		
		
		System.out.println("Project Id: " + IBM_project.get("project_id"));
		System.out.println("orgName : " + IBM_project.get("orgName"));
		System.out.println("Client Details: " + IBM_project.get("clientName"));
			
		
		
		
	}
	
	
	
	
	
	
	//@Test
	public void verufyHashMapTest() {
		
		
		
	HashMap<String , String> IBM_project = new HashMap<String , String>();
		
	IBM_project.put("project_id", "ABC123");
	IBM_project.put("orgName", "IBM");
	IBM_project.put("clientName", "XYZ.com");
	IBM_project.put("budget", "1231231");
	IBM_project.put("isLive", "True");
	
	
	String x = IBM_project.get("project_id");
	
	
	System.out.println("Project Id: " + IBM_project.get("project_id"));
	System.out.println("orgName : " + IBM_project.get("orgName"));
	System.out.println("Client Details: " + IBM_project.get("clientName"));
		
		
		
	}

}
