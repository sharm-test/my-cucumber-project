package gluecode;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import org.testng.Assert;

public class Stepdefs {
	Response response;
	static String baseURI="https://reqres.in";
	static String basePath ="/api/users";
	static String jsonString;

@Given("^I want to execute reqres endpoint$")
public void method1() throws Throwable{
	RestAssured.baseURI= baseURI;
	RestAssured.basePath = basePath;
}

@When("^I submit the request with (.*) as parameter$")
public void method2(String arg2) throws Throwable{
	System.out.println("Method When");
	response = RestAssured.given()
			.when().log().all()
			.queryParam("page", arg2)
			.get();
		
}
@Then("^I should get (\\d+) as response code$")
public void method3(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete action
	response.then().log().all();
    System.out.println("Expected is"+arg1);
    System.out.println("Body is :"+response.asString());
    
    jsonString = response.asString();
    		Assert.assertEquals(arg1, response.getStatusCode());
  
    
}

}
