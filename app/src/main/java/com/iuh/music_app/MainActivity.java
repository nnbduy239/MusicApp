package com.iuh.music_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.util.Pair;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements CallBack {
    private RecyclerView rcvMusic;
    private MusicAdapter musicAdapter;
    ArrayList<Song>songs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        songs = new ArrayList<>();
        createSongList();
        rcvMusic =findViewById(R.id.rcvMusic);
        musicAdapter = new MusicAdapter(songs,this);
        LinearLayoutManager musicLayout = new LinearLayoutManager(this);
        rcvMusic.setAdapter(musicAdapter);
        rcvMusic.setLayoutManager(musicLayout);
        musicAdapter.notifyDataSetChanged();
        rcvMusic.setHasFixedSize(true);
    }

    private void createSongList() {
        songs.add(new Song(R.drawable.album1,"Stressed Out","Twenty One Pilot"));
        songs.add(new Song(R.drawable.viva,"ViVa la Vida","ColdPLay"));
        songs.add(new Song(R.drawable.gangsta,"Gangsta Paradise","Coolio"));
    }

    @Override
    public void onSongItemClick(int pos, ImageView imgAlbum, TextView songName, TextView artistName) {
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("songObject",songs.get(pos));
        Pair<View,String> p1 =Pair.create((View) imgAlbum,"imgAlbum");
        Pair<View,String> p2 =Pair.create((View) songName,"songName");
        Pair<View,String> p3 =Pair.create((View) artistName,"artistName");
       ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(this,p1,p2,p3);
        startActivity(intent,optionsCompat.toBundle());
    }
}