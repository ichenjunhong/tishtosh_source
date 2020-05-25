package p064c.p065a.p069b;

/* renamed from: c.a.b.f */
final class C1693f extends C1692e<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    public final String toString() {
        StringBuilder sb = new StringBuilder("RunnableDisposable(disposed=");
        sb.append(isDisposed());
        sb.append(", ");
        sb.append(get());
        sb.append(")");
        return sb.toString();
    }

    C1693f(Runnable runnable) {
        super(runnable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo6179a(Object obj) {
        ((Runnable) obj).run();
    }
}
