package com.example.twowaydatabindingjava.list;

import android.text.style.UpdateLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.twowaydatabindingjava.R;

import java.util.List;

public class PlayerListAdapter extends RecyclerView.Adapter<PlayerListAdapter.ViewHolder> {
    private List<PlayerData> players;


    public PlayerListAdapter(List<PlayerData> players) {
        this.players = players;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_player, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final PlayerData playerData = players.get(position);
        holder.bindView(playerData);
    }

    @Override
    public int getItemCount() {
        return players.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView playerName;
        TextView playerNumber;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            playerName = itemView.findViewById(R.id.tv_name);
            playerNumber = itemView.findViewById(R.id.tv_number);
        }

        void bindView(PlayerData playerData){
            playerName.setText(playerData.getPlayerName());
            playerNumber.setText(playerData.getPlayerNumber());
        }
    }
}
