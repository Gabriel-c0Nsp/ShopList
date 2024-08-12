package com.example.shoplist.MainScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shoplist.R

@Composable
fun ShopListLogoSection(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFF13E3E))
            .height(90.dp)
            .padding(18.dp, top = 20.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // logo aqui
        Image(
            painter = painterResource(R.drawable.logoshoplist),
            contentDescription = null,
            modifier = Modifier.size(42.dp)
        )

        Text(
            text = "ShopList",
            color = Color.White,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(horizontal = 18.dp)
        )
    }
}
