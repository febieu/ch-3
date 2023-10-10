package com.example.chaptertiga

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var musicList: ArrayList<Music>
    private lateinit var musicAdapter: MusicAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        musicList = ArrayList()

        musicList.add(Music(R.drawable.svt_, "Seventeen"))
        musicList.add(Music(R.drawable.svt_, "BTS"))
        musicList.add(Music(R.drawable.svt_, "Red Velvet"))
        musicList.add(Music(R.drawable.svt_, "PENTAGON"))
        musicList.add(Music(R.drawable.svt_, "G-IDLE"))

        musicAdapter = MusicAdapter(musicList)
        recyclerView.adapter = musicAdapter
    }
}