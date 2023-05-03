fun main() {
statement("Megan",15,"Kenyan")
    addFourNums(20,40,30,8)
    println(numAve(2,4,6,2,2))
    var student1 = Records("Jane",25,"07123456789","jane@gmail.com",50.7F,true)
    println(student1.isUgandanCitizen)
    println(student1.fullName)
    println(student1.phoneNumber)
}
//Create and invoke a function that takes in a users name, age, and nationality and prints out “Hello my name
//is ${name}, I am ${age} and I am from ${nationality}” e.g given “Lucy”, 23, and “Kenya” it will print out
//“Hello my name is Lucy, I am 23 years old and I am from Kenya” (2 points)
fun statement(name:String, age:Int,nationality:String){
    println("Hello my name is $name, I am $age and I am from $nationality")
}
//Create and invoke a function that returns the sum of any given 4 numbers (3 points)
fun addFourNums(num1:Int, num2:Int, num3:Int, num4: Int){
    println(num1+num2+num3+num4)
}
//Create and invoke a function that given any 5 numbers, it returns their average
fun numAve(a:Int,b:Int,c:Int,d:Int,e:Int):Int{
    var sum = a+b+c+d+e
    var ave = sum/5
    return ave
}
//You are creating an app to capture a person’s records. Some of the data you will
//capture includes full name, age, phone number, email, weight in kg, and citizen. For the
//citizen field, you will track whether a student is a Ugandan or not.
data class Records (var fullName:String,var age:Int,var phoneNumber:String,var email:String,var weight:Float,var isUgandanCitizen:Boolean)
