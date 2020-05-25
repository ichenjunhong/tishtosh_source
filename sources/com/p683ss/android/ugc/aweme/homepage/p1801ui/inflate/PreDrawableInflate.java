package com.p683ss.android.ugc.aweme.homepage.p1801ui.inflate;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.p683ss.android.ugc.aweme.lego.LegoInflate;
import com.p683ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.ss.android.ugc.trill.R;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate */
public class PreDrawableInflate implements LegoInflate {
    private Class<? extends Activity> activityClass;
    private final Map<Integer, Drawable> drawableCache = new ConcurrentHashMap();
    private final Map<String, Object> valueCache = new ConcurrentHashMap();

    public int theme() {
        return R.style.hg;
    }

    public PreDrawableInflate() {
    }

    public Class<? extends Activity> activity() {
        if (this.activityClass != null) {
            return this.activityClass;
        }
        return HomePageUIFrameServiceImpl.createHomePageUIFrameServicebyMonsterPlugin().getHomePageInflateActivityClass();
    }

    public Drawable getFestivalDrawable() {
        Drawable drawable = (Drawable) this.drawableCache.remove(Integer.valueOf(-100));
        if (drawable == null) {
            return null;
        }
        return drawable;
    }

    public Object getValue(String str) {
        return this.valueCache.get(str);
    }

    public PreDrawableInflate(Class<? extends Activity> cls) {
        this.activityClass = cls;
    }

    private void preloadValue(String str, Object obj) {
        this.valueCache.put(str, obj);
    }

    private void preLoadDrawable(int i, Drawable drawable) {
        if (drawable != null) {
            this.drawableCache.put(Integer.valueOf(i), drawable);
        }
    }

    public Drawable getDrawable(int i, Context context) {
        Drawable drawable = (Drawable) this.drawableCache.remove(Integer.valueOf(i));
        if (drawable == null) {
            return context.getResources().getDrawable(i);
        }
        return drawable;
    }

    public void inflate(Context context, Activity activity) {
        preLoadDrawable(R.drawable.cz3, context, true);
        preLoadDrawable(R.drawable.czi, context, true);
        preLoadDrawable(R.drawable.cz9, context, true);
        preLoadDrawable(R.drawable.cze, context, true);
        preLoadDrawable(R.drawable.cz1, context, true);
        preLoadDrawable(R.drawable.cyy, context, true);
        preLoadDrawable(R.drawable.cz0, context, true);
        preLoadDrawable(R.drawable.czv, context, true);
        preLoadDrawable(R.drawable.cz7, context, true);
        preLoadDrawable(R.drawable.czc, context, true);
        preLoadDrawable(R.drawable.cze, context, true);
        preLoadDrawable(R.drawable.czg, context, true);
        preLoadDrawable(R.drawable.czp, context, true);
        preLoadDrawable(R.drawable.czn, context, true);
        preLoadDrawable(R.drawable.czl, context, true);
        preLoadDrawable(R.drawable.czr, context, true);
        preLoadDrawable(R.drawable.cza, context, true);
        preLoadDrawable(R.drawable.cz5, context, true);
        preLoadDrawable(2131953089, context, true);
        try {
            preLoadDrawable(-100, null);
            preloadValue("status_bar_height", Integer.valueOf(context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android"))));
        } catch (Exception unused) {
        }
    }

    private void preLoadDrawable(int i, Context context, boolean z) {
        try {
            Drawable drawable = context.getResources().getDrawable(i);
            if (z) {
                this.drawableCache.put(Integer.valueOf(i), drawable);
            }
        } catch (Exception unused) {
        }
    }
}
