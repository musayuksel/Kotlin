package OOP


//ENUM
enum class QuestionDifficulty { EASY, MEDIUM, HARD }
class QuestionGeneric<T>(
    val questionText: String,
    val answer: T,// use generic
    val difficulty: QuestionDifficulty //use enum
)

//Classes like the Question class, on the other hand, only contain data.
// They don't have any methods that perform an action. These can be defined as a data class.
// Defining a class as a data class allows the Kotlin compiler to make certain assumptions, and to automatically implement some methods.

//Note: A data class needs to have at least one parameter in its constructor, and all constructor parameters must be marked with val or var.
// A data class also cannot be abstract, open, sealed, or inner.
data class QuestionGenericBetter<T>(
    val questionText: String,
    val answer: T,// use generic
    val difficulty: QuestionDifficulty //use enum
)

fun main() {
    val question1 = QuestionGeneric<String>("Generics advantages", "re-usability", QuestionDifficulty.EASY)
    val question2 = QuestionGeneric<Boolean>(
        questionText = "Are generics easy?",
        answer = false,
        difficulty = QuestionDifficulty.MEDIUM
    )

//    data class
    val question3 = QuestionGenericBetter<Int>("3+4", 7, QuestionDifficulty.EASY)
    println(question3.toString())//QuestionGenericBetter(questionText=3+4, answer=7, difficulty=EASY)
    print(question2.toString())//OOP.QuestionGeneric@87aac27
}