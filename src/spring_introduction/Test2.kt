import org.springframework.context.support.ClassPathXmlApplicationContext
import spring_introduction.Pet

fun main() {
    var context = ClassPathXmlApplicationContext("applicationContext.xml")
    var pet: Pet = context.getBean("myPet") as Pet
    pet.say()
    context.close()
}