package android.arch.p011c.p014b;

import android.arch.p011c.p012a.C0126f;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: android.arch.c.b.j */
public abstract class C0151j {

    /* renamed from: a */
    private final AtomicBoolean f384a = new AtomicBoolean(false);

    /* renamed from: b */
    private final C0142f f385b;

    /* renamed from: c */
    private volatile C0126f f386c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo216a();

    /* renamed from: c */
    private C0126f m344c() {
        return this.f385b.mo239a(mo216a());
    }

    /* renamed from: b */
    public final C0126f mo264b() {
        this.f385b.mo245b();
        if (!this.f384a.compareAndSet(false, true)) {
            return m344c();
        }
        if (this.f386c == null) {
            this.f386c = m344c();
        }
        return this.f386c;
    }

    public C0151j(C0142f fVar) {
        this.f385b = fVar;
    }

    /* renamed from: a */
    public final void mo263a(C0126f fVar) {
        if (fVar == this.f386c) {
            this.f384a.set(false);
        }
    }
}
