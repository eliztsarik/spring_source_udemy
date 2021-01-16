package aop.aspects

import aop.Book
import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.reflect.MethodSignature
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

    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    fun beforeAddBookAdvice(joinPoint: JoinPoint) {

        val methodSignature = joinPoint.signature as MethodSignature
        println("methodSignature = $methodSignature")
        println("methodSignature.method = ${methodSignature.method}")
        println("methodSignature.returnType = ${methodSignature.returnType}")
        println("methodSignature.name = ${methodSignature.name}")
        if (methodSignature.name.equals("addBook")) {
            val args = joinPoint.args
            for (obj in args) {
                if (obj is Book) {
                    println("Information about book: name - ${obj.name}, author - ${obj.author}, year of publication -  ${obj.yearOfPublication}")
                } else if (obj is String) {
                    println("book in library is being added by $obj")
                }
            }

        }
        println("beforeAddBookAdvice: logging attempt to take a book/magazine")
        println("--------------------------------------")
    }

//    @Before("aop.aspects.MyPointcuts.allGetMethods()")
//    fun beforeReturnBookAdvice() {
//        println("beforeReturnBookAdvice: attempt to get back a book")
//    }


}