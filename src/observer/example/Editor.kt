package observer.example

import java.io.File

class Editor {
    val events: EventManager = EventManager("open", "save")
    private var file: File? = null

    fun openFile(filePath: String){
        file = File(filePath)
        events.notify("open", file!!)
    }

    fun saveFile() {
        if (file != null){
            events.notify("save", file!!)
        }
        else{
            throw RuntimeException("Please open a file first.")
        }
    }
}