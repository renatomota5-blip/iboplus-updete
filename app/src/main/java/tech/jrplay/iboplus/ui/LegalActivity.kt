package tech.jrplay.iboplus.ui
import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class LegalActivity : AppCompatActivity() {
  override fun onCreate(b: Bundle?) {
    super.onCreate(b)
    val page = intent.getStringExtra("page") ?: "privacy"
    val wv = WebView(this)
    setContentView(wv)
    wv.settings.javaScriptEnabled = false
    wv.settings.domStorageEnabled = true
    wv.settings.safeBrowsingEnabled = true
    val url = if (page == "terms") "file:///android_asset/terms.html"
              else "file:///android_asset/privacy.html"
    wv.loadUrl(url)
  }
}
