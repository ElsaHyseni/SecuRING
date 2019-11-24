package com.example.secu_ring.activities

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.example.secu_ring.MessageSender
import com.example.secu_ring.R
import com.example.secu_ring.modal.User
import com.squareup.picasso.MemoryPolicy
import com.squareup.picasso.NetworkPolicy
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.someone_at_the_door.*

class SomeonecameActivity : AppCompatActivity() {

    private lateinit var el: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.someone_at_the_door)




        val showPerson: Button = findViewById(R.id.see_person_at_door)
            showPerson.setOnClickListener {
                val imageView: ImageView = findViewById(R.id.raspi_img)
                    Picasso.with(this)
                        .load("http://192.168.1.103:6060/tester_recent.jpg")
                        .memoryPolicy(MemoryPolicy.NO_CACHE)
                        .networkPolicy(NetworkPolicy.NO_CACHE)
                        .into(imageView)


            }

        el = findViewById(R.id.editText)

        val decline: Button = findViewById(R.id.dontunlock_btn)
        decline.setOnClickListener {
            val intent = Intent(this, UsersMainPage::class.java)
            startActivity(intent)

            Toast.makeText(this, "Access denied", Toast.LENGTH_LONG).show()
        }


    }

    fun send(v: View){
        val messageSender = MessageSender()
        messageSender.execute(el.getText().toString())

        Toast.makeText(this,"Door is now locked", Toast.LENGTH_LONG).show()


    }





}