package com.example.cooktak.ui.Main.Community

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cooktak.Adapter.RecommendRVAdapter
import com.example.cooktak.R
import com.example.cooktak.model.RecommendModel
import kotlinx.android.synthetic.main.fragment_community.view.*


class CommunityFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_community, container, false)

        val viewList: ArrayList<RecommendModel> = arrayListOf()

        for (i in 0..10) {
            viewList.add(RecommendModel(R.drawable.example, "test $i", "test $i"))
        }

        var flag = true

        view.recycler_recommend.adapter = RecommendRVAdapter(view.context, viewList, flag)

        var glm = GridLayoutManager(view.context, 3)
        view.recycler_recommend.layoutManager = glm
        view.recycler_recommend.setHasFixedSize(true)

        view.btn_category_recommend.setOnClickListener {
            flag = !flag

            if (flag) {
                view.recycler_recommend.adapter = RecommendRVAdapter(view.context, viewList, flag)

                glm = GridLayoutManager(view.context, 3)
                view.recycler_recommend.layoutManager = glm
                view.recycler_recommend.setHasFixedSize(true)
            } else {
                view.recycler_recommend.adapter = RecommendRVAdapter(view.context, viewList, flag)

                val lm = LinearLayoutManager(view.context)
                view.recycler_recommend.layoutManager = lm
                view.recycler_recommend.setHasFixedSize(true)
            }
        }

        view.fab_create_community.setOnClickListener {
            val intent = Intent(this.activity, CreateActivity::class.java)
            startActivity(intent)
        }
        return view
    }
}