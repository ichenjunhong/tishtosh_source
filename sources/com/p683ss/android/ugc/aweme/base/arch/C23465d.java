package com.p683ss.android.ugc.aweme.base.arch;

import android.arch.lifecycle.C0184k;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.ext.adapter.C11971g;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.p747b.C11954g;
import com.bytedance.jedi.ext.adapter.p747b.C11959h;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.base.arch.d */
public abstract class C23465d<VH extends JediViewHolder<? extends C11796d, ?>> extends C23471h<VH, C11971g<VH>> {

    /* renamed from: a */
    public final C11971g<VH> f62535a;

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C11954g mo22686b() {
        return this.f62535a;
    }

    public C23465d(C0184k kVar) {
        C52711k.m112240b(kVar, "parent");
        C11971g<VH> gVar = new C11971g<>(kVar);
        mo48639a((C11959h<VH>) gVar);
        this.f62535a = gVar;
    }
}
