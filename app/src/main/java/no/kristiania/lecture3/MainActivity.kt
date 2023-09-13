package no.kristiania.helloinsets

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            BoxBoxBoxBoxBox()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BoxBoxBoxBoxBox()
{
    var mutableText by remember { mutableStateOf("0") }

    Column(modifier = Modifier.fillMaxHeight(), horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Magenta)
                .weight(2f)
                .height(300.dp),
            contentAlignment = Alignment.Center
        ) {
            Box(modifier = Modifier.background(Color.Blue).size(200.dp))
            Box(modifier = Modifier.background(Color.Red).size(100.dp))

            Box(modifier = Modifier.background(Color.Green).size(100.dp).align(Alignment.TopStart))
            Box(modifier = Modifier.background(Color.Green).size(100.dp).align(Alignment.TopEnd))
            Box(modifier = Modifier.background(Color.Green).size(100.dp).align(Alignment.BottomStart))
            Box(modifier = Modifier.background(Color.Green).size(100.dp).align(Alignment.BottomEnd))

        }

        OutlinedTextField(
            value = mutableText,
            onValueChange = { newText ->
                mutableText = newText
            },
            modifier = Modifier.background(Color.Red)
        )

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Row(horizontalArrangement = Arrangement.Center) {
                Button(onClick = {
                    mutableText = (mutableText.toInt() + 1).toString()
                }) {
                    Text(text = "Increment")
                }
                Spacer(modifier = Modifier.size(12.dp))
                Button(onClick = {
                    mutableText = (mutableText.toInt() - 1).toString()
                }) {
                    Text(text = "Decrement")
                }
            }
        }
    }
}

@Preview
@Composable
fun BoxBoxBoxBoxBoxPreview() {
    BoxBoxBoxBoxBox()
}
