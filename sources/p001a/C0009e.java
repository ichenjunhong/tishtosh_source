package p001a;

import java.io.Closeable;

/* renamed from: a.e */
public final class C0009e implements Closeable {

    /* renamed from: a */
    private final Object f14a;

    /* renamed from: b */
    private C0010f f15b;

    /* renamed from: c */
    private Runnable f16c;

    /* renamed from: d */
    private boolean f17d;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo10a() {
        synchronized (this.f14a) {
            if (!this.f17d) {
                this.f16c.run();
                close();
            } else {
                throw new IllegalStateException("Object already closed");
            }
        }
    }

    public final void close() {
        synchronized (this.f14a) {
            if (!this.f17d) {
                this.f17d = true;
                C0010f fVar = this.f15b;
                synchronized (fVar.f18a) {
                    fVar.mo16d();
                    fVar.f19b.remove(this);
                }
                this.f15b = null;
                this.f16c = null;
            }
        }
    }
}
