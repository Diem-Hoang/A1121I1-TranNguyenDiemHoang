package com.codegym.entity;

import javax.persistence.*;

@Entity
//@Table(name = "music")
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "id", columnDefinition = "int")
    private String id;
    private String nameSong;
    private String artist;
    private String kindOfMusic;
    private String filePath;

    public Music() {
    }

    public Music(String id, String nameSong, String artist, String kindOfMusic, String filePath) {
        this.id = id;
        this.nameSong = nameSong;
        this.artist = artist;
        this.kindOfMusic = kindOfMusic;
        this.filePath = filePath;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getKindOfMusic() {
        return kindOfMusic;
    }

    public void setKindOfMusic(String kindOfMusic) {
        this.kindOfMusic = kindOfMusic;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
