package br.senai.sp.jandira.lionschool.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R


@Composable
fun CourseCard(
    caminhoId: Int = 0,
    courseAbbreviation: String = "",
    courseName: String = "",
    courseDescription: String = "",
    courseTime: String = ""
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()

            .height(250.dp)
            .padding(top = 16.dp),
        colors = CardDefaults.cardColors(Color(0xFF3347B0)),
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 10.dp, start = 16.dp, end = 16.dp)
        ) {

            Column(
                verticalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(170.dp)
            ) {

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                ) {
                    Image(
                        painter = painterResource(caminhoId),
                        contentDescription = "DS Logo",
                        modifier = Modifier
                            .size(100.dp)
                    )
                    Text(
                        text = courseAbbreviation,
                        fontSize = 64.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color(0xFFFFC23D),
                        modifier =  Modifier
                            .padding(start = 10.dp)
                    )
                }
                Text(
                    text = courseName,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Text(
                    text = courseDescription,
                    fontSize = 12.sp,
                    color = Color.White
                )
            }

            Row (
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .height(50.dp)
                    .width(90.dp)
                    .padding(top = 5.dp)
            ){
                Image(
                    painter = painterResource(R.drawable.clock),
                    contentDescription = "Clock Icon",
                    modifier = Modifier
                        .size(20.dp)
                )

                Text(
                    text = courseTime,
                    fontSize = 12.sp,
                    color = Color.White
                )
            }
        }
    }
}

@Preview
@Composable
private fun CourseCardPreview() {
    CourseCard()
}
