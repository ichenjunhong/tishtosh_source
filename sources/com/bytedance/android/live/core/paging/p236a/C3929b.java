package com.bytedance.android.live.core.paging.p236a;

import android.support.p043v7.widget.RecyclerView.LayoutParams;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.core.p235h.C3923a;

/* renamed from: com.bytedance.android.live.core.paging.a.b */
public final class C3929b extends C3923a<Object> {

    /* renamed from: b */
    private ViewGroup f10948b;

    public C3929b(ViewGroup viewGroup) {
        super(new View(viewGroup.getContext()));
        this.f10948b = viewGroup;
    }

    /* renamed from: a */
    public final void mo9280a(Object obj, int i) {
        this.itemView.setLayoutParams(new LayoutParams(this.f10948b.getMeasuredWidth(), 1));
    }
}
