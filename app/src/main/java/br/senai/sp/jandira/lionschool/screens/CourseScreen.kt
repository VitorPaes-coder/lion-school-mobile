package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
import br.senai.sp.jandira.lionschool.screens.components.CourseCard

@Composable
fun CourseScreen (){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White)
            .padding(top=50.dp, bottom = 20.dp, start = 20.dp, end = 20.dp)
    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
        ){
            Column (
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            ){
                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                ){
                    Row(
                        modifier = Modifier
                            .padding(bottom = 5.dp)
                            .fillMaxWidth()
                    ) {
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
                    label = { Text(text = stringResource(R.string.find_course)) },
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .fillMaxWidth(),
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
                    ),
                )

                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                ){
                    Image(
                        painter = painterResource(R.drawable.list),
                        contentDescription = "DS Logo",
                        modifier = Modifier
                            .size(36.dp)
                    )
                    Text(
                        text = stringResource(R.string.courses),
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF1262BE),
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                CourseCard(
                    caminhoId = R.drawable.programming,
                    courseAbbreviation = stringResource(R.string.ds_abbreviation),
                    courseName = stringResource(R.string.ds_name),
                    courseDescription = stringResource(R.string.ds_description),
                    courseTime = stringResource(R.string.course_time)
                )

                CourseCard(
                    caminhoId = R.drawable.internet,
                    courseAbbreviation = stringResource(R.string.rds_abbreviation),
                    courseName = stringResource(R.string.rds_name),
                    courseDescription = stringResource(R.string.rds_description),
                    courseTime = stringResource(R.string.course_time)
                )

                CourseCard(
                    caminhoId = R.drawable.chip,
                    courseAbbreviation = stringResource(R.string.ele_abbreviation),
                    courseName = stringResource(R.string.ele_name),
                    courseDescription = stringResource(R.string.ele_description),
                    courseTime = stringResource(R.string.course_time)
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun CourseScreenPreview() {
    CourseScreen()
}