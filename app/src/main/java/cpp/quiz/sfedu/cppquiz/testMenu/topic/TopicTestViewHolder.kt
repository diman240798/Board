package cpp.quiz.sfedu.cppquiz.testMenu.mixed

import android.support.v7.widget.RecyclerView
import android.view.View
import cpp.quiz.sfedu.cppquiz.testMenu.listener.TestClickListener
import kotlinx.android.synthetic.main.topic_item.*

class TopicTestViewHolder(itemView: View, testClickListener: TestClickListener) : RecyclerView.ViewHolder(itemView) {

    init {
        itemView.setOnClickListener {
            testClickListener.onTestClicked(itemView.context, adapterPosition)
        }
    }

    fun bindItems(mixedTest: TopicQuestion) {
        itemView.apply {


        }
    }

}
