package com.example.sezin.ui.screens

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sezin.R
import com.example.sezin.databinding.FragmentMusicBinding

class MusicFragment : Fragment() {

    lateinit var binding: FragmentMusicBinding
    private lateinit var mediaPlayer: MediaPlayer


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMusicBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mediaPlayer = MediaPlayer.create(activity, R.raw.wind)
        setListeners()
    }

    private fun setListeners() {
        binding.btnWind.setOnClickListener {
            cleanIcons()
            if (mediaPlayer.isPlaying) {
                mediaPlayer.pause()
            } else {
                binding.btnWind.setImageResource(R.drawable.ic_pause)
                startPlayer(R.raw.wind)
            }
        }

        binding.btnForest.setOnClickListener {
            cleanIcons()
            if (mediaPlayer.isPlaying) {
                mediaPlayer.pause()
            } else {
                binding.btnForest.setImageResource(R.drawable.ic_pause)
                startPlayer(R.raw.forest)
            }
        }

        binding.btnNight.setOnClickListener {
            cleanIcons()
            if (mediaPlayer.isPlaying) {
            } else {
                binding.btnNight.setImageResource(R.drawable.ic_pause)
                startPlayer(R.raw.night)
            }
        }

        binding.btnOcean.setOnClickListener {
            cleanIcons()
            if (mediaPlayer.isPlaying) {
                mediaPlayer.pause()
            } else {
                binding.btnOcean.setImageResource(R.drawable.ic_pause)
                startPlayer(R.raw.ocean)
            }
        }

        binding.btnWaterfall.setOnClickListener {
            cleanIcons()
            if (mediaPlayer.isPlaying) {
                mediaPlayer.pause()
            } else {
                binding.btnWaterfall.setImageResource(R.drawable.ic_pause)
                startPlayer(R.raw.waterfall)
            }
        }
    }

    private fun cleanIcons() {
        binding.btnWind.setImageResource(R.drawable.ic_play)
        binding.btnWaterfall.setImageResource(R.drawable.ic_play)
        binding.btnForest.setImageResource(R.drawable.ic_play)
        binding.btnNight.setImageResource(R.drawable.ic_play)
        binding.btnOcean.setImageResource(R.drawable.ic_play)
    }


    private fun startPlayer(music:Int) {
        mediaPlayer = MediaPlayer.create(activity, music)
        mediaPlayer.start()
    }
}