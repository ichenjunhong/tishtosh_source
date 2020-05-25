package com.bytedance.jedi.ext.adapter.internal;

import android.support.p043v7.widget.RecyclerView;
import com.bytedance.jedi.ext.adapter.p745a.p746a.C11943b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.ext.adapter.internal.a */
public final class C11977a {

    /* renamed from: a */
    public boolean f31691a = true;

    /* renamed from: b */
    public int f31692b = -241;

    /* renamed from: c */
    public final C11943b f31693c = new C11943b(null, null, 3, null);

    /* renamed from: d */
    public C11989h f31694d;

    /* renamed from: a */
    public final void mo22715a(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "recyclerView");
        C11943b bVar = this.f31693c;
        C52711k.m112240b(recyclerView, "recyclerView");
        bVar.f31636a = recyclerView;
        recyclerView.addOnAttachStateChangeListener(bVar);
        this.f31694d = new C11989h();
    }

    /* renamed from: b */
    public final void mo22716b(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "recyclerView");
        C11943b bVar = this.f31693c;
        C52711k.m112240b(recyclerView, "recyclerView");
        bVar.f31636a = null;
        recyclerView.removeOnAttachStateChangeListener(bVar);
        this.f31694d = null;
    }
}
