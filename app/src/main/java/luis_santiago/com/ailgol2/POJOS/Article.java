package luis_santiago.com.ailgol2.POJOS;

import android.graphics.drawable.Drawable;

/**
 * Created by Luis Santiago on 8/4/18.
 */
public class Article {

    private String title;
    private String description;
    private Drawable drawable;

    public Article(String title, String description, Drawable drawable) {
        this.title = title;
        this.description = description;
        this.drawable = drawable;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Drawable getDrawable() {
        return drawable;
    }
}
