package OOP


//ENUM
enum class QuestionDifficulty { EASY, MEDIUM, HARD }
class QuestionGeneric<T>(
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
}