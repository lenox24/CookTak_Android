package com.example.cooktak.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.cooktak.R
import com.example.cooktak.model.RecommendModel
import kotlinx.android.synthetic.main.community_rv_item.view.*
import kotlinx.android.synthetic.main.community_rv_item2.view.*

class RecommendRVAdapter(
    val context: Context,
    private val viewList: ArrayList<RecommendModel>,
    private val flag: Boolean
) :
    RecyclerView.Adapter<RecommendRVAdapter.ViewHolder>() {

    private var expandedPosition: Int = -1

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = if (flag) {
            LayoutInflater.from(context).inflate(R.layout.community_rv_item2, parent, false)
        } else {
            LayoutInflater.from(context).inflate(R.layout.community_rv_item, parent, false)
        }

        return ViewHolder(view)
    }

    override fun getItemCount(): Int = viewList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(viewList[position])
        if (!flag) {
            if (position == expandedPosition) {
                holder.expandItem.visibility = View.INVISIBLE
            } else {
                holder.expandItem.visibility = View.GONE
            }
        }
        holder.itemView.setOnClickListener {
            if (flag) {
                Toast.makeText(context, "Title : ${holder.itemView.tex_title1.text}", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(context, "Title : ${holder.itemView.tex_title2.text}", Toast.LENGTH_SHORT).show()

                if (expandedPosition >= 0) {
                    val prev = expandedPosition
                    notifyItemChanged(prev)
                }
                expandedPosition = holder.position
                notifyItemChanged(expandedPosition)
            }
        }
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val expandItem = itemView.findViewById<View>(R.id.expand_constraint)
        fun bindView(recommendModel: RecommendModel) {
            if (flag) {
                itemView.img_item1.setImageResource(recommendModel.img)
                itemView.tex_title1.text = recommendModel.name
                itemView.tex_sub1.text = recommendModel.sub
            } else {
                itemView.img_item2.setImageResource(recommendModel.img)
                itemView.tex_title2.text = recommendModel.name
                itemView.tex_sub2.text = recommendModel.sub
            }

        }
    }
}
