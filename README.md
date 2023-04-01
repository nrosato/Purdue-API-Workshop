# Welcome Purdue students! 
## HammerWars API and Postman Demo Workshop
This is a demo application intended to help hackathoner's get comfortable with Postman and Spring Boot

![image](https://user-images.githubusercontent.com/99365396/229256297-56000db7-3919-4778-b9df-6175a010ea77.png)


## Prerequisite tools
### Java 17 Installation for those who do not have it

A Java Development Kit must be downloaded. Please find and download the Microsoft build of **OpenJDK 17** [here](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html).

### Postman Installation

[Installation Instructions and Download Link](https://www.postman.com/downloads/)

### IntelliJ Installation for those who do not have it

Please follow these [instructions](https://www.jetbrains.com/help/idea/installation-guide.html) to download the latest version of the community edition of IntelliJ [here.](https://www.jetbrains.com/idea/download/#section=windows)

## PLAYER Table
| Column                                                                                          | Description         |
| ------------------------------------------------------------------------------------- | --------------------------------------- |
| Player ID                                                                           | `Integer` Player ID number|
| Player Name                                                                        | `String` The Player's name                         |
| Sport                                                                        |  `String` The sport the player plays      |

## Demo endpoints
| Functionality                                                                         | Endpoint (`HTTP Verb` + `Path`)         |
| ------------------------------------------------------------------------------------- | --------------------------------------- |
| Add Player                                                                              | `POST /demo/add?name=<name>&sport=<sport>`|
| Get All Players                                                                         | `GET /demo/all`                         |
| Get Player by ID                                                                         | `GET /demo/getPlayerById?id=<id>`      |
| Delete Player                                                                        | `DELETE /demo/deletePlayer?id=<id>`        |
| Patch Player                                                                        | `PATCH /demo/changePlayerName?id=<id>&newName=<name>` |
| Put Player                                                      | `PUT /demo/replacePlayer?id=<id>&newName=<name>&newSport=<sport>` |

## Making a Postman call
1. Run the spring boot application
2. On Postman enter your hostname (usually local host: `http://127.0.0.1:<port>/ + the endpoint and its parameters`) and click send

![image](https://user-images.githubusercontent.com/99365396/201766650-b3256317-35ee-41f8-a703-3a27519a61b0.png)

### Completed postman collection
`postman_demo.postman_collection.json`
Attached to this repo is a completed postman collection; import it into the postman app to see it
