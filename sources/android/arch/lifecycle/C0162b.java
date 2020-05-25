package android.arch.lifecycle;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: android.arch.lifecycle.b */
public abstract class C0162b<T> {

    /* renamed from: a */
    public final Executor f411a;

    /* renamed from: b */
    public final LiveData<T> f412b;

    /* renamed from: c */
    public AtomicBoolean f413c = new AtomicBoolean(true);

    /* renamed from: d */
    public AtomicBoolean f414d = new AtomicBoolean(false);

    /* renamed from: e */
    final Runnable f415e = new Runnable() {
        public final void run() {
            boolean z;
            do {
                if (C0162b.this.f414d.compareAndSet(false, true)) {
                    Object obj = null;
                    z = false;
                    while (C0162b.this.f413c.compareAndSet(true, false)) {
                        try {
                            obj = C0162b.this.mo115a();
                            z = true;
                        } finally {
                            C0162b.this.f414d.set(false);
                        }
                    }
                    if (z) {
                        C0162b.this.f412b.postValue(obj);
                    }
                } else {
                    z = false;
                }
                if (!z) {
                    return;
                }
            } while (C0162b.this.f413c.get());
        }
    };

    /* renamed from: f */
    public final Runnable f416f = new Runnable() {
        public final void run() {
            boolean hasActiveObservers = C0162b.this.f412b.hasActiveObservers();
            if (C0162b.this.f413c.compareAndSet(false, true) && hasActiveObservers) {
                C0162b.this.f411a.execute(C0162b.this.f415e);
            }
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo115a();

    public C0162b(Executor executor) {
        this.f411a = executor;
        this.f412b = new LiveData<T>() {
            /* access modifiers changed from: protected */
            public final void onActive() {
                C0162b.this.f411a.execute(C0162b.this.f415e);
            }
        };
    }
}
