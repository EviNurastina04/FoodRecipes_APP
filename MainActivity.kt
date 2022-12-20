package com.evinurastina.foodapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.evinurastina.foodapp.R
import com.evinurastina.foodapp.databinding.ActivityMainBinding
import com.evinurastina.foodapp.repository.FoodRepository
import com.evinurastina.foodapp.ui.viewModels.FoodViewModel
import com.evinurastina.foodapp.ui.viewModels.FoodViewModelProviderFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    lateinit var viewModel:FoodViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val repository=FoodRepository()
        val viewModelProviderFactory=FoodViewModelProviderFactory(application,repository)
        viewModel=ViewModelProvider(this,viewModelProviderFactory)[FoodViewModel::class.java]

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bottomNavigationView.setupWithNavController(foodNavHostFragment.findNavController())
    }
}
