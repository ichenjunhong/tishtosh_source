package com.p683ss.android.ugc.aweme.longvideo;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.C2240a;
import com.bytedance.common.utility.C9432q;
import java.util.Arrays;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.longvideo.i */
public final class C36381i {

    /* renamed from: a */
    public int f93146a;

    /* renamed from: b */
    private final double f93147b = 0.56d;

    /* renamed from: c */
    private int f93148c;

    /* renamed from: d */
    private int f93149d;

    /* renamed from: e */
    private int f93150e;

    /* renamed from: f */
    private final LinearLayout f93151f;

    /* renamed from: a */
    public final void mo75303a(boolean z) {
        if (this.f93146a != 0) {
            LayoutParams layoutParams = this.f93151f.getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                if (z) {
                    layoutParams2.bottomMargin -= this.f93146a;
                } else {
                    layoutParams2.bottomMargin += this.f93146a;
                }
                this.f93151f.setLayoutParams(layoutParams2);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
    }

    public C36381i(final Context context, final View view, LinearLayout linearLayout) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(view, "rootView");
        C52711k.m112240b(linearLayout, "mPlayContainer");
        this.f93151f = linearLayout;
        view.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener(this) {

            /* renamed from: a */
            final /* synthetic */ C36381i f93152a;

            public final void onGlobalLayout() {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.f93152a.f93146a = this.f93152a.mo75302a(context, view.getWidth(), view.getHeight());
                this.f93152a.mo75303a(false);
            }

            {
                this.f93152a = r1;
            }
        });
    }

    /* renamed from: a */
    public final int mo75302a(Context context, int i, int i2) {
        double d;
        if (i != 0 && i2 != 0) {
            this.f93148c = i;
            this.f93150e = i2;
        } else if (VERSION.SDK_INT < 17) {
            this.f93150e = C9432q.m18688b(context);
            this.f93149d = this.f93150e;
            this.f93148c = C9432q.m18670a(context);
        } else if (context != null) {
            WindowManager windowManager = ((Activity) context).getWindowManager();
            C52711k.m112236a((Object) windowManager, "(context as Activity).windowManager");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            this.f93150e = displayMetrics.heightPixels;
            this.f93149d = displayMetrics.heightPixels + C9432q.m18695e(context);
            this.f93148c = displayMetrics.widthPixels;
        } else {
            throw new C52857u("null cannot be cast to non-null type android.app.Activity");
        }
        double d2 = (double) this.f93148c;
        double d3 = (double) this.f93150e;
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = d2 / d3;
        try {
            String a = C2240a.m6772a("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d4)}, 1));
            C52711k.m112236a((Object) a, "java.lang.String.format(format, *args)");
            d = Double.parseDouble(a);
        } catch (Throwable unused) {
            d = 1.0d;
        }
        if (d >= this.f93147b) {
            return 0;
        }
        return (this.f93150e - ((this.f93148c / 9) * 16)) / 2;
    }
}
