import kotlin.random.Random

fun main(args: Array<String>) {

    var numbers = mutableListOf<Int>(6,5,4,3,2,1)
    var dice = mutableListOf<Die>(
        Die(), Die(), Die(), Die(), Die(), Die()
    )


    for(die in dice){
        die.roll()
    }

    for(die in dice){
        die.yamb()
    }

    for(die in dice){
        die.full()
    }

}

class Die(var number: Int) {
    constructor() : this(1)

    fun get(): Int {
        return this.number
    }

    fun roll() {
        number = Random.nextInt(1, 6)
        number++

        println("Numbers are:" + number)
    }
    

    fun poker() {
        var count = 0
        if (count == 4) {
            count++
            println("Poker!")
        } else {
            println("Not poker")
        }
    }

    fun yamb() {
        var count1 = 0
        if(count1 == 5) {
            count1++
            println("Jamb")
        }
    }

    fun full(){
        var count2 = 0
        if(count2==3 && count2==2)
            println("Full")
    }



}







