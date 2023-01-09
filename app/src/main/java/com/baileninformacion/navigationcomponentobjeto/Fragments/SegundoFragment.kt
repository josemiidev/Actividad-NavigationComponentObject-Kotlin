package com.baileninformacion.navigationcomponentobjeto.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.baileninformacion.navigationcomponentobjeto.databinding.FragmentSegundoBinding

class SegundoFragment : Fragment() {
    private lateinit var binding : FragmentSegundoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSegundoBinding.inflate(layoutInflater)
        return binding.root
    }
}