package cpp.quiz.sfedu.cppquiz.testMenu.topic

import android.support.v7.widget.RecyclerView
import android.transition.TransitionManager
import android.view.View
import cpp.quiz.sfedu.cppquiz.testMenu.listener.TestClickListener
import kotlinx.android.synthetic.main.topic_item.view.*

class TopicTestViewHolder(
    itemView: View,
    testClickListener: TestClickListener
) : RecyclerView.ViewHolder(itemView) {

    init {
        val context = itemView.context
        val testClicedListener =
            {v:View -> testClickListener.onTestClicked(context, adapterPosition)}
        itemView.apply {
            topic_test_1.setOnClickListener(testClicedListener)
            topic_test_2.setOnClickListener(testClicedListener)
            topic_test_3.setOnClickListener(testClicedListener)
        }
        itemView.setOnClickListener{
            itemView.apply {
                TransitionManager.beginDelayedTransition(topic_item)
                topic_item_text.visibility = View.GONE
                topic_test_layout.visibility = View.VISIBLE
            }
        }
    }

    fun bindItems(mixedTest: TopicTest) {
        itemView.apply {
            topic_item_text.text = mixedTest.id.toString()
        }
    }

}
