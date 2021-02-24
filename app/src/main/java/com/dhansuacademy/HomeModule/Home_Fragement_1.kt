package com.dhansuacademy.HomeModule

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel
import com.dhansuacademy.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


class Home_Fragement_1 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_home__fragement_1, container, false)
        val imageList = ArrayList<SlideModel>() // Create image list

// imageList.add(SlideModel("String Url" or R.drawable)
// imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title

        imageList.add(SlideModel("https://lh3.googleusercontent.com/yuV8974N1UVuT-lq1fDLDzxcDdt2G19odEy9kwaKf7AvjBRy9MjbQk15yPwDTBq5pO3sIg=s113" , "RRB Exams"))
        imageList.add(SlideModel("https://lh3.googleusercontent.com/yuV8974N1UVuT-lq1fDLDzxcDdt2G19odEy9kwaKf7AvjBRy9MjbQk15yPwDTBq5pO3sIg=s113" , "RRB Exams"))
        imageList.add(SlideModel("https://lh3.googleusercontent.com/yuV8974N1UVuT-lq1fDLDzxcDdt2G19odEy9kwaKf7AvjBRy9MjbQk15yPwDTBq5pO3sIg=s113" , "RRB Exams"))

        val imageSlider = view.findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)
        imageSlider.startSliding(3000)
        return view
    }

}