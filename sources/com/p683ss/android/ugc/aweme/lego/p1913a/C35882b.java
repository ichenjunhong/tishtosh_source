package com.p683ss.android.ugc.aweme.lego.p1913a;

import android.support.p030v4.view.PagerAdapter;
import android.util.SparseArray;
import android.view.ViewGroup;

/* renamed from: com.ss.android.ugc.aweme.lego.a.b */
public abstract class C35882b<T> extends PagerAdapter {

    /* renamed from: b */
    protected SparseArray<T> f92088b = new SparseArray<>();

    /* renamed from: c */
    protected T f92089c;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo56227b(ViewGroup viewGroup, int i);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract T mo56346c(ViewGroup viewGroup, int i);

    /* renamed from: a */
    public boolean mo56226a(int i) {
        if (this.f92088b.get(i) != null) {
            return true;
        }
        return false;
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        this.f92089c = mo56227b(viewGroup, i);
    }
}
