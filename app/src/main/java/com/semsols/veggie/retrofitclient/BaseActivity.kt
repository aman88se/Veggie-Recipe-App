package com.semsols.veggie.retrofitclient

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.semsols.veggie.entities.Category
import com.semsols.veggie.interfaces.GetDataService
import com.semsols.veggie.retrofitclient.RetrofitClientInstance
import kotlinx.android.synthetic.main.activity_splash.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback
import kotlin.coroutines.CoroutineContext

open class BaseActivity : AppCompatActivity(),CoroutineScope {

    private lateinit var job: Job
    override val coroutineContext: CoroutineContext
    get() = job+Dispatchers.Main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        job = Job()
    }

    override fun onDestroy() {
        super.onDestroy()
        job.cancel()
    }

}