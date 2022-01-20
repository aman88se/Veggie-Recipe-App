package com.semsols.veggie.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.PropertyKey

@Entity(
    tableName = "Recipe"
)
data class RecipeModel(

    @PrimaryKey(autoGenerate = true)
    var id:Int
)
