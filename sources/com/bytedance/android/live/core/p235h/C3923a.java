package com.bytedance.android.live.core.p235h;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;

/* renamed from: com.bytedance.android.live.core.h.a */
public abstract class C3923a<T> extends C1352v {

    /* renamed from: a */
    public boolean f10935a;

    /* renamed from: b */
    private final C1689b f10936b = new C1689b();

    /* renamed from: a */
    public static T m9918a(Object obj) {
        return obj;
    }

    /* renamed from: a */
    public abstract void mo9280a(T t, int i);

    /* renamed from: b */
    public boolean mo9281b() {
        return false;
    }

    /* renamed from: c */
    public void mo9282c() {
        this.f10935a = true;
    }

    /* renamed from: d */
    public void mo9283d() {
        this.f10935a = false;
    }

    /* renamed from: a */
    public void mo9278a() {
        this.f10936b.mo6180a();
    }

    public C3923a(View view) {
        super(view);
    }

    /* renamed from: a */
    public final void mo9279a(C1690c cVar) {
        this.f10936b.mo6181a(cVar);
    }
}
