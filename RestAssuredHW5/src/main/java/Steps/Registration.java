package Steps;


import Models.Requests.registration.User;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Registration {

    public static Response successfulScenario(){
        RestAssured.baseURI = "https://reqres.in/api/";

        return given()
                .header("Content-Type", "application/json")
                .body(new User("eve.holt@reqres.in", "pistol").generateJsonString())
                .when()
                .post("register");
    }

    public static Response unsuccessfulScenario(){
        RestAssured.baseURI = "https://reqres.in/api/";

        return given()
                .header("Content-Type", "application/json")
                .body(new User("sydney@fife").generateJsonString())
                .when()
                .post("register");
    }

}
