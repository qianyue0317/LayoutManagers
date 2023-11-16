package com.qianyue.layoutmanagers

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.setPadding
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

/**
 * @author QianYue
 * @since 2023/11/16
 */
class SnapHelperTestActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_testsnaphelper)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@SnapHelperTestActivity, LinearLayoutManager.VERTICAL, false)
            adapter = TestAdapter()
        }
        val snapHelper = PagerSnapHelper()

        snapHelper.attachToRecyclerView(recyclerView)
    }


    inner class TestAdapter : Adapter<ViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            return ViewHolder(layoutInflater.inflate(R.layout.snap_test_item, parent, false))
        }

        override fun getItemCount(): Int {
            return 40
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        }

    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
}