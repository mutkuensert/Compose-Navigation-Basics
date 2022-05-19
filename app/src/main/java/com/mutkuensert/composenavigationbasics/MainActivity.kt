package com.mutkuensert.composenavigationbasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mutkuensert.composenavigationbasics.ui.theme.ComposeNavigationBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val navController = rememberNavController()
            
            ComposeNavigationBasicsTheme {
                
                NavHost(navController = navController, startDestination = "FirstScreen" ){
                    composable("FirstScreen"){ FirstScreen(navController = navController)}
                    composable("SecondScreen"){ SecondScreen(navController = navController)}
                    composable("ThirdScreen"){ ThirdScreen(navController = navController)}
                }
                
            }
        }
    }
}