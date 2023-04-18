package builder2

class Teacher private constructor(builder: Builder, var userName: String){
    var name: String? = null
    var surname: String? = null
    var age: Int? = null
    var tall: Int? = null
    var weight: Int? = null

    class Builder(private var userName: String) {
        var name: String? = null
            private set
        var surname: String? = null
            private set
        var age: Int? = null
            private set
        var tall: Int? = null
            private set
        var weight: Int? = null
            private set

        fun withName(name: String) = apply { this.name = name }
        fun withSurname(surname: String) = apply { this.surname = surname }
        fun setAge(age: Int) = apply { this.age = age }
        fun setTall(tall: Int) = apply { this.tall = tall }
        fun setWeight(weight: Int) = apply { this.weight = weight }

        fun build() = Teacher(this, userName)
    }

    init {
        this.name = builder.name
        this.surname = builder.surname
        this.age = builder.age
        this.tall = builder.tall
        this.weight = builder.weight
    }
}

fun main() {
    val teacher = Teacher.Builder("dabi")
        .withName("David")
        .withSurname("Bily")
        .setAge(23)
        .setTall(187)
        .setWeight(87)
        .build()
    println("${teacher.name} ${teacher.surname} ${teacher.age} ${teacher.tall} ${teacher.weight} ${teacher.userName}")

    val teacher2 = Teacher.Builder("kacer")
        .withName("Karel")
        .setAge(23)
        .build()
    println("${teacher2.name} ${teacher2.surname} ${teacher2.age} ${teacher2.tall} ${teacher2.weight} ${teacher2.userName}")
}