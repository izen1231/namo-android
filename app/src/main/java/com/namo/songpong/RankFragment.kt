package com.namo.songpong

import android.annotation.SuppressLint
import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_plant.view.*

class RankFragment : Fragment() {

    private val items = java.util.ArrayList<Data>()
    private var recyclerView: RecyclerView? = null
    private var adapter: RecyclerAdapter? = null
    @SuppressLint("WrongConstant")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_plant, container, false)
        view.fab.setOnClickListener {
            items += Data(R.drawable.sonamu,"Test", "Test")
            recyclerView!!.adapter!!.notifyDataSetChanged()
        }
        recyclerView = view!!.findViewById(R.id.recyclerView)
        recyclerView!!.setHasFixedSize(true)
        recyclerView!!.layoutManager = LinearLayoutManager(context, LinearLayout.VERTICAL, false)
        recyclerView!!.adapter = com.namo.songpong.RecyclerAdapter(items)
        adapter = recyclerView!!.adapter as RecyclerAdapter?

        /*Client.retrofitService.getQuestionList().enqueue(object : Callback<ArrayList<QuestionRepo>> {
            override fun onResponse(call: Call<ArrayList<QuestionRepo>>?, response: Response<ArrayList<QuestionRepo>>?) {
                val repo = response!!.body()

                when (response.code()) {
                    200 -> {
                        repo!!.indices.forEach {
                            items += Data(repo[it].id, repo[it].writer)
                            recyclerView!!.adapter!!.notifyDataSetChanged()
                        }
                    }
                }
            }

            override fun onFailure(call: Call<ArrayList<QuestionRepo>>?, t: Throwable?) {
                Log.v("C2cTest", "fail!!")
            }
        })*/
            items += Data(R.drawable.orangetree,"오렌지나무", "3µg/m")
            items += Data(R.drawable.ikki,"이끼식물", "2µg/m")
            items += Data(R.drawable.sonamu,"소나무", "9µg/m")

        return view
    }

}