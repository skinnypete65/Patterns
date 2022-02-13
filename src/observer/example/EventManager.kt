package observer.example

import observer.example.listeners.EventListener
import java.io.File

class EventManager(vararg operations: String) {
    val listeners = hashMapOf<String, MutableList<EventListener>>()

    init {
        for (operation in operations) {
            listeners[operation] = mutableListOf()
        }
    }

    fun subscribe(eventType: String, listener: EventListener) {
        val users = listeners[eventType]
        users?.add(listener)
    }

    fun unsubscribe(eventType: String, listener: EventListener) {
        val users = listeners[eventType]
        users?.remove(listener)
    }

    fun notify(eventType: String, file: File){
        val users = listeners[eventType] ?: throw RuntimeException("Error")
        for (listener in users){
            listener.update(eventType, file)
        }
    }
}