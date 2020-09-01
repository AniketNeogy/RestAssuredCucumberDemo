package Steps;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class BDDStyleMethod {
    public static void simpleGetPostsMethod(String url, String resource, String postNumber, String author) {
        RestAssured.baseURI = url;
        given().
                contentType(ContentType.JSON).
                when().
                get(resource + "/" + postNumber).
                then().
                body("author", is(author));// "is()" method is from hamcrest matchers library to check the equal condition

    }

    public static void performContainsCollection(String url, String resource, String authorList[]) {
        RestAssured.baseURI = url;
        given().
                contentType(ContentType.JSON).
                when().
                get(resource).
                then().
                body("author", containsInAnyOrder(authorList)). // this will pass as the order is neglected only the values are considered
                //body("author", containsInRelativeOrder(authorList)). //relative order will fail as we are passing authorlist as ["Shalini", "Aniket"] but from API we get [Aniket, Shalini]
                statusCode(200);

    }

    public static void performPathParameter(String url, String resource, String postNumber, String author) {
        RestAssured.baseURI = url;
        given().
                contentType(ContentType.JSON).
                with().
                pathParam("id", postNumber).
                when().
                get(resource + "/{id}").
                then().
                body("author", containsString(author)).
                statusCode(200);

    }

    public static void performQueryParameter(String url, String resource, String postNumber, String author) {
        RestAssured.baseURI = url;
        given().
                contentType(ContentType.JSON).
                queryParam("id", postNumber).
                when().
                get(resource).
                then().
                body("author", hasItem(author)).
                statusCode(200);

    }

    public static void performQueryParameterWithMultipleValues(String url, String resource, String firstPostNumber, String secondPostNumber, String size) {
        RestAssured.baseURI = url;
        given().
                contentType(ContentType.JSON).
                queryParam("id", firstPostNumber).
                queryParam("id",secondPostNumber).
                when().
                get(resource).
                then().
                body("author", hasSize(Integer.parseInt(size))).
                statusCode(200);

    }
}
