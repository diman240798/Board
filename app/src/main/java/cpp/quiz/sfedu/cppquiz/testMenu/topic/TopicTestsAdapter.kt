package cpp.quiz.sfedu.cppquiz.testMenu.mixed

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import cpp.quiz.sfedu.cppquiz.R
import cpp.quiz.sfedu.cppquiz.testMenu.listener.TestClickListener
import cpp.quiz.sfedu.cppquiz.test.activity.TestActivity

class TopicTestsAdapter(val tests: List<TopicQuestion>) : RecyclerView.Adapter<MixedTestViewHolder>(),
    TestClickListener {
    override fun onCreateViewHolder(parent: ViewGroup, position: Int): MixedTestViewHolder =
        MixedTestViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.topic_item,
                parent,
                false
            ), this
        )

    override fun getItemCount(): Int = tests.size

    override fun onBindViewHolder(holder: MixedTestViewHolder, position: Int) {
        holder.bindItems(tests[position])
    }

    override fun onTestClicked(context: Context, adapterPosition: Int) {
        val testActivityIntent = Intent(context, TestActivity::class.java)
        context.startActivity(testActivityIntent)

    }

}
