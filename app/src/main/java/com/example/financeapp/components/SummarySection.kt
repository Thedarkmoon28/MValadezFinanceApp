package com.example.financeapp.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.example.financeapp.data.SummaryCard

@Composable
fun SummarySection(cards: List<SummaryCard>) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {

        Card(
            modifier = Modifier
                .weight(1f)
                .height(140.dp),
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(cards[0].color)
        ) {

            Box(contentAlignment = Alignment.Center) {

                Column(horizontalAlignment = Alignment.CenterHorizontally) {

                    Text("Actividad", fontWeight = FontWeight.Bold)
                    Text("de la Semana")
                }
            }
        }

        Spacer(modifier = Modifier.width(10.dp))

        Column(modifier = Modifier.weight(1f)) {

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(65.dp),
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(cards[1].color)
            ) {

                Column(modifier = Modifier.padding(12.dp)) {

                    Text("Ventas")
                    Text("$${cards[1].amount}")
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(65.dp),
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(cards[2].color)
            ) {

                Column(modifier = Modifier.padding(12.dp)) {

                    Text("Ganancias")
                    Text("$${cards[2].amount}")
                }
            }
        }
    }
}