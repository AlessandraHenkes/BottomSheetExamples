package com.example.bottomsheet

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateView(name: String?, context: Context?, attrs: AttributeSet?): View? {
        val view = super.onCreateView(name, context, attrs)

        btnBottomSheetBehavior.setOnClickListener {
            startActivity(Intent(this@MainActivity, PersistenceBottomSheet::class.java))
        }

        return view
    }
}
