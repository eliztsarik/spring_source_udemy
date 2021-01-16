package aop.aspects

import aop.Student
import org.aspectj.lang.annotation.*
import org.springframework.stereotype.Component

@Component
@Aspect
open class UniversityLoggingAspect {
    @Before("execution(* getStudents())")
    open fun beforeGetStudentsLoggingAdvice() {
        println("beforeGetStudentsLoggingAdvice: logging students list receiving before getStudents method")
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    open fun afterReturningGetStudentsLoggingAdvice(students: List<Student>) {
        val st1 = students[0]
        val nameSurname = "Mr. ${st1.nameSurname}"
        st1.nameSurname = nameSurname

        val avgGrade = ++st1.avgGrade
        st1.avgGrade = avgGrade

        println("afterReturningGetStudentsLoggingAdvice: logging students list receiving after getStudents method ends")
    }

    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
    fun afterThrowingGetStudentsLoggingAdvice(exception: Throwable) {

        println("afterThrowingGetStudentsLoggingAdvice: logging exception throwing $exception")
    }

    @After("execution(* getStudents())")
    fun afterGetStudentsLoggingAdvice() {
        println("afterGetStudentsLoggingAdvice: logging normal method ending or throwing exception")
    }
}