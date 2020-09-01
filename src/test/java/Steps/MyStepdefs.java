package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class MyStepdefs {
    @Given("^I need to set the BaseUrl to \"([^\"]*)\" and do GET operation for resource \"([^\"]*)\" and post number \"([^\"]*)\" and check author name to be \"([^\"]*)\"$")
    public void iNeedToSetTheBaseUrlToAndDoGETOperationForResourceAndPostNumberAndCheckAuthorNameToBe
            (String url, String resource, String postNumber, String author) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        BDDStyleMethod.simpleGetPostsMethod(url, resource, postNumber, author);
    }

    @Given("^I need to set the BaseUrl to \"([^\"]*)\" and do GET operation for resource \"([^\"]*)\" and verify authorList$")
    public void iNeedToSetTheBaseUrlToAndDoGETOperationForResourceAndVerifyAuthorList(String url, String resource) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String authorList[] = {"Shalini", "Aniket"};
        BDDStyleMethod.performContainsCollection(url, resource, authorList);
    }


    @Given("^I need to set the BaseUrl to \"([^\"]*)\" and do GET operation for resource \"([^\"]*)\" using the path parameter value of \"([^\"]*)\" and validate it to be \"([^\"]*)\"$")
    public void iNeedToSetTheBaseUrlToAndDoGETOperationForResourceUsingThePathParameterValueOfAndValidateItToBe(String url, String resource, String postNumber, String author) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        BDDStyleMethod.performPathParameter(url, resource, postNumber, author);
    }

    @Given("^I need to set the BaseUrl to \"([^\"]*)\" and do GET operation for resource \"([^\"]*)\" using the query parameter value of \"([^\"]*)\" and validate it to be \"([^\"]*)\"$")
    public void iNeedToSetTheBaseUrlToAndDoGETOperationForResourceUsingTheQueryParameterValueOfAndValidateItToBe(String url, String resource, String postNumber, String author) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        BDDStyleMethod.performQueryParameter(url, resource, postNumber, author);
    }

    @Given("^I need to set the BaseUrl to \"([^\"]*)\" and do GET operation for resource \"([^\"]*)\" using the query parameter value of \"([^\"]*)\" & \"([^\"]*)\" and validate the size equal to \"([^\"]*)\"$")
    public void iNeedToSetTheBaseUrlToAndDoGETOperationForResourceUsingTheQueryParameterValueOfAndValidateTheSizeEqualTo(String url, String resource, String firstPostNumber, String secondPostNumber, String size) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        BDDStyleMethod.performQueryParameterWithMultipleValues(url, resource, firstPostNumber, secondPostNumber, size);
    }
}
