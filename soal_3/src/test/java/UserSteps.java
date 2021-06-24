import net.serenitybdd.rest.SerenityRest;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class UserSteps {

//    ------------ CREATE USER ------------

    public void createUser(){
        Map<String, Object> jsonAsMap = new HashMap<>();
        jsonAsMap.put("name", "juli");
        jsonAsMap.put("job", "quality engineer");

        SerenityRest
                .given()
                .contentType("application/json")
                .body(jsonAsMap)
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .log()
                .ifValidationFails()
                .statusCode(201);
    }

    public void getSuccessCreatedUser(){
        String name = SerenityRest.then().extract().path("name");
        String job = SerenityRest.then().extract().path("job");
        Assert.assertEquals("juli",name);
        Assert.assertEquals("quality engineer",job);
    }

    public void validationJSONSchemaCreateUser(){
        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/createUser.json"));
    }


    //    ------------ GET LIST USERS ------------


    public void getListUsersSuccess(){
        SerenityRest
                .given()
                .contentType("application/json")
                .when()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .log()
                .ifValidationFails()
                .statusCode(200);
    }


    public void validationJSONSchemaListUserSuccess(){
        SerenityRest.then().body(matchesJsonSchemaInClasspath("JSONSchema/listUsers.json"));
    }
}

