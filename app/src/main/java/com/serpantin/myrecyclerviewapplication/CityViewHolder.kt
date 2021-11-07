package com.serpantin.myrecyclerviewapplication

import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import java.nio.file.Files.size

class CityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(cityName: City) {
        val cityNameTextView: TextView = itemView.findViewById(R.id.city_name_view)
        val citySizeTextView: TextView = itemView.findViewById(R.id.city_size_view)
        cityNameTextView.text = cityName.name
        val citySizeFormatter = "${cityName.size} чел."
        citySizeTextView.text = citySizeFormatter

        val cityButtonToast:Button = itemView.findViewById(R.id.city_button_toast)
        cityButtonToast.setOnClickListener {
            Toast.makeText(itemView.context, citySizeFormatter, Toast.LENGTH_LONG).show()
        }

    }
}