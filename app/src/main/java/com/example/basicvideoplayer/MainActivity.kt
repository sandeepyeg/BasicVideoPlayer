package com.example.basicvideoplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoPlayer:VideoView = findViewById(R.id.videoView)
        videoPlayer.setVideoPath("android.resource://" + packageName + "/" + R.raw.lion2)
        val mediaPlayer = MediaController(this)
        mediaPlayer.setAnchorView(videoPlayer)
        mediaPlayer.setMediaPlayer(videoPlayer)
        videoPlayer.setMediaController(mediaPlayer)
    }
}