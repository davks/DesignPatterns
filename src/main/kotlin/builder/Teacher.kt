package builder

// Product we want to use
class Teacher private constructor(var userName: String) {
    var name: String? = null
    var surname: String? = null
    var age: Int? = null
    var tall: Int? = null
    var weight: Int? = null

    // This is our builder that will create out product (Teacher) and sets up
    class Builder(userName: String) {
        private val teacher = Teacher(userName)

        fun withName(name: String) = apply { teacher.name = name }
        fun withSurname(surname: String) = apply { teacher.surname = surname }
        fun setAge(age: Int) = apply { teacher.age = age }
        fun setTall(tall: Int) = apply { teacher.tall = tall }
        fun setWeight(weight: Int) = apply { teacher.weight = weight }

        fun build() = teacher

        // The some function as above
        /*fun withName(name: String): Builder {
            teacher.name = name
            return this
        }*/
    }
}

fun main() {
    val teacher = Teacher.Builder("kacer")
        .withName("Karel")
        .withSurname("Cerny")
        .setAge(45)
        .setTall(187)
        .setWeight(76)
        .build()
    println("${teacher.name} ${teacher.surname} ${teacher.age} ${teacher.tall} ${teacher.weight} ${teacher.userName}")

    val teacher2 = Teacher.Builder("rad")
        .withName("Radek")
        .setAge(34)
        .build()
    println("${teacher2.name} ${teacher2.surname} ${teacher2.age} ${teacher2.tall} ${teacher2.weight} ${teacher2.userName}")
}