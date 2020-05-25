package com.airbnb.lottie.p104a.p106b;

import com.airbnb.lottie.p115g.C2468a;
import com.airbnb.lottie.p115g.C2470c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.a */
public abstract class C2320a<K, A> {

    /* renamed from: a */
    final List<C2321a> f7250a = new ArrayList();

    /* renamed from: b */
    public boolean f7251b = false;

    /* renamed from: c */
    public float f7252c = 0.0f;

    /* renamed from: d */
    protected C2470c<A> f7253d;

    /* renamed from: e */
    private final List<? extends C2468a<K>> f7254e;

    /* renamed from: f */
    private C2468a<K> f7255f;

    /* renamed from: com.airbnb.lottie.a.b.a$a */
    public interface C2321a {
        /* renamed from: a */
        void mo6707a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract A mo6719a(C2468a<K> aVar, float f);

    /* renamed from: f */
    private float m6932f() {
        if (this.f7254e.isEmpty()) {
            return 0.0f;
        }
        return ((C2468a) this.f7254e.get(0)).mo6859a();
    }

    /* renamed from: a */
    public void mo6720a() {
        for (int i = 0; i < this.f7250a.size(); i++) {
            ((C2321a) this.f7250a.get(i)).mo6707a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public float mo6725c() {
        if (this.f7254e.isEmpty()) {
            return 1.0f;
        }
        return ((C2468a) this.f7254e.get(this.f7254e.size() - 1)).mo6861b();
    }

    /* renamed from: d */
    public A mo6726d() {
        float f;
        C2468a e = m6931e();
        C2468a e2 = m6931e();
        if (e2.mo6862c()) {
            f = 0.0f;
        } else {
            f = e2.f7611d.getInterpolation(mo6724b());
        }
        return mo6719a(e, f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final float mo6724b() {
        if (this.f7251b) {
            return 0.0f;
        }
        C2468a e = m6931e();
        if (e.mo6862c()) {
            return 0.0f;
        }
        return (this.f7252c - e.mo6859a()) / (e.mo6861b() - e.mo6859a());
    }

    /* renamed from: e */
    private C2468a<K> m6931e() {
        if (this.f7255f != null && this.f7255f.mo6860a(this.f7252c)) {
            return this.f7255f;
        }
        C2468a<K> aVar = (C2468a) this.f7254e.get(this.f7254e.size() - 1);
        if (this.f7252c < aVar.mo6859a()) {
            for (int size = this.f7254e.size() - 1; size >= 0; size--) {
                aVar = (C2468a) this.f7254e.get(size);
                if (aVar.mo6860a(this.f7252c)) {
                    break;
                }
            }
        }
        this.f7255f = aVar;
        return aVar;
    }

    /* renamed from: a */
    public final void mo6722a(C2321a aVar) {
        this.f7250a.add(aVar);
    }

    /* renamed from: a */
    public final void mo6723a(C2470c<A> cVar) {
        if (this.f7253d != null) {
            this.f7253d.f7625a = null;
        }
        this.f7253d = cVar;
        if (cVar != null) {
            cVar.f7625a = this;
        }
    }

    C2320a(List<? extends C2468a<K>> list) {
        this.f7254e = list;
    }

    /* renamed from: a */
    public void mo6721a(float f) {
        if (f < m6932f()) {
            f = m6932f();
        } else if (f > mo6725c()) {
            f = mo6725c();
        }
        if (f != this.f7252c) {
            this.f7252c = f;
            mo6720a();
        }
    }
}
