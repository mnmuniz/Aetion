package createUsers;
import main.BaseApi;
import static com.jayway.restassured.RestAssured.expect;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import createUsers.CreateUserPost;

import org.json.simple.JSONObject;
import org.junit.Test;


public class UsersCreateChallengue extends BaseApi {

	public String userUrlApi = endpoint+"user/";
	
	@Test
	public void shouldCreateFirstUser () {
		JSONObject userData = new JSONObject ();
		userData.put("email","peta@example.org");
		userData.put("first_name","Peta");
		userData.put("last_name","Francis");
		userData.put("age", 34);
		
		Integer userId = createUser(userData, userUrlApi); 

		expect().statusCode(200)
		.body("email", equalTo(userData.get("email")))
		.body("first_name", equalTo(userData.get("first_name")))
		.body("last_name", equalTo(userData.get("last_name")))
		.body("age", equalTo(userData.get("age")))
		.given().headers(authHeader)
		.when().get(userUrlApi+userId);

	}
	
		
	@Test
	public void shouldCreate2User () {
		JSONObject userData = new JSONObject ();
		userData.put("email","george@example.com");
		userData.put("first_name","Goerge");
		userData.put("last_name","Pearson");
		userData.put("age", 45);
		
		Integer userId = createUser(userData, userUrlApi); 

		expect().statusCode(200)
		.body("email", equalTo(userData.get("email")))
		.body("first_name", equalTo(userData.get("first_name")))
		.body("last_name", equalTo(userData.get("last_name")))
		.body("age", equalTo(userData.get("age")))
		.given().headers(authHeader)
		.when().get(userUrlApi+userId);
		
		
		userData.put("first_name","Jorge");
		
		expect().statusCode(200)
		.body("email", equalTo(userData.get("email")))
		.body("first_name", equalTo(userData.get("first_name")))
		.body("last_name", equalTo(userData.get("last_name")))
		.body("age", equalTo(userData.get("age")))
		.given().headers(authHeader)
		.given().body(userData)
		.when().put(userUrlApi+userId);
		
		
		
	}
	
	@Test
	public void shouldCreate3User () {
		JSONObject userData = new JSONObject ();
		userData.put("email","sandeep@ertedd.test");
		userData.put("first_name","Sandeep");
		userData.put("last_name","Midha");
		userData.put("age", 23);
		
		Integer userId = createUser(userData, userUrlApi); 

		expect().statusCode(200)
		.body("email", equalTo(userData.get("email")))
		.body("first_name", equalTo(userData.get("first_name")))
		.body("last_name", equalTo(userData.get("last_name")))
		.body("age", equalTo(userData.get("age")))
		.given().headers(authHeader)
		.when().get(userUrlApi+userId);
		
	}
	
	@Test
	public void shouldCreate4User () {
		JSONObject userData = new JSONObject ();	
		userData.put("email","rory@domain.test");
		userData.put("first_name","Rory");
		userData.put("last_name","Winter");
		userData.put("age", 41);
		
		Integer userId = createUser(userData, userUrlApi); 

		expect().statusCode(200)
		.body("email", equalTo(userData.get("email")))
		.body("first_name", equalTo(userData.get("first_name")))
		.body("last_name", equalTo(userData.get("last_name")))
		.body("age", equalTo(userData.get("age")))
		.given().headers(authHeader)
		.when().get(userUrlApi+userId);
	}
	
	@Test
	public void shouldCreate5User () {
		JSONObject userData = new JSONObject ();
		userData.put("email","jenny@another.test");
		userData.put("first_name","Jenny");
		userData.put("last_name","Wu");
		userData.put("age", 53);
		
		Integer userId = createUser(userData, userUrlApi); 

		expect().statusCode(200)
		.body("email", equalTo(userData.get("email")))
		.body("first_name", equalTo(userData.get("first_name")))
		.body("last_name", equalTo(userData.get("last_name")))
		.body("age", equalTo(userData.get("age")))
		.given().headers(authHeader)
		.when().get(userUrlApi+userId);
	}
	
