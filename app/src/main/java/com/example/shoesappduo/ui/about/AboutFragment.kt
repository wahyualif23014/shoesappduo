package com.example.shoesappduo.ui.about

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.shoesappduo.R
import com.example.shoesappduo.databinding.FragmentAboutBinding

class AboutFragment : Fragment() {

    private var _binding: FragmentAboutBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAboutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView()
    }

    private fun setupView() {
        binding.apply {
            // Mengisi data secara dinamis
            tvProfileName.text = "Dewa" // Ganti dengan nama Anda
            tvProfileEmail.text = "dewa.developer@example.com" // Ganti dengan email Anda
            imgProfilePhoto.setImageResource(R.drawable.ic_profile_placeholder) // Ganti dengan foto Anda

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}