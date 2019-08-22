package com.example.cooktak.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.google.gson.JsonObject

class SearchAdapter : BaseAdapter() {

    val list: ArrayList<JsonObject>? = null
    val searchList: ArrayList<JsonObject>? = null

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val holder = ViewHolder()
        var item = searchList!![position]

        if(convertView == null) {

        }

        return convertView!!
    }

    override fun getItem(position: Int): Any = searchList!![position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getCount(): Int = searchList!!.size

    inner class ViewHolder {
        lateinit var tex_title: TextView
        lateinit var img_content: ImageView
    }
}