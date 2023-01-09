package com.baileninformacion.navigationcomponentobjeto.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.baileninformacion.navigationcomponentobjeto.databinding.FragmentTercerBinding

class TercerFragment : Fragment() {
    private lateinit var binding : FragmentTercerBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTercerBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnVolverInicio.setOnClickListener {
            val navController = Navigation.findNavController(it)
            val action = TercerFragmentDirections.actionTercerFragmentToPrimerFragment()
            navController.navigate(action)
        }
    }
}