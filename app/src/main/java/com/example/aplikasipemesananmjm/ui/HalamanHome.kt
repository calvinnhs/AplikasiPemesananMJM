package com.example.aplikasipemesananmjm.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aplikasipemesananmjm.R
import com.example.aplikasipemesananmjm.ui.theme.AplikasiPemesananMJMTheme

@Composable
fun HalamanHome(
    oneNextButtonClicked: () -> Unit
) {
    Column(modifier = Modifier, verticalArrangement = Arrangement.Center) {
        OutlinedCard(
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
            border = BorderStroke(1.dp, Color.Black),
            modifier = Modifier
                .fillMaxWidth(0.95f)
                .padding(vertical = 50.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Text(
                    text = "Selamat Datang Di Warmindo MJM",
                    color = Color.DarkGray,
                    fontSize = 20.sp,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(dimensionResource(id = R.dimen.padding_medium))
                    .weight(1f, false),
                horizontalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_medium)),
                verticalAlignment = Alignment.Bottom

            ) {
                Button(
                    onClick = oneNextButtonClicked,
                    modifier = Modifier.weight(1f)
                ) {
                    Text(stringResource(R.string.next))
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewHalamanUtama() {
    AplikasiPemesananMJMTheme {
        HalamanHome(
            oneNextButtonClicked = {}
        )
    }
}