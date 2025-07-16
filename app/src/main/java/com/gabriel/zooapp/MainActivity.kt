package com.gabriel.zooapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import com.gabriel.zooapp.navigation.NavGraph
import com.gabriel.zooapp.ui.theme.ZooAppTheme

@ExperimentalMaterial3Api
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ZooAppTheme {
                NavGraph()
            }
        }
    }
}