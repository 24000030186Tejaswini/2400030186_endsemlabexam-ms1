MS1 - MockMvc controller test project
=====================================
Requirements: JDK 17+, STS4/Eclipse (with Maven support, built in to STS).

Import into STS4/Eclipse:
  File > Import > Maven > Existing Maven Projects > select the ms1 folder > Finish
  (needs internet the first time to download dependencies)

Run the test:
  Right-click src/test/java/com/example/ms1/MS1ControllerTest.java
  > Run As > JUnit Test   (green bar = pass)

Run the app (optional):
  Right-click Ms1Application.java > Run As > Spring Boot App
  Open: http://localhost:8080/ms1/add?a=5&b=10

Command line (if Maven installed):
  mvn test
  mvn spring-boot:run
