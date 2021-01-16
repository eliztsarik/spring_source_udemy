package aop

import org.springframework.stereotype.Component

@Component
open class Library {
    open fun getBook() {
        println("We take a book")
        println("--------------------------------------")
    }

    open fun returnBook(): String {
        val a: Int = 10 / 0
        println("We return book to library")
        return "War and Peace"
    }

    open fun getMagazine() {
        println("We take magazine from library")
        println("--------------------------------------")
    }

    open fun returnMagazine() {
        println("We return magazine to library")
        println("--------------------------------------")
    }

    open fun addBook(personName: String, book: Book) {
        println("We add a book to library")
        println("--------------------------------------")
    }

    open fun addMagazine() {
        println("We add a magazine to library")
        println("--------------------------------------")
    }
}