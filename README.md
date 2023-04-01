# Postman Demo Spring Boot Application
This is a demo application intended to help bootcampers get comfortable with Postman and Spring Boot

## Prerequisite tools
### Java Installation

A Java Development Kit must be downloaded. Please find and download the Microsoft build of **OpenJDK 11** [here](https://learn.microsoft.com/en-us/java/openjdk/download#openjdk-11).

### Postman Installation

[Installation Instructions and Download Link](https://www.postman.com/downloads/)

### IntelliJ Installation

Please follow these [instructions](https://www.jetbrains.com/help/idea/installation-guide.html) to download the latest version of the community edition of IntelliJ [here.](https://www.jetbrains.com/idea/download/#section=windows)

### MySQL Installation

Please install MySQL + Workbench. It should create a root DB for you; if it prompts you to name it, call the DB "root". You can create named schemas within root. https://dev.mysql.com/downloads/installer/


## Connecting your MySQL database
In `application.properties` enter your database name in the `datasource.url`, username, and password. Then run the spring application.

![image](https://user-images.githubusercontent.com/99365396/201757624-83b134fe-d6e2-4841-9723-7cdbe3b86b5c.png)

## Demo endpoints
| Functionality                                                                         | Endpoint (`HTTP Verb` + `Path`)         |
| ------------------------------------------------------------------------------------- | --------------------------------------- |
| Add User                                                                              | `POST /demo/add?name=<name>&email=<email>`|
| Get All Users                                                                         | `GET /demo/all`                         |

## Making a Postman call
1. Run the spring boot application
2. On Postman enter your hostname (usually local host: `http://127.0.0.1:<port>/ + the endpoint and its parameters`) and click send

![image](https://user-images.githubusercontent.com/99365396/201766650-b3256317-35ee-41f8-a703-3a27519a61b0.png)

### Completed postman collection
`postman_demo.postman_collection.json`
Attached to this repo is a completed postman collection; import it into the postman app to see it

### To Do
- Add endpoints that use request bodies
- Change DB to H2 from MySQL workbench
