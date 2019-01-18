package cpp.quiz.sfedu.cppquiz

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented tests, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under tests.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("cpp.quiz.sfedu.cppquiz", appContext.packageName)
    }
}
