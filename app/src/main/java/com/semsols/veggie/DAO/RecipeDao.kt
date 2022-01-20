package com.semsols.veggie.DAO

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.semsols.veggie.entities.RecipeModel


@Dao
interface RecipeDao {

    @get:Query("SELECT * FROM  Recipe ORDER BY id DESC")
    val allRecipes: List<RecipeModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRecipe(recipes : RecipeModel)


}