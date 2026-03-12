package com.example.financeapp.ui

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.financeapp.data.*
import com.example.financeapp.components.*

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

    val user = User("Juan", 1200.0)

    val cards = listOf(
        SummaryCard("Actividad",0.0, Color(0xFFDCEAE5)),
        SummaryCard("Ventas",280.99, Color(0xFFEADCCF)),
        SummaryCard("Ganancias",280.99, Color(0xFFDCD8EE))
    )

    val transactions = listOf(
        Transaction("Supermarket","Groceries",45.99,"10:30 AM"),
        Transaction("Gas Station","Fuel",-30.5,"12:15 PM"),
        Transaction("Coffee Shop","Food & Drinks",5.75,"8:00 AM"),
        Transaction("Electronics Store","Electronics",120.0,"3:45 PM"),
        Transaction("Book Store","Books",15.0,"1:20 PM"),
        Transaction("Restaurant","Dining",32.5,"7:30 PM")
    )

    Column(modifier = modifier) {

        Header(user.name)

        SummarySection(cards)

        TransactionSection(transactions)
    }
}