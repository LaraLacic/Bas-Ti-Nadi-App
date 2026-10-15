package com.example.bastinadiapp.ui.theme

import android.media.Image
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxColors
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.bastinadiapp.R
import com.example.bastinadiapp.Routes
import java.time.format.TextStyle

@Composable
fun TripScreen(
    navigation : NavController
){
    var attraction by remember { mutableStateOf(listOf<Pair<String, String>>())}
    var checkedAttraction by remember { mutableStateOf(setOf<String>()) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Brush.verticalGradient(listOf(Color(0xFF0D1B2A), Color(0xFF1B263B))))
    ) {
        ReturnBar(navigation, coverImage = R.drawable.manhattan__nyc)
        ScreenTitle("Pin places you want to visit!")
        AddButton(iconResource = R.drawable.ic_plus, text = "Add attraction") { name, city ->
            attraction = attraction + (name to city)
        }
        LazyColumn(modifier = Modifier
            .padding(top = 16.dp)
        ) {
            items(attraction) { (name, city) ->
                var checked by remember { mutableStateOf(false) }
                Row(
                    modifier = Modifier.fillMaxWidth().padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Checkbox(
                        checked = checked,
                        onCheckedChange = {
                            checked = it
                            if (it) checkedAttraction = checkedAttraction + "$name - $city"
                            else checkedAttraction = checkedAttraction - "$name - $city"
                        },
                        colors = CheckboxDefaults.colors(checkmarkColor = Color.White),
                    )
                    Text(
                        text = "$name - $city",
                        color = Color.White,
                        textDecoration = if (checked) TextDecoration.LineThrough else TextDecoration.None,
                        modifier = Modifier.padding(start = 8.dp)
                    )
                }
            }
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddButton(
    @DrawableRes iconResource: Int,
    text: String,
    color: Color = Color.Cyan,
    elevation: ButtonElevation? =
        ButtonDefaults.buttonElevation(defaultElevation = 12.dp),
    onAttractionAdded: (String, String) -> Unit
) {
    var showDialog by remember { mutableStateOf(false)}
    var attractionName by remember {mutableStateOf("")}
    var cityName by remember {mutableStateOf("")}

    Button(
        contentPadding = PaddingValues(),
        elevation = elevation,
        onClick = { showDialog = true },
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1B263B),
            contentColor = color),
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier
            .padding(30.dp)
            .width(145.dp)
            .height(38.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(painter = painterResource(id = iconResource), contentDescription = null, tint = Color.White)
            Spacer(modifier = Modifier.width(8.dp))
            Text(text, color = Color.White)
        }
    }

    if(showDialog){
        AlertDialog(
            onDismissRequest = {showDialog = false},
            title = {Text("Add new attraction", color = Color.White)},
            text = {
                Column {
                    TextField(
                        value = attractionName,
                        onValueChange = { attractionName = it },
                        label = { Text("Attraction name", color = Color.White)}
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    TextField(
                        value = cityName,
                        onValueChange = { cityName = it },
                        label = { Text("City name", color = Color.White) }
                    )
                }
            },
            confirmButton = {
                Button(
                    onClick = {
                        if (attractionName.isNotBlank() && cityName.isNotBlank()) {
                            onAttractionAdded(attractionName, cityName)
                            attractionName = ""
                            cityName = ""
                            showDialog = false
                        }
                    }
                ) {
                    Text("Add", color = Color.White)
                }
            },
            dismissButton = {
                Button(onClick = { showDialog = false }) {
                    Text("Cancel", color = Color.White)
                }
            },
            containerColor = Color(0xFF1B263B)
        )
    }
}

@Composable
fun ReturnBar(
    navigation: NavController,
    coverImage: Int
) {
    Box(
        modifier = Modifier
            .height(300.dp)
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = coverImage),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
        )
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxHeight()
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .statusBarsPadding()
                    .height(56.dp)
                    .padding(horizontal = 16.dp)
            ) {
                CircularButton(R.drawable.ic_arrow_back){
                    navigation.navigate(Routes.HOME_SCREEN)
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.Transparent
                            ),
                            startY = 100f
                        )
                    )
            )
        }
    }
}