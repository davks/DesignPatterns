package prototype3

class Person(
    val name: String,
    val age: Int,
    val address: Address
) : Cloneable {
    public override fun clone(): Person {
        return Person(name, age, address.clone())
    }
}

class Address(
    val street: String,
    var city: String,
    val country: String
) : Cloneable {
    public override fun clone(): Address {
        return Address(street, city, country)
    }
}

object PersonCache {
    private val personMap = hashMapOf<String?, Person>()

    fun loadCache() {
        personMap["1"] = Person("Ales Vesely", 25, Address("Velka 25", "Prague", "Czech"))
        personMap["2"] = Person("Karel Velky", 21, Address("Mala 2", "Brno", "Czech"))
        personMap["3"] = Person("Andrea Krasna", 16, Address("U boru 25", "Znojmo", "Czech"))
    }

    fun getPerson(key: String): Person? {
        val originalPerson = personMap[key]
        return originalPerson?.clone()
    }
}

fun main() {
    val originalPerson = Person("John", 30, Address("Main Street", "New York", "USA"))

    // Use deep cloning to create a new copy of the Person object.
    val clonedPerson = originalPerson.clone()

    // Change the address in a cloned object
    clonedPerson.address.city = "Los Angeles"

    // Listing of original person and cloned person
    println(originalPerson)
    println(clonedPerson)

    // Use prototype manager
    PersonCache.loadCache()
    val person1 = PersonCache.getPerson("1")
    val person2 = PersonCache.getPerson("2")
    val person3 = PersonCache.getPerson("3")

    person1?.address?.city = "London"

    println("$person1 ${person1?.address?.city}")
    println("$person2 ${person2?.address?.city}")
    println("$person3 ${person3?.address?.city}")
}
