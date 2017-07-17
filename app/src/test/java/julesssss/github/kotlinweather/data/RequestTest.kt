package julesssss.github.kotlinweather.data

import org.jetbrains.anko.doAsync
import org.junit.Test

class RequestTest {

    @Test
    fun testRequest() {

        val url = "http://api.openweathermap.org/data/2.5/forecast/daily?" +
                "APPID=15646a06818f61f7b8d7823ca833e1ce&q=94043&mode=json&units=metric&cnt=7"

        doAsync {
            Request(url).run()
//            uiThread { longToast("Request performed") }
        }


    }

}