package com.p683ss.android.ugc.aweme.p1402b;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.b.e */
public abstract class C23347e implements C23345c {

    /* renamed from: a */
    public final Activity f62352a;

    /* renamed from: com.ss.android.ugc.aweme.b.e$a */
    public class C23348a {

        /* renamed from: a */
        public final List<C52847n<Integer, Integer>> f62353a = new ArrayList();

        /* renamed from: a */
        public final void mo48407a() {
            C23347e.this.mo48404a(this, 0);
        }

        /* renamed from: a */
        public final C23348a mo48405a(int i) {
            return mo48406a(i, 1);
        }

        public C23348a() {
        }

        /* renamed from: a */
        public final C23348a mo48406a(int i, int i2) {
            this.f62353a.add(C52856t.m112465a(Integer.valueOf(i), Integer.valueOf(i2)));
            return this;
        }
    }

    /* renamed from: a */
    public abstract void mo48404a(C23348a aVar, long j);

    /* renamed from: a */
    public final C23348a mo48403a() {
        return new C23348a();
    }

    public C23347e(Activity activity) {
        C52711k.m112240b(activity, "activity");
        this.f62352a = activity;
    }
}
