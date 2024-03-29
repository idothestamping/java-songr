# java-songr

## Feature Tasks
* hello world route at /hello ensures that you can visit that route in your browser and see data come back.
* Capitalize route at /captialize turns words into UPPER CASE. For instance, visit /capitalize/hello and get back the response HELLO.
* Reverse route at /reverse reverses the order of the words in a query parameter. For example, if I visit /reverse?sentence=Hello world, it should return world Hello.
* Spring RESTful Routing:
   * Create an Album model.
   * An Album has a title, an artist, a songCount, a length (in seconds), and an imageUrl that is a link to that album’s art.
   * A user should be able to see information about all the albums on the site.
   * A user should be able to add albums to the site.
* Related Resources and Integration Testing
  * Create a Song model.
  * A Song has a title, a length (in seconds), a trackNumber, and the album on which that song appears.
  * Ensure that the relationship between Albums and Songs is appropriately set up.
  * A user should be able to see information about all the songs on the site.
  * A user should be able to view a page with data about one particular album.
  * A user should be able to add songs to an album.
  * A user should be able to see the songs that belong to an album when looking at that album.
   
## Setup
Use the [Spring Initializr](https://start.spring.io/) to create a new application with artifact songr with Web (and optionally Devtools) dependency. Download the zip file and extract the directory it contains. 

## Solution
* [App Code](https://github.com/idothestamping/java-songr/blob/master/src/main/java/com/idothestamping/lab11/songr/SongrApplication.java)
* [Songr Controller Code](https://github.com/idothestamping/java-songr/blob/master/src/main/java/com/idothestamping/lab11/songr/SongrController/SongrController.java)
* [App Test Code](https://github.com/idothestamping/java-songr/blob/master/src/test/java/com/idothestamping/lab11/songr/SongrApplicationTests.java)

**Spring RESTful Routing:**
* [Album Code](https://github.com/idothestamping/java-songr/blob/master/src/main/java/com/idothestamping/lab11/songr/Album.java)
* [Album Controller Code](https://github.com/idothestamping/java-songr/blob/master/src/main/java/com/idothestamping/lab11/songr/SongrController/AlbumController.java)

**Related Resources and Integration Testing**
* [Song Code](https://github.com/idothestamping/java-songr/blob/master/src/main/java/com/idothestamping/lab11/songr/Song.java)
* [Song Controller Code](https://github.com/idothestamping/java-songr/blob/master/src/main/java/com/idothestamping/lab11/songr/SongrController/SongController.java)