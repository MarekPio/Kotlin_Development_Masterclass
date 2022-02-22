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
    private var tvAgeInMinutes : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDataPicker : Button = findViewById(R.id.btnDatePicker)
        tvSelectedDate = findViewById(R.id.tvSelectedDate)
        tvAgeInMinutes = findViewById(R.id.tvAgeInMinutes)

        btnDataPicker.setOnClickListener {
            clickDatePicker();
        }
    }

    fun clickDatePicker(){
        val myCalendar = Calendar.getInstance()
        val year = myCalendar.get(Calendar.YEAR)
        val month = myCalendar.get(Calendar.MONTH)
        val day = myCalendar.get(Calendar.DAY_OF_MONTH)

        val dpd = DatePickerDialog(this,
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

                val selectedDateInMinutes = theDate.time / 60000

                val currentDate = sdf.parse(sdf.format(System.currentTimeMillis()))

                val currentDateInMinutes = currentDate.time / 60000

                val differenceInMinutes = currentDateInMinutes - selectedDateInMinutes

                tvAgeInMinutes?.text = differenceInMinutes.toString()

            },
            year,
            month,
            day
        )
        dpd.datePicker.maxDate = System.currentTimeMillis() - 86400000
        dpd.show()

//        Toast.makeText(this,"btnDatePicker pressed", Toast.LENGTH_LONG).show()
    }
}