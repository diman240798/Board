package cpp.quiz.sfedu.cppquiz.testMenu.topic

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cpp.quiz.sfedu.cppquiz.R
import kotlinx.android.synthetic.main.topic_fragment.*

class TopicFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.topic_fragment, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        topic_recycler_view.layoutManager = LinearLayoutManager(context)
        topic_recycler_view.adapter =
                TopicTestsAdapter(TopicTestsUtil.getTests())

    }


}
