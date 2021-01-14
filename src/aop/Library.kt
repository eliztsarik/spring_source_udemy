package aop

import org.springframework.stereotype.Component

@Component
open class Library {
    open fun getBook() {
        println("We take a book")
    }

    open fun returnBook(): String {
        println("We return book to library")
        return "OK"
    }

    open fun getMagazine() {
        println("We take magazine from library")
    }

    open fun returnMagazine() {
        println("We return magazine to library")
    }

    open fun addBook() {
        println("We add a book to library")
    }

    open fun addMagazine() {
        println("We add a magazine to library")
    }
}