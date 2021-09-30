# SpringDemo_CRUD
SpringBoot,JPA,Mysql

Technologies Used
1. SpringBoot
2. JPA
3. MySql Database 

4.Junit

5.Swagger

Description : REST API creation using java8,SpringBoot,JPA,MYSQl Database
Here Four APIs present in this app
1. to get all employee details
2. to get details according employee id
3. to update an employee detail
4. save new employee detail
5. delete an existing employee detail

Following Steps :

Step 1: Create a new project "SpringBootAssign1" through https://start.spring.io
Step 1: Create a new project "SpringBootAssign1" through https://start.spring.io,

Step 2: Add Dependencies on POM.xml file like spring-data-jpa,mysql-connector,spring-web etc.
Step 3: Set up the MYSQl Database 
Step 4: Create a new database named "Assigment" and table in it named Employee
Step 5: Create id,firstname,lastname,email column in database
Step 6: Open the "springbootAssign1.jar" folder into eclipse
Step 7: Create four packages viz. Entity,Services,Dao,Controller
Step 8: Add logics to all this folder 
Step 9: Run the project
Step 10: use portNo.8050 "http://localhost:8050"

To testing Rest API's
![A1_spring_initializer](https://user-images.githubusercontent.com/55799798/134897739-08b2698a-62fa-4613-9d45-75a7a0805af2.PNG)

Project Directory Structure 
![A2_before_directory_Structure](https://user-images.githubusercontent.com/55799798/134898199-0c514cd4-a607-4372-b6e4-a5dec48db937.PNG)

Step 3: MYSQL Database Setup
[Create New User]
![A3_Mysql_create_user](https://user-images.githubusercontent.com/55799798/134898617-48cdfe65-fc5d-4d68-965f-1eff3182a8f6.PNG)
[Database Creation]
![A4_Mysql_database_setup](https://user-images.githubusercontent.com/55799798/134898679-8765eb99-d32f-4518-a3ab-9fb24d6a3ae9.PNG)
[Testing Database]
![A4_test_done](https://user-images.githubusercontent.com/55799798/134898751-afae1c2a-1767-4c88-9ef1-eff3e3282742.PNG)
[show table data]
![A6_Data_Done](https://user-images.githubusercontent.com/55799798/134898433-869021ba-83b8-45c6-b720-76a121265f20.PNG)

Step 4: Open the "SpringBootAssign1.jar" folder into eclipse
Create four packages viz. Entity,Services,Dao,Controller
Add logics to all this folder 
Eclipse Project Directory after writing all Code logic
![A88](https://user-images.githubusercontent.com/55799798/134899390-1f6fa4f1-f4f7-4ebd-b385-95939c63eb10.PNG)

Step 5: Run the Project
![AD7_1_Allemployee](https://user-images.githubusercontent.com/55799798/134899816-9e916563-c2ec-4ef3-8c66-a9ce5fb6ac30.PNG)

Step 6: To test Rest API's

1. Getting all employees Data
http://localhost:8050/api/employee
![D1](https://user-images.githubusercontent.com/55799798/134899869-cebc1bdd-c115-4af3-98d5-00311f3c88e8.PNG)

2. Getting Employee data by ID 
http://localhost:8050/api/employees/employeeId
http://localhost:8050/api/employees/{employeeId}
![D2_get_by_id](https://user-images.githubusercontent.com/55799798/134899909-de869f44-6044-4ee9-a561-73f06f3fb7b6.PNG)

3. Saving new Employee Data and updating 
[using POSTMan]
Saving new Employee Data
![D3_store_data1](https://user-images.githubusercontent.com/55799798/134900067-e0c69177-d20d-4ff2-bb8d-f0b2e93df336.PNG)
[Changes in Database]
![D3_store_data2](https://user-images.githubusercontent.com/55799798/134900152-11f511f0-2c4a-4895-a25b-59e7c82d042b.PNG)

Updating Employee data having id 3
![D5_put](https://user-images.githubusercontent.com/55799798/134900237-d0b6a49a-9801-417e-a5b4-c653b7fa024c.PNG)

4. Deleting Employeee Data
![D4_delete_final](https://user-images.githubusercontent.com/55799798/134900410-76bdad0f-39ec-4fe7-a1ab-d0f071116a2f.PNG)
[Database look]
![D5_Result](https://user-images.githubusercontent.com/55799798/134900464-f99c90c0-e8cf-4de6-878a-038f7bf00563.PNG)

======================================
Perform testing using Junit @ Mockito
======================================
Here we are testing out "getEmployeeById" RestApi by creating a test class "EmployeeControllerTest.java"
Code is looking like that:
![A1_Junit_Testing_Code png](https://user-images.githubusercontent.com/55799798/135252104-4e4f0236-5701-4aee-9f04-89c6933b20e9.png)

[Output]
![A2_Console](https://user-images.githubusercontent.com/55799798/135252233-de853f81-f72e-48b5-b954-fe9cb6238cfb.JPG)

[Junit Testing Result]
![A3_Junit_Face](https://user-images.githubusercontent.com/55799798/135252310-98bd865a-4a55-40f7-b6fe-0fa444af0c35.JPG)

=================
Swagger
=================
Now let's implement Swagger and see all RestApi's information through an UI
1.[Add dependencies]
![D1_dep1](https://user-images.githubusercontent.com/55799798/135465963-b8003123-a3c4-410c-a187-4b05d0190cdb.JPG)

2[Add Configuration File]
![D2_dep](https://user-images.githubusercontent.com/55799798/135466059-bae457cd-6828-429c-814b-b57278e7ba6f.JPG)

3[Swagger UI]
![D3](https://user-images.githubusercontent.com/55799798/135466204-1d9f32c7-b364-4578-88e4-aba6139616de.JPG)









