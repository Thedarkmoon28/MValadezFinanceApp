package com.example.financeapp.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.example.financeapp.data.Transaction

@Composable
fun TransactionItem(transaction: Transaction) {

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Row(verticalAlignment = Alignment.CenterVertically) {

                Icon(
                    imageVector = Icons.Default.ShoppingCart,
                    contentDescription = null
                )

                Spacer(modifier = Modifier.width(10.dp))

                Column {

                    Text(
                        transaction.place,
                        fontWeight = FontWeight.Bold
                    )

                    Text(transaction.category)
                }
            }

            Column(horizontalAlignment = Alignment.End) {

                Text("$${transaction.amount}")

                Text(transaction.time)
            }
        }
    }
}