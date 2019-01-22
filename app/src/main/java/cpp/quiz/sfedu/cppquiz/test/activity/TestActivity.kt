package cpp.quiz.sfedu.cppquiz.test.activity

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.ViewPager
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import cpp.quiz.sfedu.cppquiz.R
import cpp.quiz.sfedu.cppquiz.test.TestFragment
import cpp.quiz.sfedu.cppquiz.test.base.TestBaseClass
import cpp.quiz.sfedu.cppquiz.testMenu.activity.ViewPagerAdapter


class TestActivity : AppCompatActivity() {

    var tests = mutableListOf<TestBaseClass>();
    var fragments = mutableListOf<TestFragment>()
    var currentFragmentNumber = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)


        var viewPager = findViewById(R.id.view_pager) as ViewPager
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        var drawer = findViewById(R.id.drawerLayout) as DrawerLayout

//        setSupportActionBar(toolbar)

        //create default navigation drawer toggle
        val toggle = ActionBarDrawerToggle(
            this, drawer, toolbar,
            R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawer.addDrawerListener(toggle)
        toggle.syncState()


        //handling navigation view item event
        val navigationView = findViewById(R.id.nav_view) as NavigationView
        val add = navigationView.menu.add("1")
        add.setActionView(R.layout.drawer_menu_item)

        //navigationView.setNavigationItemSelectedListener(this)

        //set viewpager adapter
        val pagerAdapter = ViewPagerAdapter(supportFragmentManager)
        /*for (fragment in fragments) {
            pagerAdapter.addFragment(fragment, "Title from test")
        }*/
        viewPager.setAdapter(pagerAdapter)

        //change Tab selection when swipe ViewPager
//        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))


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
