package com.serpantin.myrecyclerviewapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cityNameList:List<City> = listOf(
            City("Москва", 12655050),
            City("Самара", 1144000),
            City("Казань", 1257000),
            City("Челябинск", 1187000),
            City("Омск", 1139000),
            City("Уфа", 1125000),
            City("Пермь", 1049000),
            City("Волгоград", 1004000),
            City("Саратов", 830000),
            City("Тюмень", 816000)
        )

        val cityRecyclerView: RecyclerView = findViewById(R.id.city_recycler_view)
        cityRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        cityRecyclerView.adapter = CityAdapter(cityNameList)

    }
}