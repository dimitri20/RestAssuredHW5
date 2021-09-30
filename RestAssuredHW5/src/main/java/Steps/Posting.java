package Steps;


import Models.Requests.posting.User;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Posting {


    public static Response postUser(User user){

        return given()
                .header("Content-Type", "application/json")
                .body(user.generateJsonString())
                .when()
                .post("https://reqres.in/api/users");

    }

}
