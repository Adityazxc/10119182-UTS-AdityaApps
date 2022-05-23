package com.example.a10119182_uts_adityaapps

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

//        21 Mei 2022
//        10119182
//        Aditya Firmansayah
//        IF-5
class SplashFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Handler().postDelayed({

            //lamun embung  aya terus hapus ieu

//            if(onBoardingFinished()){
//                findNavController().navigate(R.id.action_splashFragment_to_mainActivity)
//            }else{
//                findNavController().navigate(R.id.action_splashFragment_to_viewPagerFragment)
//            }

        //ieu mun hayang aya terus splash na
            findNavController().navigate(R.id.action_splashFragment_to_viewPagerFragment)


        },3000)
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    private fun onBoardingFinished():Boolean{
        val sharedPref= requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        return sharedPref.getBoolean("Finished",false)

    }

}