package aop

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main() {
    println("Method main starts")
    val context = AnnotationConfigApplicationContext(MyConfig::class.java)
    val library = context.getBean("library") as Library
    context.close()
    try {
        val book = library.returnBook()
        println("Return book $book to library")
    } catch (e: Exception) {
        println("Exception was caught: $e, method was ended")
    }
    println("Method main ends")

}