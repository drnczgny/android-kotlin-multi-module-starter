package com.adrian.project.ui.jsonplaceholder.submodules.postspage

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.adrian.project.R
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject


class PostsPageFragment : Fragment(), PostsPageRouter {

    @Inject
    lateinit var postsPageModel: PostsPageModel

    companion object {
        fun newInstance(): PostsPageFragment {
            val fragment = PostsPageFragment()

            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        AndroidSupportInjection.inject(this)

        if (arguments != null) {
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        postsPageModel.callApiService()

        return inflater!!.inflate(R.layout.fragment_posts_page, container, false)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }

    override fun onDetach() {
        super.onDetach()
    }

}
