package cpp.quiz.sfedu.cppquiz

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.TextureView
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.mixed_item.*
import kotlinx.android.synthetic.main.mixed_item.view.*

class MixedTestViewHolder(itemView: View, testClickListener: TestClickListener) : RecyclerView.ViewHolder(itemView) {

    init {
        itemView.setOnClickListener {
            testClickListener.onTestClicked(itemView.context, adapterPosition)
        }
    }

    fun bindItems(mixedTest: MixedTest) {
        itemView.apply {
            mixed_item_text.text = mixedTest.id.toString()
        }
    }

}
