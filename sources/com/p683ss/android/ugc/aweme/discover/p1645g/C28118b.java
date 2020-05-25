package com.p683ss.android.ugc.aweme.discover.p1645g;

import com.p683ss.android.ugc.aweme.discover.p1644f.C28116e;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

/* renamed from: com.ss.android.ugc.aweme.discover.g.b */
public abstract class C28118b implements C28117a, Callable {

    /* renamed from: a */
    public C41440e f73843a;

    /* renamed from: b */
    private boolean f73844b;

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract Object mo56525b() throws Exception;

    /* renamed from: c */
    private void m66927c() {
        if (this.f73844b) {
            throw new CancellationException();
        }
    }

    public final Object call() throws Exception {
        m66927c();
        Object b = mo56525b();
        m66927c();
        return b;
    }

    /* renamed from: a */
    public final void mo56524a() {
        this.f73844b = true;
        if (this.f73843a != null) {
            C28116e.m66923a(this.f73843a).mo56516b().mo56517b(2).mo56520c();
        }
    }
}
