package cpp.quiz.sfedu.cppquiz.test.activity

import android.os.Bundle
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.View
import cpp.quiz.sfedu.cppquiz.R
import cpp.quiz.sfedu.cppquiz.test.TestFragment
import cpp.quiz.sfedu.cppquiz.test.base.TestBaseClass
import cpp.quiz.sfedu.cppquiz.testMenu.activity.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_test.*


class TestActivity : AppCompatActivity() {

    var tests = mutableListOf<TestBaseClass>();
    var fragments = mutableListOf<TestFragment>()
    var currentFragmentNumber = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)


        configDrawer()
        configViewPager()


        /*supportFragmentManager
            .beginTransaction()
            .add(R.id.test_fragment, fragments[currentFragmentNumber])
            .commit()*/
    }

    private fun configViewPager() {
        //set viewpager adapter
        val pagerAdapter = ViewPagerAdapter(supportFragmentManager)
        /*for (fragment in fragments) {
            pagerAdapter.addFragment(fragment, "Title from test")
        }*/
        viewPager.setAdapter(pagerAdapter)

        //change Tab selection when swipe ViewPager
        //        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
    }

    private fun configDrawer() {
        //create default navigation drawer toggle
        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar,
            R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        //handling navigation view item event
        val add = nav_view.menu.add("1")
        add.setActionView(R.layout.drawer_menu_item)

        //navigationView.setNavigationItemSelectedListener(this)
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
