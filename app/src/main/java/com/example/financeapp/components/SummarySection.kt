package com.example.financeapp.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.financeapp.data.SummaryCard

@Composable
fun SummarySection(cards: List<SummaryCard>) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .height(160.dp)
    ) {

        // Tarjeta grande izquierda
        Card(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(cards[0].color)
        ) {

            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {

                Column(horizontalAlignment = Alignment.CenterHorizontally) {

                    Text(
                        text = "Actividad",
                        fontWeight = FontWeight.Bold
                    )

                    Text("de la Semana")
                }
            }
        }

        Spacer(modifier = Modifier.width(12.dp))

        // Columna derecha
        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
        ) {

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(cards[1].color)
            ) {

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(12.dp),
                    verticalArrangement = Arrangement.Center
                ) {

                    Text("Ventas")

                    Text(
                        "$${cards[1].amount}",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(cards[2].color)
            ) {

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(12.dp),
                    verticalArrangement = Arrangement.Center
                ) {

                    Text("Ganancias")

                    Text(
                        "$${cards[2].amount}",
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}