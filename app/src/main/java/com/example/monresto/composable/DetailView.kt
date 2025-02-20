package com.example.monresto.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.monresto.data.DataService
import com.example.monresto.model.Article
import com.example.monresto.ui.theme.MonRestoTheme

@Composable
fun DetailView(article: Article, btnTitle: String, onClick: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = article.name, style = MaterialTheme.typography.titleMedium)
        Image(
            painter = painterResource(id = article.image),
            contentDescription = null
        )
        Button(onClick = onClick ) {
            Text(text = btnTitle)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DetailPreview() {
    MonRestoTheme() {
        DetailView(article = DataService().burger, btnTitle = "Suivant", onClick = {})
    }
}
