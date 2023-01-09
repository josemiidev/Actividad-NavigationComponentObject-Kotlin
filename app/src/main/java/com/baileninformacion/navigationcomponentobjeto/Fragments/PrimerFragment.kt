package com.baileninformacion.navigationcomponentobjeto.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.baileninformacion.navigationcomponentobjeto.databinding.FragmentPrimerBinding

class PrimerFragment : Fragment() {
    private lateinit var binding: FragmentPrimerBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPrimerBinding.inflate(layoutInflater)
        return binding.root
    }
}