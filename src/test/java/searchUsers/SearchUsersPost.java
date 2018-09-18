package searchUsers;

import static com.jayway.restassured.RestAssured.expect;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

import org.json.simple.JSONObject;
import org.junit.Test;

import main.BaseApi;

public class SearchUsersPost extends BaseApi {
	public String userSearchUrl = endpoint+"user/search";
	
	
	@Test
	public void shouldSearchBetween20and50Age () {
	JSONObject searchBody = new JSONObject ();
	
	searchBody.put("start_age", 20);
	searchBody.put("end_age",50);
	
	
	expect().statusCode(200)
	.body("age", everyItem(greaterThanOrEqualTo(20)))
	.body("age", everyItem(lessThanOrEqualTo(50)))
	.given().headers(authHeader)
	.body(searchBody)
	.when().post(userSearchUrl)
	.then().extract().path("id");


}
}
