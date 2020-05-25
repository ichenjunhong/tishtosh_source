package com.p683ss.android.ugc.aweme.sharer.p2172b;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sharer.b.d */
public final class C42314d {

    /* renamed from: a */
    public static final C42314d f106873a = new C42314d();

    private C42314d() {
    }

    /* renamed from: a */
    public static boolean m92913a(Context context, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "packageName");
        try {
            if (context.getPackageManager().getPackageInfo(str, 0) != null) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
            return false;
        }
    }
}
