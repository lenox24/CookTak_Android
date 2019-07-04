package com.example.cooktak.ui.Main

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cooktak.Adapter.GridRecyclerAdapter
import com.example.cooktak.R
import com.example.cooktak.model.RecommendModel
import kotlinx.android.synthetic.main.fragment_recommend.view.*


class RecommendFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_recommend, container, false)

        val viewList: ArrayList<RecommendModel> = arrayListOf()
        var model = RecommendModel(R.drawable.example, "test 1", "test")
        viewList.add(model)

        model = RecommendModel(R.drawable.example, "test 2", "test")
        viewList.add(model)

        model = RecommendModel(R.drawable.example, "test 3", "test")
        viewList.add(model)

        model = RecommendModel(R.drawable.example, "test 4", "test")
        viewList.add(model)

        view.recycler_recommend.adapter = GridRecyclerAdapter(view.context, viewList)

        val lm = GridLayoutManager(view.context, 3)
        view.recycler_recommend.layoutManager = lm
        view.recycler_recommend.setHasFixedSize(true)

        return view
    }
}