package observer.myexample

class Publisher {
    private val subscribers = mutableListOf<Subscriber>()

    fun subscribe(s: Subscriber){
        subscribers.add(s)
    }

    fun unsubscribe(s: Subscriber){
        subscribers.remove(s)
    }

    fun notifySubscribers(){
        for (s in subscribers) {
            s.update()
        }
    }

}