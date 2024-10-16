package com.example.creditcardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.creditcardapp.ui.theme.CreditCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CreditCardAppTheme {
                DisplayCards()
            }
        }
    }
}
@Composable
fun DisplayCards(){
    val cards = listOf(
        CardInfo("1234 5678 9012 3456", "John Doe"
            ,R.drawable.visa, R.drawable.cardback2),

        CardInfo("2345 6789 0123 4567", "Jane Smith",
            R.drawable.mastercard, R.drawable.cardback1),

        CardInfo("3456 7890 1234 5678", "Bob Johnson"
            , R.drawable.visa,R.drawable.cardback4),

        CardInfo("8587 8685 7659 6323", "João Pedro"
            , R.drawable.mastercard,R.drawable.cardback3),

        CardInfo("9876 5432 1098 7654", "Maria Santos"
        , R.drawable.visa,R.drawable.cardback2),

        CardInfo("4321 0987 6543 2109", "Carlos Oliveira"
        , R.drawable.mastercard,R.drawable.cardback1))


    LazyColumn (modifier = Modifier.fillMaxSize()) {
        items(cards) { card ->
            CreditCardApp(cardInfo = card)
        }
    }
}
