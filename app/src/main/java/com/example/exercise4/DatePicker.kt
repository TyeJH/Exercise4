package com.example.exercise4


import android.app.DatePickerDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.fragment_date_picker.*
import java.util.*

/**
 * A simple [Fragment] subclass.
 */
class DatePicker : Fragment() {


    private lateinit var btn:Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var rootView = inflater.inflate(R.layout.fragment_date_picker, container, false)

        val c= Calendar.getInstance()
        var year=c.get(Calendar.YEAR)
        val month =c.get(Calendar.MONTH)
        val day =c.get(Calendar.DAY_OF_MONTH)


    btn = rootView.findViewById(R.id.btnBirthDate)
    btn.setOnClickListener{
        val a=DatePickerDialog(activity!!, DatePickerDialog.OnDateSetListener

            { view, mYear, mMonth, mDay->

                textView.text = ""+mDay+"/"+(mMonth+1)+"/"+mYear
                year=mYear
                (activity as MainActivity?)?.calc(mYear)
            }, year, month, day)

            a.show()

        }

        return rootView
    }


}
