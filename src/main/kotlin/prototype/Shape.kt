package prototype

abstract class Shape: Cloneable {
    var id: String? = null
    var type: String? = null

    abstract fun draw()

    public override fun clone(): Any {
        var clone: Any? = null
        try {
            clone = super.clone()
        } catch (e: CloneNotSupportedException) {
            e.printStackTrace()
        }
        return clone!!
    }
}

class Rectangle : Shape() {
    override fun draw() {
        println("Inside Rectangle::draw() method.")
    }

    init {
        type = "Rectangle"
    }
}

class Square : Shape() {
    override fun draw() {
        println("Inside Square::draw() method.")
    }

    init {
        type = "Square"
    }
}

class Circle : Shape() {
    override fun draw() {
        println("Inside Circle::draw() method.")
    }

    init {
        type = "Circle"
    }
}

object ShapeCache {
    private val shapeMap = hashMapOf<String?, Shape>()

    fun loadCache() {
        val circleShape = Circle()
        val squareShape = Square()
        val rectangleShape = Rectangle()

        shapeMap["1"] = circleShape
        shapeMap["2"] = squareShape
        shapeMap["3"] = rectangleShape
    }

    fun getShape(shapeId: String): Shape {
        val cachedShape = shapeMap[shapeId]
        return cachedShape?.clone() as Shape
    }
}

fun main() {
    ShapeCache.loadCache()

    val cloneShaped1 = ShapeCache.getShape("1")
    val cloneShaped1b = ShapeCache.getShape("1")
    val cloneShaped2 = ShapeCache.getShape("2")
    val cloneShaped3 = ShapeCache.getShape("3")

    cloneShaped1.type = "Circle2"

    cloneShaped1.draw()
    cloneShaped2.draw()
    cloneShaped3.draw()

    println(cloneShaped1 == cloneShaped2)
    println(cloneShaped1 == cloneShaped3)
    println(cloneShaped2 == cloneShaped3)

    println("${cloneShaped1.type} x ${cloneShaped1b.type}")
}