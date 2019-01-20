# Application Details
Create a simple app about listing and viewing of profiles from json source. This is required for job application in Stratpoint Technologies.

# Technologies and Frameworks Used
* Spring Boot - used as a backend framework for providing API
* jQuery - used for doing DOM manipulation and AJAX requests
* DataTables - used as a library in rendering list of profiles as a table
* Bootstrap - used for the design and layout of all pages
* Maven - used as a build tool to retrieve dependencies from repository
* Git - used as the version control system during development of this app
* GSON - used to deserialize JSON to POJO

# Requirements to run application
* Installed Git 
* Installed Java 8
* Tomcat 9.0.14
* Maven

# Installation/Deployment
1. Open command prompt. Change the current directory on any folder you want to run the application.
2. Type the following in command prompt:
```
  git clone https://github.com/cpablo/profile_app.git
```
3. Clone will be downloaded. On command prompt, change the current directory to the folder of cloned repository.
4. Type the following in command prompt:
```
  mvn clean install
```
5. Wait for the build to complete. After build completion, change the current directory to /target folder. A jar file was generated (**profile-0.0.1-SNAPSHOT.jar**).
6. Type the following in command prompt to run the application:
```
  java -jar profile-0.0.1-SNAPSHOT.jar
```
7. Wait for a minute for the app to initialize. After waiting, open Google Chrome or Firefox and access this URL:
```
  http://localhost:8080/stratpoint/
```

