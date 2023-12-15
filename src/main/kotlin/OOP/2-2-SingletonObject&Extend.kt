package OOP

// There are many scenarios where you want a class to only have one instance. For example:
//
//Player stats in a mobile game for the current user.
//Interacting with a single hardware device, like sending audio through a speaker.
//Authentication, where only one user should be logged in at a time.
//In the above scenarios, you'd probably need to use a class. However, you'll only ever need to instantiate one instance of that class.
// If there's only one hardware device, or only one user logged in at once, there would be no reason to create more than a single instance.
// Having two objects that access the same hardware device simultaneously could lead to some really strange and buggy behavior.
// "object" ensures that there is a single point of access to that instance,


class Quiz {
    val question1 = QuestionGeneric<String>("Generics advantages", "re-usability", QuestionDifficulty.MEDIUM)
    val question2 = QuestionGeneric<Boolean>("Is sky blue", true, QuestionDifficulty.EASY)

    companion object StudentProgress {
        // A companion object allows you to access its properties and methods from inside the class, if the object's properties
        // and methods belong to that class, allowing for more concise syntax.
        var total: Int = 10
        var answered: Int = 3
    }

    //    let()
    // The let() function allows you to refer to an object in a lambda expression using the identifier it, instead of the object's actual name.
    fun printQuiz() {
//        println(question1.questionText)
//        println(question1.answer)
//        println(question1.difficulty)
//        println() // this is not best practice

        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)// better
        }
    }

}

//    Add an extension property
val Quiz.StudentProgress.progressText: String
    get() = "${answered} of ${total} answered"
//    set(value) = answered =11 //err

fun Quiz.StudentProgress.printProgressBar() {
    repeat(Quiz.answered) { print("▓") }
    repeat((Quiz.total - Quiz.answered)) { print("▒") }
    println("")
    println(Quiz.progressText)
}

fun main() {
    Quiz.printProgressBar()
    val quiz = Quiz()
    quiz.printQuiz()
}