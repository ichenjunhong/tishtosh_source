package okhttp3.internal;

/* renamed from: okhttp3.internal.b */
public abstract class C53548b implements Runnable {

    /* renamed from: d */
    protected final String f132681d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo99503a();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f132681d);
        try {
            mo99503a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }

    public C53548b(String str, Object... objArr) {
        this.f132681d = C53559c.m113798a(str, objArr);
    }
}
