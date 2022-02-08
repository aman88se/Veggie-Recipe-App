package com.semsols.veggie.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.PropertyKey
import java.io.Serializable

@Entity(tableName = "Recipe")
data class RecipeModel(

    @PrimaryKey(autoGenerate = true)
    var id: Int,
    @ColumnInfo(name = "dishName")
    var dishName: String

): Serializable
