package spring_introduction

import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct
import javax.annotation.PreDestroy

@Component
class Dog : Pet {

    constructor() {
        println("Dog has been created")
    }

//    @PostConstruct
//    fun init() {
//        println("Class Dog: init method")
//    }
//
//    @PreDestroy
//    fun finalize() {
//        println("Class Dog: destroy method")
//    }

    override fun say() {
        println("Bow-Wow")
    }
}