package com.p683ss.android.ugc.aweme.notification.util;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.notification.util.d */
public final class C38432d {

    /* renamed from: a */
    private static float f97821a;

    /* renamed from: b */
    public static void m85746b(Context context) {
        if (context != null) {
            f97821a = m85748c(context);
        }
    }

    /* renamed from: a */
    public static int m85744a(Context context) {
        if (f97821a > 0.0f) {
            return (int) f97821a;
        }
        float c = m85748c(context);
        f97821a = c;
        return (int) c;
    }

    /* renamed from: b */
    public static void m85747b(View view) {
        if (VERSION.SDK_INT >= 23) {
            view.setForeground(null);
        } else {
            view.setOnClickListener(null);
        }
    }

    /* renamed from: a */
    public static void m85745a(View view) {
        if (VERSION.SDK_INT >= 23) {
            view.setForeground(view.getResources().getDrawable(R.drawable.clf));
        } else {
            C38446k.m85764a(view);
        }
    }

    /* renamed from: c */
    private static float m85748c(Context context) {
        float f = 0.0f;
        if (context == null) {
            return 0.0f;
        }
        int[] iArr = {R.string.c_6, R.string.as8, R.string.cc5, R.string.c_b, R.string.ck8, R.string.cl5, R.string.as_, R.string.gfm};
        Paint paint = new Paint();
        paint.setTextSize(C9432q.m18687b(context, 15.0f));
        float b = C9432q.m18687b(context, 52.0f);
        float b2 = C9432q.m18687b(context, 122.0f);
        for (int i = 0; i < 8; i++) {
            float measureText = paint.measureText(context.getString(iArr[i]));
            if (measureText > f) {
                f = measureText;
            }
        }
        float b3 = f + C9432q.m18687b(context, 12.0f);
        if (b3 > b2) {
            return b2;
        }
        if (b3 < b) {
            return b;
        }
        return b3;
    }
}
