package com.example.chaptertiga

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MusicAdapter(
private val musicList: ArrayList<Music>
): RecyclerView.Adapter<MusicAdapter.MusicViewHolder>()
{

    var onItemClick : ((Music) -> Unit)? = null
    class MusicViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.image_view)
        val textView: TextView = itemView.findViewById(R.id.text_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(
                R.layout.activity_item,
                parent,
                false,
            )
        return MusicViewHolder(view)
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        val music = musicList[position]
        holder.imageView.setImageResource(music.image)
        holder.textView.text = music.name


        holder.itemView.setOnClickListener{
            onItemClick?.invoke(music)
        }
    }

    override fun getItemCount(): Int {
        return musicList.size
    }
}