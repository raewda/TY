package com.example.tsitatyyarika

import android.gesture.Gesture
import android.graphics.drawable.Drawable
import android.graphics.fonts.Font
import android.os.Build
import android.os.Bundle
import androidx.activity.BackEventCompat
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.ColorRes
import androidx.annotation.RequiresApi
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
//import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.DraggableState
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tsitatyyarika.ui.theme.TY
import com.example.tsitatyyarika.ui.theme.YanoneKaffeesatz
import com.example.tsitatyyarika.ui.theme.randomFun
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue


class MainActivity : ComponentActivity() {

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val offsetY = remember {
                androidx.compose.animation.core.Animatable(0F)
            }
            var contenttext by remember { mutableStateOf( randomFun().ts) }
            val coroutineScope = rememberCoroutineScope()
            Card(
                shape = RoundedCornerShape(
                    topStart = 0.dp,
                    topEnd = 0.dp,
                    bottomEnd = 0.dp,
                    bottomStart = 0.dp,
                ),
                modifier = Modifier
                    .fillMaxSize()
                    .draggable(
                        orientation = Orientation.Vertical,
                        state = rememberDraggableState(onDelta = {
                            if (it < 0F){
                                coroutineScope.launch {
                                    offsetY.snapTo(offsetY.value + it)
                                }
                            }
                        }),
                        onDragStopped = {
                            coroutineScope.launch {
                                if (offsetY.value < 600F) {
                                    contenttext = randomFun().ts
                                }
                                offsetY.animateTo(
                                    targetValue = 0f,
                                    animationSpec = tween(
                                        durationMillis = 500,
                                        delayMillis = 0
                                    )
                                )
                                delay(1000)
                            }
                        }),
                colors = CardDefaults.cardColors(containerColor = Color.Black)
            ) {

                Text(text = stringResource(id = R.string.me),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 15.dp, end = 15.dp),
                    color = colorResource(R.color.gold),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Light,
                    fontFamily = YanoneKaffeesatz,
                    textAlign = TextAlign.Start
                )
                Image(painter = painterResource(id = R.drawable.typng), contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(310.dp))

                Text(text = stringResource(id = R.string.title),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 0.dp, start = 15.dp, end = 15.dp),
                    color = colorResource(R.color.gold),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Light,
                    fontFamily = YanoneKaffeesatz,
                    textAlign = TextAlign.Center)

                Text(stringResource(contenttext),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 80.dp, start = 15.dp, end = 15.dp),
                    color = colorResource(R.color.gold),
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Light,
                    fontFamily = YanoneKaffeesatz,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}





