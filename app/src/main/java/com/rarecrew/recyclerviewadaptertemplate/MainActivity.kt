package com.rarecrew.recyclerviewadaptertemplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rarecrew.recyclerviewadaptertemplate.fragment.FirstFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.container, FirstFragment()).commit()
    }
}