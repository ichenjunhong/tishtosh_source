package com.bytedance.ies.abmock;

/* renamed from: com.bytedance.ies.abmock.g */
public final class C10186g {

    /* renamed from: a */
    private static C10186g f27520a;

    /* renamed from: a */
    public static synchronized C10186g m20576a() {
        C10186g gVar;
        synchronized (C10186g.class) {
            if (f27520a == null) {
                f27520a = new C10186g();
            }
            gVar = f27520a;
        }
        return gVar;
    }
}
