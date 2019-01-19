package cpp.quiz.sfedu.cppquiz.testMenu.mixed

data class MixedQuestion(
    val id: Int,
    val description: String,
    val answers: Array<String>,
    val rigthAnswer: Int,
    var chosenAnswer: Int? = null
) {

}
