package cpp.quiz.sfedu.cppquiz.testMenu.activity

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import cpp.quiz.sfedu.cppquiz.testMenu.mixed.MixedFragment
import cpp.quiz.sfedu.cppquiz.R
import cpp.quiz.sfedu.cppquiz.testMenu.topic.TopicFragment


class TestMenuActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_menu)

        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        val actionBar = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)


        val viewPager = findViewById(R.id.viewpager) as ViewPager
        setupViewPager(viewPager)

        val tabLayout = findViewById(R.id.tablayout) as TabLayout
        tabLayout.setTabTextColors(resources.getColor(R.color.colorGreyText), resources.getColor(
            R.color.colorPrimary
        ))
        tabLayout.setupWithViewPager(viewPager)



    }

    private fun setupViewPager(viewPager: ViewPager) {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(MixedFragment(), "Mixed")
        adapter.addFragment(TopicFragment(), "TOPIC")
        viewPager.adapter = adapter
    }


    /*override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_menu)
    }*/
}
