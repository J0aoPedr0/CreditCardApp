package com.example.creditcardapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CreditCardApp(cardInfo: CardInfo){
    Card(modifier = Modifier
        .padding(top = 24.dp, start = 20.dp, end = 20.dp)
        .height(200.dp),
        shape = RoundedCornerShape(18.dp),
        elevation = CardDefaults.cardElevation(24.dp))
    {
        Box() {
            Image(
                painter = painterResource(id = cardInfo.backGroundImage),
                contentDescription = "BackGroundImage",
                contentScale = ContentScale.Crop
            )

            Box(modifier = Modifier
                .fillMaxSize()) {
                Image(
                    painter = painterResource(id = cardInfo.providerImage),
                    contentDescription = "ImageBank",
                    modifier = Modifier
                        .padding(16.dp)
                        .align(Alignment.TopEnd)
                        .width(86.dp)
                )


                Column(modifier = Modifier.padding(16.dp)
                    .align(Alignment.BottomStart)) {
                    Text(text = cardInfo.cardNumber,
                        color = Color.Black,
                        letterSpacing = 1.2.sp,
                        fontStyle = FontStyle.Italic
                    )
                    Text(text = cardInfo.cardHolder,
                        color = Color.Black,
                        letterSpacing = 1.2.sp,
                        fontStyle = FontStyle.Italic)
                }
            }
        }
    }
}
