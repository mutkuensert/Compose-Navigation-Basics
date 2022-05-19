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
    Column(modifier = Modifier.fillMaxSize()){
        Button(onClick = { /*TODO*/ }) {
            Text(text = "To second screen")
        }
    }
}

@Composable
fun SecondScreen(navController: NavController){
    val (text, setText) = remember {mutableStateOf("Text")}

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){

        OutlinedTextField(value = text, onValueChange = setText)
        
        Spacer(modifier = Modifier.height(15.dp))

        Button(onClick = { /*TODO*/ }) {
            Text(text = "To third screen")
        }
    }
}

@Composable
fun ThirdScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "Text")

        Button(onClick = { /*TODO*/ }) {
            Text(text = "To first screen")
        }
    }
}