package com.umutesen.simplecalculatorkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import org.w3c.dom.Text
//import android.widget.TextView
import com.umutesen.simplecalculatorkotlin.databinding.ActivityMainBinding

class MainActivity: AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var myString : String

    var a:Int?=null
    var b:Int?=null
    var result:Int?=null
    //var sum=""
    //var sub=""
    //var multiply=""
    //var div=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun mySum(view: View){
            a= binding.editTextNumber.text.toString().toIntOrNull();
            b= binding.editTextNumber2.text.toString().toIntOrNull();
            if (a == null || b == null ) {
                binding.resultText.text = "Error!"
            } else {
                result = a!! + b!!
                binding.resultText.text = "Result: $result"
            }

    }
    fun mySub(view: View){
        a= binding.editTextNumber.text.toString().toIntOrNull();
        b= binding.editTextNumber2.text.toString().toIntOrNull();
        if (a == null || b == null ) {
            binding.resultText.text = "Error!"
        } else {
            result = a!! - b!!
            binding.resultText.text = "Result: $result"
        }
    }
    fun myMultiply(view: View){
        a= binding.editTextNumber.text.toString().toIntOrNull();
        b= binding.editTextNumber2.text.toString().toIntOrNull();
        if (a == null || b == null ) {
            binding.resultText.text = "Error!"
        } else {
            result = a!! * b!!
            binding.resultText.text = "Result: $result"
        }
    }
    fun myDiv(view: View){
        a= binding.editTextNumber.text.toString().toIntOrNull();
        b= binding.editTextNumber2.text.toString().toIntOrNull();
        if (a == null || b == null ) {
            binding.resultText.text = "Error!"
        } else {
            result = a!! / b!!
            binding.resultText.text = "Result: $result"
        }
    }
}


