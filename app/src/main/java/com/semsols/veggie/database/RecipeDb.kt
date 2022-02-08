package com.semsols.veggie.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.semsols.veggie.DAO.RecipeDao
import com.semsols.veggie.entities.Category
import com.semsols.veggie.entities.CategoryItem
import com.semsols.veggie.entities.RecipeModel
import com.semsols.veggie.entities.converter.CategoryListConverter


@Database(

    entities = [RecipeModel::class,CategoryItem::class,Category::class,CategoryListConverter::class], version = 1, exportSchema = false
)
abstract class RecipeDb: RoomDatabase() {

    companion object{

        var recipeDb: RecipeDb? = null

        @Synchronized
        fun getDb(context: Context): RecipeDb{
            if(recipeDb != null){

                recipeDb = Room.databaseBuilder(
                    context,RecipeDb::class.java,"Recipe.db"
                ).build()

            }
            return recipeDb!!
        }
    }

    abstract fun recipeDao(): RecipeDao

}