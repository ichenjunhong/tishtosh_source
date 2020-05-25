package com.bytedance.apm.p471b.p474c;

import com.bytedance.apm.p471b.p473b.C8960b;
import com.bytedance.apm.p485h.C9040b;
import com.bytedance.apm.p501q.C9180b;

/* renamed from: com.bytedance.apm.b.c.e */
public final class C8971e extends C8967b {

    /* renamed from: c */
    private long f24419c;

    public C8971e() {
        super("cpu_active_time");
    }

    /* renamed from: b */
    public final void mo16248b() {
        mo16257a(this.f24404a);
        super.mo16248b();
    }

    /* renamed from: c */
    public final void mo16249c() {
        mo16257a(this.f24404a);
        super.mo16249c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo16259b(boolean z) {
        long c = C9180b.m18218c();
        long j = c - this.f24419c;
        if (j > 0) {
            mo16258a(z, j);
            this.f24419c = c;
        }
    }

    /* renamed from: a */
    public final void mo16262a(C8960b bVar, C9040b bVar2) {
        if (bVar2.f24663b) {
            bVar.f24363c += (bVar2.f24668g / 100) * 1000;
            return;
        }
        bVar.f24368h += (bVar2.f24668g / 100) * 1000;
    }
}
