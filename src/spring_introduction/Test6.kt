package spring_introduction

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main() {
    val context = AnnotationConfigApplicationContext(MyConfig::class.java)
    val myPerson = context.getBean("person") as Person
    println(myPerson.surname)
    println(myPerson.age)

    context.close()
}