package com.example.hw7.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

import com.example.hw7.R
import com.example.hw7.databinding.SurveyResultFragmentBinding


class SurveyResultFragment : Fragment() {

    private val args: SurveyResultFragmentArgs by navArgs()
    private var _binding: SurveyResultFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = SurveyResultFragmentBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.result.text = args.answer

        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_surveyResultFragment_to_surveyFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}