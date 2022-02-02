package com.semsols.veggie.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.semsols.veggie.R
import com.semsols.veggie.entities.RecipeModel
import kotlinx.android.synthetic.main.main_category.view.*

class MainAdapter: RecyclerView.Adapter<MainAdapter.RecipeViewHolder>() {


    //Array for recipes
    var arrMain = ArrayList<RecipeModel>()

    class RecipeViewHolder(view: View): RecyclerView.ViewHolder(view){

    }

    fun setData(arrData: List<RecipeModel>){

        arrMain = arrData as ArrayList<RecipeModel>

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {

        return RecipeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.main_category,parent,false))
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {

        holder.itemView.dish_name.text = arrMain[position].dishName

    }

    override fun getItemCount(): Int {
        return arrMain.size
    }
}