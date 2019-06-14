package com.idothestamping.lab11.songr;

import javax.persistence.*;
import java.util.List;

@Entity // This tells Hibernate to make a table out of this class
public class Album {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
     Long id;
     String title;
     String artist;
     Long songCount;
     Long length;
     String imageUrl;

    @OneToMany(mappedBy = "album")
    List<Song> songs;
    public Album() {}
    public Album(String title, String artist, Long songCount, Long length, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Long getSongCount() {
        return songCount;
    }

    public void setSongCount(Long songCount) {
        this.songCount = songCount;
    }

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}