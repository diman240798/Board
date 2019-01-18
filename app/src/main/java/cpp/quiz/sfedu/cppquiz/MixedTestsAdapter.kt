package cpp.quiz.sfedu.cppquiz

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class MixedTestsAdapter(val tests: List<MixedTest>) : RecyclerView.Adapter<MixedTestViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, position: Int): MixedTestViewHolder =
        MixedTestViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.mixed_item, parent, false))

    override fun getItemCount(): Int = tests.size

    override fun onBindViewHolder(holder: MixedTestViewHolder, position: Int) {

    }

}
