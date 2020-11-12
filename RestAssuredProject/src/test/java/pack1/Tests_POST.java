package pack1;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;



public class Tests_POST {

//	@Test
	public void test_1_POST() {

//		Map<String, Object> map = new HashMap<String, Object>();
//
//		map.put("name", "John");
//		map.put("job", "QA");
//
//		System.out.println(map);

		JSONObject request = new JSONObject();
		
		
		request.put("name", "Peter");
		request.put("job", "QA");
		
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given().
		    header("Content-Type","application/json").
		    contentType(ContentType.JSON).
		    accept(ContentType.JSON).
		    body(request.toJSONString()).
		 when().
		    post("https://reqres.in/api/users").
		 then().
		    statusCode(201);
	}
	
	//@Test
	public void test_2_PUT() {


		JSONObject request = new JSONObject();
		
		
		request.put("name", "Peter");
		request.put("job", "QA");
		
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given().
		    header("Content-Type","application/json").
		    contentType(ContentType.JSON).
		    accept(ContentType.JSON).
		    body(request.toJSONString()).
		 when().
		    put("https://reqres.in/api/users/2").
		 then().
		    statusCode(200).
		    log().
		    all();
	}
	
//	@Test
	public void test_3_PATCH() {


		JSONObject request = new JSONObject();
		
		
		request.put("name", "Peter");
		request.put("job", "QA");
		
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given().
		    header("Content-Type","application/json").
		    contentType(ContentType.JSON).
		    accept(ContentType.JSON).
		    body(request.toJSONString()).
		 when().
		    patch("https://reqres.in/api/users/2").
		 then().
		    statusCode(200).
		    log().
		    all();
	}
	
	@Test
	public void test_4_DELETE() {

		 when().
		   delete("https://reqres.in/api/users/2").
		 then().
		    statusCode(204).
		    log().
		    all();
	}


}
