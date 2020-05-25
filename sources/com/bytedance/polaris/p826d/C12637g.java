package com.bytedance.polaris.p826d;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;
import com.bytedance.common.utility.C9432q;
import com.bytedance.polaris.p821a.C12563i;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.polaris.d.g */
public final class C12637g {

    /* renamed from: a */
    public static boolean f33207a = true;

    /* renamed from: b */
    public Activity f33208b;

    /* renamed from: c */
    public int f33209c;

    /* renamed from: d */
    public int f33210d;

    /* renamed from: e */
    public View f33211e;

    /* renamed from: f */
    public boolean f33212f;

    /* renamed from: g */
    public boolean f33213g;

    /* renamed from: h */
    public boolean f33214h;

    /* renamed from: i */
    public boolean f33215i;

    /* renamed from: j */
    public boolean f33216j;

    /* renamed from: com.bytedance.polaris.d.g$a */
    public static class C12638a {

        /* renamed from: a */
        public int f33217a = C12563i.m25215a().getResources().getColor(R.color.z0);

        /* renamed from: b */
        public boolean f33218b = false;

        /* renamed from: c */
        public boolean f33219c = false;

        /* renamed from: d */
        public boolean f33220d = false;

        /* renamed from: e */
        public boolean f33221e = false;

        /* renamed from: f */
        public boolean f33222f = true;

        /* renamed from: a */
        public final C12638a mo23738a(boolean z) {
            this.f33220d = z;
            return this;
        }

        /* renamed from: a */
        public final C12638a mo23737a(int i) {
            this.f33217a = C12563i.m25215a().getResources().getColor(i);
            return this;
        }
    }

    /* renamed from: a */
    public final void mo23736a(boolean z) {
        m25393a(this.f33208b.getWindow(), z);
    }

    public C12637g(Activity activity, C12638a aVar) {
        this.f33208b = activity;
        this.f33210d = aVar.f33217a;
        this.f33214h = aVar.f33218b;
        this.f33216j = aVar.f33219c;
        this.f33212f = aVar.f33220d;
        this.f33215i = aVar.f33221e;
        if (aVar.f33222f) {
            f33207a = true;
        }
    }

    /* renamed from: a */
    public static void m25393a(Window window, boolean z) {
        int i;
        if (VERSION.SDK_INT >= 23 && f33207a) {
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            View decorView = window.getDecorView();
            if (z) {
                i = systemUiVisibility | VideoCacheReadBuffersizeExperiment.DEFAULT;
            } else {
                i = systemUiVisibility & -8193;
            }
            decorView.setSystemUiVisibility(i);
            if (C12633e.m25373a()) {
                C12633e.m25372a(z, window);
            }
        }
    }

    /* renamed from: a */
    public static int m25392a(Context context, boolean z) {
        int i;
        int i2;
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            i = 0;
        } else if (z) {
            i = context.getResources().getDimensionPixelSize(identifier);
        } else {
            i = (int) (context.getResources().getDimension(identifier) / context.getResources().getDisplayMetrics().density);
        }
        if (z) {
            i2 = (int) C9432q.m18687b(context, 25.0f);
        } else {
            i2 = 25;
        }
        if (i == 0) {
            return i2;
        }
        return i;
    }
}