	@Test
	public void shouldCreate6User () {
		JSONObject userData = new JSONObject ();
		userData.put("email","m@thisisa.test");
		userData.put("first_name","Mark");
		userData.put("last_name","Ehrenreich");
		userData.put("age", 38);
		
		Integer userId = createUser(userData, userUrlApi); 

		expect().statusCode(200)
		.body("email", equalTo(userData.get("email")))
		.body("first_name", equalTo(userData.get("first_name")))
		.body("last_name", equalTo(userData.get("last_name")))
		.body("age", equalTo(userData.get("age")))
		.given().headers(authHeader)
		.when().get(userUrlApi+userId);
		
	}
	
	@Test
	public void shouldCreate7User () {
		JSONObject userData = new JSONObject ();
		
		userData.put("email","cora@domain.test");
		userData.put("first_name","Cora");
		userData.put("last_name","Engel");
		userData.put("age", 28);
		
		Integer userId = createUser(userData, userUrlApi); 

		expect().statusCode(200)
		.body("email", equalTo(userData.get("email")))
		.body("first_name", equalTo(userData.get("first_name")))
		.body("last_name", equalTo(userData.get("last_name")))
		.body("age", equalTo(userData.get("age")))
		.given().headers(authHeader)
		.when().get(userUrlApi+userId);
		
		userData.put("age","38");
		
		expect().statusCode(200)
		.body("email", equalTo(userData.get("email")))
		.body("first_name", equalTo(userData.get("first_name")))
		.body("last_name", equalTo(userData.get("last_name")))
		.body("age", equalTo(userData.get("age")))
		.given().headers(authHeader)
		.given().body(userData)
		.when().put(userUrlApi+userId);
		
		
	}
	
	@Test
	public void shouldCreate8User () {
		JSONObject userData = new JSONObject ();
		userData.put("email","dan@oprqu.test");
		userData.put("first_name","Dan");
		userData.put("last_name","Ankemah");
		userData.put("age", 31);
		
		Integer userId = createUser(userData, userUrlApi); 

		expect().statusCode(200)
		.body("email", equalTo(userData.get("email")))
		.body("first_name", equalTo(userData.get("first_name")))
		.body("last_name", equalTo(userData.get("last_name")))
		.body("age", equalTo(userData.get("age")))
		.given().headers(authHeader)
		.when().get(userUrlApi+userId);
		
		userData.put("last_name","Ankomah");
		
		expect().statusCode(200)
		.body("email", equalTo(userData.get("email")))
		.body("first_name", equalTo(userData.get("first_name")))
		.body("last_name", equalTo(userData.get("last_name")))
		.body("age", equalTo(userData.get("age")))
		.given().headers(authHeader)
		.given().body(userData)
		.when().put(userUrlApi+userId);
		
	}
	
	@Test
	public void shouldCreate9User () {
		JSONObject userData = new JSONObject ();	
		userData.put("email","jorge@op3ueopup.test");
		userData.put("first_name","Jorge");
		userData.put("last_name","Georgiannakis");
		userData.put("age", 29);
		
		Integer userId = createUser(userData, userUrlApi); 

		expect().statusCode(200)
		.body("email", equalTo(userData.get("email")))
		.body("first_name", equalTo(userData.get("first_name")))
		.body("last_name", equalTo(userData.get("last_name")))
		.body("age", equalTo(userData.get("age")))
		.given().headers(authHeader)
		.when().get(userUrlApi+userId);
		
	}
	
	@Test
	public void shouldCreate10User () {
		JSONObject userData = new JSONObject ();
		userData.put("email","pooja@example.org");
		userData.put("first_name","Pooja");
		userData.put("last_name","Reddy");
		userData.put("age", 27);
		
		Integer userId = createUser(userData, userUrlApi); 

		expect().statusCode(200)
		.body("email", equalTo(userData.get("email")))
		.body("first_name", equalTo(userData.get("first_name")))
		.body("last_name", equalTo(userData.get("last_name")))
		.body("age", equalTo(userData.get("age")))
		.given().headers(authHeader)
		.when().get(userUrlApi+userId);
		
	}
	
