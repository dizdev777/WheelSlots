package game.wheelsuper.wheelslots.domain

import android.app.Activity
import android.content.pm.ActivityInfo
import androidx.compose.animation.core.Animatable

import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import game.wheelsuper.wheelslots.R


@Composable
fun ijfokJIFIHWQjfiqwfj(open: () -> Unit) {
    val fijqhuwfjiHUFJIWFQIrji = (LocalContext.current as Activity)
    fijqhuwfjiHUFJIWFQIrji.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
    val uhiqwjrhuqwurqwr72hruwir = remember { Animatable(0f) }
    LaunchedEffect(Unit)
    {
        uhiqwjrhuqwurqwr72hruwir.animateTo(1f, tween(1300)
        )
        open.invoke()
    }
    val fiqjwirwqijrji = remember{
        100
    }
    val nqwihrjqwriqwr = remember{
        202
    }
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Image(
            painter = painterResource(id = R.drawable.splash), contentDescription = "",
            contentScale = ContentScale.FillBounds, modifier = Modifier.fillMaxSize()
        )
        Column(
            modifier = Modifier
                .padding(bottom = fiqjwirwqijrji.dp)
                .size(nqwihrjqwriqwr.dp, 92.dp)
                .align(Alignment.BottomCenter),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LinearProgressIndicator(
                progress = uhiqwjrhuqwurqwr72hruwir.value, color = Color(0xFFFED103),
                modifier = Modifier
                    .size(213.dp, 16.dp)
                    .clip(RoundedCornerShape(16.dp))
            )
            Text(text = "Loading...", color = Color.White, fontSize = 24.sp)
        }
    }
}