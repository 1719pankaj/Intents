package com.example.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_another.*


class AnotherActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)

        val name = intent.getStringExtra(NAME_EXTRA)

        aBigFatString.text = "Happy Birthday $name"
    }

    companion object {
        const val NAME_EXTRA = "name_extra"
    }
}