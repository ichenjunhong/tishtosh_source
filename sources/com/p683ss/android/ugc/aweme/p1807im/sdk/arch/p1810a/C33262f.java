package com.p683ss.android.ugc.aweme.p1807im.sdk.arch.p1810a;

import android.support.p043v7.widget.RecyclerView.C1322a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.arch.a.f */
public final class C33262f<T extends C1322a<?>> implements C33264h {

    /* renamed from: a */
    private final T f86285a;

    /* renamed from: b */
    private final C52671b<Integer, Integer> f86286b;

    /* renamed from: a */
    public final void mo70608a() {
        this.f86285a.notifyDataSetChanged();
    }

    public C33262f(T t, C52671b<? super Integer, Integer> bVar) {
        C52711k.m112240b(t, "adapter");
        C52711k.m112240b(bVar, "positionMapper");
        this.f86285a = t;
        this.f86286b = bVar;
    }

    /* renamed from: a */
    public final void mo164a(int i, int i2) {
        if (i2 != 0) {
            this.f86285a.notifyItemRangeInserted(((Number) this.f86286b.invoke(Integer.valueOf(i))).intValue(), i2);
        }
    }

    /* renamed from: b */
    public final void mo166b(int i, int i2) {
        if (i2 != 0) {
            if (i == 0 && i2 == this.f86285a.getItemCount()) {
                this.f86285a.notifyDataSetChanged();
            }
            this.f86285a.notifyItemRangeRemoved(((Number) this.f86286b.invoke(Integer.valueOf(i))).intValue(), i2);
        }
    }

    /* renamed from: c */
    public final void mo167c(int i, int i2) {
        this.f86285a.notifyItemMoved(((Number) this.f86286b.invoke(Integer.valueOf(i))).intValue(), ((Number) this.f86286b.invoke(Integer.valueOf(i2))).intValue());
    }

    /* renamed from: a */
    public final void mo165a(int i, int i2, Object obj) {
        this.f86285a.notifyItemRangeChanged(((Number) this.f86286b.invoke(Integer.valueOf(i))).intValue(), i2, obj);
    }
}
