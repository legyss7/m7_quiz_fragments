package com.example.hw7.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.hw7.R
import com.example.hw7.databinding.SurveyFragmentBinding



class SurveyFragment : Fragment() {

    private var _binding: SurveyFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = SurveyFragmentBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            val answers : String = getAnswersByUser()
            val action = SurveyFragmentDirections.actionSurveyFragmentToSurveyResultFragment(answers)
            findNavController().navigate(action)
        }
    }

    private fun getAnswersByUser(): String {
        var answer = ""

        if (binding.question1.checkedRadioButtonId == binding.answer11.id) answer +=
            getString(R.string.answer_11_response)
        if (binding.question1.checkedRadioButtonId == binding.answer12.id) answer +=
            getString(R.string.answer_12_response)
        if (binding.question1.checkedRadioButtonId == binding.answer13.id) answer +=
            getString(R.string.answer_13_response)
        if (binding.question1.checkedRadioButtonId == binding.answer14.id) answer +=
            getString(R.string.answer_14_response)
        answer += "\n\n"

        if (binding.question2.checkedRadioButtonId == binding.answer21.id) answer +=
            getString(R.string.answer_21_response)
        if (binding.question2.checkedRadioButtonId == binding.answer22.id) answer +=
            getString(R.string.answer_22_response)
        if (binding.question2.checkedRadioButtonId == binding.answer23.id) answer +=
            getString(R.string.answer_23_response)
        if (binding.question2.checkedRadioButtonId == binding.answer24.id) answer +=
            getString(R.string.answer_24_response)
        answer += "\n\n"
        if (binding.question3.checkedRadioButtonId == binding.answer31.id) answer +=
            getString(R.string.answer_31_response)
        if (binding.question3.checkedRadioButtonId == binding.answer32.id) answer +=
            getString(R.string.answer_32_response)
        if (binding.question3.checkedRadioButtonId == binding.answer33.id) answer +=
            getString(R.string.answer_33_response)
        if (binding.question3.checkedRadioButtonId == binding.answer34.id) answer +=
            getString(R.string.answer_34_response)
        answer += "\n\n"

        return answer
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}