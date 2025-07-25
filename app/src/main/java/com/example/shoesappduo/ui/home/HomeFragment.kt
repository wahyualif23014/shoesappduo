package com.example.shoesappduo.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shoesappduo.databinding.FragmentHomeBinding
import com.example.shoesappduo.ui.adapter.ShoeAdapter

class HomeFragment : Fragment() {

    private val viewModel: HomeViewModel by viewModels()

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val shoeAdapter = ShoeAdapter { shoe ->
            val action = HomeFragmentDirections.actionHomeFragmentToDetailFragment(shoe)
            findNavController().navigate(action)
        }

        // Setup RecyclerView
        binding.rvShoes.apply {
            // --- UBAH BARIS INI ---
            layoutManager = GridLayoutManager(context, 2)
            adapter = shoeAdapter
        }

        viewModel.shoes.observe(viewLifecycleOwner) { shoesList ->
            shoeAdapter.submitList(shoesList)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}