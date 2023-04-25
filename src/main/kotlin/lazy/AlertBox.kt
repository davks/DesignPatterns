package lazy

class AlertBox {
    var message: String? = null

    fun show() {
        println("My message is: $message")
    }
}

// Example with lateinit
class Window1 {
    private lateinit var box: AlertBox

    fun showMessage(message: String) {
        box = AlertBox()  // need create the object
        box.message = message
        box.show()
    }
}

// Example with lazy
class Window2 {
    private val box by lazy { AlertBox() }

    fun showMessage(message: String) {
        box.message = message
        box.show()
    }
}

fun main() {
    // Example one
    val window1 = Window1()
    window1.showMessage("Message one")

    // Example two
    val window2 = Window2()
    window2.showMessage("Message two")
}