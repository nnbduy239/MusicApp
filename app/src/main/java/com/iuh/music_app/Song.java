package com.iuh.music_app;

import java.io.Serializable;

public class Song implements Serializable {
    private int imgAlbum;
    private String songName;
    private String artistName;

    public Song(){

    }
    public Song(int imgAlbum, String songName, String artistName) {
        this.imgAlbum = imgAlbum;
        this.songName = songName;
        this.artistName = artistName;
    }

    public int getImgAlbum() {
        return imgAlbum;
    }

    public void setImgAlbum(int imgAlbum) {
        this.imgAlbum = imgAlbum;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

}
