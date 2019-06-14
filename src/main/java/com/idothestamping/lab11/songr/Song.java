package com.idothestamping.lab11.songr;

import javax.persistence.*;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    public String title;
    public Long length;
    public Long trackNumber;

    // name of this variable matches mappedBy in Song.java
    @ManyToOne
    public Album album;


    public Song() {}
    public Song(String title, Long length, Long trackNumber, Album album) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
        this.album = album;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title; }

    public Long getLength() {
        return length; }

    public void setLength(Long length) {
        this.length = length;
    }

    public Long getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(Long trackNumber) {
        this.trackNumber = trackNumber;
    }

    public Album getGetAlbum() {
        return album;
    }

    public void setGetAlbum(Album album) {
        this.album = album;
    }

}