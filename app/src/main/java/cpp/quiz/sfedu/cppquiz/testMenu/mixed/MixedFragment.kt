package cpp.quiz.sfedu.cppquiz.testMenu.mixed

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cpp.quiz.sfedu.cppquiz.R
import kotlinx.android.synthetic.main.mixed_fragment.*


class MixedFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.mixed_fragment, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mixed_recycler_view.layoutManager = GridLayoutManager(context, 3)
        mixed_recycler_view.adapter =
                MixedTestsAdapter(MixedTestsUtil.getTests())
    }


}
