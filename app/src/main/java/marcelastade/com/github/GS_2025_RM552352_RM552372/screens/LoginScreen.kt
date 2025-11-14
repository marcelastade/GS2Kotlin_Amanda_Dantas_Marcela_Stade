package marcelastade.com.github.GS_2025_RM552352_RM552372.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import marcelastade.com.github.GS_2025_RM552352_RM552372.R

@Composable
fun LoginScreen(modifier: Modifier = Modifier, navController: NavController) {

    var usuario by remember { mutableStateOf("") }
    var senha by remember { mutableStateOf("") }
    var erro by remember { mutableStateOf("") }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.grey))
            .padding(32.dp)
    ) {

        Text(
            text = "LOGIN",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = (colorResource(id = R.color.blue))
        )

        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(top = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            TextField(
                value = usuario,
                onValueChange = { usuario = it },
                label = { Text("Usuário") },
                singleLine = true,
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White
                )

            )

            Spacer(modifier = Modifier.height(16.dp))

            TextField(
                value = senha,
                onValueChange = { senha = it },
                label = { Text("Senha") },
                singleLine = true,
                visualTransformation = PasswordVisualTransformation(),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White
                )

            )

            Spacer(modifier = Modifier.height(25.dp))

            Button(
                onClick = {
                    if (usuario == "admin" && senha == "123456") {
                        erro = ""
                        navController.navigate("menu")
                    } else {
                        erro = "Usuário inválido!"
                    }
                },
                modifier = Modifier.width(170.dp)
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(colorResource(id = R.color.blue))
            ) {
                Text(
                    text = "ENTRAR",
                    fontSize = 20.sp,
                    color = Color.White
                )
            }

            if (erro.isNotEmpty()) {
                Spacer(modifier = Modifier.height(12.dp))
                Text(
                    text = erro,
                    color = (colorResource(id = R.color.vermelho_fiap)),
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}
