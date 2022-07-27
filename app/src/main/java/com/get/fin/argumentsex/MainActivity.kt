package com.get.fin.argumentsex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.get.fin.argumentsex.Companion.Companion.BUNDEL_KEY
import com.get.fin.argumentsex.NewFragment.Companion.newInstance

class MainActivity : AppCompatActivity() {
    private lateinit var btnActivity: Button
    private lateinit var tvActivity: TextView
    private lateinit var tvTitleActivity: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        btnActivity.setOnClickListener {
            btnActivity.visibility = View.INVISIBLE
            tvActivity.visibility = View.INVISIBLE
            tvTitleActivity.visibility = View.INVISIBLE
            supportFragmentManager.beginTransaction().add(R.id.container, newInstance(tvActivity.text.toString())).commit()
        }

        val dog = Dog()
        dog.dogName = "Peter"
    }

    private fun init() {
        btnActivity = findViewById(R.id.btn_activity)
        tvActivity = findViewById(R.id.tv_activity)
        tvTitleActivity = findViewById(R.id.tv_title_activity)
    }

}