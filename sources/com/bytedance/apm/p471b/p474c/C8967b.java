package com.bytedance.apm.p471b.p474c;

import com.bytedance.apm.C8976c;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p471b.p473b.C8956a;
import com.bytedance.apm.p485h.C9040b;
import com.bytedance.apm.p497o.C9149b;

/* renamed from: com.bytedance.apm.b.c.b */
public abstract class C8967b implements C8975i {

    /* renamed from: a */
    boolean f24404a = ActivityLifeObserver.getInstance().isForeground();

    /* renamed from: b */
    public boolean f24405b = C8976c.m17747c();

    /* renamed from: c */
    private String f24406c;

    /* renamed from: b */
    public void mo16248b() {
        this.f24404a = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo16259b(boolean z);

    /* renamed from: c */
    public void mo16249c() {
        this.f24404a = true;
    }

    /* renamed from: j_ */
    public final void mo16260j_() {
        mo16257a(this.f24404a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16257a(final boolean z) {
        C9149b.m18170a().mo16524a((Runnable) new Runnable() {
            public final void run() {
                C8967b.this.mo16259b(z);
            }
        });
    }

    C8967b(String str) {
        this.f24406c = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16258a(boolean z, long j) {
        C9040b bVar = new C9040b(z, System.currentTimeMillis(), this.f24406c, j);
        C8956a.m17674a().mo16233a(bVar);
    }
}
