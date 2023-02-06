package com.example.sezin.ui.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sezin.R
import com.example.sezin.databinding.FragmentChatBinding
import com.example.sezin.ui.activities.MainActivity

class ChatFragment : Fragment() {

    lateinit var binding:FragmentChatBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChatBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnInfo.setOnClickListener{
            val activity = activity as MainActivity

            activity.navController.navigate(R.id.action_chatFragment_to_therapistDetailsFragment)
        }
    }


}