package com.example.duandanhthiep

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.duandanhthiep.ui.theme.DuandanhthiepTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DuandanhthiepTheme {
                BusinessCard()
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFD0E8D0)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(top = 120.dp)
        ) {
            Image(
                painter = painterResource(
                    id = R.drawable.z7032019379188_777d834cdc7ac856fbbdc4947b2352fe),
                contentDescription = "Avatar",
                modifier = Modifier.size(100.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Nguyễn Mai Tuấn Hưng",
                fontSize = 26.sp,
                fontWeight = FontWeight.Medium
            )

            Text(
                text = "Sinh viên khoa Công nghệ thông tin",
                color = Color(0xFF006400),
                fontSize = 14.sp
            )
            Column(
                modifier = Modifier.padding(top = 40.dp),
                horizontalAlignment = Alignment.Start
            ) {

            }
        }

        // 🔹 Phần dưới (contact)
        Column(
            modifier = Modifier
                .padding(bottom = 100.dp),
            horizontalAlignment = Alignment.Start
        ) {
            ContactItem(Icons.Default.Phone, "0876573882")
            ContactItem(Icons.Default.Share, "@MaiTuanHung2005")
            ContactItem(Icons.Default.Email, "nmth31050809@gmail.com")
        }
    }
}

@Composable
fun ContactItem(icon: ImageVector, text: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(vertical = 6.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFF006400),
            modifier = Modifier.size(20.dp)
        )
        Spacer(modifier = Modifier.width(12.dp))
        Text(
            text = text,
            fontSize = 14.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCard() {
    DuandanhthiepTheme {
        BusinessCard()
    }
}