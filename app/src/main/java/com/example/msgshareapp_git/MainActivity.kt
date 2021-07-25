package com.example.msgshareapp_git

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnStart.setOnClickListener {
            //Code
            Log.i("MainActivity", "Button was clicked")
            Toast.makeText(this, "Toast test", Toast.LENGTH_LONG).show()
        }

        btnSendMsgToNextActivity.setOnClickListener{

            val message: String = etUserMessage.text.toString()
            Toast.makeText(this,"Welcome "+ message,Toast.LENGTH_LONG).show()
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)
        }
    }
}