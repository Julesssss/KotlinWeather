package julesssss.github.kotlinweather.domain.commands

import julesssss.github.kotlinweather.data.ForecastRequest
import julesssss.github.kotlinweather.domain.mappers.ForecastDataMapper
import julesssss.github.kotlinweather.domain.model.ForecastList

class RequestForecastCommand(val zipCode: String) : Command<ForecastList> {

    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }
}