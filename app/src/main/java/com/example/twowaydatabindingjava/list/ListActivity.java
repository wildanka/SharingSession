package com.example.twowaydatabindingjava.list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.twowaydatabindingjava.R;
import com.example.twowaydatabindingjava.databinding.ActivityListBinding;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {
    private ActivityListBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_list);


        PlayerListAdapter adapter = new PlayerListAdapter(generatePlayerData());
        binding.rvPlayer.setLayoutManager(new LinearLayoutManager(this));
        binding.rvPlayer.setAdapter(adapter);
    }

    private List<PlayerData> generatePlayerData() {
        List<PlayerData> list = new ArrayList<>();

        list.add(new PlayerData("Elie Eiboy", "11"));
        list.add(new PlayerData("Frank Lampard", "8"));
        list.add(new PlayerData("Patrick Wanggai", "10"));
        list.add(new PlayerData("Christian Gonzales", "9"));
        list.add(new PlayerData("Buffon", "1"));

        return list;
    }


}
