package spring_introduction

import org.springframework.stereotype.Component

@Component("catBean")
class Cat: Pet {

    init {
        println("Cat has been created")
    }

    override fun say() {
        println("Meow-meow")
    }
}