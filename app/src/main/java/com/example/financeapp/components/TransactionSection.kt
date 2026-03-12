package com.example.financeapp.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.example.financeapp.data.Transaction

@Composable
fun TransactionSection(transactions: List<Transaction>) {

    Column(modifier = Modifier.padding(16.dp)) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Text("Transactions", fontWeight = FontWeight.Bold)

            Text("See All")
        }

        Spacer(modifier = Modifier.height(10.dp))

        LazyColumn {

            items(transactions) {

                TransactionItem(it)

                Spacer(modifier = Modifier.height(10.dp))
            }
        }
    }
}