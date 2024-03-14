package com.mike.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Loginscreen(navController: NavController){
    var email by remember{ mutableStateOf("") }
    var password by remember{ mutableStateOf("") }


    Column(modifier = Modifier
       .verticalScroll(rememberScrollState())
       .background(Color.Black)
       .fillMaxSize(),
       verticalArrangement = Arrangement.SpaceBetween) {
       Box(modifier = Modifier
           .height(200.dp)
           .fillMaxWidth(),
           contentAlignment = Alignment.Center){
           Box(modifier = Modifier
               .background(
                   Color.White,
                   shape = RoundedCornerShape(topStart = 20.dp, 0.dp, 20.dp, 20.dp)
               )
               .size(100.dp),
               contentAlignment = Alignment.Center){
               Box(modifier = Modifier
                   .background(
                       Color.Black,
                       shape = RoundedCornerShape(topStart = 25.dp, 25.dp, 25.dp, 0.dp)
                   )
                   .size(50.dp))

           }
       }

       Column(modifier = Modifier
           .background(Color.White, shape = RoundedCornerShape(topStart = 70.dp))
           .height(750.dp)
           .fillMaxWidth(),

           ){
           Spacer(modifier = Modifier.height(50.dp))
           Row (modifier = Modifier
               .height(100.dp)
               .fillMaxWidth(),
               verticalAlignment = Alignment.CenterVertically,
               horizontalArrangement = Arrangement.Center){
                Text(text = "Login",
                    style = TextStyle(),
                    fontSize = 30.sp,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = FontFamily.Monospace,
                    color = Color.Black
                )
           }
           Spacer(modifier = Modifier.height(50.dp))
           Column (modifier = Modifier

               .background(Color(0xfffafafa))
               .height(160.dp)
               .fillMaxWidth(),
               horizontalAlignment = Alignment.CenterHorizontally,
               verticalArrangement = Arrangement.SpaceBetween){
               OutlinedTextField(
                   value = email,
                   onValueChange = { email = it },
                   label = { Text("Email", style = TextStyle(),
                       fontFamily = FontFamily.Monospace,
                       fontWeight = FontWeight.SemiBold,
                       fontSize = 15.sp,
                       color = Color.Black
                  ) },
                   modifier = Modifier
                       .width(350.dp),
                   shape = RoundedCornerShape(10.dp),
                   colors = TextFieldDefaults.colors(
                       focusedTextColor = Color.Black,
                       unfocusedTextColor = Color.Black,
                       focusedContainerColor = Color.White,
                       unfocusedContainerColor = Color.White,
                       unfocusedLabelColor = Color.Black,
                       focusedIndicatorColor = Color.Black,
                       unfocusedIndicatorColor = Color.Transparent,


                   ),


               )
               OutlinedTextField(
                   value = password,
                   onValueChange = { password = it },
                   label = { Text("Password", style = TextStyle(),
                       fontFamily = FontFamily.Monospace,
                       fontWeight = FontWeight.SemiBold,
                       fontSize = 15.sp,
                       color = Color.Black
                   ) },
                   modifier = Modifier
                       .width(350.dp),
                   shape = RoundedCornerShape(10.dp),
                   colors = TextFieldDefaults.colors(
                       focusedTextColor = Color.Black,
                       unfocusedTextColor = Color.Black,
                       focusedContainerColor = Color.White,
                       unfocusedContainerColor = Color.White,
                       unfocusedLabelColor = Color.Black,
                       focusedIndicatorColor = Color.Black,
                       unfocusedIndicatorColor = Color.Transparent,

                       ),


                   )
           }

Spacer(modifier = Modifier.height(30.dp))
           Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
               Button(onClick = { navController.navigate("signup") },
                   modifier = Modifier
                       .height(50.dp)
                       .width(350.dp),

                   shape = RoundedCornerShape(10.dp,0.dp,10.dp,10.dp)


                   ,colors = ButtonDefaults.buttonColors(Color.Black)) {
                   Text(text = "Login", style = TextStyle(),
                       fontFamily = FontFamily.Monospace,
                       fontWeight = FontWeight.SemiBold,
                       fontSize = 15.sp,
                       color = Color.White)


                   
               }
           }

           Box(modifier = Modifier
               .height(160.dp)
               .fillMaxWidth(), contentAlignment = Alignment.BottomCenter){
               Button(onClick = { navController.navigate("login")},
                   shape = RoundedCornerShape(10.dp),
                   colors = ButtonDefaults.buttonColors(Color.Transparent)

               ) {
                   Text(text = "Already have an account? Sign In",style = TextStyle(),
                       fontFamily = FontFamily.Monospace,
                       fontWeight = FontWeight.SemiBold,
                       fontSize = 15.sp,
                       color = Color.Black)
               }
           }


       }



   }

}


@Preview
@Composable
fun Loginpreview(){
    Loginscreen(navController = rememberNavController())
}