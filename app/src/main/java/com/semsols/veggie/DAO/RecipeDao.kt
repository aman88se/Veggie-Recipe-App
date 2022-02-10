package com.semsols.veggie.DAO

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.semsols.veggie.entities.Category
import com.semsols.veggie.entities.RecipeModel


@Dao
interface RecipeDao {

    @get:Query("SELECT * FROM  category ORDER BY id DESC")
    val getAllCategory: List<Category>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCategory(category: Category)


}