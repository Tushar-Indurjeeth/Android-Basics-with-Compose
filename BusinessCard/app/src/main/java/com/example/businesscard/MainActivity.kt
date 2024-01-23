package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    Column (
        modifier = Modifier.padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Name()
        UserInfo()
    }
}

@Composable
fun Name() {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(bottom = 50.dp)
    ) {
        Image(
            painter = painterResource(
                id = R.drawable.illust_108538996_20230531_132743
            ),
            contentDescription = null,
            Modifier.width(200.dp)
        )
        
        Text(
            text = stringResource(R.string.name),
            fontSize = 35.sp
        )
        Text(
            text = stringResource(R.string.title),
            fontSize = 20.sp
        )
    }
}

@Composable
fun UserInfo() {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Row (
            horizontalArrangement = Arrangement.Center,
            verticalAlignment =  Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Rounded.Email,
                contentDescription = "email",
            )
            Spacer(modifier = Modifier.width(6.dp))

            Text(
                text = stringResource(R.string.email),
                fontSize = 15.sp
            )
        }

        Row (
            horizontalArrangement = Arrangement.Center,
            verticalAlignment =  Alignment.CenterVertically
        ) {
            Icon(
                Icons.Rounded.Info,
                contentDescription = "personal website",
            )
            Spacer(modifier = Modifier.width(6.dp))

            Text(
                text = stringResource(R.string.website),
                fontSize = 15.sp
                )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}