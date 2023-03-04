package com.example.scudassesment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.scudassesment.ui.theme.ScudAssesmentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScudAssesmentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun ScudScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        TopSection()
    }    
}

@Composable
fun TopSection() {
    Row(Modifier.fillMaxWidth()) {
        //Icon(painter = Icon, contentDescription = )
        
        Text(
            text = "Incentives",
            fontSize = 16.sp,
        )
    }
}

@Composable
fun Complete() {
    Row(Modifier.fillMaxWidth()) {

      //Icon(painter = R.drawable., contentDescription = )

        Text(
            text =R.string.complete_String ,

        )
    }
}

@Composable
fun TripsSection(text1: String = "", text2: String = "" ) {
    Column() {
        Row(
            Modifier
                .width(246.dp)
                .padding(start = 15.dp, end = 14.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = text1
            )
            Text(text = text2)

        }
    }
}

@Composable
fun CompletedTrips() {
    Column(
        modifier = Modifier.padding(start = 15.dp, end = 14.dp)
    ) {
        Column() {
            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "complete 25 trips in 7 days to earn N1000"
                )
                Text(
                    text = "5 Days left"
                )
            }
            Column() {
                Row(modifier = Modifier.fillMaxSize()) {
                    Text(
                        text = "complete 40 trips in 7 days to earn N1000"
                    )
                    Text(
                        text = "5 Days left"
                    )
                }
                Column() {
                    Row(modifier = Modifier.fillMaxSize()) {
                        Text(
                            text = "complete 25 trips in 7 days to earn N1000"
                        )
                        Text(
                            text = "5 Days left"
                        )
                    }

                }

            }

        }


    }
}

@Preview
@Composable
fun CompletedTripsPrev() {
    CompletedTrips()

}