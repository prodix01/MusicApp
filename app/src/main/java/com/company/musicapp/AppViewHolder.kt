package com.company.musicapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.layout_recyler_item.view.*

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    private val songTitleView = itemView.title
    private val songImgView = itemView.song_img

    //데이터와 뷰를 묶음
    fun bind(myModel: MyModel) {
        songTitleView.text = myModel.name

        Glide
            .with(App.instance)
            .load(myModel.songImg)
//            .centerCrop()
            .placeholder(R.drawable.pngwave)
            .into(songImgView)
    }

}