package spring_introduction

import org.springframework.context.support.ClassPathXmlApplicationContext

fun main() {
    val context = ClassPathXmlApplicationContext("applicationContext3.xml")
//    val myCat = context.getBean("cat") as Cat
//    myCat.say()

    val myPerson = context.getBean("person") as Person
    myPerson.callYourPet()

    println(myPerson.age)
    println(myPerson.surname)

    context.close()

}