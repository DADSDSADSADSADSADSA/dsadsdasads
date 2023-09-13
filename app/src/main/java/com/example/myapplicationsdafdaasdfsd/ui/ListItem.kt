package com.example.myapplicationsdafdaasdfsd.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplicationsdafdaasdfsd.data.NameEntity

@Composable
fun ListItem(
    item: NameEntity,
    onClick: (NameEntity) -> Unit,
    delete: (NameEntity) -> Unit
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                onClick(item)
            }
            .absolutePadding(left=15.dp, right=15.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(android.graphics.Color.parseColor("#2e2e2e")))
                ,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                item.name,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .absolutePadding(left=10.dp, top=15.dp),
                color = Color(android.graphics.Color.parseColor("#c9c9c9")),
                fontSize = 20.sp
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(android.graphics.Color.parseColor("#2e2e2e"))),
            verticalAlignment = Alignment.CenterVertically
        )
        {
            Text(
                "7 сентября",
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .absolutePadding(left=10.dp, bottom=15.dp),
                color = Color(android.graphics.Color.parseColor("#a9a9a9"))
            )
        }
    }
}