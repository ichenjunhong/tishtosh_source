package com.p683ss.android.ugc.aweme.location;

import android.content.Context;
import android.support.p030v4.content.C0726c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.location.n */
public interface C36275n {

    /* renamed from: com.ss.android.ugc.aweme.location.n$a */
    public static final class C36276a {
        /* renamed from: a */
        public static boolean m81910a(C36275n nVar, Context context) {
            C52711k.m112240b(context, "context");
            if (C0726c.m2090a(context, "android.permission.ACCESS_FINE_LOCATION") == -1) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    void mo75062a();

    /* renamed from: a */
    void mo75063a(int i);

    /* renamed from: b */
    C36282r mo75064b();

    /* renamed from: c */
    void mo75065c();
}
