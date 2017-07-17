package julesssss.github.kotlinweather.ui.activities

import android.content.Context
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import julesssss.github.kotlinweather.R
import julesssss.github.kotlinweather.data.Request
import julesssss.github.kotlinweather.ui.adapters.ForecastListAdapter
import org.jetbrains.anko.*

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

        val forecastList: RecyclerView = find(R.id.forecast_list)
        forecastList.layoutManager = LinearLayoutManager(this)
        forecastList.adapter = ForecastListAdapter(items)

        val url = "http://api.openweathermap.org/data/2.5/forecast/daily?" +
                "APPID=15646a06818f61f7b8d7823ca833e1ce&q=94043&mode=json&units=metric&cnt=7"

        doAsync {
            Request(url).run()
            uiThread { longToast("Toast Performed")}
        }


    }

    fun Context.toast(message: String) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

    fun niceSnack(msg: String, len: Int = Snackbar.LENGTH_SHORT) = Snackbar.make(this.contentView!!, msg, len).show()

    fun niceComplexSnack(msg: String,
                         len: Int = Snackbar.LENGTH_SHORT,
                         cls: String = MainActivity::class.java.simpleName) =
            Snackbar.make(this.contentView!!, "Message: $cls $msg", len).show()

}
