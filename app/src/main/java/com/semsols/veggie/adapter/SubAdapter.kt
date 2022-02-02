package com.semsols.veggie.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.semsols.veggie.R
import com.semsols.veggie.entities.RecipeModel
import kotlinx.android.synthetic.main.main_category.view.*

class SubAdapter: RecyclerView.Adapter<SubAdapter.RecipeViewHolder>() {


    //Array for recipes
    var arrSub = ArrayList<RecipeModel>()

    class RecipeViewHolder(view: View): RecyclerView.ViewHolder(view){

    }

    fun setData(arrData: List<RecipeModel>){

        arrSub = arrData as ArrayList<RecipeModel>

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {

        return RecipeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.sub_category,parent,false))
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {

        holder.itemView.dish_name.text = arrSub[position].dishName

    }

    override fun getItemCount(): Int {
        return arrSub.size
    }
}