package aop

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main() {
    val context = AnnotationConfigApplicationContext(MyConfig::class.java)

    val library = context.getBean("library") as Library
    library.getBook()

    context.close()
}