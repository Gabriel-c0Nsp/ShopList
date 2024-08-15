package com.example.shoplist.MainScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shoplist.R
import java.text.SimpleDateFormat
import java.util.Locale

@Composable
fun ListSection(modifier: Modifier = Modifier) {
    val shoppingLists = testShoppingLists()

    Column(
        modifier = Modifier
            .fillMaxHeight()
            .padding(8.dp)
    ) {
        LazyColumn(
            content = {
                itemsIndexed(shoppingLists) { _, shoppingList: ShoppingLists ->
                    ListsView(shoppingList = shoppingList)
                }
            }
        )
    }
}

@Composable
fun ListsView(shoppingList: ShoppingLists) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(Color(0xFF0076D5))
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = SimpleDateFormat("HH:mm, dd/MM", Locale("pt", "BR")).format(shoppingList.createdAt),
                color = Color(0xFFE2E2E2),
                fontSize = 12.sp,
            )
            Text(
                text = shoppingList.name,
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_mode_edit_outline_24),
                contentDescription = "edit",
                tint = Color.White
            )
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_delete_24),
                contentDescription = "delete",
                tint = Color.White
            )
        }
    }
}