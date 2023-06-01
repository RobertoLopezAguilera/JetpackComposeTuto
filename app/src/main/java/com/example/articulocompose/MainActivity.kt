package com.example.articulocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.articulocompose.ui.theme.ArticuloComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArticuloComposeTheme {
               praCompose()
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun praCompose() {
    pantallaPrinci(modifier = Modifier
        .fillMaxSize()
        .wrapContentHeight(Alignment.Top)
    )

}

@Composable
fun pantallaPrinci(modifier: Modifier=Modifier){

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(R.drawable.bg_compose_background),
            contentDescription = null)
        Text(
            stringResource(R.string.titulo),
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
            )
        Text(
            stringResource(R.string.subtitulo),
            textAlign = TextAlign.Justify,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            stringResource(R.string.texto),
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
    }
}