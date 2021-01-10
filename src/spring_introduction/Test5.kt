import org.springframework.context.support.ClassPathXmlApplicationContext
import spring_introduction.Dog

fun main() {
    val context = ClassPathXmlApplicationContext("applicationContext2.xml")
    var dog1 = context.getBean("myPet") as Dog
    dog1.say()

    var dog2 = context.getBean("myPet") as Dog
    dog2.say()


    context.close()
}