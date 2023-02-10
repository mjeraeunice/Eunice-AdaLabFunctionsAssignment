fun main(){
    greetperson(name="Furry")
    greetperson(name="Mane")
    reminder(num1=380, num2=25)
    addition(num1=20, num2=45, num3=32, num4=12 )
    interestingFact()
}
fun greetperson(name: String){
    println("Hello $name")
}
fun reminder(num1: Int, num2: Int): Int {
    var reminder= num1%num2
    println(reminder)
    return(reminder)
}
fun addition(num1: Int, num2: Int, num3: Int, num4: Int): Int {
    var sum= num1+num2+num3+num4
    println(sum)
    return(sum)
}
fun interestingFact() {
    println("I love cooking") // This is a comment
}