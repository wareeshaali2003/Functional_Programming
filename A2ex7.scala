import scala.language.implicitConversions

object TemperatureConverter {
  class Celsius(val temperature: Double)

  object Celsius {
    implicit def celsiusToFahrenheit(celsius: Celsius): Double = {
      celsius.temperature * 9 / 5 + 32
    }
  }

  object Main extends App {
    val temperatureCelsius = new Celsius(25.0)
    val temperatureFahrenheit: Double = temperatureCelsius // Implicit conversion kicks in here

    println(s"Temperature in Fahrenheit: $temperatureFahrenheit°F")
  }
}
