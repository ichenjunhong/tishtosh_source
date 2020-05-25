package com.bytedance.android.live.core.p230g;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import com.bytedance.android.live.uikit.p255a.C4197a;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.core.g.ac */
public final class C3865ac {
    /* renamed from: b */
    private static void m9797b(Activity activity) {
        activity.getWindow().setFlags(PreloadTask.BYTE_UNIT_NUMBER, PreloadTask.BYTE_UNIT_NUMBER);
        m9799d(activity);
    }

    /* renamed from: c */
    private static int m9798c(Activity activity) {
        return activity.getResources().getColor(R.color.a8w);
    }

    /* renamed from: a */
    public static int m9795a(Context context) {
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
    }

    /* renamed from: d */
    private static void m9799d(Activity activity) {
        if (VERSION.SDK_INT >= 21) {
            activity.getWindow().setStatusBarColor(m9798c(activity));
            return;
        }
        if (VERSION.SDK_INT >= 19) {
            C4197a.m10408a(activity, m9798c(activity));
        }
    }

    /* renamed from: a */
    public static void m9796a(Activity activity) {
        if (activity == null || C3894h.m9842a(activity)) {
            return;
        }
        if (VERSION.SDK_INT >= 19) {
            m9797b(activity);
        } else if (VERSION.SDK_INT >= 16) {
            activity.getWindow().setFlags(PreloadTask.BYTE_UNIT_NUMBER, PreloadTask.BYTE_UNIT_NUMBER);
            activity.getWindow().getDecorView().setSystemUiVisibility(4);
            ActionBar actionBar = activity.getActionBar();
            if (actionBar != null) {
                actionBar.hide();
            }
        } else {
            activity.getWindow().setFlags(PreloadTask.BYTE_UNIT_NUMBER, PreloadTask.BYTE_UNIT_NUMBER);
        }
    }
}
