package Steps;

import com.sun.javafx.binding.StringFormatter;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.is;

public class MyStepdefs {

    @Given("^I need to set the BaseUrl to \"([^\"]*)\"$")
    public void iNeedToSetTheBaseUrlTo(String url) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        RestAssured.baseURI = url;
        given().contentType(ContentType.JSON);
    }

    @And("^I perform GET operation for resource \"([^\"]*)\" and post number \"([^\"]*)\" and check author name to be \"([^\"]*)\"$")
    public void iPerformGETOperationForResourceAndPostNumberAndCheckAuthorNameToBe(String resource, String postNumber, String author) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        when().get(resource+"/"+postNumber).
                then().body("author",is (author));
    }
}