	@Test
	public void shouldCreate11User () {
		JSONObject userData = new JSONObject ();
		
		userData.put("email","peta@example.org");
		userData.put("first_name","Peta");
		userData.put("last_name","Francis");
		userData.put("age", 34);
		
		Integer userId = createUser(userData, userUrlApi); 

		expect().statusCode(200)
		.body("email", equalTo(userData.get("email")))
		.body("first_name", equalTo(userData.get("first_name")))
		.body("last_name", equalTo(userData.get("last_name")))
		.body("age", equalTo(userData.get("age")))
		.given().headers(authHeader)
		.when().get(userUrlApi+userId);
	}
	
	@Test
	public void shouldCreate12User () {
		JSONObject userData = new JSONObject ();
		userData.put("email","enzo@ooooe.test");
		userData.put("first_name","Enzo");
		userData.put("last_name","Fumagelli");
		userData.put("age", 52);
		Integer userId = createUser(userData, userUrlApi); 

		expect().statusCode(200)
		.body("email", equalTo(userData.get("email")))
		.body("first_name", equalTo(userData.get("first_name")))
		.body("last_name", equalTo(userData.get("last_name")))
		.body("age", equalTo(userData.get("age")))
		.given().headers(authHeader)
		.when().get(userUrlApi+userId);
		
	}
	
	@Test
	public void shouldCreate13User () {
		JSONObject userData = new JSONObject ();
		
		userData.put("email","natashia@eopjpo.test");
		userData.put("first_name","Natasha");
		userData.put("last_name","Pham");
		userData.put("age", 35);
		
		Integer userId = createUser(userData, userUrlApi); 

		expect().statusCode(200)
		.body("email", equalTo(userData.get("email")))
		.body("first_name", equalTo(userData.get("first_name")))
		.body("last_name", equalTo(userData.get("last_name")))
		.body("age", equalTo(userData.get("age")))
		.given().headers(authHeader)
		.when().get(userUrlApi+userId);
	}
	
	@Test
	public void shouldCreate14User () {
		JSONObject userData = new JSONObject ();
		
		userData.put("email","sandeep@ertedd.test");
		userData.put("first_name","Sandeep");
		userData.put("last_name","Midha");
		userData.put("age", 23);
		
		Integer userId = createUser(userData, userUrlApi); 

		expect().statusCode(200)
		.body("email", equalTo(userData.get("email")))
		.body("first_name", equalTo(userData.get("first_name")))
		.body("last_name", equalTo(userData.get("last_name")))
		.body("age", equalTo(userData.get("age")))
		.given().headers(authHeader)
		.when().get(userUrlApi+userId);
		
	}
	
	@Test
	public void shouldCreate15User () {
		JSONObject userData = new JSONObject ();
		userData.put("email","peta@example.org");
		userData.put("first_name","Peta");
		userData.put("last_name","Francis");
		userData.put("age", 34);
		
		Integer userId = createUser(userData, userUrlApi); 

		expect().statusCode(200)
		.body("email", equalTo(userData.get("email")))
		.body("first_name", equalTo(userData.get("first_name")))
		.body("last_name", equalTo(userData.get("last_name")))
		.body("age", equalTo(userData.get("age")))
		.given().headers(authHeader)
		.when().get(userUrlApi+userId);
		
	}
	
	@Test
	public void shouldCreate16User () {
		JSONObject userData = new JSONObject ();
		userData.put("email","m@thisisa.test");
		userData.put("first_name","Miranda");
		userData.put("last_name","Croft");
		userData.put("age", 27);
		
		Integer userId = createUser(userData, userUrlApi); 

		expect().statusCode(200)
		.body("email", equalTo(userData.get("email")))
		.body("first_name", equalTo(userData.get("first_name")))
		.body("last_name", equalTo(userData.get("last_name")))
		.body("age", equalTo(userData.get("age")))
		.given().headers(authHeader)
		.when().get(userUrlApi+userId);
	}
	
	@Test
	public void shouldCreate17User () {
		JSONObject userData = new JSONObject ();
		
		userData.put("email","jorge@op3ueopup.test");
		userData.put("first_name","Jorge");
		userData.put("last_name","Georgiannakis");
		userData.put("age", 29);
		
		Integer userId = createUser(userData, userUrlApi); 

		expect().statusCode(200)
		.body("email", equalTo(userData.get("email")))
		.body("first_name", equalTo(userData.get("first_name")))
		.body("last_name", equalTo(userData.get("last_name")))
		.body("age", equalTo(userData.get("age")))
		.given().headers(authHeader)
		.when().get(userUrlApi+userId);
		
	}
	
