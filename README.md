# java-songr

## Feature Tasks
* hello world route at /hello ensures that you can visit that route in your browser and see data come back.
* Capitalize route at /captialize turns words into UPPER CASE. For instance, visit /capitalize/hello and get back the response HELLO.
* Reverse route at /reverse reverses the order of the words in a query parameter. For example, if I visit /reverse?sentence=Hello world, it should return world Hello.

## Setup
Use the [Spring Initializr](https://start.spring.io/) to create a new application with artifact songr with Web (and optionally Devtools) dependency. Download the zip file and extract the directory it contains. 

## Solution
* [App Code](https://github.com/idothestamping/java-songr/src/main/java/com.idothestamping.lab11.songr/SongApplication.java)
* [Controller Code](https://github.com/idothestamping/java-songr/src/main/java/com/idothestamping/lab11/songr/SongrController/SongrController.java)
* [Test Code](https://github.com/idothestamping/java-songr/src/test/java/com/idothestamping/lab11/songr/SongrController/SongrControllerTest.java)
