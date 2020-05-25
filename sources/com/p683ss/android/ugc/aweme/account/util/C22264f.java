package com.p683ss.android.ugc.aweme.account.util;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.util.f */
public final class C22264f {

    /* renamed from: a */
    public static final C22264f f60038a = new C22264f();

    private C22264f() {
    }

    /* renamed from: a */
    public static final void m55111a(String str, Bundle bundle) {
        C52711k.m112240b(str, "logTag");
        if (bundle != null) {
            Set keySet = bundle.keySet();
            if (keySet != null) {
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}
