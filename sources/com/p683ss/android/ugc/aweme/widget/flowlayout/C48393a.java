package com.p683ss.android.ugc.aweme.widget.flowlayout;

import android.util.SparseArray;
import android.view.View;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.widget.flowlayout.a */
public abstract class C48393a<T> {

    /* renamed from: a */
    private List<T> f121726a;

    /* renamed from: b */
    private SparseArray<C48396c> f121727b = new SparseArray<>();

    /* renamed from: d */
    public C48394a f121728d;

    /* renamed from: e */
    public HashSet<Integer> f121729e = new HashSet<>();

    /* renamed from: com.ss.android.ugc.aweme.widget.flowlayout.a$a */
    public interface C48394a {
        /* renamed from: a */
        void mo95849a();
    }

    /* renamed from: a */
    public abstract View mo56339a(FlowLayout flowLayout, int i, T t);

    /* renamed from: a */
    public void mo60843a(int i, View view) {
    }

    /* renamed from: b */
    public void mo60844b(int i, View view) {
    }

    /* renamed from: a */
    public final int mo95860a() {
        if (this.f121726a == null) {
            return 0;
        }
        return this.f121726a.size();
    }

    /* renamed from: a */
    public final T mo95861a(int i) {
        return this.f121726a.get(i);
    }

    public C48393a(List<T> list) {
        this.f121726a = list;
    }

    /* renamed from: a */
    public final void mo95862a(int i, C48396c cVar) {
        this.f121727b.append(i, cVar);
    }
}
