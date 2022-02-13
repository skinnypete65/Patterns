package observer.example.listeners

import java.io.File

interface EventListener {
    fun update(eventType: String, file: File)
}