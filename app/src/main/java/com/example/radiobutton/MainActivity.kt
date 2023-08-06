package com.example.radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var radioGroup:RadioGroup
    lateinit var radioButton:RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        radioGroup = findViewById(R.id.radioGroup)
        radioGroup.setOnCheckedChangeListener { group, id ->
            radioButton = findViewById(id)
            when(radioButton.id){
                R.id.radioYes ->{
                    Toast.makeText(this,"Yes is clicked",Toast.LENGTH_SHORT).show()
                }
                R.id.radioNo ->{
                    Toast.makeText(this,"No is clicked",Toast.LENGTH_SHORT).show()
                }
                R.id.radioMaybe ->{
                    Toast.makeText(this,"Maybe is clicked",Toast.LENGTH_SHORT).show()
                }

            }
        }
    }
}