package com.uvg.labfinalplats

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.uvg.labfinalplats.presentation.navigation.AppNavigation
import com.uvg.labfinalplats.ui.theme.LabFinalPlatsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController= rememberNavController()
            LabFinalPlatsTheme {
                Scaffold(modifier = Modifier.fillMaxSize().safeDrawingPadding()) { innerPadding ->
                    AppNavigation(
                        navController = navController,
                        modifier =Modifier.fillMaxSize().safeDrawingPadding().padding(innerPadding)
                    )
                }
            }
        }
    }
}

