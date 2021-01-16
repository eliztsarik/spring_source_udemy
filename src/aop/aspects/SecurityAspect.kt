package aop.aspects

import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

@Component
@Aspect
@Order(2)
open class SecurityAspect {

    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    open fun beforeAddSecurityAdvice() {
        println("beforeAddSecurityAdvice check rights to take a book/magazine")
        println("--------------------------------------")
    }
}