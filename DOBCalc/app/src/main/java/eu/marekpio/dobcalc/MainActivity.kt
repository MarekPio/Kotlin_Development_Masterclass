package eu.marekpio.dobcalc

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private var tvSelectedDate : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDataPicker : Button = findViewById(R.id.btnDatePicker)
        tvSelectedDate = findViewById(R.id.tvSelectedDate)

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
            { view, selectedYear, selectedMonth, selectedDayOfMonth ->
                Toast.makeText(this,"Year was $selectedYear" +
                        ", month was ${selectedMonth+1}" +
                        ", day was $selectedDayOfMonth", Toast.LENGTH_LONG).show()

                val selectedDate ="$selectedDayOfMonth/${selectedMonth+1}/$selectedYear"

                tvSelectedDate?.text = selectedDate

                val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)
                val theDate = sdf.parse(selectedDate)

            },
            year,
            month,
            day
        ).show()

//        Toast.makeText(this,"btnDatePicker pressed", Toast.LENGTH_LONG).show()
    }
}