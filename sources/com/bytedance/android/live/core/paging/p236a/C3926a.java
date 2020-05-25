package com.bytedance.android.live.core.paging.p236a;

import android.support.p043v7.p051e.C1208c.C1212c;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.ViewGroup;

/* renamed from: com.bytedance.android.live.core.paging.a.a */
public class C3926a<T> extends C3930c<T> {

    /* renamed from: l */
    private C3927a f10946l;

    /* renamed from: com.bytedance.android.live.core.paging.a.a$a */
    public interface C3927a<V> {
        /* renamed from: a */
        int mo9311a(int i, V v);

        /* renamed from: a */
        C1352v mo9312a(ViewGroup viewGroup, int i);

        /* renamed from: a */
        boolean mo9313a(V v, V v2);

        /* renamed from: b */
        boolean mo9314b(V v, V v2);
    }

    /* renamed from: com.bytedance.android.live.core.paging.a.a$b */
    static class C3928b<T> extends C1212c<T> {

        /* renamed from: a */
        private C3927a<T> f10947a;

        C3928b(C3927a<T> aVar) {
            this.f10947a = aVar;
        }

        /* renamed from: a */
        public final boolean mo3932a(T t, T t2) {
            return this.f10947a.mo9313a(t, t2);
        }

        /* renamed from: b */
        public final boolean mo3933b(T t, T t2) {
            return this.f10947a.mo9314b(t, t2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo9307a() {
        return super.mo9307a();
    }

    public C3926a(C3927a<T> aVar) {
        super(new C3928b(aVar));
        this.f10946l = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9310a(C1352v vVar, int i) {
        mo144a(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo9308a(int i, T t) {
        return this.f10946l.mo9311a(i, t);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C1352v mo9309a(ViewGroup viewGroup, int i) {
        return this.f10946l.mo9312a(viewGroup, i);
    }
}
