fun main() {
printCharacter()
    personAge("Janet",20)
    stringLength("my book")
myName("Janet")
    myName("Ruth")
}
fun printCharacter(){
 var school="akirachix"
   print(school[0])
    print(school[2])
    println(school[3])
}
fun personAge(name: String, age: Int){
    println("Hi, I my name is $name and I am $age years old")
}
fun stringLength(text: String){
    println(text.count())
}
fun myName(name: String){
    if(name=="Janet"){
        println("thats me")}
    else { println("i dont know who that is")

    }
}
