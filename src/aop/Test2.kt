package aop

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main() {
    val context = AnnotationConfigApplicationContext(MyConfig::class.java)
    val university = context.getBean("university") as University
    university.addStudents()
    try {
        val studentsList = university.getStudents()
        println(studentsList)
    } catch (e: Exception) {
        println("Exception was caught $e")
    }
    context.close()

}