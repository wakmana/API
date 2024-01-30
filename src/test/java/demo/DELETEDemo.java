package demo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DELETEDemo {
	
	@Test
	public void deleteuser() {
		RestAssured.baseURI="https://gorest.co.in/";
		RestAssured.basePath="/public/v2/users/6097259";
		
		RestAssured
		 .given()
	      .contentType("application/json")
	   .header("Authorization", "Beare efdfc539ad89bd06d9979baeefa93a9ccefe1bf69d65675bcf59823f85ba3d8b")
		 .when()
		     .delete()
		 .then()
		      .statusCode(204);
	}
}
