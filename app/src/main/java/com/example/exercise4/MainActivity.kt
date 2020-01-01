package com.example.exercise4


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.time.Year

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }
    fun cal(year: Int){
        val age = Year.now().value-year
        var saving =0;

        if(age in 16..20)
        {
            saving = 5000
        }
        else if(age in 21..25)
        {
            saving = 14000
        }
        else if(age in 26..30)
        {
            saving = 29000
        }
        else if(age in 31..35)
        {
            saving = 50000
        }
        else if(age in 36..40)
        {
            saving = 78000
        }
        else if(age in 41..45)
        {
            saving = 116000
        }
        else if(age in 46..50)
        {
            saving = 165000
        }
        else if(age in 51..55)
        {
            saving = 228000
        }
        else
        {
            saving = 0
        }

        val transfer = saving * 0.30

        ageValue.text = "" + age
        minSaving.text = "RM " + saving
        maxTrans.text = "RM " + transfer

    }
}
