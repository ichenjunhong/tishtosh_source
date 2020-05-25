package com.bytedance.jedi.ext.adapter;

import android.arch.lifecycle.C0210y.C0212b;
import android.view.View;
import com.bytedance.jedi.arch.C11791ad;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

public abstract class JediSimpleViewHolder<ITEM> extends JediViewHolder<JediSimpleViewHolder<ITEM>, ITEM> implements C11791ad<C0212b> {

    /* renamed from: f */
    private final C0212b f31627f = C11964e.f31662a;

    /* renamed from: a */
    public final C0212b mo22542a() {
        return this.f31627f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo22662a(ITEM item);

    public JediSimpleViewHolder(View view) {
        C52711k.m112240b(view, "view");
        super(view);
    }

    /* renamed from: a */
    public final void mo22664a(List<Object> list) {
        mo22663a(mo22689o(), this.f31643i, list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22663a(ITEM item, int i, List<Object> list) {
        mo22662a(item);
    }
}
