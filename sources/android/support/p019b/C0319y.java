package android.support.p019b;

import android.os.Build.VERSION;
import android.view.ViewGroup;

/* renamed from: android.support.b.y */
final class C0319y {
    /* renamed from: a */
    static void m693a(ViewGroup viewGroup, boolean z) {
        if (VERSION.SDK_INT >= 18) {
            C0239aa.m487a(viewGroup, z);
        } else {
            C0320z.m695a(viewGroup, z);
        }
    }
}
