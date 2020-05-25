package android.arch.p006a.p007a;

import java.util.concurrent.Executor;

/* renamed from: android.arch.a.a.a */
public class C0040a extends C0044c {

    /* renamed from: a */
    public static final Executor f104a = new Executor() {
        public final void execute(Runnable runnable) {
            C0040a.m62a().mo55a(runnable);
        }
    };

    /* renamed from: b */
    private static volatile C0040a f105b;

    /* renamed from: e */
    private static final Executor f106e = new Executor() {
        public final void execute(Runnable runnable) {
            C0040a.m62a().mo56b(runnable);
        }
    };

    /* renamed from: c */
    private C0044c f107c = this.f108d;

    /* renamed from: d */
    private C0044c f108d = new C0043b();

    /* renamed from: b */
    public static Executor m63b() {
        return f106e;
    }

    /* renamed from: c */
    public final boolean mo57c() {
        return this.f107c.mo57c();
    }

    private C0040a() {
    }

    /* renamed from: a */
    public static C0040a m62a() {
        if (f105b != null) {
            return f105b;
        }
        synchronized (C0040a.class) {
            if (f105b == null) {
                f105b = new C0040a();
            }
        }
        return f105b;
    }

    /* renamed from: a */
    public final void mo55a(Runnable runnable) {
        this.f107c.mo55a(runnable);
    }

    /* renamed from: b */
    public final void mo56b(Runnable runnable) {
        this.f107c.mo56b(runnable);
    }
}
