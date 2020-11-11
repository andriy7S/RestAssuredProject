
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test01_GET {

	@Test
	public void test_01() {

		Response responce = RestAssured.get("https://reqres.in/api/users?page=2");

		System.out.println(responce.asString());
		System.out.println(responce.getBody().asPrettyString());
		System.out.println(responce.getStatusCode());
		System.out.println(responce.getStatusLine());
		System.out.println(responce.getHeader("content-type"));
		System.out.println(responce.getTime());

	}

}
