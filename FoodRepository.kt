package com.evinurastina.foodapp.repository

import com.evinurastina.foodapp.api.RetrofitInstance
import com.evinurastina.foodapp.models.CategoriesResponse
import com.evinurastina.foodapp.models.FilterResponse
import com.evinurastina.foodapp.models.RecipeResponse
import retrofit2.Response
import java.util.logging.Filter

class FoodRepository {

    suspend fun getCategories(): Response<CategoriesResponse> {
        return RetrofitInstance.api.getCategories()
    }

    suspend fun getFilterByCategory(category:String): Response<FilterResponse> {
        return RetrofitInstance.api.getFilterByCategory(category)
    }

    suspend fun getFilterByArea(area:String): Response<FilterResponse> {
        return RetrofitInstance.api.getFilterByArea(area)
    }

    suspend fun getFilterByIngredient(ingredient:String): Response<FilterResponse> {
        return RetrofitInstance.api.getFilterByIngredient(ingredient)
    }

    suspend fun getIngredientList(): Response<FilterResponse>{
        return RetrofitInstance.api.getIngredientList()
    }

    suspend fun getAreaList(): Response<FilterResponse>{
        return RetrofitInstance.api.getAreaList()
    }

    suspend fun search(searchQuery:String): Response<FilterResponse>{
        return RetrofitInstance.api.search(searchQuery)
    }

    suspend fun getRecipeById(id:String): Response<RecipeResponse>{
        return RetrofitInstance.api.getRecipeById(id)
    }

    suspend fun getRandomRecipe(): Response<RecipeResponse>{
        return RetrofitInstance.api.getRandomRecipe()
    }
}
