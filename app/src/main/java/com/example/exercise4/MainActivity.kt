package com.example.exercise4


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_date_picker.*
import java.time.Year

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun calc(yr:Int){
        val test:Int=editText.text.toString().toInt()
        cal(yr,test)
    }

    private fun cal(year: Int, test:Int){
        val age = Year.now().value-year
        var saving =0

        if(age in 16..20)
        {
            if(test>=5000){
                saving = test-5000
            }
        }
        else if(age in 21..25)
        {
            if(test>=14000){
                saving = test-14000
            }
        }
        else if(age in 26..30)
        {
            if(test>=29000){
                saving = test-29000
            }
        }
        else if(age in 31..35)
        {
            if(test>=50000){
                saving = test-50000
            }
        }
        else if(age in 36..40)
        {
            if(test>=78000){
                saving = test-78000
            }
        }
        else if(age in 41..45)
        {
            if(test>=116000){
                saving =test-116000
            }
        }
        else if(age in 46..50)
        {
            if(test>=165000){
                saving = test-165000
            }
        }
        else if(age in 51..55)
        {
            if(test>=228000){
                saving = test-228000
            }
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
