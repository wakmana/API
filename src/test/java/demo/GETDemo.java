package demo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GETDemo {
	
	@Test
	public void getUser() {
		RestAssured.basePath="/public/v2/users/ 6097259";
		
		RestAssured
		.given()
		   .contentType("application/json")
		       .header("Authorization","Bearer  efdfc539ad89bd06d9979baeefa93a9ccefe1bf69d65675bcf59823f85ba3d8b")
		   .when()
		       .get("https://gorest.co.in/")
		       .then()
		   .statusCode(200)
		        .log().all();
		   
	}

}
