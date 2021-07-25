package com.example.msgshareapp_git

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_2.*

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        //Here you have the syntax of extracting data from another activity
        val bundle: Bundle? = intent.extras
        val msg = bundle!!.getString("User_message")

        Toast.makeText(this, "Welcome $msg",Toast.LENGTH_LONG).show()
        //Here you have the syntax of displaying a string value into the Textview
        // that was created earlier in the xml layout file
        txvUserMsg.text = msg

    }
}