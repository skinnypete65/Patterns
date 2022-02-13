package observer.myexample

class Programmer(private val name: String) : Subscriber {
    override fun update() {
        println("$name: I've just notified.")
    }
}