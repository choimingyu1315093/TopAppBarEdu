package com.example.topappbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.topappbar.ui.theme.TopAppBarTheme

//안녕하세요 코딩일기 채널의 최대리입니다.
//오늘은 TopAppBar Composable 배워보겠습니다.
//TopAppBar는 앱의 상단에 표시되는 앱바에요
//주로 앱의 제목이나 액션 버튼을 활용해서 페이지를 전환하거나 할 때 사용됩니다.
//그럼 코드보면서 설명드리도록 하겠습니다.
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TopAppBarTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    Column (
                        modifier = Modifier
                            .padding(innerPadding)
                    ){

                    }
                }
            }
        }
    }
}

@Composable
fun BasicTopAppBar(modifier: Modifier = Modifier){
    TopAppBar(

    )
}