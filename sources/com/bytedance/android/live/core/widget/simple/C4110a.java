package com.bytedance.android.live.core.widget.simple;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.android.live.core.p235h.C3923a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.live.core.widget.simple.a */
public final class C4110a extends C3923a {

    /* renamed from: b */
    Map<String, Object> f11307b = new HashMap();

    /* renamed from: c */
    private SparseArray<View> f11308c = new SparseArray<>();

    /* renamed from: a */
    public final void mo9280a(Object obj, int i) {
    }

    /* renamed from: b */
    public final void mo9447b(Object obj) {
        this.f11307b.put("__________", obj);
    }

    public C4110a(View view) {
        super(view);
        this.itemView.setTag(this);
    }

    /* renamed from: a */
    public final <V extends View> V mo9446a(int i) {
        V v = (View) this.f11308c.get(i);
        if (v != null) {
            return v;
        }
        V findViewById = this.itemView.findViewById(i);
        this.f11308c.put(i, findViewById);
        return findViewById;
    }
}
