package com.example.twowaydatabindingjava.detail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.twowaydatabindingjava.R;
import com.example.twowaydatabindingjava.databinding.ActivityDetailBinding;

public class ActivityDetail extends AppCompatActivity {
    private ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail);

        binding.btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateNama();
            }
        });

    }

    private void updateNama(){
        binding.detail.tvDetailText.setText(binding.etInput.getText().toString());
    }

}