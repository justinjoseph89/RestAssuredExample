package com.hascode.tutorial.rest;

import static com.jayway.restassured.RestAssured.expect;
import static com.jayway.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;

import org.junit.Test;

import com.jayway.restassured.http.ContentType;

public class UserServiceTest {

	/**
	 * It is to check whether it returns when id is 6661
	 */

	// @Test
	// public void testUserNotFound() {
	// expect().body(nullValue()).when()
	// .get("/RestAssuredExample/user/id/6661");
	// }

	/**
	 * Test whether the response are correct
	 */
	@Test
	public void testUserFetchesSuccess() {
		System.out.println("Find it -s-f- "
				+ get("/RestAssuredExample/user/id/13").asString());

		// given().param("firstName", "Tim").param("id", "12")
		// .param("lastName", "Tester").when()
		// .get("/RestAssuredExample/user/id/12").then();

		expect().body("user.firstName", equalTo("Tim"))
				.body("user.id", equalTo("13")).when()
				.get("/RestAssuredExample/user/id/13");

	}

	/**
	 * Testing For the Content type from the response
	 * get("/x").then().assertThat().contentType(ContentType.JSON) we can also
	 * use this
	 */

	@Test
	public void testContentTypeTest() {
		System.out.println("Find it -s-f- "
				+ get("/RestAssuredExample/user/id/13").asString());

		expect().contentType(ContentType.XML).when()
				.get("/RestAssuredExample/user/id/13");

	}

	/**
	 * To Check The status Code out By the Requet
	 */

	@Test
	public void testStatusCode() {
		System.out.println("Find it -s-f- "
				+ get("/RestAssuredExample/user/id/13").asString());

		expect().statusCode(200).body("user.firstName", equalTo("Tim"))
				.body("user.id", equalTo("12")).when()
				.get("/RestAssuredExample/user/id/12");

	}

	/**
	 * Testing for the POST
	 */

	@Test
	public void testPostWithName() {

		expect().body("user.name", equalTo("John")).when()
				.post("/RestAssuredExample/user/login/John");

	}

	/**
	 * expect().content(equalsTo("something")) OR
	 * expect().body(equalsTo("something")) For checking the pure Output
	 */

}
