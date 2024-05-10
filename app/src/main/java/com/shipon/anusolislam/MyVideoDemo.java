package com.shipon.anusolislam;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MyVideoDemo extends AppCompatActivity {


    private VideoView videoView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_video_demo);
        videoView = findViewById(R.id.videoViewID);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.gojor);
        videoView.setVideoURI(uri);
        MediaController mediaController =new MediaController(this);
        videoView.setMediaController(mediaController);
        videoView.start();
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        // প্রথম এ ডোকার পরে কল হয়
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
        // প্রথম এ ডোকার পরে কল হয়
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
        // প্রথম এ ডোকার পরে কল হয়
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();

        // এপ্স থেকে বাহির হলে এটা কল হয়

    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
        // এপ্স থেকে বাহির হলে এটা কল হয়
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
        // এপ্স থেকে বাহির হয়ার পরে আবার ডোকার পারে এটা কল হয় আগে
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();

        // এপ্স থেকে back preass করে বাহির হলে এটা কল হয়


    }
}

