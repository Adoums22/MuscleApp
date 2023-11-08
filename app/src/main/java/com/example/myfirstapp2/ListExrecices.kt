package com.example.myfirstapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myfirstapp2.adapter.CustomAdapter
import com.example.myfirstapp2.model.exercices

class ListExrecices : AppCompatActivity() {
    private val itemsList = mutableListOf<exercices>()
    private lateinit var customAdapter: CustomAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_exrecices)

        val firstName = intent.getStringExtra("first_name")
        val lastName = intent.getStringExtra("last_name")
        val fullname = "$firstName $lastName"
        val textViewFullName = findViewById<TextView>(R.id.textViewFullName)
        textViewFullName.text = fullname

        recyclerView = findViewById(R.id.recycler_view)
        customAdapter = CustomAdapter(itemsList)
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = customAdapter

        // Create exercices and add them to the list
        val exercices1 = exercices("Incline Hammer Curls", "beginner", "dumbbell")
        val exercices2 = exercices("Wide-grip barbell curl", "intermediate", "dumbbell")
        val exercices3 = exercices("Hammer Curls", "beginner", "dumbbell")
        val exercices4 = exercices("EZ-Bar Curl", "beginner", "dumbbell")
        val exercices5 = exercices("Zottman Curl", "expert", "dumbbell")

        itemsList.add(exercices1)
        itemsList.add(exercices2)
        itemsList.add(exercices3)
        itemsList.add(exercices4)
        itemsList.add(exercices5)

        // Log pour afficher le contenu de la liste
        for (exercice in itemsList) {
            Log.d("ListExrecices", "Exercice: ${exercice.name}, Difficulty: ${exercice.difficulty}, Equipment: ${exercice.equipment}")
        }

        // Notify the adapter to update the RecyclerView
        customAdapter.notifyDataSetChanged()
    }
}
