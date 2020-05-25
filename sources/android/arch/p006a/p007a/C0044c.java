package android.arch.p006a.p007a;

/* renamed from: android.arch.a.a.c */
public abstract class C0044c {
    /* renamed from: a */
    public abstract void mo55a(Runnable runnable);

    /* renamed from: b */
    public abstract void mo56b(Runnable runnable);

    /* renamed from: c */
    public abstract boolean mo57c();

    /* renamed from: c */
    public final void mo60c(Runnable runnable) {
        if (mo57c()) {
            runnable.run();
        } else {
            mo56b(runnable);
        }
    }
}
