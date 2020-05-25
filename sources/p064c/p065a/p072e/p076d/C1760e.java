package p064c.p065a.p072e.p076d;

/* renamed from: c.a.e.d.e */
public final class C1760e<T> extends C1759d<T> {
    public final void onError(Throwable th) {
        if (this.f5870a == null) {
            this.f5871b = th;
        }
        countDown();
    }

    public final void onNext(T t) {
        if (this.f5870a == null) {
            this.f5870a = t;
            this.f5872c.dispose();
            countDown();
        }
    }
}
