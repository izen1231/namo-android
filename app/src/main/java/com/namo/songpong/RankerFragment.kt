package com.namo.songpong

import android.os.Bundle

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class RankerFragment : Fragment() {

    private val items = java.util.ArrayList<Data>()
    private var recyclerView: RecyclerView? = null
    private var adapter: RecyclerAdapter? = null
    private var searchbard: androidx.appcompat.widget.SearchView? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_rank, container, false)
        recyclerView = view!!.findViewById(R.id.recyclerView)
        recyclerView!!.setHasFixedSize(true)
        recyclerView!!.layoutManager = LinearLayoutManager(context, LinearLayout.VERTICAL, false)
        recyclerView!!.adapter = com.namo.songpong.RecyclerAdapter(items)
        adapter = recyclerView!!.adapter as RecyclerAdapter?
        searchbard = view.findViewById(R.id.search_bard)
        searchbard!!.bringToFront()
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
        return view
    }
    }