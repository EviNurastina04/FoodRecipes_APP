package com.evinurastina.foodapp.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.foodapp.R
import com.example.foodapp.adapters.ListAdapter
import com.example.foodapp.databinding.FragmentAreaBinding
import com.example.foodapp.databinding.FragmentIngrediantBinding
import com.example.foodapp.models.FilterQuery
import com.example.foodapp.ui.MainActivity
import com.example.foodapp.ui.viewModels.FoodViewModel
import com.example.foodapp.util.Resource

class AreaFragment :Fragment(R.layout.fragment_area) {

    companion object {
        const val TAG = "AreaFragment"
    }
    private lateinit var viewModel: FoodViewModel
    private lateinit var listAdapter: ListAdapter
    private lateinit var binding: FragmentAreaBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_area,container,false)

        viewModel=(activity as MainActivity).viewModel

        viewModel.getAreaList()

        setUpRecyclerView()

        listAdapter.setOnItemClickListener {
            Log.d(CategoriesFragment.TAG,"Clicked")
            val bundle= Bundle().apply {
                putSerializable("Filter",
                    it.strArea?.let { it1 -> FilterQuery(queryType = "a", query = it1) })
            }
            findNavController().navigate(
                R.id.action_areaFragment_to_filterFragment,
                bundle
            )
        }

        viewModel.filters.observe(viewLifecycleOwner, Observer { response->
            when(response){
                is Resource.Success->{
                    hideProgressBar()
                    response.data?.let{
                        listAdapter.differ.submitList(it.meals?.toList())
                    }
                }
                is Resource.Error -> {
                    hideProgressBar()
                    response.message?.let {
                        Toast.makeText(requireContext(),"An error occurred", Toast.LENGTH_LONG).show()
                    }
                }
                is Resource.Loading -> {
                    showProgressBar()
                }
            }
        })

        return binding.root
    }

    private fun setUpRecyclerView() {
        listAdapter = ListAdapter()
        binding.rvCategories.apply {
            adapter = listAdapter
            layoutManager= LinearLayoutManager(requireContext())
        }
    }

    private fun hideProgressBar() {
        binding.progressBar.visibility = View.INVISIBLE
    }

    private fun showProgressBar() {
        binding.progressBar.visibility = View.VISIBLE
    }
}
