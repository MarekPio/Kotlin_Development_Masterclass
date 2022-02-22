package eu.marekpio.dobcalc

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDataPicker : Button = findViewById(R.id.btnDatePicker)

        btnDataPicker.setOnClickListener {
            clickDatePicker();
        }
    }

    fun clickDatePicker(){
        val myCalendar = Calendar.getInstance()
        val year = myCalendar.get(Calendar.YEAR)
        val month = myCalendar.get(Calendar.MONTH)
        val day = myCalendar.get(Calendar.DAY_OF_MONTH)

        DatePickerDialog(this,
            /* Longer version */
//          DatePickerDialog.OnDateSetListener{ view, year, month, dayOfMonth ->
            /* Shorter version with deleted expected function */
            { view, year, month, dayOfMonth ->
                Toast.makeText(this,"Datepicker works", Toast.LENGTH_LONG).show()
            },
            year,
            month,
            day
        ).show()

//        Toast.makeText(this,"btnDatePicker pressed", Toast.LENGTH_LONG).show()
    }
}