package ua.edu.lntu.cw_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ua.edu.lntu.cw_1.ui.theme.IPZ_CW_1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IPZ_CW_1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyInfo()
                }
            }
        }
    }
}

@Composable
fun MyInfo() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = android.R.drawable.ic_menu_gallery),
            contentDescription = "Android Logo",
            modifier = Modifier.size(128.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Чоботар Юлія",
            style = LargeBold
        )

        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Студент")
        Spacer(modifier = Modifier.height(8.dp))
        ContactInfo(icon = Icons.Filled.Phone, text = "+380 333 333 333")
        Spacer(modifier = Modifier.height(8.dp))
        ContactInfo(icon = Icons.Filled.Email, text = "example@example.com")
        Spacer(modifier = Modifier.height(8.dp))
        ContactInfo(icon = Icons.Filled.Email, text = "email@email.com")
    }
}

@Composable
fun ContactInfo(icon: ImageVector, text: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(imageVector = icon, contentDescription = null)
        Spacer(modifier = Modifier.width(4.dp))
        Text(text = text)
    }
}

val LargeBold = TextStyle(
    fontWeight = FontWeight.Bold,
    fontSize = 35.sp
)

@Preview(showBackground = true)
@Composable
fun MyInfoPreview() {
    IPZ_CW_1Theme {
        MyInfo()
    }
}
