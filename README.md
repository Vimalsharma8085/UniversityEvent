# UniversityEvent..

## Framework and Language Used

- `Framework` SpringBoot
- `Language` java

## Description
Welcome to the UniversityEvent Management System repository! This open-source project is a Java-based application built using the Spring Boot framework. The UniversityEvent Management System allows users to manage application users through a set of APIs. With these APIs, users can perform various operations such as adding users, updating user information (including all properties), deleting users, retrieving users by their user ID, and retrieving a list of all users.

## Data flow

The project is organized into several parts, each serving a specific purpose:

### 1. Controller

This Controller houses has two sections the `StudentController` and StudentEventcon  classes, which provides API endpoints for interacting with the UniversityEvent Management System. Here is a list of available endpoints:

- `POST /userMan/Users` : Adds a new user. Accepts a user object in the request body.
- `GET /Users/id/{id}` : Retrieves user information by user ID.
- `GET /userMan/allUsers` : Retrieves a list of all users.
- `PUT /updateUserInfo/{id}` : Updates user information. Accepts user ID and optional parameters for name, username, address, and phone number.
- `DELETE /Users/delete/{ids}` : Deletes a user by user ID.
-  ............
- @PostMapping("addAllEvent");
-   @GetMapping("getAllEvents")
-  @GetMapping("getEventByDate/{date}")
-  @PutMapping("updateEvent/{Id}/{name}")
-  @DeleteMapping("daleteEvent/{eventId}")
### 2. Services

The Services section includes the  set of two service classes that the API Controller class uses to handle universityEvent management operations. The list of services includes:

- `addUser` : Adds a new user to the system.
- `getUser` : Retrieves user information by user ID.
- `getAllUser` : Retrieves a list of all users in the system.
- `updateUserInfo` : Updates user information, allowing for changes to name, username, address, and phone number.
- `removeUsers` : Deletes a user by their user ID.
-...........
- removeStudentById
- getStudentById
### 3 model :-

This section contains the `UniversityEvent Management` classes, which represents the core entity of the system. The `StudentEvent.java` class includes the following properties:

- eventId
- eventName
- locationOfEvent
- Date
- starttime
- endtime
- ..........
- StudentId
- firstName
- lastName
- Age
- department
- 
-

### 4.Repository

In this layer data is stored. for storing data I have used database (H2-console)
