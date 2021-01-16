package aop

class Student(
    var nameSurname: String,
    var course: Int,
    var avgGrade: Double
) {
    override fun toString(): String {
        return "Student(nameSurname='$nameSurname', course=$course, avgGrade=$avgGrade)"
    }
}