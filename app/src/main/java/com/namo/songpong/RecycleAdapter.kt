package com.namo.songpong

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_c2c.view.*

internal class RecyclerAdapter(private val dataList: ArrayList<Data>) : RecyclerView.Adapter<RecyclerAdapter.Holder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = Holder(parent)

    override fun onBindViewHolder(holder: Holder, position: Int) {
        with(holder.itemView) {
            val data = dataList[position]
            imageIcon.setImageResource(data.image)
            name_tv.text = data.name
            dust_tv.text = data.dust

        }
    }

    override fun getItemCount(): Int = dataList.size

    inner class Holder(parent: ViewGroup)
        : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context)
        .inflate(R.layout.item_c2c, parent, false))
}
