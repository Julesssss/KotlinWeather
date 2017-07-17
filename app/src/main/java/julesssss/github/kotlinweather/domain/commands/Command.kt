package julesssss.github.kotlinweather.domain.commands

interface Command<out T> {
    fun execute(): T
}