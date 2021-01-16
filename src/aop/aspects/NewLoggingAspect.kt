package aop.aspects

import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.springframework.stereotype.Component

@Component
@Aspect
class NewLoggingAspect {

    @Around("execution(* returnBook())")
    fun aroundReturningBookLoggingAdvice(proceedingJoinPoint: ProceedingJoinPoint): Any {
        println("aroundReturningBookLoggingAdvice: try to return book to library")
        val begin = System.currentTimeMillis()
        val targetMethodResult = try {
            proceedingJoinPoint.proceed()
        } catch (e: Exception) {
            println("aroundReturningBookLoggingAdvice: catch the exception $e")
            throw e
        }
        val end = System.currentTimeMillis()
        println("aroundReturningBookLoggingAdvice: succeeded in return book to library")
        println("aroundReturningBookLoggingAdvice: method returnBook made work in ${end - begin} milliseconds")
        return targetMethodResult
    }
}