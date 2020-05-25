package com.bytedance.p702im.core.internal.p720c;

import java.util.List;

/* renamed from: com.bytedance.im.core.internal.c.b */
public class C11442b {

    /* renamed from: c */
    private static C11442b f30714c;

    /* renamed from: a */
    public C11443c f30715a = new C11449h();

    /* renamed from: b */
    public C11443c f30716b = new C11444d();

    private C11442b() {
    }

    /* renamed from: a */
    public static C11442b m23355a() {
        if (f30714c == null) {
            synchronized (C11442b.class) {
                if (f30714c == null) {
                    f30714c = new C11442b();
                }
            }
        }
        return f30714c;
    }

    /* renamed from: a */
    public final void mo21074a(List<Long> list) {
        this.f30715a.mo21079a(list);
        this.f30716b.mo21079a(list);
    }
}
