package julesssss.github.kotlinweather.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import julesssss.github.kotlinweather.R
import julesssss.github.kotlinweather.adapters.ForecastListAdapter

class MainActivity : AppCompatActivity() {

    private val items = listOf(
            "Mon 6/23 - Sunny - 31/17",
            "Tue 6/24 - Foggy - 21/8",
            "Wed 6/25 - Cloudy - 22/17",
            "Thurs 6/26 - Rainy - 18/11",
            "Fri 6/27 - Foggy - 21/10",
            "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
            "Sun 6/29 - Sunny - 20/7"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val forecastList = findViewById(R.id.forecast_list) as RecyclerView
        forecastList.layoutManager = LinearLayoutManager(this)
        forecastList.adapter = ForecastListAdapter(items)

//        niceSnack("Hello Kotlin!!")
//        niceSnack("Hello Long", Snackbar.LENGTH_LONG)
//        niceSnack(len = Snackbar.LENGTH_LONG, msg = "Swapped message")
//
//        niceComplexSnack("Complex")
    }

//    fun niceSnack(msg: String, len: Int = Snackbar.LENGTH_SHORT) = Snackbar.make(this.forecas, msg, len).show()
//
//    fun niceComplexSnack(msg: String,
//                         len: Int = Snackbar.LENGTH_SHORT,
//                         cls: String = MainActivity::class.java.simpleName) =
//            Snackbar.make(this.message, "Message: $cls $msg", len).show()

}
