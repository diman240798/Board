package cpp.quiz.sfedu.cppquiz

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar


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
        tabLayout.setupWithViewPager(viewPager)


    }

    private fun setupViewPager(viewPager: ViewPager) {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(PeopleFragment(), "People")
        adapter.addFragment(PeopleFragment(), "Group")
        adapter.addFragment(PeopleFragment(), "Calls")
        viewPager.adapter = adapter
    }


    /*override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_menu)
    }*/
}
