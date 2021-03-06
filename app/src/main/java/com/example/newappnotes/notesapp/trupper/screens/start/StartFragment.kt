package com.example.newappnotes.notesapp.trupper.screens.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentStateManagerControl
import androidx.lifecycle.ViewModelProvider
import com.example.newappnotes.notesapp.trupper.R
import com.example.newappnotes.notesapp.trupper.databinding.FragmentStartBinding
import com.example.newappnotes.notesapp.trupper.utilits.TYPE_ROOM

class StartFragment : Fragment() {

    private var _binding:FragmentStartBinding? = null
    private val mBinding get() = _binding!!
    private lateinit var mViewModel: StartFragmentViewModel


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View? {
      _binding = FragmentStartBinding.inflate(layoutInflater,container,false)
        return mBinding.root
    }

    override fun onStart() {
        super.onStart()
        initialization()
    }

    private fun initialization() {
        mViewModel = ViewModelProvider(this).get(StartFragmentViewModel::class.java)
       // btn_room.setOnClickListener{
            mViewModel.initDatabase(TYPE_ROOM)
        }
    }

