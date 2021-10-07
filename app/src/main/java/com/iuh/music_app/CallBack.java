package com.iuh.music_app;

import android.widget.ImageView;
import android.widget.TextView;

public interface CallBack {
    void onSongItemClick(int pos,
                         ImageView imgAlbum,
                         TextView songName,
                         TextView artistName);
}
