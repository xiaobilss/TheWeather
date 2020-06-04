package com.theweather.android.logic

import androidx.lifecycle.liveData
import com.theweather.android.logic.model.Place
import com.theweather.android.logic.network.SunnyWeatherNetwork
import kotlinx.coroutines.Dispatchers
import java.lang.Exception
import java.lang.RuntimeException

object Repository {
    fun searchPlaces(query:String) = liveData(Dispatchers.IO){
        val result= try {
            val placeRespose = SunnyWeatherNetwork.searchPlaces(query)
            if (placeRespose.status == "Ok"){
                val place = placeRespose.places
                Result.success(place)
            }else{
                Result.failure(RuntimeException("response status is ${placeRespose.status}"))
            }
        }catch (e:Exception){
            Result.failure<List<Place>>(e)
        }
        emit(result as Result<List<Place>>)
    }

}