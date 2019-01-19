package cpp.quiz.sfedu.cppquiz.main.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import cpp.quiz.sfedu.cppquiz.R
import cpp.quiz.sfedu.cppquiz.testMenu.activity.TestMenuActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClick(v: View?) {
        val id = v?.id
        var tag = when (id) {
            R.id.beginner -> 1
            R.id.intermediate-> 2
            else -> throw RuntimeException()
        }
        val testMenuintent = Intent(this, TestMenuActivity::class.java)
        startActivity(testMenuintent)
    }
}
