package marcelastade.com.github.GS_2025_RM552352_RM552372.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import marcelastade.com.github.GS_2025_RM552352_RM552372.R

@Composable
fun EquipeScreen(modifier: Modifier = Modifier, navController: NavController) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.grey))
            .padding(32.dp)
    ) {

        Text(
            text = "EQUIPE",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = (colorResource(id = R.color.pink))
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(32.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = androidx.compose.foundation.layout.Arrangement.Center
        ) {

            Text(
                text = "Amanda Dantas de Souza",
                fontSize = 22.sp,
                color = (colorResource(id = R.color.vermelho_fiap)),
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Text(
                text = "552352",
                fontSize = 22.sp,
                color = (colorResource(id = R.color.vermelho_fiap)),
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(bottom = 20.dp)
            )

            Text(
                text = "Marcela Stade Carvalho",
                fontSize = 22.sp,
                color = (colorResource(id = R.color.vermelho_fiap)),
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Text(
                text = "552372",
                fontSize = 22.sp,
                color = (colorResource(id = R.color.vermelho_fiap)),
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(bottom = 24.dp)
            )

            Button(
                onClick = { navController.navigate("menu") },
                colors = ButtonDefaults.buttonColors(colorResource(id = R.color.pink)),
                modifier = Modifier.size(width = 200.dp, height = 60.dp)
            ) {
                Text(
                    text = "Voltar",
                    fontSize = 20.sp,
                    color = Color.White
                )
            }
        }
    }
}
