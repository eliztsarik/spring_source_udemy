package aop.aspects

import org.aspectj.lang.annotation.Pointcut

class MyPointcuts {
    @Pointcut("execution(* get*())")
    fun allGetMethods() {
    }
}