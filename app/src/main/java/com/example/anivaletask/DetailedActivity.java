package com.example.anivaletask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class DetailedActivity extends AppCompatActivity {

    ImageView imageView;
    String image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);
        getSupportActionBar().hide();
        
        imageView = findViewById(R.id.imageViewDetails);
        image=getIntent().getStringExtra("image");

        Glide.with(this).load(image).into(imageView);
    }
}