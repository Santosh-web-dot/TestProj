package com.products;
import io.restassured.RestAssured;
public class newClass {
	public static void main(String[] args) {
		RestAssured.given()
		.when()
		.get("https://chercher.tech/sample/api/product/read.php")
		.prettyPrint();
	}
}