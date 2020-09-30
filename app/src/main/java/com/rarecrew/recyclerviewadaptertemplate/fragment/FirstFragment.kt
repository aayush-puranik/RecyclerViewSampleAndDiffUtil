package com.rarecrew.recyclerviewadaptertemplate.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rarecrew.recyclerviewadaptertemplate.Model.Model
import com.rarecrew.recyclerviewadaptertemplate.R
import com.rarecrew.recyclerviewadaptertemplate.adapter.RVAdapter
import kotlinx.android.synthetic.main.fragment_first.view.*

class FirstFragment : Fragment(), RVAdapter.Interaction {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        val adapter = RVAdapter(this)
        view.recyclerView.layoutManager = LinearLayoutManager(context)
        view.recyclerView.adapter = adapter
        adapter.submitList(fetchItem())


        return view
    }

    private fun fetchItem(): ArrayList<Model> {
        val list = arrayListOf<Model>()

        for (i in 0 until 100) {
            val model = Model(i, "Name$i", "123123$i","description$i")
            list.add(model)
        }
        return list
    }

    override fun onItemSelected(position: Int, item: Model) {
        Toast.makeText(context, "${item.name}", Toast.LENGTH_SHORT).show()
    }
}