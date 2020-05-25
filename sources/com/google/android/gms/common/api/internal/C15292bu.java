package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C15233f;
import com.google.android.gms.common.api.C15237g;
import com.google.android.gms.common.api.C15239h;
import com.google.android.gms.common.api.C15358j;
import com.google.android.gms.common.api.C15359k;
import com.google.android.gms.common.api.C15360l;
import com.google.android.gms.common.api.C15361m;
import com.google.android.gms.common.api.C15362n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C15464q;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.bu */
public final class C15292bu<R extends C15358j> extends C15362n<R> implements C15359k<R> {

    /* renamed from: a */
    C15361m<? super R, ? extends C15358j> f39461a;

    /* renamed from: b */
    volatile C15360l<? super R> f39462b;

    /* renamed from: c */
    C15237g<R> f39463c;

    /* renamed from: d */
    final Object f39464d;

    /* renamed from: e */
    Status f39465e;
    /* access modifiers changed from: 0000 */

    /* renamed from: f */
    public final WeakReference<C15233f> f39466f;

    /* renamed from: g */
    boolean f39467g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C15292bu<? extends C15358j> f39468h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C15294bw f39469i;

    /* renamed from: a */
    public final void mo23334a(R r) {
        synchronized (this.f39464d) {
            if (!r.mo27935a().mo28060c()) {
                m31693b(r.mo27935a());
                m31694b((C15358j) r);
            } else if (this.f39461a != null) {
                C15285bn.f39448a.submit(new C15293bv(this, r));
            } else if (m31691a()) {
                C15360l<? super R> lVar = this.f39462b;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m31693b(Status status) {
        synchronized (this.f39464d) {
            this.f39465e = status;
            mo28222a(this.f39465e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo28222a(Status status) {
        synchronized (this.f39464d) {
            if (this.f39461a != null) {
                Status a = C15361m.m31937a(status);
                C15464q.m32124a(a, (Object) "onFailure must not return null");
                this.f39468h.m31693b(a);
            } else if (m31691a()) {
                C15360l<? super R> lVar = this.f39462b;
            }
        }
    }

    /* renamed from: a */
    private final boolean m31691a() {
        return (this.f39462b == null || ((C15233f) this.f39466f.get()) == null) ? false : true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m31694b(C15358j jVar) {
        if (jVar instanceof C15239h) {
            try {
                ((C15239h) jVar).mo28127b();
            } catch (RuntimeException unused) {
            }
        }
    }
}
