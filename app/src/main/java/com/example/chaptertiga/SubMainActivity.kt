package com.example.chaptertiga

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.collections.ArrayList


class SubMainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var albumSvtList: ArrayList<Album>
    private lateinit var albumAdapter: AlbumAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub_main)

        recyclerView = findViewById(R.id.recycler_view_album)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val music = intent.getParcelableExtra<Music>("music")

        albumSvtList = ArrayList()

        albumSvtList.add(Album("Face the Sun"))
        albumSvtList.add(Album("Love & Letter"))
        albumSvtList.add(Album("FML"))


        albumAdapter = AlbumAdapter(albumSvtList)
        recyclerView.adapter = albumAdapter

        albumAdapter.onItemClick = {
            for (album in albumSvtList){
                val google = "https://www.google.com/search?q=${album.name}"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(google))
                startActivity(intent)
            }
        }

//        albumAdapter.onItemClick = {
//            val intent = Intent(this, DetailedActivity::class.java)
//            intent.putExtra("music", it)
//            startActivity(intent)
//        }
    }
}