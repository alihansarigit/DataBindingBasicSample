package com.example.databindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingexample.databinding.ActivityMainBinding
import com.example.databindingexample.model.Person

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.btnSend.setOnClickListener {
            binding.model = Person(
                binding.edtName.text.toString(),
                binding.edtAge.text.toString().toInt(),
                binding.edtDescription.text.toString())
        }
    }
}