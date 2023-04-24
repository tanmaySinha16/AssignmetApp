package com.example.assignmentapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.assignmentapp.R
import com.google.android.material.tabs.TabLayout


class ExploreFragment : Fragment(R.layout.fragment_explore) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewPager = view.findViewById<ViewPager>(R.id.viewPager)
        val adapter = MyPagerAdapter(childFragmentManager)
        viewPager.adapter = adapter


        val tabLayout = view.findViewById<TabLayout>(R.id.tabLayout)
        tabLayout.setupWithViewPager(viewPager)
        tabLayout.getTabAt(0)?.setIcon(R.drawable.baseline_people_alt_24)
        tabLayout.getTabAt(1)?.setIcon(R.drawable.baseline_business_center_24)
        tabLayout.getTabAt(2)?.setIcon(R.drawable.baseline_business_24)
    }

    // Custom PagerAdapter for managing fragments
    private class MyPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
        override fun getItem(position: Int): Fragment {
            return when (position) {
                0 -> PeopleFragment()
                1 -> JobsFragment()
                2 -> BusinessFragment()
                else -> throw IllegalArgumentException("Invalid tab position: $position")
            }
        }

        override fun getCount(): Int = 3
    }
}
