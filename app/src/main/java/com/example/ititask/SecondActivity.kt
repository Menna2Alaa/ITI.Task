package com.example.ititask

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ititask.databinding.ActivityMainBinding
import com.example.ititask.databinding.SecondActivityBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: SecondActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = SecondActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Toast.makeText(this,intent?.extras?.getString("NAME")?:"error",Toast.LENGTH_LONG).show()
        Toast.makeText(this,intent?.extras?.getString("SPORT")?:"error",Toast.LENGTH_LONG).show()
        Toast.makeText(this,intent?.extras?.getString("GENDER")?:"error",Toast.LENGTH_LONG).show()


        binding.loginWith.setOnClickListener {
            val loginBy = if(binding.google.isChecked)
            {
                "login with google"
            }
            else{
                "login with facebook"
            }
            val intent = Intent()
            intent.putExtra("LOGIN BY",loginBy)
            setResult(88,intent)
            finish()
        }
    }
}

