Feature: Verify different get operations using Rest Assured

  Scenario: Verify first author of the posts resource
    Given I need to set the BaseUrl to "http://localhost:3000/" and do GET operation for resource "/posts" and post number "1" and check author name to be "Aniket"

  Scenario: Verify second author of the posts resource
    Given I need to set the BaseUrl to "http://localhost:3000/" and do GET operation for resource "/posts" and post number "2" and check author name to be "Shalini"

  Scenario: Verify authorList in the posts resource
    Given I need to set the BaseUrl to "http://localhost:3000/" and do GET operation for resource "/posts" and verify authorList

  Scenario: Verify first author of the post resource using path parameter
    Given I need to set the BaseUrl to "http://localhost:3000/" and do GET operation for resource "/posts" using the path parameter value of "1" and validate it to be "Aniket"

  Scenario: Verify second author of the post resource using path parameter
    Given I need to set the BaseUrl to "http://localhost:3000/" and do GET operation for resource "/posts" using the query parameter value of "1" and validate it to be "Aniket"

  Scenario: Verify second author of the post resource using path parameter
    Given I need to set the BaseUrl to "http://localhost:3000/" and do GET operation for resource "/posts" using the query parameter value of "1" & "2" and validate the size equal to "2"
