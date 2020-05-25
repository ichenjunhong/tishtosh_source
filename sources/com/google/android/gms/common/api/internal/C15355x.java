package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C15211a;

/* renamed from: com.google.android.gms.common.api.internal.x */
public final class C15355x implements C15264au {

    /* renamed from: a */
    final C15265av f39641a;

    /* renamed from: b */
    boolean f39642b;

    public C15355x(C15265av avVar) {
        this.f39641a = avVar;
    }

    /* renamed from: a */
    public final void mo28149a() {
    }

    /* renamed from: a */
    public final void mo28151a(Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo28152a(ConnectionResult connectionResult, C15211a<?> aVar, boolean z) {
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [com.google.android.gms.common.api.a$h<T>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <A extends com.google.android.gms.common.api.C15211a.C15213b, T extends com.google.android.gms.common.api.internal.C15298c.C15299a<? extends com.google.android.gms.common.api.C15358j, A>> T mo28148a(T r4) {
        /*
            r3 = this;
            com.google.android.gms.common.api.internal.av r0 = r3.f39641a     // Catch:{ DeadObjectException -> 0x0045 }
            com.google.android.gms.common.api.internal.am r0 = r0.f39422m     // Catch:{ DeadObjectException -> 0x0045 }
            com.google.android.gms.common.api.internal.bx r0 = r0.f39379g     // Catch:{ DeadObjectException -> 0x0045 }
            r0.mo28226a(r4)     // Catch:{ DeadObjectException -> 0x0045 }
            com.google.android.gms.common.api.internal.av r0 = r3.f39641a     // Catch:{ DeadObjectException -> 0x0045 }
            com.google.android.gms.common.api.internal.am r0 = r0.f39422m     // Catch:{ DeadObjectException -> 0x0045 }
            com.google.android.gms.common.api.a$c<A> r1 = r4.f39479a     // Catch:{ DeadObjectException -> 0x0045 }
            java.util.Map<com.google.android.gms.common.api.a$c<?>, com.google.android.gms.common.api.a$f> r0 = r0.f39376d     // Catch:{ DeadObjectException -> 0x0045 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ DeadObjectException -> 0x0045 }
            com.google.android.gms.common.api.a$f r0 = (com.google.android.gms.common.api.C15211a.C15222f) r0     // Catch:{ DeadObjectException -> 0x0045 }
            java.lang.String r1 = "Appropriate Api was not requested."
            com.google.android.gms.common.internal.C15464q.m32124a(r0, r1)     // Catch:{ DeadObjectException -> 0x0045 }
            boolean r1 = r0.mo28074g()     // Catch:{ DeadObjectException -> 0x0045 }
            if (r1 != 0) goto L_0x0039
            com.google.android.gms.common.api.internal.av r1 = r3.f39641a     // Catch:{ DeadObjectException -> 0x0045 }
            java.util.Map<com.google.android.gms.common.api.a$c<?>, com.google.android.gms.common.ConnectionResult> r1 = r1.f39416g     // Catch:{ DeadObjectException -> 0x0045 }
            com.google.android.gms.common.api.a$c<A> r2 = r4.f39479a     // Catch:{ DeadObjectException -> 0x0045 }
            boolean r1 = r1.containsKey(r2)     // Catch:{ DeadObjectException -> 0x0045 }
            if (r1 == 0) goto L_0x0039
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status     // Catch:{ DeadObjectException -> 0x0045 }
            r1 = 17
            r0.<init>(r1)     // Catch:{ DeadObjectException -> 0x0045 }
            r4.mo28229b(r0)     // Catch:{ DeadObjectException -> 0x0045 }
            goto L_0x004f
        L_0x0039:
            boolean r1 = r0 instanceof com.google.android.gms.common.internal.C15465r     // Catch:{ DeadObjectException -> 0x0045 }
            if (r1 == 0) goto L_0x0041
            com.google.android.gms.common.internal.r r0 = (com.google.android.gms.common.internal.C15465r) r0     // Catch:{ DeadObjectException -> 0x0045 }
            com.google.android.gms.common.api.a$h<T> r0 = r0.f39872a     // Catch:{ DeadObjectException -> 0x0045 }
        L_0x0041:
            r4.mo28230b(r0)     // Catch:{ DeadObjectException -> 0x0045 }
            goto L_0x004f
        L_0x0045:
            com.google.android.gms.common.api.internal.av r0 = r3.f39641a
            com.google.android.gms.common.api.internal.y r1 = new com.google.android.gms.common.api.internal.y
            r1.<init>(r3, r3)
            r0.mo28186a(r1)
        L_0x004f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C15355x.mo28148a(com.google.android.gms.common.api.internal.c$a):com.google.android.gms.common.api.internal.c$a");
    }

    /* renamed from: b */
    public final boolean mo28156b() {
        if (this.f39642b) {
            return false;
        }
        if (this.f39641a.f39422m.mo28174n()) {
            this.f39642b = true;
            for (C15292bu buVar : this.f39641a.f39422m.f39378f) {
                buVar.f39462b = null;
            }
            return false;
        }
        this.f39641a.mo28184a((ConnectionResult) null);
        return true;
    }

    /* renamed from: c */
    public final void mo28158c() {
        if (this.f39642b) {
            this.f39642b = false;
            this.f39641a.mo28186a((C15266aw) new C15357z(this, this));
        }
    }

    /* renamed from: a */
    public final void mo28150a(int i) {
        this.f39641a.mo28184a((ConnectionResult) null);
        this.f39641a.f39423n.mo28168a(i, this.f39642b);
    }
}
