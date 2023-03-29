fun main() {
    println(studentsName("Viky","Becky","Maria","Bridgit","Jane",
            "Joky","Mary","Rebby","Glado","Val"))
    personObjects()
    var heights=heights(178.6,198.8)
    println(heights.averageheights)
    println(heights.totalheights)

}
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices ie index 2,4,6 etc
fun studentsName(name1:String,name2:String,name3:String,name4:String,name5:String,name6:String,
                 name7:String,name8:String,name9:String,name10:String):String{

var evenNumbers=name3+name5+name7+name9
    return evenNumbers
}

//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height

data class heights(var averageheights: Double,var totalheights: Double)
fun averageTotal(averageheights: Double,totalheights: Double):heights{
    return heights(averageheights, totalheights)
}

//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age (2 points)
data class Person(var name:String,var age:Int,var height:Double,var weight:Double)
fun personObjects(){
   var person1=Person("Anette",20,160.8,50.5)
    var person2=Person("Angeth",21,180.8,51.6)
    var person3=Person("Becky",23,178.9,60.7)
    var personlist= listOf(person1,person2,person3)
   println(personlist)
    var sorted=personlist.sortedByDescending { person -> person.age  }
      println(sorted)
}

//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
     fun people(){
         var person4=Person("Cynthia",22,152.4,58.7)
         var person5=Person("Josephine",32,163.4,60.7)

     }
//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list. (3 points)
data class Car(var registration:Int,var mileage:Int)

fun vehicles() {
    var car1 = Car(456, 893)
    var car2 = Car(656, 393)
    var car3 = Car(856, 793)
    var mileageAverage= listOf("mileage")

}