package com.bytedance.jedi.ext.adapter.p745a.p746a;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.ext.adapter.a.a.b */
public final class C11943b implements OnAttachStateChangeListener {

    /* renamed from: a */
    public RecyclerView f31636a;

    /* renamed from: b */
    private final C52671b<RecyclerView, C52860x> f31637b;

    /* renamed from: c */
    private final C52671b<RecyclerView, C52860x> f31638c;

    public C11943b() {
        this(null, null, 3, null);
    }

    public final void onViewAttachedToWindow(View view) {
        C52711k.m112240b(view, "v");
        this.f31636a = (RecyclerView) view;
        C52671b<RecyclerView, C52860x> bVar = this.f31637b;
        if (bVar != null) {
            bVar.invoke(view);
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        C52711k.m112240b(view, "v");
        this.f31636a = null;
        C52671b<RecyclerView, C52860x> bVar = this.f31638c;
        if (bVar != null) {
            bVar.invoke((RecyclerView) view);
        }
    }

    private C11943b(C52671b<? super RecyclerView, C52860x> bVar, C52671b<? super RecyclerView, C52860x> bVar2) {
        this.f31637b = bVar;
        this.f31638c = bVar2;
    }

    public /* synthetic */ C11943b(C52671b bVar, C52671b bVar2, int i, C52707g gVar) {
        this(null, null);
    }
}
