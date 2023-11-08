package com.example.myfirstapp2

import androidx.lifecycle.ViewModel

class MyViewModel(private val myRepository: MyRepository) : ViewModel() {
    // Ajoutez ici les fonctions et les données nécessaires pour la logique de votre interface utilisateur

    fun getSomeData(): List<String> {
        return myRepository.getData() // Utilisation de MyRepository pour obtenir des données
    }


}
