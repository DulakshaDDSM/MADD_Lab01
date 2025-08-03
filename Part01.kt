import kotlin.text.get

//Q1
fun whoAmI(parameter:String):String{
    return parameter
}
fun main (){
    //q1 call
    println("==Q1==")
    print("Hi, ")
    println("Lab 01")

    //q2 call
    val x = areaOfCircle(10.0)
    println(x)
    val y = Circumference(radius = 2.0)
    println(y)

    //q3 call
    val name = "Samali"
    val age = 23
    greetings(name, age)

    //q4 call
    printNames()
}

//Q2
fun areaOfCircle(radius:Double ):Double {
    println()
    println("==Q2==")
    print ("areaOfCircle: " )
    return 3.14 * radius * radius
}
fun Circumference(radius:Double): Double{
    print ("Circumference: ")
    return 2 * 3.14 * radius
}

//Q3
fun greetings (name:String, age:Int){
    println()
    println("==Q3==")
    println("Name: ${name} ")
    println("Age: ${age}")

    if(age>18) {
        println("You eligible for license")
    }else {
        println("you not eligible for license")
    }
}

//Q4
fun printNames() {
    var i = 0
    val namesArray = mutableListOf<String>()
    while (i < 5) {
        println()
        println("==04==")
        print("enter name ${i+1}: ")
        val store: String = readln()
        namesArray.add(store)
        i++
    }
    println()
    for(i in 0..namesArray.size - 1) {
        println("Name ${i+1}: ${namesArray[i]}")
    }
}
