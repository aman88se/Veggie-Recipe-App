package com.semsols.veggie.entities

import androidx.room.*
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.semsols.veggie.entities.converter.CategoryListConverter

@Entity(tableName = "Category")
data class Category(

    @PrimaryKey(autoGenerate = true)
    var id: Int,
    @ColumnInfo(name = "categoryitem")
    @Expose
    @SerializedName("categoryitem")
    @TypeConverters(CategoryListConverter::class)
    val categoryitem: List<CategoryItem>? = null
)