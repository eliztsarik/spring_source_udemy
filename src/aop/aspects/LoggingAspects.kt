package aop.aspects

import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

@Component
@Aspect
@Order(1)
open class LoggingAspects {

//    @Pointcut("execution(* aop.Library.*(..))")
//    private fun allMethodsFromLibrary() {}
//
//    @Pointcut("execution(public void aop.Library.returnMagazine())")
//    private fun returnMagazineMethodFromLibrary() {}
//
//    @Pointcut("allMethodsFromLibrary() && !returnMagazineMethodFromLibrary()")
//    private fun allMethodsExcludingReturnMagazineInLibrary() {}
//
//    @Before("allMethodsExcludingReturnMagazineInLibrary()")
//    fun beforeMethodsExcludingReturnMagazineAdvice() {
//        println("beforeMethodsExcludingReturnMagazineAdvice: writing log #1")
//    }


//    @Pointcut("execution(* aop.Library.get*())")
//    private fun allGetMethodsFromLibrary() {}
//
//    @Pointcut("execution(* aop.Library.return*())")
//    private fun allReturnMethodsFromLibrary() {}
//
//    @Pointcut("allGetMethodsFromLibrary() || allReturnMethodsFromLibrary()" )
//    private fun allGetAndReturnMethodsFromLibrary() {}
//
//
//    @Before("allGetMethodsFromLibrary()")
//    fun beforeGetLoggingAdvice() {
//        println("beforeGetLoggingAdvice: writing log #1")
//    }
//
//    @Before("allReturnMethodsFromLibrary()")
//    fun beforeReturnLoggingAdvice() {
//        println("beforeReturnLoggingAdvice: writing log #2")
//    }
//
//    @Before("allGetAndReturnMethodsFromLibrary()")
//    fun beforeGetAndReturnAdvice() {
//        println("beforeGetAndReturnAdvice: writing log #3")
//    }

    @Before("aop.aspects.MyPointcuts.allGetMethods()")
    fun beforeGetBookAdvice() {
        println("beforeGetLoggingAdvice: logging attempt to take a book/magazine")
    }

//    @Before("aop.aspects.MyPointcuts.allGetMethods()")
//    fun beforeReturnBookAdvice() {
//        println("beforeReturnBookAdvice: attempt to get back a book")
//    }


}