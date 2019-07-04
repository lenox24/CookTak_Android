package com.example.cooktak.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cooktak.R
import com.example.cooktak.model.RecommendModel
import kotlinx.android.synthetic.main.recommend_item.view.*
import org.jetbrains.anko.image

class GridRecyclerAdapter(val context: Context, val viewList: ArrayList<RecommendModel>) :
    RecyclerView.Adapter<GridRecyclerAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.recommend_item, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = viewList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindView(viewList[position], context)
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(recommendModel: RecommendModel, context: Context) {
            itemView.gridImg.setImageResource(recommendModel.img)
            itemView.gridName.text = recommendModel.name
            itemView.gridSub.text = recommendModel.sub
        }
    }
}

