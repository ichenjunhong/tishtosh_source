package com.p683ss.android.ugc.aweme.legoImp.inflate;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.p683ss.android.ugc.aweme.lego.LegoInflate;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.legoImp.inflate.SplashBgInflate */
public class SplashBgInflate implements LegoInflate {
    private Drawable splashBgDrawable;

    public Class<? extends Activity> activity() {
        return null;
    }

    public int theme() {
        return R.style.hg;
    }

    public Drawable getSplashBgDrawable(Context context) {
        if (this.splashBgDrawable != null) {
            Drawable drawable = this.splashBgDrawable;
            this.splashBgDrawable = null;
            return drawable;
        }
        try {
            return context.getResources().getDrawable(R.drawable.cqq);
        } catch (Exception unused) {
            return null;
        }
    }

    public void inflate(Context context, Activity activity) {
        try {
            this.splashBgDrawable = context.getResources().getDrawable(R.drawable.cqq);
        } catch (Exception unused) {
        }
    }
}
