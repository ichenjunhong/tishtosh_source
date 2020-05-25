package android.arch.p010b;

import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: android.arch.b.f */
public abstract class C0073f<Key, Value> extends C0060b<Key, Value> {

    /* renamed from: a */
    final Object f181a = new Object();

    /* renamed from: b */
    Key f182b = null;

    /* renamed from: c */
    Key f183c = null;

    /* renamed from: android.arch.b.f$a */
    public static abstract class C0074a<Key, Value> {
        /* renamed from: a */
        public abstract void mo118a(List<Value> list, Key key);
    }

    /* renamed from: android.arch.b.f$b */
    static class C0075b<Key, Value> extends C0074a<Key, Value> {

        /* renamed from: a */
        final C0068c<Value> f184a;

        /* renamed from: b */
        private final C0073f<Key, Value> f185b;

        /* renamed from: a */
        public final void mo118a(List<Value> list, Key key) {
            if (!this.f184a.mo113a()) {
                if (this.f184a.f158a == 1) {
                    C0073f<Key, Value> fVar = this.f185b;
                    synchronized (fVar.f181a) {
                        fVar.f182b = key;
                    }
                } else {
                    C0073f<Key, Value> fVar2 = this.f185b;
                    synchronized (fVar2.f181a) {
                        fVar2.f183c = key;
                    }
                }
                this.f184a.mo111a(new C0080g<>(list, 0, 0, 0));
            }
        }

        C0075b(C0073f<Key, Value> fVar, int i, Executor executor, C0081a<Value> aVar) {
            this.f184a = new C0068c<>(fVar, i, executor, aVar);
            this.f185b = fVar;
        }
    }

    /* renamed from: android.arch.b.f$c */
    public static abstract class C0076c<Key, Value> {
        /* renamed from: a */
        public abstract void mo119a(List<Value> list, Key key, Key key2);
    }

    /* renamed from: android.arch.b.f$d */
    static class C0077d<Key, Value> extends C0076c<Key, Value> {

        /* renamed from: a */
        final C0068c<Value> f186a;

        /* renamed from: b */
        private final C0073f<Key, Value> f187b;

        /* renamed from: c */
        private final boolean f188c;

        C0077d(C0073f<Key, Value> fVar, boolean z, C0081a<Value> aVar) {
            this.f186a = new C0068c<>(fVar, 0, null, aVar);
            this.f187b = fVar;
            this.f188c = z;
        }

        /* renamed from: a */
        public final void mo119a(List<Value> list, Key key, Key key2) {
            if (!this.f186a.mo113a()) {
                C0073f<Key, Value> fVar = this.f187b;
                synchronized (fVar.f181a) {
                    fVar.f183c = null;
                    fVar.f182b = key2;
                }
                this.f186a.mo111a(new C0080g<>(list, 0, 0, 0));
            }
        }
    }

    /* renamed from: android.arch.b.f$e */
    public static class C0078e<Key> {

        /* renamed from: a */
        public final int f189a;

        /* renamed from: b */
        public final boolean f190b;

        public C0078e(int i, boolean z) {
            this.f189a = i;
            this.f190b = z;
        }
    }

    /* renamed from: android.arch.b.f$f */
    public static class C0079f<Key> {

        /* renamed from: a */
        public final Key f191a;

        /* renamed from: b */
        public final int f192b;

        public C0079f(Key key, int i) {
            this.f191a = key;
            this.f192b = i;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Key mo87a(int i, Value value) {
        return null;
    }

    /* renamed from: a */
    public abstract void mo116a(C0078e<Key> eVar, C0076c<Key, Value> cVar);

    /* renamed from: a */
    public abstract void mo117a(C0079f<Key> fVar, C0074a<Key, Value> aVar);

    /* renamed from: d */
    private Key mo9351d() {
        Key key;
        synchronized (this.f181a) {
            key = this.f183c;
        }
        return key;
    }

    /* renamed from: e */
    private Key m127e() {
        Key key;
        synchronized (this.f181a) {
            key = this.f182b;
        }
        return key;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo88a(int i, Value value, int i2, Executor executor, C0081a<Value> aVar) {
        Object e = m127e();
        if (e != null) {
            mo117a(new C0079f<>(e, i2), (C0074a<Key, Value>) new C0075b<Key,Value>(this, 1, executor, aVar));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo91b(int i, Value value, int i2, Executor executor, C0081a<Value> aVar) {
        Object d = mo9351d();
        if (d != null) {
            new C0079f(d, i2);
            new C0075b(this, 2, executor, aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo89a(Key key, int i, int i2, boolean z, Executor executor, C0081a<Value> aVar) {
        C0077d dVar = new C0077d(this, z, aVar);
        mo116a(new C0078e<>(i, z), (C0076c<Key, Value>) dVar);
        dVar.f186a.mo112a(executor);
    }
}
