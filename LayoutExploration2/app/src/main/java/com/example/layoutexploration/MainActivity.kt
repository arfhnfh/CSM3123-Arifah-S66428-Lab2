package com.example.layoutexploration

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @Override
    protected fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val linearLayoutButton: Button = findViewById(R.id.linearLayoutButton)
        linearLayoutButton.setOnClickListener { v ->
            val intent = Intent(this@MainActivity, LinearLayoutActivity::class.java)
            startActivity(intent)
        }
        val relativeLayoutButton: Button = findViewById(R.id.relativeLayoutButton)
        relativeLayoutButton.setOnClickListener { v ->
            val intent = Intent(this@MainActivity, RelativeLayoutActivity::class.java)
            startActivity(intent)
        }
        val constraintLayoutButton: Button = findViewById(R.id.constraintLayoutButton)
        constraintLayoutButton.setOnClickListener { v ->
            val intent = Intent(this@MainActivity, ConstraintLayoutActivity::class.java)
            startActivity(intent)
        }
        val gridLayoutButton: Button = findViewById(R.id.gridLayoutButton)
        gridLayoutButton.setOnClickListener { v ->
            val intent = Intent(this@MainActivity, GridLayoutActivity::class.java)
            startActivity(intent)
        }
    }
}
