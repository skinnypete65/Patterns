package observer.example

import observer.example.listeners.EmailNotificationListener
import observer.example.listeners.LogOpenListener

private const val PATH = "D:\\IntellijRepos\\Patterns\\src\\observer\\example"

fun main() {
    val editor = Editor()
    editor.events.subscribe("open", LogOpenListener(PATH))
    editor.events.subscribe("save", EmailNotificationListener("admin@example.com"))

    editor.openFile("test.txt")
    editor.saveFile()
}

