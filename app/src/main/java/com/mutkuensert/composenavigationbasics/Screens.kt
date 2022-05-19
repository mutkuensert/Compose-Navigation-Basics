package com.mutkuensert.composenavigationbasics

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun FirstScreen(navController: NavController){
    MyColumn{
        Text(text = "First Screen")

        Spacer(modifier = Modifier.height(15.dp))

        Button(onClick = { navController.navigate("SecondScreen") }) {
            Text(text = "To second screen")
        }
    }
}

@Composable
fun SecondScreen(navController: NavController){
    MyColumn{
        Text(text = "Second Screen")

        Spacer(modifier = Modifier.height(15.dp))

        Button(onClick = { navController.navigate("ThirdScreen"){popUpTo("FirstScreen")} }) {
            Text(text = "To third screen")
        }
    }
}

@Composable
fun ThirdScreen(navController: NavController){
    MyColumn{
        Text(text = "Third Screen")

        Spacer(modifier = Modifier.height(15.dp))

        Button(onClick = { navController.navigate("FirstScreen") }) {
            Text(text = "To first screen")
        }
    }
}