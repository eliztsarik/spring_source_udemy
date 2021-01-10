import org.springframework.context.support.ClassPathXmlApplicationContext

fun main() {
    val context = ClassPathXmlApplicationContext("applicationContext2.xml")
//    var dog1 = context.getBean("myPet") as Dog
//    dog1.name = "Belka"
//    println(dog1.name)
//    var dog2 = context.getBean("myPet") as Dog
//    dog2.name = "Strelka"
//    println(dog1.name)
//    println(dog2.name)
//
//    println(dog1.equals(dog2))
//    println(dog1)
//    println(dog2)

    context.close()
}