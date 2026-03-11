package com.example.financeapp.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight

@Composable
fun Header(userName: String) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Column {

            Text(
                text = "Hola $userName",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )

            Text("Bienvenido")
        }

        Icon(
            imageVector = Icons.Default.Menu,
            contentDescription = "Menu"
        )
    }
}