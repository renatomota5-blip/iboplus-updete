package tech.jrplay.iboplus.ui
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
  override fun onCreate(b: Bundle?) {
    super.onCreate(b)
    val tv = TextView(this).apply {
      text = "IBO Plus OK"
      textSize = 24f
      setPadding(40, 80, 40, 40)
    }
    setContentView(tv)
  }
}
