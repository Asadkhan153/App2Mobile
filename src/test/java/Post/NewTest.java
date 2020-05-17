package Post;

import org.testng.annotations.Test;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class NewTest {
  @Test
  public void login() {
	  
	//Specify base URI
	  RestAssured.baseURI="https://stg.app2food.com/panel30/api/v3/user";
	  
	  //Request object
	  RequestSpecification httpRequest=RestAssured.given();
	  
	   
	  //Request paylaod sending along with post request
	  JSONObject requestParams=new JSONObject();
	  
	  requestParams.put("email","support@app2food.com");
	  requestParams.put("password","rome123");
	  // requestParams.put("UserName","JohnXYZ");
	  //requestParams.put("Password","JohnXYZxyx");
	 // requestParams.put("Email","JohnXYZ@gmail.com");
	  
	  httpRequest.header("Accept","application/json");
	  
	  httpRequest.body(requestParams.toJSONString()); // attach above data to the request
	  
	  //Response object
	  Response response=httpRequest.request(Method.POST,"/login");
	    
	  
	  //print response in console window
	  
	  String responseBody=response.getBody().asString();
	  System.out.println("Response Body is:" +responseBody);
	  
	  //status code validation
	  int statusCode=response.getStatusCode();
	  System.out.println("Status code is: "+statusCode);
	  Assert.assertEquals(statusCode, 201);
	  
	  //success code validation
	  String successCode=response.jsonPath().get("SuccessCode");
	  Assert.assertEquals(successCode, "OPERATION_SUCCESS");
}
  
  
	  @Test
	  public void forgotlogin() {
		  
		//Specify base URI
		  RestAssured.baseURI="https://stg.app2food.com/panel30/api/v3/user";
		  
		  //Request object
		  RequestSpecification httpRequest=RestAssured.given();
		  
		   
		  //Request paylaod sending along with post request
		  JSONObject requestParams=new JSONObject();
		  
		  requestParams.put("email","support@app2food.com");
		  //requestParams.put("password","rome123");
		  httpRequest.header("Accept","application/json");
		  httpRequest.body(requestParams.toJSONString()); // attach above data to the request
		  
		  //Response object
		  
		  Response response=httpRequest.request(Method.POST,"/forgotlogin");
		    
		  
		  //print response in console window
		  
		  String responseBody=response.getBody().asString();
		  System.out.println("Response Body is:" +responseBody);
		  
		  //status code validation
		  int statusCode=response.getStatusCode();
		  System.out.println("Status code is: "+statusCode);
		  Assert.assertEquals(statusCode, 201);
		  
		  //success code validation
		  String successCode=response.jsonPath().get("SuccessCode");
		  Assert.assertEquals(successCode, "OPERATION_SUCCESS");  
	  }
	  
	  @Test
	  public void verifypasswordcode() {
		  
		//Specify base URI
		  RestAssured.baseURI="https://stg.app2food.com/panel30/api/v3/user";
		  
		  //Request object
		  RequestSpecification httpRequest=RestAssured.given();
		  
		   
		  //Request paylaod sending along with post request
		  JSONObject requestParams=new JSONObject();
		  
		  requestParams.put("email","support@app2food.com");
		  requestParams.put("vcode","rome123");
		  httpRequest.header("Accept","application/json");
		  httpRequest.body(requestParams.toJSONString()); // attach above data to the request
		  
		  //Response object
		  
		  Response response=httpRequest.request(Method.POST,"/verifypasswordcode");
		    
		  
		  //print response in console window
		  
		  String responseBody=response.getBody().asString();
		  System.out.println("Response Body is:" +responseBody);
		  
		  //status code validation
		  int statusCode=response.getStatusCode();
		  System.out.println("Status code is: "+statusCode);
		  Assert.assertEquals(statusCode, 201);
		  
		  //success code validation
		  String successCode=response.jsonPath().get("SuccessCode");
		  Assert.assertEquals(successCode, "OPERATION_SUCCESS");  
		  
	  }
	  
	  @SuppressWarnings("unchecked")
	@Test
	  public void resetpassword() {
		  
		//Specify base URI
		  RestAssured.baseURI="https://stg.app2food.com/panel30/api/v3/user";
		  
		  //Request object
		  RequestSpecification httpRequest=RestAssured.given();
		  
		   
		  //Request paylaod sending along with post request
		  JSONObject requestParams=new JSONObject();
		  
		  requestParams.put("email","support@app2food.com");
		  requestParams.put("npass","rome123");
		  requestParams.put("pass","rome123");
		  
		  httpRequest.header("Accept","application/json");
		  httpRequest.body(requestParams.toJSONString()); // attach above data to the request
		  
		  //Response object
		  
		  Response response=httpRequest.request(Method.POST,"/resetpassword");
		    
		  
		  //print response in console window
		  
		  String responseBody=response.getBody().asString();
		  System.out.println("Response Body is:" +responseBody);
		  
		  //status code validation
		  int statusCode=response.getStatusCode();
		  System.out.println("Status code is: "+statusCode);
		  Assert.assertEquals(statusCode, 201);
		  
		  //success code validation
		  String successCode=response.jsonPath().get("SuccessCode");
		  Assert.assertEquals(successCode, "OPERATION_SUCCESS");  
	  }
	  
	  @SuppressWarnings("unchecked")
	@Test
	  public void storegraphs() {
		  
		  //Specify base URI
		  RestAssured.baseURI="https://stg.app2food.com/panel30/api/v3/store";
		  
		  //Request object
		  RequestSpecification httpRequest=RestAssured.given();
		  
		   
		  //Request paylaod sending along with post request
		  JSONObject requestParams=new JSONObject();
		  
		  requestParams.put("supervisor_id","228");
		  requestParams.put("store_id","11002");
		  
		  
		  httpRequest.param("access_token","aacac85659fb46e6694a114c748f90bb8f1b1af4");
		  httpRequest.body(requestParams.toJSONString()); // attach above data to the request
		  
		  //Response object
		  
		  Response response=httpRequest.request(Method.POST,"/graphs");
		    
		  
		  //print response in console window
		  
		  String responseBody=response.getBody().asString();
		  System.out.println("Response Body is:" +responseBody);
		  
		  //status code validation
		  int statusCode=response.getStatusCode();
		  System.out.println("Status code is: "+statusCode);
		  Assert.assertEquals(statusCode, 201);
		  
		  //success code validation
		  String successCode=response.jsonPath().get("SuccessCode");
		  Assert.assertEquals(successCode, "OPERATION_SUCCESS");  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	 }
}
