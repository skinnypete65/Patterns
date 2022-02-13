package observer.myexample

class Student(private val name: String) : Subscriber {
    override fun update() {
        println("$name: I've just notified.")
    }
}