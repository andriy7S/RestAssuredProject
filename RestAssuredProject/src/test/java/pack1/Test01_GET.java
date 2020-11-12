package pack1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class Test01_GET {

	@Test
	public void test_01() {

		Response responce = get("https://reqres.in/api/users?page=2");

		System.out.println(responce.asString());
		System.out.println(responce.getBody().asPrettyString());
		System.out.println(responce.getStatusCode());
		System.out.println(responce.getStatusLine());
		System.out.println(responce.getHeader("content-type"));
		System.out.println(responce.getTime());
		
		int statusCode = responce.getStatusCode();

	}
	
	@Test
	public void test_02(){

		given()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200)
		.body("data.id[0]", equalTo(7));
	}
}
