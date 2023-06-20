package com.manzil.rendezvous

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.manzil.rendezvous.ui.theme.RendezvousTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RendezvousTheme {
              //  Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background)
                    SignUpScreen()
            }
        }
    }
}

@Composable
fun SignUpScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Sign Up")

        Spacer(modifier = Modifier.height(16.dp))
        // Username text field

        Spacer(modifier = Modifier.height(16.dp))
        // Password text field

        Spacer(modifier = Modifier.height(16.dp))
        // Sign up button
    }
}

@Preview(showBackground = true)
@Composable
fun SignUpScreenPreview() {
    RendezvousTheme {
        SignUpScreen()
    }
}
