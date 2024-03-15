package game.wheelsuper.wheelslots

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.runtime.mutableStateOf
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import game.wheelsuper.wheelslots.domain.ijfokJIFIHWQjfiqwfj
import game.wheelsuper.wheelslots.ui.theme.WheelSlotsTheme

class ONjfoqiwjJIFJIWQifjiqfi : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val ijwqjirjoqwirijqwjfjo = mutableStateOf(false)
        val wqijrqjiwr8ujirubawirj = WindowCompat.getInsetsController(window, window.decorView)
        wqijrqjiwr8ujirubawirj.systemBarsBehavior =
            WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        wqijrqjiwr8ujirubawirj.hide(WindowInsetsCompat.Type.systemBars())

        setContent {
            WheelSlotsTheme {

                AnimatedVisibility(visible = !ijwqjirjoqwirijqwjfjo.value) {
                    ijfokJIFIHWQjfiqwfj {
                        ijwqjirjoqwirijqwjfjo.value = true
                    }
                }
                AnimatedVisibility(visible = ijwqjirjoqwirijqwjfjo.value) {
                    MNfbixZJIICu9u9ji2i()
                }


            }
        }
    }
}
