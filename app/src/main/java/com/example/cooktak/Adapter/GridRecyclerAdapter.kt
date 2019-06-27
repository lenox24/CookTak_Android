package com.example.cooktak.Adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.example.cooktak.model.RecommendModel
import kotlinx.android.synthetic.main.recommend_item.view.*

class GridRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val listOfView = listOf<RecommendModel>()

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(p0: RecyclerView.ViewHolder, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

class recommendViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bindView(recommendModel: RecommendModel) {
        itemView.gridImg.setImageURI(recommendModel.img)
        itemView.gridName.text = recommendModel.name
        itemView.gridSub.text = recommendModel.sub
    }
}