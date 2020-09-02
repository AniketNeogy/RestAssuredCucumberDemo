# Rest Assured With Cucumber DemoProject

### Rest Assured - Basic Overview
Rest Assured is one of the most powerful tools for API automation available in the market today. 
Rest Assured supports various languages,however in this project we will be using Rest Assured with Java and Cucumber. 

Rest Assured DSL (Domain Specific Language) can be classified broadly into 2 major categories : 

- BDD Structure (Traditional Approach) : Rest Assured by default provides a BDD structure for automating API's.
This is similar to any BDD based language using the "given --> when --> then" format.
Below are few of the examples of BDD structure that Rest Assured provides : 

`Get API with query params :`

        given().
            contentType(ContentType.JSON).
        with().
            pathParam("id", postNumber).
        when().
            get(resource + "/{id}").
        then().assertThat().
            body("author", containsString(author)).
            statusCode(200);

`Get API with path params :`
      
        given().
            contentType(ContentType.JSON).
            queryParam("id", postNumber).
        when().
            get(resource).
        then().assertThat().
            body("author", hasItem(author)).
            statusCode(200);
 
`Post API with payload being passed :` 

        given().
            contentType(ContentType.JSON).
        when().
            post(resource).
            bosy(payload).
        then().assertThat().
            body("author", hasItem(author)).
            statusCode(200);


- Non BDD Structure



##
The following project has been setup using IntelliJ 2020 Edition. In order to import this project in working condition, 
install IntelliJ first and then import project. Below are the steps involved in the Project Setup  :

### Json Server Setup : 
- Step 1 : *Install Json Server : ```npm install -g json-server```*
- Step 2 : *Once Json server has been installed successfully, create a DB.json file to mimic the API resources as described in the link below :
[JSON Server GitHub Page](https://github.com/typicode/json-server)*
- Step 3 : *Run the Json server using the command  : ```json-server db.json```*
- Step 4 : *Json Server should be live now. Goto to ```http://localhost:3000/``` to view Json Server live in action.*

### Setup Cucumber Plugin for IntelliJ
After creating the maven project and adding all the dependencies in POM.xml, we now need to add Cucumber Plugin for Java. 
Follow the steps in the below article and replicate the setup :
[Cucumber Java Plugin Setup for IntelliJ](https://www.hindsightsoftware.com/blog/cucumber-jvm-intellij#:~:text=Install%20and%20conFIgure%20cucumber%20plugin&text=In%20the%20search%20box%2C%20search,to%20restart%20IntelliJ%20once%20complete.) 

