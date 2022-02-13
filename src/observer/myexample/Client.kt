package observer.myexample

import kotlin.random.Random

fun main() {
    val publisher = Publisher()

    for (i in 1..10){
        if (Random.nextBoolean()){
            val student = Student("student $i")
            publisher.subscribe(student)
        }
        if (Random.nextBoolean()){
            val programmer = Programmer("programmer $i")
            publisher.subscribe(programmer)
        }
    }

    publisher.notifySubscribers()
}