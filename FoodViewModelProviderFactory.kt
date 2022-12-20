package com.evinurastina.foodapp.ui.viewModels

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.evinurastina.foodapp.repository.FoodRepository

class FoodViewModelProviderFactory(val app:Application,val foodRepository:FoodRepository) : ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return FoodViewModel(app,foodRepository) as T
    }

}
