package luis_santiago.com.ailgol2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import luis_santiago.com.ailgol2.POJOS.Article
import luis_santiago.com.ailgol2.adapter.NewsAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        list?.adapter = NewsAdapter(generateTemplate(), this)
        list?.layoutManager = LinearLayoutManager(this)
    }

    fun generateTemplate() : ArrayList<Article>{
        var list = ArrayList<Article>()
        list.add(Article("Titulo" , "Ronaldo ahora esta en la juve", resources.getDrawable(R.drawable.ronaldo_juve)))
        list.add(Article("Titulo" , "Ronaldo ahora esta en la juve", resources.getDrawable(R.drawable.ronaldo_juve)))
        list.add(Article("Titulo" , "Ronaldo ahora esta en la juve", resources.getDrawable(R.drawable.ronaldo_juve)))
        return list
    }
}

