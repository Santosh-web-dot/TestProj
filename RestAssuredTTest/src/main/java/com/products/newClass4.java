package com.products;

import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class newClass4 {

	@Test
	public void test2() {

		Response response = given().get("https://restful-booker.herokuapp.com/ping/");
		int statusCode = response.getStatusCode();

		assert(statusCode == 201);

	}

}
