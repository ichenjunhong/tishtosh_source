package com.p683ss.android.ugc.aweme.base.p1418i;

import android.app.Activity;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;

/* renamed from: com.ss.android.ugc.aweme.base.i.d */
public final class C23548d extends Resources {
    /* renamed from: a */
    public static boolean m57745a(Activity activity, boolean z) {
        if (z || !activity.isFinishing() || VERSION.SDK_INT <= 23 || VERSION.SDK_INT > 28) {
            return false;
        }
        return true;
    }

    public C23548d(AssetManager assetManager, DisplayMetrics displayMetrics, Configuration configuration) {
        super(assetManager, displayMetrics, configuration);
    }
}
