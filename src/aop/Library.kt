package aop

import org.springframework.stereotype.Component

@Component
class Library {
    fun getBook() {
        println("We take a book")
    }
}