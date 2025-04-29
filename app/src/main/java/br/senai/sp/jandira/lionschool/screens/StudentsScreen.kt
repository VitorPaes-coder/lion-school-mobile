package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R
import br.senai.sp.jandira.lionschool.screens.components.CourseCircle

@Composable
fun StudentsScreen() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White)
            .padding(top = 50.dp, bottom = 20.dp, start = 20.dp, end = 20.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Column(
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .padding(bottom = 5.dp)
                            .fillMaxWidth()
                    ) {
                        Row (
                            modifier = Modifier
                        ){

                            Image(
                                painter = painterResource(id = R.drawable.logo_image),
                                contentDescription = "Lion School Logo",
                                modifier = Modifier
                                    .size(60.dp)
                            )
                            Text(
                                text = stringResource(R.string.app_title),
                                fontSize = 17.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF1262BE),
                                modifier = Modifier
                                    .width(60.dp)
                                    .padding(4.dp),
                            )
                        }

                        CourseCircle(
                            courseAbbreviation = stringResource(R.string.ds_abbreviation)
                        )
                    }

                    HorizontalDivider(
                        color = Color(0xFFFFC23D),
                        thickness = 2.dp,
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                }
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = {
                        Text(
                            text = stringResource(R.string.find_student),
                            color = Color(0xFF595959)
                        ) },
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(45.dp),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "",
                            modifier = Modifier
                                .size(24.dp)
                        )
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number,
                        imeAction = ImeAction.Next
                    )
                )

                Row (
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                ){
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFC23D)
                        ),
                        shape = RoundedCornerShape(30.dp),
                        modifier = Modifier
                            .width(90.dp)
                            .height(36.dp)
                    ) {
                        Text(
                            text = stringResource(R.string.all_students),
                            fontSize = 13.sp,
                            color = Color(0xFF1262BE)
                        )
                    }

                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFC23D)
                        ),
                        shape = RoundedCornerShape(30.dp),
                        modifier = Modifier
                            .width(110.dp)
                            .height(36.dp)
                    ) {
                        Text(
                            text = stringResource(R.string.studying_students),
                            fontSize = 13.sp,
                            color = Color(0xFF1262BE)
                        )
                    }

                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFC23D)
                        ),
                        shape = RoundedCornerShape(30.dp),
                        modifier = Modifier
                            .width(110.dp)
                            .height(36.dp)
                    ) {
                        Text(
                            text = stringResource(R.string.graduate_students),
                            fontSize = 13.sp,
                            color = Color(0xFF1262BE)
                        )
                    }
                }

                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                ){

                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun CourseScreenPreview() {
    StudentsScreen()
}