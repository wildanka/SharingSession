package com.example.twowaydatabindingjava.list;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.twowaydatabindingjava.R;
import com.example.twowaydatabindingjava.databinding.ItemPlayerBinding;

import java.util.List;

public class PlayerListAdapter extends RecyclerView.Adapter<PlayerListAdapter.ViewHolder> {
    private List<PlayerData> players;

    public PlayerListAdapter(List<PlayerData> players) {
        this.players = players;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemPlayerBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_player, parent, false);

        return new ViewHolder(binding);
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
        ItemPlayerBinding binding;

        public ViewHolder(@NonNull ItemPlayerBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bindView(PlayerData playerData){
            binding.tvName.setText(playerData.getPlayerName());
            binding.tvNumber.setText(playerData.getPlayerNumber());
        }
    }
}
