package com.dreamwalker.myjetpackcomposeapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.imageFromResource
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.dreamwalker.myjetpackcomposeapp.ui.MyJetpackComposeAppTheme


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column() {
                Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                        .height(200.dp)
                        .border(
                            border = BorderStroke(
                                width = 1.dp,
                                color = Color.Black
                            )
                        )
                ) {
                    Text(
                        text = "ITEM1",
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
                }

                Row(
                    modifier = Modifier.fillMaxWidth()
                        .height(200.dp)
                        .width(200.dp)
                        .border(
                            border = BorderStroke(
                                width = 1.dp,
                                color = Color.Black
                            )
                        )
                ) {
                    Text(
                        text = "ITEM1",
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                }

                ScrollableColumn(
                    modifier = Modifier.background(
                        color = Color(0xFFFAFAFA)
                    ).fillMaxSize()
                ) {

                    Image(
                        bitmap = imageFromResource(
                            res = resources,
                            resId = R.drawable.happy_meal_small
                        ),
                        modifier = androidx.compose.ui.Modifier.height(100.dp)
                    )
                    Column(
                        modifier = androidx.compose.ui.Modifier.padding(16.dp)
                    ) {

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ){
                            androidx.compose.material.Text(
                                text = "Happy Meal",
                                style = TextStyle(
                                    fontSize = TextUnit.Companion.Sp(26)
                                )
                            )
                            androidx.compose.material.Text(
                                text = "$ 5.99",
                                style = TextStyle(
                                    color = Color(0xFF85bb65)
                                )
                            )
                        }

                        Spacer(modifier = androidx.compose.ui.Modifier.padding(top = 10.dp))
                        androidx.compose.material.Text(text = "800 Calories")
                        Spacer(modifier = androidx.compose.ui.Modifier.padding(top = 24.dp))
                        Button(onClick = { /*TODO*/ },
                        modifier = Modifier.align(Alignment.CenterHorizontally)) {
                            Text(text = "ORDER NOW")

                        }


                    }


                }

            }


        }

//        setContent {
//
//
//        }
    }
}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyJetpackComposeAppTheme {
        Greeting("Android")
    }
}