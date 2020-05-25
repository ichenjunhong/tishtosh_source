package p2703uk.p2704co.senab.photoview;

import android.os.Build.VERSION;
import android.view.View;

/* renamed from: uk.co.senab.photoview.a */
public final class C53887a {
    /* renamed from: a */
    public static void m114553a(View view, Runnable runnable) {
        if (VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, 16);
        }
    }
}
