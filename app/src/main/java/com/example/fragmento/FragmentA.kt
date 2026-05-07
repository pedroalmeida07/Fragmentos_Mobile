package com.example.fragmento

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmento.databinding.FragmentABinding


class FragmentA : Fragment() {


    private var _binding: FragmentABinding? = null  // A variavel _binding conterá a instancia do FragmentA
    private val binding get() = _binding!!  // A propriedade get retorna a instancia do objeto de forma segura

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false)
    }

}