package luis_santiago.com.ailgol2.adapter

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_news.view.*
import luis_santiago.com.ailgol2.MainActivity
import luis_santiago.com.ailgol2.POJOS.Article
import luis_santiago.com.ailgol2.R

/**
 * Created by Luis Santiago on 8/26/18.
 */



//Adapter

class NewsAdapter(private val listOfNews : ArrayList<Article>, val context : Context) : RecyclerView.Adapter<NewsViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(parent!!.context).inflate(R.layout.item_news , parent , false)
        return NewsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listOfNews.size
    }

    override fun onBindViewHolder(holder: NewsViewHolder?, position: Int) {
        val currentItem = listOfNews.get(position)
        holder?.bindNews(currentItem)
    }

}


class NewsViewHolder (val view : View) : RecyclerView.ViewHolder(view) , View.OnClickListener{

    override fun onClick(v: View?) {
        view.context.startActivity(Intent(view.context , MainActivity::class.java))
    }
    

    init {
        view.setOnClickListener(this)
    }

    fun bindNews(news : Article){
        view.title_main_news.setText(news.title)
        view.description_news.setText(news.description)
        view.image_main_news.setImageDrawable(news.drawable)
    }
}