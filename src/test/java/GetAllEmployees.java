import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
@Test
public class GetAllEmployees{
    public void getAllEmployee(){
        baseURI="https://reqres.in/";
        RequestSpecification requestSpecification = RestAssured.given();
        Response response = requestSpecification.request(Method.GET,"api/users");
        System.out.println(response.asPrettyString());
        System.out.println("The status code is: "+ response.getStatusCode());

    }
}