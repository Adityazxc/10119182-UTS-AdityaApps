package com.example.a10119182_uts_adityaapps

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.a10119182_uts_adityaapps.databinding.ActivityMainBinding
import com.example.a10119182_uts_adityaapps.databinding.ActivityMainBinding.*


//        21 Mei 2022
//        10119182
//        Aditya Firmansayah
//        IF-5
class MainActivity : AppCompatActivity() {

    private val homeFragment= home()
    private val musicFragment= list_music()
    private val activityFragment= activity()
    private val albumFragment=album()
    private val profileFragment=profile()

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        val view = binding.root
        setContentView(view)
        replaceFragment(homeFragment)

      binding.bottomNavigation.setOnNavigationItemSelectedListener{
        when(it.itemId){
            R.id.home->replaceFragment(homeFragment)
            R.id.profile->replaceFragment(profileFragment)
            R.id.music->replaceFragment(musicFragment)
            R.id.activity->replaceFragment(activityFragment)
            R.id.galery->replaceFragment(albumFragment)
          }
          true
      }

    }



    private fun replaceFragment(fragment: Fragment){

        if(fragment !=null){
            val transaction= supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        }
    }
}