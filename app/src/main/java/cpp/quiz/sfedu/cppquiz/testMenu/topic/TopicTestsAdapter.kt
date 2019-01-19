package cpp.quiz.sfedu.cppquiz.testMenu.topic

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import cpp.quiz.sfedu.cppquiz.R
import cpp.quiz.sfedu.cppquiz.test.activity.TestActivity
import cpp.quiz.sfedu.cppquiz.testMenu.listener.TestClickListener

class TopicTestsAdapter(val tests: List<TopicTest>) : RecyclerView.Adapter<TopicTestViewHolder>(),
    TestClickListener {

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): TopicTestViewHolder =
        TopicTestViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.topic_item,
                parent,
                false
            ), this
        )

    override fun getItemCount(): Int = tests.size

    override fun onBindViewHolder(holder: TopicTestViewHolder, position: Int) {
        holder.bindItems(tests[position])
    }


    override fun onTestClicked(context: Context, adapterPosition: Int) {
        val testActivityIntent = Intent(context, TestActivity::class.java)
        context.startActivity(testActivityIntent)

    }

}
