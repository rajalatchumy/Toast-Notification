package fr.isep.notifaction_view

import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import fr.isep.notifaction_view.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val appBarConfiguration: AppBarConfiguration? = null
    private val binding: ActivityMainBinding? = null
    var simpleToast: Button? = null
    var customToast2: Button? = null
    var customToast3: Button? = null
    var customToast4: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.custum_button)
        simpleToast = findViewById<View>(R.id.simpleToast) as Button
        customToast2 = findViewById<View>(R.id.customToast2) as Button
        customToast3 = findViewById<View>(R.id.customToast3) as Button
        customToast4 = findViewById<View>(R.id.customToast4) as Button
        simpleToast!!.setOnClickListener {
            val toast =
                Toast.makeText(applicationContext, "Simple Toast In Android", Toast.LENGTH_LONG)
            toast.setGravity(Gravity.BOTTOM or Gravity.CENTER_HORIZONTAL, 0, 0)
            toast.show()
        }
        customToast2!!.setOnClickListener {
            val inflater = layoutInflater
            val layout = inflater.inflate(
                R.layout.custom_toast_layout,
                findViewById<View>(R.id.toast_layout_root) as ViewGroup
            )
            val toastTextView = layout.findViewById<View>(R.id.toastTextView) as TextView
            val toastImageView = layout.findViewById<View>(R.id.toastImageView) as ImageView
            toastTextView.text = "Custom Toast In Android"
            toastImageView.setImageResource(R.drawable.house_door_icon_160036)
            val toast = Toast(applicationContext)
            toast.duration = Toast.LENGTH_LONG
            toast.view = layout
            toast.show()
        }
        customToast3!!.setOnClickListener {
            val inflater = layoutInflater
            val layout = inflater.inflate(
                R.layout.custom_toast_layout,
                findViewById<View>(R.id.toast_layout_root) as ViewGroup
            )
            val toastTextView = layout.findViewById<View>(R.id.toastTextView) as TextView
            toastTextView.text = "Custom Toast In Android"
            val toast = Toast(applicationContext)
            toast.duration = Toast.LENGTH_SHORT
            toast.view = layout
            toast.show()
        }
        customToast4!!.setOnClickListener {
            val inflater = layoutInflater
            val layout = inflater.inflate(
                R.layout.custom_toast_layout,
                findViewById<View>(R.id.toast_layout_root) as ViewGroup
            )
            val toastTextView = layout.findViewById<View>(R.id.toastTextViewOther) as TextView
            val toastImageView = layout.findViewById<View>(R.id.toastImageViewOther) as ImageView
            toastTextView.text = "Custom Toast In Android"
            toastImageView.setImageResource(R.drawable.house_door_icon_160036)
            toastTextView.text = "Custom Toast In Android"
            val toast = Toast(applicationContext)
            toast.duration = Toast.LENGTH_LONG
            toast.view = layout
            toast.show()
        }
    }
}