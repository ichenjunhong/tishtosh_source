package com.bytedance.ies.abmock;

import com.google.gson.C17971f;

/* renamed from: com.bytedance.ies.abmock.i */
public final class C10188i {

    /* renamed from: a */
    private static C17971f f27521a;

    /* renamed from: a */
    public static synchronized C17971f m20580a() {
        C17971f fVar;
        synchronized (C10188i.class) {
            if (f27521a == null) {
                f27521a = new C17971f();
            }
            fVar = f27521a;
        }
        return fVar;
    }
}
