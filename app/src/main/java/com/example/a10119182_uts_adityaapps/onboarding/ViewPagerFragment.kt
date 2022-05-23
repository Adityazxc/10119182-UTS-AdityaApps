package com.example.a10119182_uts_adityaapps.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.a10119182_uts_adityaapps.databinding.FragmentViewPagerBinding
import com.example.a10119182_uts_adityaapps.onboarding.screens.FirstScreen
import com.example.a10119182_uts_adityaapps.onboarding.screens.SecondScreen
import com.example.a10119182_uts_adityaapps.onboarding.screens.ThirdScreen


//        21 Mei 2022
//        10119182
//        Aditya Firmansayah
//        IF-5
class ViewPagerFragment : Fragment() {

    private var _binding: FragmentViewPagerBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentViewPagerBinding.inflate(inflater, container, false)

        val fragmentList = arrayListOf<Fragment>(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        binding.viewPager.adapter = adapter

        return binding.root
    }

}