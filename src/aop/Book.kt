package aop

import org.springframework.stereotype.Component

@Component
open class Book(
    val name: String = "Master and Margarita",
    val author: String = "Bulgakov",
    val yearOfPublication: Int = 1866
) {

}