package com.example.shoesappduo.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import coil.load
import com.example.shoesappduo.R
import com.example.shoesappduo.data.model.Shoe
import com.example.shoesappduo.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    private val viewModel: DetailViewModel by viewModels()
    private val args: DetailFragmentArgs by navArgs()

    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Mengambil data shoe dari argumen dan mengirimkannya ke ViewModel
        val shoe = args.shoe
        viewModel.setShoeData(shoe)

        // Mengamati data dari ViewModel dan menampilkan ke UI
        viewModel.selectedShoe.observe(viewLifecycleOwner) { shoeData ->
            bindShoeDetails(shoeData)
        }
    }

    private fun bindShoeDetails(shoe: Shoe) {
        binding.apply {
            imgDetailPhoto.load(shoe.photoUrl) {
                crossfade(true)
                placeholder(R.drawable.ic_placeholder)
                error(R.drawable.ic_error)
            }
            tvDetailName.text = shoe.name
            tvDetailBrand.text = shoe.brand
            tvDetailPrice.text = shoe.price
            tvDetailDescription.text = shoe.description
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}