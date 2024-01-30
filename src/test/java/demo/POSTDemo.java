package demo;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class POSTDemo {
	
	HashMap<String,String>map=new HashMap<>();
	
	@BeforeClass
	public void createPayload() {
		map.put("name", "Khalid");
		map.put("email", "khalid44@gmail.com");
		map.put("gender", "male");
		map.put("status", "active");
		RestAssured.baseURI="https://gorest.co.in/";
		RestAssured.basePath="public/v2/users";
	}
	@Test
	public void CreateUser() {
		RestAssured
		.given()
		    .contentType("application/json")
		 .body(map)
		      .header("Authorization","Bearer efdfc539ad89bd06d9979baeefa93a9ccefe1bf69d65675bcf59823f85ba3d8b")
		   .when()
		        .post()
		        .then()
		           .statusCode(201)
		                .log().all();
		    
	}

}
