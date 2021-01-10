package spring_introduction

import org.springframework.context.support.ClassPathXmlApplicationContext

fun main() {
    val context = ClassPathXmlApplicationContext("applicationContext3.xml")

    val dog1 = context.getBean("dog") as Pet
    val dog2 = context.getBean("dog") as Pet
    println("Переменные dog1 и dog2 ссылаются на один и тот же объект?")
    println("Ответ: ${if (dog1.equals(dog2)) "ДА" else "НЕТ"}")


    context.close()
}