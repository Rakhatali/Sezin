package com.example.sezin.ui.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sezin.databinding.FragmentProfileBinding
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry


class ProfileFragment : Fragment() {

    lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initChart()
    }


    private fun initChart() {
        var labels = mutableListOf<String>()
        labels.add("Monday")
        labels.add("Tuesday")
        labels.add("Wednesday")
        labels.add("Thursday")
        labels.add("Friday")
        labels.add("Saturday")
        labels.add("Sunday")

        var entries = mutableListOf<BarEntry>()
        entries.add(BarEntry(0f,15f))
        entries.add(BarEntry(0f, 10f))
        entries.add(BarEntry(18f, 20f))
        entries.add(BarEntry(5f, 30f))
        entries.add(BarEntry(8f, 40f))
        entries.add(BarEntry(8f, 40f))
        entries.add(BarEntry(8f, 40f))
        val dataset = BarDataSet(entries, "Tasks")

        val data = BarData(dataset)
        binding.chartStatistic.data = data

    }
}