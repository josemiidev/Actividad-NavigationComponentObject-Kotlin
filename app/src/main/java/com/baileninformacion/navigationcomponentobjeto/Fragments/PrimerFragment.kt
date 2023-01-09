package com.baileninformacion.navigationcomponentobjeto.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.baileninformacion.navigationcomponentobjeto.Persona
import com.baileninformacion.navigationcomponentobjeto.R
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnSegundaPantalla.setOnClickListener {
            val navController = Navigation.findNavController(it)
            if(!binding.txtNombre.text.toString().isEmpty() && !binding.txtApellidos.text.toString().isEmpty() && !binding.txtTelefono.text.toString().isEmpty()){
                val nombre = binding.txtNombre.text.toString()
                val apellidos = binding.txtApellidos.text.toString()
                val telefono = binding.txtTelefono.text.toString()
                var persona = Persona(nombre,apellidos,telefono)

                val action = PrimerFragmentDirections.actionPrimerFragmentToSegundoFragment(persona)
                navController.navigate(action)
            }else{
                Toast.makeText(null,"Debe rellenar todos los campos",Toast.LENGTH_LONG).show()
            }
        }
    }
}