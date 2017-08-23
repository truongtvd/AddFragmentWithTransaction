package com.example.truongtvd.testfragment


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.transition.Slide
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_blank.*


/**
 * A simple [Fragment] subclass.
 */
class BlankFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button.setOnClickListener {
            val secondFragment = SecondFragment()
            val ft = activity.supportFragmentManager.beginTransaction()
            ft.addToBackStack(null)
            ft.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_to_right,R.anim.enter_from_left,R.anim.exit_to_right)
            ft.add(R.id.fragment,secondFragment)
            ft.commit()
        }


    }

}// Required empty public constructor

