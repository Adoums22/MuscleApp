package com.example.myfirstapp2

class MyRepository {
    private val data: List<String> = listOf("Item 1", "Item 2", "Item 3")

    fun getData(): List<String> {
        return data
    }
}
