package pack1;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Examples {
	
	

	//@Test
	public void test_get() {

		baseURI = "http://localhost:3000/";
		given().
		    param("name", "Automation").
		    get("/subjects").
		then().
		    statusCode(200).
		    log().all();

	}
	
	
	//@Test
	public void test_POST() {
		
		
		JSONObject request = new JSONObject();
		
		request.put("firstName", "Tom");
		request.put("lastName", "Soyer");
		request.put("subjectId", 1);
		
		
		baseURI = "http://localhost:3000/";
		
		given().
		    contentType(ContentType.JSON).
		    accept(ContentType.JSON).
		    header("Content-Type", "application/json").
		    body(request.toJSONString()).
		when().
		    post("/users").    
	    then().
	        statusCode(201).
	        log().all();
	}
	
	    //@Test
		public void test_PATCH() {
			
			
			JSONObject request = new JSONObject();
			
			request.put("firstName", "Greg");
			request.put("lastName", "Johnson");
			
			
			
			baseURI = "http://localhost:3000/";
			
			given().
			    contentType(ContentType.JSON).
			    accept(ContentType.JSON).
			    header("Content-Type", "application/json").
			    body(request.toJSONString()).
			when().
			    patch("/users/4").    
		    then().
		        statusCode(200).
		        log().all();
		}
		
		//@Test
		public void test_PUT() {
			
			
			JSONObject request = new JSONObject();
			
			request.put("firstName", "Mary");
			request.put("lastName", "Poppens");
			request.put("subjectId", 1);
			
			
			baseURI = "http://localhost:3000/";
			
			given().
			    contentType(ContentType.JSON).
			    accept(ContentType.JSON).
			    header("Content-Type", "application/json").
			    body(request.toJSONString()).
			when().
			    put("/users/4").    
		    then().
		        statusCode(200).
		        log().all();
		}
		
		@Test
		public void test_DELETE() {
			
			baseURI = "http://localhost:3000/";
			
			when().
			     delete("/users/4").
			then().
			     statusCode(200);
			
		}

}
