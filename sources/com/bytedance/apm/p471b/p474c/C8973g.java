package com.bytedance.apm.p471b.p474c;

import com.bytedance.apm.p471b.p473b.C8960b;
import com.bytedance.apm.p485h.C9040b;
import com.bytedance.apm.p485h.C9046h;
import com.bytedance.apm.p501q.C9201q;

/* renamed from: com.bytedance.apm.b.c.g */
public final class C8973g extends C8967b {

    /* renamed from: c */
    private volatile boolean f24420c;

    /* renamed from: d */
    private long f24421d = -1;

    /* renamed from: e */
    private long f24422e = -1;

    public C8973g() {
        super("traffic");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo16259b(boolean z) {
        if (this.f24405b) {
            try {
                if (!this.f24420c) {
                    this.f24420c = true;
                }
                C9046h b = C9201q.m18283b();
                if (b != null) {
                    if (this.f24422e > -1 && this.f24421d > -1) {
                        mo16258a(true, b.f24706i - this.f24421d);
                        mo16258a(false, b.f24707j - this.f24422e);
                    }
                    this.f24421d = b.f24706i;
                    this.f24422e = b.f24707j;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo16262a(C8960b bVar, C9040b bVar2) {
        if (bVar2.f24663b) {
            bVar.f24367g += bVar2.f24668g;
            return;
        }
        bVar.f24372l += bVar2.f24668g;
    }
}
