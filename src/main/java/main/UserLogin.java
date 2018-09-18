package main;
import static com.jayway.restassured.RestAssured.expect;
import static com.jayway.restassured.RestAssured.given;

import org.json.simple.JSONObject;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.config.EncoderConfig;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Header;
import com.jayway.restassured.response.Headers;

import main.BaseApi;


	
	@SuppressWarnings("unchecked")
	public class UserLogin extends BaseApi {


		
		/***** Session Token *****/
		public static String getOauthToken(String userName, String password){
			
			JSONObject loginBody = new JSONObject();
			loginBody.put("username", userName);
			loginBody.put("password", password);
			
			String token = expect().statusCode(200)
			.given().body(loginBody)
			  .accept("application/json")
	            .contentType("application/json")
			.post(endpoint + "login")
			.then().extract().path("token");
			
			return token;
		}

	}

	

