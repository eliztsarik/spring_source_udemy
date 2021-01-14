package aop.aspects

import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

@Component
@Aspect
@Order(3)
open class ExceptionHandlingAspect {
    @Before("aop.aspects.MyPointcuts.allGetMethods()")
    open fun beforeGetExceptionHandlingAdvice() {
        println("beforeGetExceptionHandlingAdvice: catch/handling exception when try to get a book/magazine")
    }
}