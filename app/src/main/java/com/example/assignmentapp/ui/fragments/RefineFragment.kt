package com.example.assignmentapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.navigation.fragment.findNavController
import com.example.assignmentapp.R

class RefineFragment : Fragment(R.layout.fragment_refine) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val availabilityOptions = resources.getStringArray(R.array.Availability)
        val arrayAdapter =
            ArrayAdapter(requireContext(), R.layout.dropdown_item, availabilityOptions)
        view.findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)?.setAdapter(arrayAdapter)

        val cvCoffee = view.findViewById<CardView>(R.id.cvCoffee)
        val tvCoffee = view.findViewById<TextView>(R.id.tvCoffee)
        cvCoffee?.setOnClickListener {
            cvCoffee.isSelected = !cvCoffee.isSelected
            tvCoffee?.isSelected = cvCoffee.isSelected
            cvCoffee.setBackgroundResource(R.drawable.effect)
        }

        val cvBusiness = view.findViewById<CardView>(R.id.cvBusiness)
        val tvBusiness = view.findViewById<TextView>(R.id.tvBusiness)
        cvBusiness?.setOnClickListener {
            cvBusiness.isSelected = !cvBusiness.isSelected
            tvBusiness?.isSelected = cvBusiness.isSelected
            cvBusiness.setBackgroundResource(R.drawable.effect)
        }

        val cvHobbies = view.findViewById<CardView>(R.id.cvHobbies)
        val tvHobbies = view.findViewById<TextView>(R.id.tvHobbies)
        cvHobbies?.setOnClickListener {
            cvHobbies.isSelected = !cvHobbies.isSelected
            tvHobbies?.isSelected = cvHobbies.isSelected
            cvHobbies.setBackgroundResource(R.drawable.effect)
        }


        val cvFriendship = view.findViewById<CardView>(R.id.cvFriendship)
        val tvFriendship = view.findViewById<TextView>(R.id.tvFriendship)
        cvFriendship?.setOnClickListener {
            cvFriendship.isSelected = !cvFriendship.isSelected
            tvFriendship?.isSelected = cvFriendship.isSelected
            cvFriendship.setBackgroundResource(R.drawable.effect)
        }

        val cvMovies = view.findViewById<CardView>(R.id.cvMovies)
        val tvMovies = view.findViewById<TextView>(R.id.tvMovies)
        cvMovies?.setOnClickListener {
            cvMovies.isSelected = !cvMovies.isSelected
            tvMovies?.isSelected = cvMovies.isSelected
            cvMovies.setBackgroundResource(R.drawable.effect)
        }


        val cvDining = view.findViewById<CardView>(R.id.cvDining)
        val tvDining = view.findViewById<TextView>(R.id.tvDining)
        cvDining?.setOnClickListener {
            cvDining.isSelected = !cvDining.isSelected
            tvDining?.isSelected = cvDining.isSelected
            cvDining.setBackgroundResource(R.drawable.effect)
        }

        val cvDating = view.findViewById<CardView>(R.id.cvDating)
        val tvDating = view.findViewById<TextView>(R.id.tvDating)
        cvDating?.setOnClickListener {
            cvDating.isSelected = !cvDating.isSelected
            tvDating?.isSelected = cvDating.isSelected
            cvDating.setBackgroundResource(R.drawable.effect)
        }

        val cvMatrimony = view.findViewById<CardView>(R.id.cvMatrimony)
        val tvMatrimony = view.findViewById<TextView>(R.id.tvMatrimony)
        cvMatrimony?.setOnClickListener {
            cvMatrimony.isSelected = !cvMatrimony.isSelected
            tvMatrimony?.isSelected = cvMatrimony.isSelected
            cvMatrimony.setBackgroundResource(R.drawable.effect)
        }

    }

    override fun onResume() {
        super.onResume()
        val availabilityOptions = resources.getStringArray(R.array.Availability)
        val arrayAdapter =
            ArrayAdapter(requireContext(), R.layout.dropdown_item, availabilityOptions)
        requireView().findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)?.setAdapter(arrayAdapter)
    }

}



