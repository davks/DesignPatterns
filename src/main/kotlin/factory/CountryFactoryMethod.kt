package factory

sealed class Country {
    object Canada: Country()
    data class Poland(val someProperty: String): Country()
}

object Spain: Country()
class Greece(val someProperty: String): Country()
data class USA(val someProprty: String): Country()

// From this class we will make instances
class Currency(val code: String)

// Factory
object CurrencyFactory {

    fun currencyForCountry(country: Country): Currency =
        when (country) {
            is Spain -> Currency("EUR")
            is Greece -> Currency("EUR")
            is USA -> Currency("USD")
            is Country.Canada -> Currency("CAD")
            is Country.Poland -> Currency("EUR")
        }
}

// Use
fun main() {
    val greekCurrency = CurrencyFactory.currencyForCountry(Greece(""))
    val usaCurrency = CurrencyFactory.currencyForCountry(USA(""))
    val polandCurrency = CurrencyFactory.currencyForCountry(Country.Poland(""))

    println("Greek currency: ${greekCurrency.code}")
    println("USA currency: ${usaCurrency.code}")
    println("Poland currency: ${polandCurrency.code}")
}