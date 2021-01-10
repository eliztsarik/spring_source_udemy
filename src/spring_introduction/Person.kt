package spring_introduction

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct
import javax.annotation.PreDestroy
import kotlin.properties.Delegates

@Component
class Person(@Qualifier("catBean") val pet: Pet) {

    @Value("\${person.surname}")
    lateinit var surname: String

    @Value("\${person.age}")
    var age: Int? = null

//    @PostConstruct
//    fun initial() {
//        println("Person has been created")
//    }
//
//    @PreDestroy
//    fun destroy() {
//        println("Person has been destroyed")
//    }

    fun callYourPet() {
        println("Hello, my lovely pet")
        pet.say()
    }

}