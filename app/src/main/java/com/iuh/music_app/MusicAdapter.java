package com.iuh.music_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.ViewHolder> {
    List<Song>songs;
    CallBack callBack;
    public MusicAdapter(List<Song> songs,CallBack callBack) {
        this.songs = songs;
        this.callBack =callBack;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.music_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Song song = songs.get(position);
        holder.imgAlbum.setImageResource(song.getImgAlbum());
        holder.songName.setText(song.getSongName());
        holder.artistName.setText(song.getArtistName());
    }

    @Override
    public int getItemCount() {
        return songs.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgAlbum;
        TextView songName,artistName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgAlbum =itemView.findViewById(R.id.imgAlbum);
            songName = itemView.findViewById(R.id.songName);
            artistName = itemView.findViewById(R.id.artistName);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    callBack.onSongItemClick(getAdapterPosition(),imgAlbum,songName,artistName);
                }
            });
        }
    }
}
