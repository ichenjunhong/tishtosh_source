package com.facebook.imagepipeline.p974n;

import android.util.Pair;
import com.facebook.common.p920d.C13689i;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.n.az */
public final class C14164az<T> implements C14139am<T> {

    /* renamed from: a */
    public int f36982a;

    /* renamed from: b */
    public final ConcurrentLinkedQueue<Pair<C14188k<T>, C14140an>> f36983b;

    /* renamed from: c */
    public final Executor f36984c;

    /* renamed from: d */
    private final C14139am<T> f36985d;

    /* renamed from: e */
    private final int f36986e = 5;

    /* renamed from: com.facebook.imagepipeline.n.az$a */
    class C14166a extends C14196n<T, T> {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo26239a() {
            this.f37059e.mo26402b();
            m29020c();
        }

        /* renamed from: c */
        private void m29020c() {
            final Pair pair;
            synchronized (C14164az.this) {
                pair = (Pair) C14164az.this.f36983b.poll();
                if (pair == null) {
                    C14164az.this.f36982a--;
                }
            }
            if (pair != null) {
                C14164az.this.f36984c.execute(new Runnable() {
                    public final void run() {
                        C14164az.this.mo26400b((C14188k) pair.first, (C14140an) pair.second);
                    }
                });
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo26242a(Throwable th) {
            this.f37059e.mo26405b(th);
            m29020c();
        }

        private C14166a(C14188k<T> kVar) {
            super(kVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo26241a(T t, int i) {
            this.f37059e.mo26404b(t, i);
            if (m29025a(i)) {
                m29020c();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo26400b(C14188k<T> kVar, C14140an anVar) {
        anVar.mo26387c().onProducerFinishWithSuccess(anVar.mo26386b(), "ThrottlingProducer", null);
        this.f36985d.mo26346a(new C14166a(kVar), anVar);
    }

    /* renamed from: a */
    public final void mo26346a(C14188k<T> kVar, C14140an anVar) {
        boolean z;
        anVar.mo26387c().onProducerStart(anVar.mo26386b(), "ThrottlingProducer");
        synchronized (this) {
            z = true;
            if (this.f36982a >= this.f36986e) {
                this.f36983b.add(Pair.create(kVar, anVar));
            } else {
                this.f36982a++;
                z = false;
            }
        }
        if (!z) {
            mo26400b(kVar, anVar);
        }
    }

    public C14164az(int i, Executor executor, C14139am<T> amVar) {
        this.f36984c = (Executor) C13689i.m27652a(executor);
        this.f36985d = (C14139am) C13689i.m27652a(amVar);
        this.f36983b = new ConcurrentLinkedQueue<>();
        this.f36982a = 0;
    }
}
