package com.star.tipapp.widgets

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun RoundIconButton(
    modifier: Modifier = Modifier,
    imageVector: ImageVector,
    onClick: () -> Unit,
    tint : Color = Color.Black.copy(alpha = 0.8f),
    backgroundColor : Color = MaterialTheme.colors.onBackground,
    elevation : Dp = 4.dp
) {
    
    Card(modifier = modifier.padding(4.dp).clickable { onClick.invoke() }.then()) {

    }
    
}