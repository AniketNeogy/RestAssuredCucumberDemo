package Steps;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class BDDStyleMethod {
    public static void simpleGetPostsMethod(String url,String resource,String postNumber,String author){
        RestAssured.baseURI = url;
        given().
                contentType(ContentType.JSON).
                when().
                    get(resource+"/"+postNumber).
                then().
                    body("author",is (author));// "is()" method is from hamcrest matchers library to check the equal condition

    }

    public static void performContainsCollection(String url,String resource,String authorList[]){
        RestAssured.baseURI = url;
        given().
                contentType(ContentType.JSON).
                when().
                get(resource+"/").
                then().
                    body("author",containsInAnyOrder(authorList)). // this will pass as the order is neglected only the values are considered
                    body("author",containsInRelativeOrder(authorList)). //relative order will fail as we are passing authorlist as ["Shalini", "Aniket"] but from API we get [Aniket, Shalini]
                    statusCode(200);

    }
}
