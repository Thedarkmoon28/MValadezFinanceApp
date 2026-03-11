package com.example.financeapp.data

data class Transaction(
    val place: String,
    val category: String,
    val amount: Double,
    val time: String
)