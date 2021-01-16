package aop

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main() {
    val context = AnnotationConfigApplicationContext(MyConfig::class.java)

    val book = context.getBean("book") as Book
    val library = context.getBean("library") as Library

    library.getBook()
    library.getMagazine()
    library.addBook("Zaur", book)
    library.addMagazine()
    //library.returnBook()
    //library.returnMagazine()
    //library.addBook()

    context.close()
}