package cpp.quiz.sfedu.cppquiz.testMenu.topic

import cpp.quiz.sfedu.cppquiz.testMenu.topic.TopicTest
import java.util.ArrayList;

class TopicTestsUtil {
    companion object {
        fun getTests(): List<TopicTest> = mutableListOf<TopicTest>(
            TopicTest(1, ArrayList()),
            TopicTest(2, ArrayList()),
            TopicTest(3, ArrayList()),
            TopicTest(4, ArrayList()),
            TopicTest(5, ArrayList()),
            TopicTest(6, ArrayList()),
            TopicTest(7, ArrayList())
        )
    }

}



