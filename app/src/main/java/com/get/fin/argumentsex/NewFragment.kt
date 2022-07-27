package com.get.fin.argumentsex

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.get.fin.argumentsex.Companion.Companion.BUNDEL_KEY

class NewFragment : Fragment() {
    private lateinit var btnFragment: Button
    private lateinit var tvFragment: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_new, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init()

        tvFragment.text = getArguments()?.getString(BUNDEL_KEY) ?: "NULL"
    }

    private fun init() {
        btnFragment = view?.findViewById(R.id.btn_fragment)!!
        tvFragment = view?.findViewById(R.id.tv_fragment)!!
    }

    companion object{
        fun newInstance(string: String): NewFragment {
            val newFragment = NewFragment()
            val args = Bundle()
            args.putString(BUNDEL_KEY, string)
            newFragment.setArguments(args)
            return newFragment
        }
    }
}