package cpp.quiz.sfedu.cppquiz.testMenu.topic

data class TopicQuestion(
    val id: Int,
    val description: String,
    val answers: Array<String>,
    val rigthAnswer: Int,
    var chosenAnswer: Int? = null
) {

}
