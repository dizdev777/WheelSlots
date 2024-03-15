package game.wheelsuper.wheelslots.domain
import android.view.MotionEvent
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.input.pointer.pointerInteropFilter
import kotlinx.coroutines.launch


@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun fjoqwjirqhiwrjiqhwriq(ijqwrhuqqwrqwr: () -> Unit, huqwrhuy7r28huhwaur: Modifier = Modifier, jiji8yhu2ghurhu: @Composable () -> Unit) {
    val ijqwrhuqwhiruqwrii2 = rememberCoroutineScope()
    val fiqwjriqwrij = remember{1f}
    val ijqwriqwirhqiwrij = remember { Animatable(fiqwjriqwrij) }
    Box(
        modifier = Modifier
            .then(huqwrhuy7r28huhwaur)
            .scale(ijqwriqwirhqiwrij.value)
            .pointerInteropFilter {
                when (it.action) {
                    MotionEvent.ACTION_DOWN -> {
                        ijqwrhuqwhiruqwrii2.launch {
                            ijqwriqwirhqiwrij.animateTo(
                                0.92f,
                                animationSpec = tween(100)
                            )
                        }
                    }

                    MotionEvent.ACTION_UP -> {
                        ijqwrhuqwhiruqwrii2.launch {
                            ijqwriqwirhqiwrij.animateTo(fiqwjriqwrij,
                                animationSpec = tween(80),
                                block = {
                                    if (ijqwriqwirhqiwrij.value == fiqwjriqwrij) {
                                        ijqwrhuqqwrqwr.invoke()
                                    }
                                }
                            )
                        }
                    }
                }
                true
            }, contentAlignment = Alignment.Center
    ) {
        jiji8yhu2ghurhu.invoke()
    }
}