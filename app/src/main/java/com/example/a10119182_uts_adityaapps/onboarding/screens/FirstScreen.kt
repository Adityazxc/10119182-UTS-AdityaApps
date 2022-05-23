package com.example.a10119182_uts_adityaapps.onboarding.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.a10119182_uts_adityaapps.R
import com.example.a10119182_uts_adityaapps.databinding.FragmentFirstScreenBinding
import com.example.a10119182_uts_adityaapps.databinding.FragmentViewPagerBinding


//        21 Mei 2022
//        10119182
//        Aditya Firmansayah
//        IF-5
class FirstScreen : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentFirstScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFirstScreenBinding.inflate(inflater, container, false)

        val viewPager=activity?.findViewById<ViewPager2>(R.id.viewPager)

        binding.next.setOnClickListener{
            viewPager?.currentItem=1

        }
        return binding.root
    }



}