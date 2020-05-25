package com.bytedance.android.live.core.rxutils.autodispose.p241a;

import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1709d;

/* renamed from: com.bytedance.android.live.core.rxutils.autodispose.a.a */
public final class C3994a {

    /* renamed from: a */
    private static volatile C1709d f11135a;

    /* renamed from: a */
    public static boolean m10112a(C1709d dVar) {
        if (dVar != null) {
            C1709d dVar2 = f11135a;
            if (dVar2 != null) {
                return dVar2.mo6202a();
            }
            try {
                return dVar.mo6202a();
            } catch (Exception e) {
                throw C1700b.m6016a(e);
            }
        } else {
            throw new NullPointerException("defaultChecker == null");
        }
    }
}
