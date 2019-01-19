package cpp.quiz.sfedu.cppquiz

import java.util.ArrayList;

class MixedTestsUtil {
    companion object {
        fun getTests(): List<MixedTest> = mutableListOf<MixedTest>(
            MixedTest(1, ArrayList()),
            MixedTest(2, ArrayList()),
            MixedTest(3, ArrayList()),
            MixedTest(4, ArrayList()),
            MixedTest(5, ArrayList()),
            MixedTest(6, ArrayList()),
            MixedTest(7, ArrayList())
        )
    }

}



