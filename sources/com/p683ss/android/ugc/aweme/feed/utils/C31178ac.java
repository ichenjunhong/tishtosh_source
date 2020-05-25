package com.p683ss.android.ugc.aweme.feed.utils;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.adaptation.C22453b;
import com.p683ss.android.ugc.aweme.app.p1372c.C23059a;

/* renamed from: com.ss.android.ugc.aweme.feed.utils.ac */
public final class C31178ac {

    /* renamed from: a */
    public static int f81597a;

    /* renamed from: a */
    public static void m72808a(View view) {
        if (view != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams instanceof LayoutParams) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                if (layoutParams.gravity != 17) {
                    layoutParams.gravity = 17;
                }
            } else if (marginLayoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) view.getLayoutParams();
                layoutParams2.addRule(13, -1);
                if (VERSION.SDK_INT >= 17) {
                    layoutParams2.removeRule(10);
                }
            }
            if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
            }
        }
    }

    /* renamed from: a */
    private static void m72809a(MarginLayoutParams marginLayoutParams) {
        if (marginLayoutParams instanceof LayoutParams) {
            ((LayoutParams) marginLayoutParams).gravity = 49;
            return;
        }
        if (marginLayoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) marginLayoutParams;
            layoutParams.addRule(14, -1);
            layoutParams.addRule(10, -1);
            if (VERSION.SDK_INT >= 17) {
                layoutParams.removeRule(13);
            }
        }
    }

    /* renamed from: a */
    public static void m72807a(Context context, ViewGroup viewGroup, View view, float f, float f2, int i, int i2) {
        boolean z;
        int i3 = i;
        int i4 = i2;
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        if (f == 0.0f) {
            if (marginLayoutParams.width != i3) {
                marginLayoutParams.width = i3;
                marginLayoutParams.height = i4;
                m72808a(view);
                viewGroup.requestLayout();
            }
            return;
        }
        float f3 = (float) i4;
        float f4 = (((float) i3) * 1.0f) / f3;
        float measuredHeight = ((float) viewGroup.getMeasuredHeight()) - f;
        boolean z2 = true;
        int i5 = 0;
        if (((double) f4) > 0.625d) {
            z = true;
        } else {
            z = false;
        }
        if (!C23059a.m56592a(context) || C22453b.m55511d() != 0) {
            z2 = false;
        }
        if (z2) {
            i5 = C22453b.m55512d(context);
        }
        float f5 = f / f2;
        m72809a(marginLayoutParams);
        Context a = C11010c.m22280a();
        if (z) {
            if (f81597a == 0) {
                if (z2) {
                    f81597a = (int) (((float) i5) + (((float) C9432q.m18670a(a)) / 1.7777778f));
                } else {
                    f81597a = (int) ((((float) C9432q.m18688b(a)) - C9432q.m18687b(a, 52.0f)) / 4.0f);
                }
            }
            float measuredHeight2 = (((float) viewGroup.getMeasuredHeight()) - f3) / 2.0f;
            marginLayoutParams.topMargin = (int) (measuredHeight2 + ((((float) i5) - measuredHeight2) * f5));
            marginLayoutParams.height = (int) (Math.min(f3, (float) f81597a) + (Math.max(0.0f, f3 - ((float) f81597a)) * (1.0f - f5)));
            marginLayoutParams.width = (int) (((float) marginLayoutParams.height) * f4);
        } else {
            float measuredHeight3 = (((float) viewGroup.getMeasuredHeight()) - f3) / 2.0f;
            marginLayoutParams.topMargin = (int) (measuredHeight3 + ((((float) i5) - measuredHeight3) * f5));
            marginLayoutParams.height = (int) (measuredHeight - ((float) marginLayoutParams.topMargin));
            marginLayoutParams.width = (int) (f4 * ((float) marginLayoutParams.height));
        }
        view.requestLayout();
    }
}
