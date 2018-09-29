package Base;
/**
 * Created by Sam.Gnanarathne on 28/09/2018.
 */
import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Common {
	protected Response response = null;
	protected JSONObject jsonResponse = null;

	protected void request(String resource) {
		RestAssured.baseURI="http://bnb.data.bl.uk/doc/resource";
		
		RequestSpecification request = RestAssured.given();
		response= request.request(Method.GET,resource);
		jsonResponse = new JSONObject(response.getBody().asString());

	}

}
