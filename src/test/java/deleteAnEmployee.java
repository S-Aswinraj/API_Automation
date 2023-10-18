import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class deleteAnEmployee {
    @Test
    public void delete(){
        RestAssured.baseURI ="https://reqres.in/";
        RequestSpecification requestSpecification = RestAssured.given();
        Response response = requestSpecification.request(Method.DELETE,"api/user/978");
        System.out.println(response.asPrettyString());
        System.out.println("The status code of the delete request is: "+response.getStatusCode());
    }
}
