package android.arch.p010b;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: android.arch.b.d */
public abstract class C0065d<Key, Value> {

    /* renamed from: a */
    private AtomicBoolean f156a = new AtomicBoolean(false);

    /* renamed from: b */
    private CopyOnWriteArrayList<C0067b> f157b = new CopyOnWriteArrayList<>();

    /* renamed from: android.arch.b.d$a */
    public static abstract class C0066a<Key, Value> {
        /* renamed from: a */
        public abstract C0065d<Key, Value> mo109a();
    }

    /* renamed from: android.arch.b.d$b */
    public interface C0067b {
        /* renamed from: c_ */
        void mo110c_();
    }

    /* renamed from: android.arch.b.d$c */
    static class C0068c<T> {

        /* renamed from: a */
        final int f158a;

        /* renamed from: b */
        public final C0081a<T> f159b;

        /* renamed from: c */
        private final C0065d f160c;

        /* renamed from: d */
        private final Object f161d = new Object();

        /* renamed from: e */
        private Executor f162e = null;

        /* renamed from: f */
        private boolean f163f = false;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo113a() {
            if (!this.f160c.mo108c()) {
                return false;
            }
            mo111a(C0080g.f193a);
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo112a(Executor executor) {
            synchronized (this.f161d) {
                this.f162e = executor;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo111a(final C0080g<T> gVar) {
            Executor executor;
            synchronized (this.f161d) {
                if (!this.f163f) {
                    this.f163f = true;
                    executor = this.f162e;
                } else {
                    throw new IllegalStateException("callback.onResult already called, cannot call again.");
                }
            }
            if (executor != null) {
                executor.execute(new Runnable() {
                    public final void run() {
                        C0068c.this.f159b.mo102a(C0068c.this.f158a, gVar);
                    }
                });
            } else {
                this.f159b.mo102a(this.f158a, gVar);
            }
        }

        C0068c(C0065d dVar, int i, Executor executor, C0081a<T> aVar) {
            this.f160c = dVar;
            this.f158a = i;
            this.f162e = executor;
            this.f159b = aVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo90a();

    /* renamed from: c */
    public boolean mo108c() {
        return this.f156a.get();
    }

    C0065d() {
    }

    /* renamed from: b */
    public void mo106b() {
        if (this.f156a.compareAndSet(false, true)) {
            Iterator it = this.f157b.iterator();
            while (it.hasNext()) {
                ((C0067b) it.next()).mo110c_();
            }
        }
    }

    /* renamed from: a */
    public void mo105a(C0067b bVar) {
        this.f157b.add(bVar);
    }

    /* renamed from: b */
    public void mo107b(C0067b bVar) {
        this.f157b.remove(bVar);
    }
}
