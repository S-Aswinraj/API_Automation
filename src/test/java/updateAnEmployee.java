import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;

public class updateAnEmployee {
    @Test
    public void update(){
        baseURI="https://reqres.in/";

        RequestSpecification requestSpecification = RestAssured
                .given()
                .header("Content-Type","application/json")
                .body("{\n" +
                        "    \"name\": \"Abcd\",\n" +
                        "    \"job\": \"example\"\n" +
                        "}");
        Response response = requestSpecification.request(Method.PUT,"api/users/9");
        System.out.println(response.asPrettyString());
        System.out.println(response.getStatusCode());

    }
}
