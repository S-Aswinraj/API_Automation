import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;

public class PostEmployeesDetails {
    @Test
    public void createAnEmployee(){
        baseURI="https://reqres.in/";

        RequestSpecification requestSpecification = RestAssured.given()
                .header("Content-Type","application/json") // this is used to say what is the body type we are sending
                .body("{\n" +
                        "    \"name\": \"Abcd\",\n" +
                        "    \"job\": \"example\"\n" +
                        "}");

        Response response = requestSpecification.request(Method.POST,"api/users");
        System.out.println(response.asPrettyString()); // for printing the response as formatted text
        System.out.println(response.getStatusCode()); // for printing status code

    }
}
