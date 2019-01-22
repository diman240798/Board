package cpp.quiz.sfedu.cppquiz.test.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import com.mikepenz.materialdrawer.DrawerBuilder
import cpp.quiz.sfedu.cppquiz.R
import cpp.quiz.sfedu.cppquiz.test.TestFragment
import cpp.quiz.sfedu.cppquiz.test.base.TestBaseClass
import kotlinx.android.synthetic.main.activity_test.*


class TestActivity : AppCompatActivity() {

    var tests = mutableListOf<TestBaseClass>();
    var fragments = mutableListOf<TestFragment>()
    var currentFragmentNumber = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)



        /*supportFragmentManager
            .beginTransaction()
            .add(R.id.test_fragment, fragments[currentFragmentNumber])
            .commit()*/
    }

    fun onNextPressed(view: View) {
        if (currentFragmentNumber + 1 > fragments.size)
            return
        currentFragmentNumber += 1
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.test_fragment, fragments[currentFragmentNumber])
            .commit()
    }
}
