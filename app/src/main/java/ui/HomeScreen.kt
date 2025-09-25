package cl.duoc.appduoc

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api:: class)
@Composable
fun HomeScreen(){
    Scaffold (
        topBar = {
            TopAppBar(title = { Text(text = "Mi aplicacion Duoc") })
        }
    ){ innerPadding ->
        Column (
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ){
            Text(text= "Bienvenido")
            Button(onClick = { /*1000*/}) {
                Text(text = "PRESS ME")
            }
            Image(painter = painterResource(id = R.drawable.duoc2), contentDescription = "Logo Duoc",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.Fit
            )
        }

    }
}


