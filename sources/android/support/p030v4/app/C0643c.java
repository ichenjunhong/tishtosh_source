package android.support.p030v4.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.p038f.C0794k;
import android.util.Pair;
import android.view.View;

/* renamed from: android.support.v4.app.c */
public class C0643c {

    /* renamed from: android.support.v4.app.c$a */
    static class C0644a extends C0643c {

        /* renamed from: a */
        private final ActivityOptions f2309a;

        /* renamed from: a */
        public final Bundle mo2171a() {
            return this.f2309a.toBundle();
        }

        C0644a(ActivityOptions activityOptions) {
            this.f2309a = activityOptions;
        }
    }

    protected C0643c() {
    }

    /* renamed from: a */
    public Bundle mo2171a() {
        return null;
    }

    /* renamed from: a */
    public static C0643c m1726a(Activity activity, C0794k<View, String>... kVarArr) {
        if (VERSION.SDK_INT < 21) {
            return new C0643c();
        }
        Pair[] pairArr = new Pair[kVarArr.length];
        for (int i = 0; i < kVarArr.length; i++) {
            pairArr[i] = Pair.create(kVarArr[i].f2711a, kVarArr[i].f2712b);
        }
        return new C0644a(ActivityOptions.makeSceneTransitionAnimation(activity, pairArr));
    }

    /* renamed from: a */
    public static C0643c m1725a(Activity activity, View view, String str) {
        if (VERSION.SDK_INT >= 21) {
            return new C0644a(ActivityOptions.makeSceneTransitionAnimation(activity, view, str));
        }
        return new C0643c();
    }

    /* renamed from: a */
    public static C0643c m1727a(Context context, int i, int i2) {
        if (VERSION.SDK_INT >= 16) {
            return new C0644a(ActivityOptions.makeCustomAnimation(context, i, i2));
        }
        return new C0643c();
    }

    /* renamed from: b */
    public static C0643c m1729b(View view, int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 23) {
            return new C0644a(ActivityOptions.makeClipRevealAnimation(view, 0, 0, i3, i4));
        }
        return new C0643c();
    }

    /* renamed from: a */
    public static C0643c m1728a(View view, int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 16) {
            return new C0644a(ActivityOptions.makeScaleUpAnimation(view, i, i2, 0, 0));
        }
        return new C0643c();
    }
}
