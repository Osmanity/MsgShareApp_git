package com.example.msgshareapp_git

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_hobbies.*

class HobbiesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)
        //Step1
        //val layoutManager =LinearLayoutManager(this)
        //layoutManager.orientation = LinearLayoutManager.VERTICAL
        val layoutManager = GridLayoutManager(this,2)
        layoutManager.orientation = GridLayoutManager.VERTICAL

        //Step2
        val adapter = HobbiesAdapter(this, Supplier.hobbies)
        recyclerView.adapter = adapter

        //Step3 - attach layoutManger to recyclerview
        recyclerView.layoutManager = layoutManager



    }
}