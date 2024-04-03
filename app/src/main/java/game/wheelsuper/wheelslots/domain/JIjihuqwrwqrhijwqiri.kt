package game.wheelsuper.wheelslots.domain

import android.Manifest
import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.CookieManager
import android.webkit.PermissionRequest
import android.webkit.ValueCallback
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import game.wheelsuper.wheelslots.databinding.ActivityGameBonusBinding

class JIjihuqwrwqrhijwqiri : AppCompatActivity() {
    private var qwijrjiqwjirqwr: ValueCallback<Array<Uri>>? = null
    private var jiqwrjiqwriqwir2: ActivityResultLauncher<Intent>? = null

    lateinit var jfqworjuqwjri: ActivityGameBonusBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        jfqworjuqwjri = ActivityGameBonusBinding.inflate(layoutInflater)
        setContentView(jfqworjuqwjri.root)
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(jfqworjuqwjri.gameBonus,true)
        ijqwrqwiriiqwiriwj2()
        qwjirjiqwrijwqirji()
        uhqwirhuqwr7t2ruhawr(this)
        qwiru82urjaiwriajirji()
        intent.getStringExtra("url")?.let { jfqworjuqwjri.gameBonus.loadUrl(it) }

    }

    override fun onBackPressed() {
        if (jfqworjuqwjri.gameBonus.canGoBack())
            jfqworjuqwjri.gameBonus.goBack()
        else
            super.onBackPressed()
    }
   fun ijqwrqwiriiqwiriwj2(){
       jfqworjuqwjri.gameBonus.settings.apply {
           javaScriptEnabled=true
           domStorageEnabled=true
           javaScriptCanOpenWindowsAutomatically=true
           useWideViewPort = true
           databaseEnabled = true
           loadWithOverviewMode = true
           builtInZoomControls = true
           displayZoomControls = false
           allowFileAccess = true
           allowContentAccess = true
       }
   }
    fun qwjirjiqwrijwqirji(){
        CookieManager.allowFileSchemeCookies()
        CookieManager.getInstance().acceptThirdPartyCookies(jfqworjuqwjri.gameBonus)
        jfqworjuqwjri.gameBonus.webViewClient= object : WebViewClient() {

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                jfqworjuqwjri.gameBonus.visibility = View.VISIBLE
                CookieManager.getInstance().flush()
            }

            override fun shouldOverrideUrlLoading(
                qwijrhqwriqwrij: WebView?,
                request: WebResourceRequest?
            ): Boolean {
                val uhwqrwqruhwurhuwr = request?.url.toString()
                if (uhwqrwqruhwurhuwr.startsWith("http")) {
                    qwijrhqwriqwrij?.loadUrl(uhwqrwqruhwurhuwr)
                } else {
                    try {
                        if (ContextCompat.checkSelfPermission(
                                this@JIjihuqwrwqrhijwqiri.applicationContext,
                                android.Manifest.permission.CAMERA
                            ) != PackageManager.PERMISSION_GRANTED
                        ) {
                            ActivityCompat.requestPermissions(
                                this@JIjihuqwrwqrhijwqiri,
                                arrayOf(android.Manifest.permission.CAMERA),
                                201
                            )
                        } else {
                            try {
                                val uhqwirhuqwhrhqwur = Intent(Intent.ACTION_VIEW, Uri.parse(uhwqrwqruhwurhuwr))
                                this@JIjihuqwrwqrhijwqiri.startActivity(uhqwirhuqwhrhqwur)
                            } catch (e: ActivityNotFoundException) {
                                val qwuhruqrqhwuru = Intent(Intent.ACTION_GET_CONTENT,Uri.parse(uhwqrwqruhwurhuwr))
                                qwuhruqrqhwuru.addCategory(Intent.CATEGORY_OPENABLE)
                                qwuhruqrqhwuru.type = "*/*"
                                this@JIjihuqwrwqrhijwqiri.startActivity(qwuhruqrqhwuru)
                            }

                        }


                    } catch (e: Exception) {

                    }

                }
                return true
            }
        }
    }
    private fun uhqwirhuqwr7t2ruhawr(appCojiqwrqwjirjiqwrpatActivity: AppCompatActivity) {
        jiqwrjiqwriqwir2 = appCojiqwrqwjirjiqwrpatActivity.activityResultRegistry.register(
            "UploadFile",
            ActivityResultContracts.StartActivityForResult()
        ) { ijqwrhuquwrhquwru ->
            if (ijqwrhuquwrhquwru.resultCode == Activity.RESULT_OK) {
                if (ijqwrhuquwrhquwru.data != null) {
                    val uqwrhuqwhrhu2: Uri? = ijqwrhuquwrhquwru.data?.data
                    if (uqwrhuqwhrhu2 != null && qwijrjiqwjirqwr != null) {
                        qwijrjiqwjirqwr?.onReceiveValue(arrayOf(uqwrhuqwhrhu2))
                        qwijrjiqwjirqwr = null
                    }
                }
            }
            else
            {
                qwijrjiqwjirqwr?.onReceiveValue(null)
                qwijrjiqwjirqwr = null
            }
        }
    }
    fun qwiru82urjaiwriajirji(){
        jfqworjuqwjri.gameBonus.webChromeClient = object : WebChromeClient() {
            override fun onPermissionRequest(request: PermissionRequest?) {
                if (request?.resources?.contains("android.permission.CAMERA") == true || request?.resources?.contains(
                        "android.webkit.resource.VIDEO_CAPTURE"
                    ) == true
                ) {
                    if (ContextCompat.checkSelfPermission(
                            this@JIjihuqwrwqrhijwqiri,
                            Manifest.permission.CAMERA
                        ) != PackageManager.PERMISSION_GRANTED
                    ) {
                        ActivityCompat.requestPermissions(
                            this@JIjihuqwrwqrhijwqiri,
                            arrayOf(Manifest.permission.CAMERA),
                            201
                        )
                    } else {
                        request.grant(request.resources)
                    }
                } else {
                    super.onPermissionRequest(request)
                }
            }
            override fun onShowFileChooser(
                iqjwrqwjirjiqwr: WebView?, filePathCallback: ValueCallback<Array<Uri>>?,
                qijwriqwhruwhqrriw: FileChooserParams?
            ): Boolean {

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                    val zaresheniegkdfgkdfgjdf = ContextCompat.checkSelfPermission(
                        this@JIjihuqwrwqrhijwqiri,
                        android.Manifest.permission.READ_MEDIA_IMAGES
                    )
                    if (zaresheniegkdfgkdfgjdf != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(
                            this@JIjihuqwrwqrhijwqiri, arrayOf(android.Manifest.permission.READ_MEDIA_IMAGES), 300
                        )
                    }
                    else
                    {
                        if (qwijrjiqwjirqwr != null) {
                            qwijrjiqwjirqwr?.onReceiveValue(null)
                            qwijrjiqwjirqwr = null
                        }
                        qwijrjiqwjirqwr = filePathCallback
                        val yiwqrhuqhwrhuwr2 = Intent(Intent.ACTION_GET_CONTENT)
                        yiwqrhuqhwrhuwr2.addCategory(Intent.CATEGORY_OPENABLE)
                        yiwqrhuqhwrhuwr2.type = "*/*"
                        jiqwrjiqwriqwir2?.launch(Intent.createChooser(yiwqrhuqhwrhuwr2, "File Browser"))
                        return true
                    }
                } else {
                    val uqwrqwijrjqwirwqjrii2 =
                        ContextCompat.checkSelfPermission(
                            this@JIjihuqwrwqrhijwqiri,
                            android.Manifest.permission.READ_EXTERNAL_STORAGE
                        )
                    if (uqwrqwijrjqwirwqjrii2 != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(
                            this@JIjihuqwrwqrhijwqiri, arrayOf(android.Manifest.permission.READ_EXTERNAL_STORAGE),
                            200
                        )
                    }
                    else
                    {
                        if (qwijrjiqwjirqwr != null) {
                            qwijrjiqwjirqwr?.onReceiveValue(null)
                            qwijrjiqwjirqwr = null
                        }
                        qwijrjiqwjirqwr = filePathCallback
                        val qiwrjqwrijiqwrjiqwr2 = Intent(Intent.ACTION_GET_CONTENT)
                        qiwrjqwrijiqwrjiqwr2.addCategory(Intent.CATEGORY_OPENABLE)
                        qiwrjqwrijiqwrjiqwr2.type = "*/*"
                        jiqwrjiqwriqwir2?.launch(Intent.createChooser(qiwrjqwrijiqwrjiqwr2, "File Browser"))
                        return true
                    }

                }
                return false

            }
        }
    }
}