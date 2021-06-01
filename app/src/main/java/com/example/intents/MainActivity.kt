package com.example.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.intents.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        button.text = "GO!"
    }

    fun navigateAway(view: View) {
        val name = edit_text.text.toString()
        val intent = Intent(this, AnotherActivity::class.java)
                .putExtra(AnotherActivity.NAME_EXTRA, name)
        startActivity(intent)
    }
}