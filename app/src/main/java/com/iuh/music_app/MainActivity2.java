package com.iuh.music_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private ImageView imgAlbum;
    private TextView songName,artistName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imgAlbum = findViewById(R.id.imgAlbum2);
        songName = findViewById(R.id.songName2);
        artistName =findViewById(R.id.artistName2);

        Song songItem = (Song)getIntent().getExtras().getSerializable("songObject");
        imgAlbum.setImageResource(songItem.getImgAlbum());
        songName.setText(songItem.getSongName());
        artistName.setText(songItem.getArtistName());
    }
}