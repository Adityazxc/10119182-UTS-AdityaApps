package com.example.a10119182_uts_adityaapps.onboarding.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.a10119182_uts_adityaapps.R
import com.example.a10119182_uts_adityaapps.databinding.FragmentSecondScreenBinding
import com.example.a10119182_uts_adityaapps.databinding.FragmentThirdScreenBinding

//        21 Mei 2022
//        10119182
//        Aditya Firmansayah
//        IF-5
class ThirdScreen : Fragment() {
    private var _binding: FragmentThirdScreenBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentThirdScreenBinding.inflate(inflater, container, false)



        binding.finish.setOnClickListener{
          findNavController().navigate(R.id.action_viewPagerFragment_to_mainActivity)
            onBoardingFinished()

        }
        return binding.root

    }
    private fun onBoardingFinished(){
        val sharedPref= requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("Finished",true)
        editor.apply()
    }
}