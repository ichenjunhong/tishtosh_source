package com.p683ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;
import com.gyf.barlibrary.FlymeOSStatusBarFontUtils;
import com.gyf.barlibrary.OSUtils;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.lang.reflect.Method;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.fi */
public final class C47887fi {

    /* renamed from: a */
    public static final C47887fi f120483a = new C47887fi();

    private C47887fi() {
    }

    /* renamed from: a */
    private static void m103583a(boolean z, Window window) {
        int i;
        try {
            Class cls = window.getClass();
            Class cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i2 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Method method = cls.getMethod("setExtraFlags", new Class[]{Integer.TYPE, Integer.TYPE});
            Object[] objArr = new Object[2];
            if (z) {
                i = i2;
            } else {
                i = 0;
            }
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Integer.valueOf(i2);
            method.invoke(window, objArr);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo95098a(Activity activity, Window window, boolean z) {
        if (activity != null && window != null) {
            try {
                if (VERSION.SDK_INT >= 23) {
                    View decorView = window.getDecorView();
                    C52711k.m112236a((Object) decorView, "decorView");
                    int systemUiVisibility = decorView.getSystemUiVisibility();
                    if (!z) {
                        decorView.setSystemUiVisibility(systemUiVisibility & -8193);
                    } else {
                        decorView.setSystemUiVisibility(systemUiVisibility | VideoCacheReadBuffersizeExperiment.DEFAULT);
                    }
                    window.clearFlags(67108864);
                    window.addFlags(DynamicTabYellowPointVersion.DEFAULT);
                }
                if (OSUtils.isMIUI6Later()) {
                    m103583a(z, window);
                }
                if (OSUtils.isFlymeOS4Later()) {
                    FlymeOSStatusBarFontUtils.setStatusBarDarkIcon(activity, z);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
