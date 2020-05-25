package com.bytedance.jedi.ext.adapter;

import android.view.View;
import android.view.ViewGroup;
import p2628d.p2639f.p2641b.C52711k;

final class JediInvisibleViewHolder extends JediSimpleViewHolder<Object> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo22662a(Object obj) {
        C52711k.m112240b(obj, "item");
    }

    public JediInvisibleViewHolder(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        super(new View(viewGroup.getContext()));
    }
}
