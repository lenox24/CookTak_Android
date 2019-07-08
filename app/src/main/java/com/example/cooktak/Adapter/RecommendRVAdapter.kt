package com.example.cooktak.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.cooktak.R
import com.example.cooktak.model.RecommendModel
import kotlinx.android.synthetic.main.recommand_item2.view.*
import kotlinx.android.synthetic.main.recommend_item1.view.*

class RecommendRVAdapter(
    val context: Context,
    private val viewList: ArrayList<RecommendModel>,
    private val flag: Boolean
) :
    RecyclerView.Adapter<RecommendRVAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view: View = if (flag) {
            LayoutInflater.from(context).inflate(R.layout.recommend_item1, parent, false)
        } else {
            LayoutInflater.from(context).inflate(R.layout.recommand_item2, parent, false)
        }

        return Holder(view)
    }

    override fun getItemCount(): Int = viewList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindView(viewList[position], context)
        holder.itemView.setOnClickListener {
            if (flag) {
                Toast.makeText(context, "Title : ${holder.itemView.tex_title_item1.text}", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(context, "Title : ${holder.itemView.tex_title_item2.text}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(recommendModel: RecommendModel, context: Context) {
            if (flag) {
                itemView.img_item1.setImageResource(recommendModel.img)
                itemView.tex_title_item1.text = recommendModel.name
                itemView.tex_sub_item1.text = recommendModel.sub
            } else {
                itemView.img_item2.setImageResource(recommendModel.img)
                itemView.tex_title_item2.text = recommendModel.name
                itemView.tex_sub_item2.text = recommendModel.sub
            }

        }
    }
}

