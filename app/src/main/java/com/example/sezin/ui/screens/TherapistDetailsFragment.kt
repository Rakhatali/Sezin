package com.example.sezin.ui.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sezin.databinding.FragmentTherapistDetailsBinding
import com.example.sezin.ui.activities.MainActivity

class TherapistDetailsFragment : Fragment() {

    lateinit var binding:FragmentTherapistDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTherapistDetailsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnBack.setOnClickListener{
            val activity = activity as MainActivity

            activity.navController.popBackStack()
        }
    }
}