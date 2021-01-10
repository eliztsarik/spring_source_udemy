import org.springframework.context.support.ClassPathXmlApplicationContext
import spring_introduction.Person

fun main() {
    val context = ClassPathXmlApplicationContext("applicationContext.xml")
    val person = context.getBean("myPerson") as Person
    person.callYourPet()

    println(person.surname)
    println(person.age)

    context.close()

}