package material_design.soussi.com.viewpagerlibrary.header;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;

import com.flaviofaria.kenburnsview.KenBurnsView;

/**
 * Created by Soussi on 14/11/2015.
 */
public class MaterialViewPagerImageHeader extends KenBurnsView {

    //region construct

    public MaterialViewPagerImageHeader(Context context) {
        super(context);
    }

    public MaterialViewPagerImageHeader(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MaterialViewPagerImageHeader(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    //endregion

    /**
     * change the image with a fade
     * @param urlImage
     * @param fadeDuration
     *
     * TODO : remove Picasso
     */
    public void setImageUrl(final String urlImage, final int fadeDuration) {
        MaterialViewPagerImageHelper.setImageUrl(this, urlImage, fadeDuration);
    }

    /**
     * change the image with a fade
     * @param drawable
     * @param fadeDuration
     */
    public void setImageDrawable(final Drawable drawable, final int fadeDuration) {
        MaterialViewPagerImageHelper.setImageDrawable(this, drawable, fadeDuration);
    }

}

