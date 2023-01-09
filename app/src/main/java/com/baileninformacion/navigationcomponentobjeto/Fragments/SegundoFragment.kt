package com.baileninformacion.navigationcomponentobjeto.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            val args = SegundoFragmentArgs.fromBundle(requireArguments())
            val persona = args.persona

            binding.tvNombre.text = persona.Nombre
            binding.tvApellidos.text = persona.Apellidos
            binding.tvTelefono.text = persona.Telefono
        }

        binding.btnSegundaPantalla.setOnClickListener {
            val navController = Navigation.findNavController(it)
            val action = SegundoFragmentDirections.actionSegundoFragmentToTercerFragment2()

            navController.navigate(action)
        }
    }
}