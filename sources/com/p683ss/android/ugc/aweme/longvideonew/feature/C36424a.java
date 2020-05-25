package com.p683ss.android.ugc.aweme.longvideonew.feature;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.C2240a;
import com.bytedance.common.utility.C9432q;
import java.util.Arrays;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.longvideonew.feature.a */
public final class C36424a {

    /* renamed from: a */
    public int f93297a;

    /* renamed from: b */
    public final Context f93298b;

    /* renamed from: c */
    public final View f93299c;

    /* renamed from: d */
    private final double f93300d = 0.56d;

    /* renamed from: e */
    private int f93301e;

    /* renamed from: f */
    private int f93302f;

    /* renamed from: g */
    private int f93303g;

    /* renamed from: h */
    private final FrameLayout f93304h;

    /* renamed from: a */
    public final void mo75370a(boolean z) {
        LayoutParams layoutParams;
        if (this.f93297a != 0) {
            FrameLayout frameLayout = this.f93304h;
            if (frameLayout != null) {
                layoutParams = frameLayout.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                if (z) {
                    layoutParams2.bottomMargin -= this.f93297a;
                } else {
                    layoutParams2.bottomMargin += this.f93297a;
                }
                this.f93304h.setLayoutParams(layoutParams2);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
    }

    public C36424a(Context context, View view, FrameLayout frameLayout) {
        this.f93298b = context;
        this.f93299c = view;
        this.f93304h = frameLayout;
        View view2 = this.f93299c;
        if (view2 != null) {
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new OnGlobalLayoutListener(this) {

                    /* renamed from: a */
                    final /* synthetic */ C36424a f93305a;

                    public final void onGlobalLayout() {
                        this.f93305a.f93299c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        this.f93305a.f93297a = this.f93305a.mo75369a(this.f93305a.f93298b, this.f93305a.f93299c.getWidth(), this.f93305a.f93299c.getHeight());
                        this.f93305a.mo75370a(false);
                    }

                    {
                        this.f93305a = r1;
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final int mo75369a(Context context, int i, int i2) {
        double d;
        if (i != 0 && i2 != 0) {
            this.f93301e = i;
            this.f93303g = i2;
        } else if (context != null) {
            if (VERSION.SDK_INT >= 17) {
                WindowManager windowManager = ((Activity) context).getWindowManager();
                C52711k.m112236a((Object) windowManager, "(context as Activity).windowManager");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getRealMetrics(displayMetrics);
                this.f93303g = displayMetrics.heightPixels;
                this.f93302f = displayMetrics.heightPixels + C9432q.m18695e(context);
                this.f93301e = displayMetrics.widthPixels;
            } else {
                this.f93303g = C9432q.m18688b(context);
                this.f93302f = this.f93303g;
                this.f93301e = C9432q.m18670a(context);
            }
        }
        double d2 = (double) this.f93301e;
        double d3 = (double) this.f93303g;
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
        if (d >= this.f93300d) {
            return 0;
        }
        return (this.f93303g - ((this.f93301e / 9) * 16)) / 2;
    }
}
