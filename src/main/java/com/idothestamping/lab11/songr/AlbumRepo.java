package com.idothestamping.lab11.songr;

import org.springframework.data.repository.CrudRepository;

// sets up how Spring will interact with the database to retrieve/save/etc Greetings
public interface AlbumRepo extends CrudRepository<Album, Long> {
}