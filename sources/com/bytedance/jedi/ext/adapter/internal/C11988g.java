package com.bytedance.jedi.ext.adapter.internal;

import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.ext.adapter.internal.g */
public final class C11988g {

    /* renamed from: a */
    public final List<JediViewHolderProxy> f31716a = new ArrayList();

    /* renamed from: b */
    public final C11982d f31717b;

    /* renamed from: a */
    public final void mo22724a() {
        if (this.f31716a.size() != 0) {
            for (JediViewHolderProxy jediViewHolderProxy : this.f31716a) {
                if (jediViewHolderProxy != null) {
                    this.f31717b.mo22722b(jediViewHolderProxy);
                }
            }
            this.f31716a.clear();
        }
    }

    /* renamed from: a */
    private final void m24386a(int i) {
        this.f31716a.add(i, null);
    }

    public C11988g(C11982d dVar) {
        C52711k.m112240b(dVar, "manager");
        this.f31717b = dVar;
    }

    /* renamed from: b */
    private final void m24387b(int i, JediViewHolderProxy jediViewHolderProxy) {
        if (i < this.f31716a.size()) {
            this.f31716a.set(i, jediViewHolderProxy);
        } else {
            this.f31716a.add(i, jediViewHolderProxy);
        }
    }

    /* renamed from: a */
    public final void mo22725a(int i, JediViewHolderProxy jediViewHolderProxy) {
        if (i >= 0 && i <= this.f31716a.size()) {
            if (jediViewHolderProxy != null) {
                m24387b(i, jediViewHolderProxy);
            } else {
                m24386a(i);
            }
        }
    }
}
