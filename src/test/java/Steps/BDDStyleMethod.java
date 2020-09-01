package Steps;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;

public class BDDStyleMethod {
    public static void simpleGetPostsMethod(String url,String resource,String postNumber,String author){
        RestAssured.baseURI = url;
        given().
                contentType(ContentType.JSON).
                when().
                    get(resource+"/"+postNumber).
                then().
                    body("author",is (author));

    }

    public static void performContainsCollection(String url,String resource,String authorList[]){
        RestAssured.baseURI = url;
        given().
                contentType(ContentType.JSON).
                when().
                get(resource+"/").
                then().
                    body("author",containsInAnyOrder(authorList)).statusCode(200);

    }
}
