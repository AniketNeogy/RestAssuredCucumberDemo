Feature: Verify different get operations using Rest Assured

  Scenario: Verify one author of the post resource
    Given I need to set the BaseUrl to "http://localhost:3000/"
    And I perform GET operation for resource "/posts" and post number "1" and check author name to be "Aniket"

  Scenario: Verify one author of the post resource
    Given I need to set the BaseUrl to "http://localhost:3000/"
    And I perform GET operation for resource "/posts" and post number "2" and check author name to be "Shalini"

  Scenario: Verify one author of the post resource
    Given I need to set the BaseUrl to "http://localhost:3000/"
    And I perform GET operation for resource "/posts" and post number "3" and check author name to be "NotPresent"
