package aop

import org.springframework.stereotype.Component

@Component
open class University(
    private var students: ArrayList<Student> = ArrayList<Student>()
) {

    open fun addStudents() {
        val st1 = Student("Eliz Tsarik", 2, 10.0)
        val st2 = Student("Mick Ivanov", 3, 8.0)
        val st3 = Student("Ivan Petrov", 4, 7.5)
        students.addAll(listOf(st1, st2, st3))
    }

    open fun getStudents(): List<Student> {
        println("Start of getStudents method work")
        println("Information from method getStudents: $students")
        return students
    }
}