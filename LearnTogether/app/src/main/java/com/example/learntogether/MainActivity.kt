package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LernTogether(
                        stringResource(R.string.titre),
                        stringResource(R.string.introduction),
                        stringResource(R.string.developpement)
                    )
                }
            }
        }
    }
}

@Composable
fun LernTogether(titre: String, textIntrocution: String, textDeveleppement: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)

    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        //pour l'image
        Image(
            painter = image,
            contentDescription = "image de font"
        )
        //premier compassable: le titre
        Text(
            text = titre,
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )

        //deuxieme compassable: l'introduction
        Text(
            text = textIntrocution,
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        //troisieme compassable: le developpement
        Text(
            text = textDeveleppement,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun LernTogetherPreview() {
    LearnTogetherTheme {
        LernTogether(
            stringResource(R.string.titre),
            stringResource(R.string.introduction),
            stringResource(R.string.developpement)
        )
    }
}