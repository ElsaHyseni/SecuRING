package com.example.secu_ring.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.secu_ring.R
import com.example.secu_ring.adapters.UserRecyclerAdapter.UsersRecyclerAdapter
import com.example.secu_ring.modal.User

import com.example.secu_ring.sql.DatabaseHelper



class UsersMainPage : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_users_main_page)

        val loggingout: Button = findViewById(R.id.logging_out)
        loggingout.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }





        val someonethere: Button = findViewById(R.id.see_known_faces_btn)
        someonethere.setOnClickListener {
            val intent = Intent(this, SomeonecameActivity::class.java)
            startActivity(intent)
        }
        


    }

    override fun onBackPressed() {

    }


}
