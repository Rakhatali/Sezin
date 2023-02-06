package com.example.sezin.ui.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sezin.R
import com.example.sezin.databinding.FragmentHomeBinding
import com.example.sezin.ui.activities.MainActivity


class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnMood.setOnClickListener{
            val activity = activity as MainActivity

            activity.navController.navigate(R.id.action_homeFragment_to_testFragment)
        }

        binding.btnPlan.setOnClickListener{
            val activity = activity as MainActivity

            activity.navController.navigate(R.id.action_homeFragment_to_plansFragment)
        }
    }


}