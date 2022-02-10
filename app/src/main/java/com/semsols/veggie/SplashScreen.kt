package com.semsols.veggie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.semsols.veggie.entities.Category
import com.semsols.veggie.interfaces.GetDataService
import com.semsols.veggie.retrofitclient.BaseActivity
import com.semsols.veggie.retrofitclient.RetrofitClientInstance
import kotlinx.android.synthetic.main.activity_splash.*
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class SplashScreen : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        startBtn.setOnClickListener{

            startActivity(Intent(this@SplashScreen,HomeScreen::class.java))
            finish()

        }
    }

    fun getCategories(){

        val service = RetrofitClientInstance.retrofitInstance.create(GetDataService::class.java)
        val call = service.getCategoryList()

        call.enqueue(object : retrofit2.Callback<List<Category>>{
            override fun onResponse(
                call: Call<List<Category>>,
                response: Response<List<Category>>
            ) {

                insertDataToRoomDb(response.body())

            }

            override fun onFailure(call: Call<List<Category>>, t: Throwable) {

                progressBar.visibility = View.INVISIBLE
                Toast.makeText(this@SplashScreen,"Error",Toast.LENGTH_LONG).show()

            }


        })




    }

    private fun insertDataToRoomDb(category: List<Category>?) {
        TODO("Not yet implemented")
    }
}