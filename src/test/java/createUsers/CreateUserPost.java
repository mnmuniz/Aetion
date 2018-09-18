package createUsers;

import main.BaseApi;
import static com.jayway.restassured.RestAssured.expect;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONObject;
import org.junit.Test;



public class CreateUserPost extends BaseApi {

	public static String userUrlApi = endpoint+"user/";
	
	@Test
	public void shouldCreateUser () {
		JSONObject userData = new JSONObject ();
		userData.put("email","mmatias@test.com");
		userData.put("first_name","Matias");
		userData.put("last_name","Muniz");
		userData.put("age", 28);
		
		
	
		Integer userId = createUser(userData, userUrlApi); 

		expect().statusCode(200)
		.body("email", equalTo(userData.get("email")))
		.given().headers(authHeader)
		.when().get(userUrlApi+userId);

	}
	
	
	
	

	public  Integer createUser (JSONObject userBody,String url) {
		
			
		Integer id = expect().statusCode(200)
		.body("notices", equalTo(null))
		.given().headers(authHeader)
		.body(userBody)
		.when().post(url)
		.then().extract().path("id");
		return id;
		
	}

}