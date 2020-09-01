## Rest Assured With Cucumber DemoProject
The following project has been setup using IntelliJ 2020 Edition. In order to import this project in working condition, install IntelliJ first and then import project. Below are the steps involved in the Project Setup  :

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

