package com.semsols.veggie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.semsols.veggie.adapter.MainAdapter
import com.semsols.veggie.adapter.SubAdapter
import com.semsols.veggie.entities.RecipeModel
import kotlinx.android.synthetic.main.home_screen.*

class HomeScreen : AppCompatActivity() {

    var arrMainCategory = ArrayList<RecipeModel>()
    var arrSubCategory = ArrayList<RecipeModel>()

    var mainAdapter = MainAdapter()
    var subAdapter = SubAdapter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_screen)

        //This data is Temporary
        arrMainCategory.add(RecipeModel(1,"Tandoori"))
        arrMainCategory.add(RecipeModel(1,"Gravy"))
        arrMainCategory.add(RecipeModel(1,"Snacks"))
        arrMainCategory.add(RecipeModel(1,"Fried"))
        arrMainCategory.add(RecipeModel(1,"South Indian"))
        arrMainCategory.add(RecipeModel(1,"Dessert"))
        mainAdapter.setData(arrMainCategory)

        arrSubCategory.add(RecipeModel(1,"Tandoori Chicken"))
        arrSubCategory.add(RecipeModel(1,"Butter Chicken"))
        arrSubCategory.add(RecipeModel(1,"Samosa"))
        arrSubCategory.add(RecipeModel(1,"Chicken Pakoda"))
        arrSubCategory.add(RecipeModel(1,"Masala Dosa"))
        arrSubCategory.add(RecipeModel(1,"Rasmalai"))
        subAdapter.setData(arrSubCategory)


        //Set Adapter to RecyclerView
        main_recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        main_recyclerView.adapter = mainAdapter

        sub_recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        sub_recyclerView.adapter = subAdapter





    }
}