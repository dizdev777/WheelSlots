package game.wheelsuper.wheelslots

import android.app.Activity
import android.content.pm.ActivityInfo
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import game.wheelsuper.wheelslots.domain.fjoqwjirqhiwrjiqhwriq
import kotlinx.coroutines.delay
import kotlin.random.Random

@Composable
fun MNfbixZJIICu9u9ji2i() {
    val iqwjriqwrqwir2 = (LocalContext.current as Activity)
    iqwjriqwrqwir2.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
    val qiwjrhiqwjriqwjir = remember {
        mutableStateOf(false)
    }
    val fijqwhrqjwriq2 = remember {
        mutableStateOf(0)
    }
    val iqwjriqwrqwjir2 = remember {
        mutableStateOf(0f)
    }
    val fjqwirqwriwqrij2 = remember {
        mutableStateOf(700)
    }

    LaunchedEffect(qiwjrhiqwjriqwjir.value){
        if(qiwjrhiqwjriqwjir.value){
            while(true){
                delay(3700)
                iqwjriqwrqwjir2.value -= (Random.nextInt(1200) + 500)
            }

        }
    }
    val akfokowajawor = remember{2000}
    val fqjiwihrjqjwiriqwr = remember{1000}
    val ifqwhurqjwirhqwrji2 = animateFloatAsState(
        targetValue = iqwjriqwrqwjir2.value,
        animationSpec = tween(3000),
        finishedListener = { fl ->
            fijqwhrqjwriq2.value = when (fl.toInt() * (-1) % 360) {
                in 0..15 -> akfokowajawor
                in 16..46 -> 777
                in 46..76 -> fqjiwihrjqjwiriqwr
                in 76..106 -> 2*fjqwirqwriwqrij2.value
                in 106..136 -> {fjqwirqwriwqrij2.value}
                in 136..166 -> akfokowajawor
                in 166..196 -> 1500
                in 196..226 -> 600
                in 226..256 -> akfokowajawor
                in 256..286 -> 1400
                in 286..316 -> 0
                in 316..346 -> 3000
                in 346..360 ->akfokowajawor
                else -> akfokowajawor
            }
            fjqwirqwriwqrij2.value += fijqwhrqjwriq2.value
        }, label = ""
    )
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.wheel_background), contentDescription = "",
            modifier = Modifier.fillMaxSize(), contentScale = ContentScale.FillBounds
        )
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 48.dp)) {
            
            Column(modifier = Modifier
                .padding(vertical = 50.dp)
                .weight(1f)
                .offset(4.dp, 0.dp),
                verticalArrangement = Arrangement.spacedBy(0.dp)) {

                Box(contentAlignment = Alignment.Center,   modifier = Modifier
                    .weight(1f)
                    .size(128.dp, 88.dp)
                    .scale(1.14f)) {
                    Image(painter = painterResource(id = R.drawable.balance), contentDescription = "",
                        modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Fit)

                    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
                        .padding(6.dp)
                        .offset(6.dp, 0.dp)) {
                        Text(text = "COINS:", fontSize = 11.sp,color = Color.White,
                            fontFamily = FontFamily.Serif)
                        Text(text = fjqwirqwriwqrij2.value.toString(),
                            fontFamily = FontFamily.Serif, fontSize = 14.sp,color = Color.White)
                    }
                }
                Spacer(modifier = Modifier.weight(0.7f))
                Image(painter = painterResource(id = R.drawable.qwijrhuqwrhuqwrhqwru), contentDescription = "",
                    modifier = Modifier
                        .weight(1f)
                        .size(128.dp, 30.dp)
                        .scale(1.15f), contentScale = ContentScale.Fit)
                Image(painter = painterResource(id = R.drawable.qwriqwhurqwhurqiwj), contentDescription = "",
                    modifier = Modifier
                        .weight(1f)
                        .size(128.dp, 30.dp)
                        .scale(1.15f), contentScale = ContentScale.Fit)
                Image(painter = painterResource(id = R.drawable.qwijriqwrjiqwjir), contentDescription = "",
                    modifier = Modifier
                        .weight(1f)
                        .size(128.dp, 30.dp)
                        .scale(1.15f), contentScale = ContentScale.Fit)
                Image(painter = painterResource(id = R.drawable.qwijrhuqwrjqwij), contentDescription = "",
                    modifier = Modifier
                        .weight(1f)
                        .size(128.dp, 30.dp)
                        .scale(1.15f), contentScale = ContentScale.Fit)
            }
            Column(modifier = Modifier
                .weight(3f), horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(-18.dp),){
                Box(modifier = Modifier,
                    contentAlignment = Alignment.Center){

                    Image(painter = painterResource(id = R.drawable.qwjriqwrowqirjiwq), contentDescription = "",
                        modifier = Modifier
                            .size(326.dp)
                            .offset(0.dp,8.dp)
                            .rotate(ifqwhurqjwirhqwrji2.value)
                        , contentScale = ContentScale.Fit)
                    Image(painter = painterResource(id = R.drawable.jqiwrjiqwjirjiqwri), contentDescription = "",
                    modifier = Modifier
                        .size(342.dp)
                    , contentScale = ContentScale.Fit)
                }


                Image(painter = painterResource(id = R.drawable.qwjrjoqiwrjwrio), contentDescription = "",
                    modifier = Modifier
                        .size(170.dp, 60.dp)
                    , contentScale = ContentScale.Fit)


                
            }
            Column(modifier = Modifier
                .weight(1f)
                .offset(5.dp, 0.dp),
                horizontalAlignment = Alignment.CenterHorizontally){
                fjoqwjirqhiwrjiqhwriq(ijqwrhuqqwrqwr = { qiwjrhiqwjriqwjir.value = !qiwjrhiqwjriqwjir.value }) {
                    Image(painter = painterResource(id = R.drawable.jqiwrhuqwrjiqwir),
                        contentDescription = null,
                        modifier = Modifier.size(70.dp),
                        contentScale = ContentScale.Fit)
                }
                fjoqwjirqhiwrjiqhwriq(ijqwrhuqqwrqwr = {  iqwjriqwrqwjir2.value -= (Random.nextInt(1000) + 700) }) {
                    Image(painter = painterResource(id = R.drawable.rqwijrqwjriqhwr2),
                        contentDescription = null,
                        modifier = Modifier.size(100.dp),
                        contentScale = ContentScale.Fit)
                }
                fjoqwjirqhiwrjiqhwriq(ijqwrhuqqwrqwr = { iqwjriqwrqwjir2.value = ifqwhurqjwirhqwrji2.value }) {
                    Image(painter = painterResource(id = R.drawable.rqwijriqwriqwjir),
                        contentDescription = null,
                        modifier = Modifier.size(70.dp),
                        contentScale = ContentScale.Fit)
                }
            }
            
            
        }

    }
}

   
