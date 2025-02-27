package otus.homework.flowcats

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class CatsView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr), ICatsView {

    override fun populate(fact: CatsFact) {
        findViewById<TextView>(R.id.fact_textView).text = fact.text
    }

    override fun showError(message: String) =
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
}