	@Test
	public void shouldCreate18User () {
		JSONObject userData = new JSONObject ();
		userData.put("email","roshni@pojopjw.test");
		userData.put("first_name","Roshni");
		userData.put("last_name","Khalid");
		userData.put("age", 37);
		
		Integer userId = createUser(userData, userUrlApi); 

		expect().statusCode(200)
		.body("email", equalTo(userData.get("email")))
		.body("first_name", equalTo(userData.get("first_name")))
		.body("last_name", equalTo(userData.get("last_name")))
		.body("age", equalTo(userData.get("age")))
		.given().headers(authHeader)
		.when().get(userUrlApi+userId);
	}
	
	@Test
	public void shouldCreate19User () {
		JSONObject userData = new JSONObject ();
		
		userData.put("email","julio@opjpoj.test");
		userData.put("first_name","Julio");
		userData.put("last_name","Galinder");
		userData.put("age", 35);
		
		Integer userId = createUser(userData, userUrlApi); 

		expect().statusCode(200)
		.body("email", equalTo(userData.get("email")))
		.body("first_name", equalTo(userData.get("first_name")))
		.body("last_name", equalTo(userData.get("last_name")))
		.body("age", equalTo(userData.get("age")))
		.given().headers(authHeader)
		.when().get(userUrlApi+userId);
	}
	
	@Test
	public void shouldCreate20User () {
		JSONObject userData = new JSONObject ();
		
		userData.put("email","elida@opjopj.test");
		userData.put("first_name","Elida");
		userData.put("last_name","Moura");
		userData.put("age", 61);
		
		Integer userId = createUser(userData, userUrlApi); 

		expect().statusCode(200)
		.body("email", equalTo(userData.get("email")))
		.body("first_name", equalTo(userData.get("first_name")))
		.body("last_name", equalTo(userData.get("last_name")))
		.body("age", equalTo(userData.get("age")))
		.given().headers(authHeader)
		.when().get(userUrlApi+userId);



	}
	
	@Test
	public void shouldCreate21User () {
		JSONObject userData = new JSONObject ();
		
		userData.put("email","chris@ohoph.test");
		userData.put("first_name","Chris");
		userData.put("last_name","Ingilby");
		userData.put("age", 31);
		
		Integer userId = createUser(userData, userUrlApi); 

		expect().statusCode(200)
		.body("email", equalTo(userData.get("email")))
		.body("first_name", equalTo(userData.get("first_name")))
		.body("last_name", equalTo(userData.get("last_name")))
		.body("age", equalTo(userData.get("age")))
		.given().headers(authHeader)
		.when().get(userUrlApi+userId);
	}
	
	
	@Test
	public void shouldCreate22User () {
		JSONObject userData = new JSONObject ();
		
		userData.put("email","emily@sopjs.test	");
		userData.put("first_name","Emily");
		userData.put("last_name","Crobak");
		userData.put("age", 28);
		
		Integer userId = createUser(userData, userUrlApi); 

		expect().statusCode(200)
		.body("email", equalTo(userData.get("email")))
		.body("first_name", equalTo(userData.get("first_name")))
		.body("last_name", equalTo(userData.get("last_name")))
		.body("age", equalTo(userData.get("age")))
		.given().headers(authHeader)
		.when().get(userUrlApi+userId);
	}
	@Test
	public void shouldCreate23User () {
		JSONObject userData = new JSONObject ();
		
		userData.put("email","maryam@eopjp.test");
		userData.put("first_name","Maryam");
		userData.put("last_name","Kapur");
		userData.put("age", 41);
		
		Integer userId = createUser(userData, userUrlApi); 

		expect().statusCode(200)
		.body("email", equalTo(userData.get("email")))
		.body("first_name", equalTo(userData.get("first_name")))
		.body("last_name", equalTo(userData.get("last_name")))
		.body("age", equalTo(userData.get("age")))
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
