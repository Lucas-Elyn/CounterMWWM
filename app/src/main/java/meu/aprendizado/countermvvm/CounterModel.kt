package meu.aprendizado.countermvvm

data class CounterModel(var count : Int)

class  CounterRespository{
    private var _counter = CounterModel(0)
    fun getCounter() = _counter

    fun incrementCounter(){
        _counter.count++
    }

    fun decrementCounter(){
        _counter.count--
    }
    }
