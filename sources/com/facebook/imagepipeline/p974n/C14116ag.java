package com.facebook.imagepipeline.p974n;

import android.util.Pair;
import com.facebook.common.p920d.C13689i;
import com.facebook.imagepipeline.common.C13951c;
import com.facebook.imagepipeline.n.ag$a.a;
import com.facebook.imagepipeline.p976p.C14237b;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.facebook.imagepipeline.n.ag */
public abstract class C14116ag<K, T extends Closeable> implements C14139am<T> {

    /* renamed from: a */
    final Map<K, C14118a> f36858a = new HashMap();

    /* renamed from: b */
    public final C14139am<T> f36859b;

    /* renamed from: com.facebook.imagepipeline.n.ag$a */
    class C14118a {

        /* renamed from: a */
        final K f36860a;

        /* renamed from: b */
        public final CopyOnWriteArraySet<Pair<C14188k<T>, C14140an>> f36861b = new CopyOnWriteArraySet<>();

        /* renamed from: c */
        T f36862c;

        /* renamed from: d */
        float f36863d;

        /* renamed from: e */
        public C14177d f36864e;

        /* renamed from: f */
        a f36865f;

        /* renamed from: h */
        private int f36867h;

        /* renamed from: com.facebook.imagepipeline.n.ag$a$a */
        class C14120a extends C14168b<T> {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo26239a() {
                try {
                    if (C14237b.m29187b()) {
                        C14237b.m29186a("MultiplexProducer#onCancellation");
                    }
                    C14118a aVar = C14118a.this;
                    synchronized (aVar) {
                        if (aVar.f36865f == this) {
                            aVar.f36865f = null;
                            aVar.f36864e = null;
                            C14118a.m28916a(aVar.f36862c);
                            aVar.f36862c = null;
                            aVar.mo26360a();
                        }
                    }
                    if (C14237b.m29187b()) {
                        C14237b.m29185a();
                    }
                } catch (Throwable th) {
                    if (C14237b.m29187b()) {
                        C14237b.m29185a();
                    }
                    throw th;
                }
            }

            private C14120a() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo26240a(float f) {
                try {
                    if (C14237b.m29187b()) {
                        C14237b.m29186a("MultiplexProducer#onProgressUpdate");
                    }
                    C14118a aVar = C14118a.this;
                    synchronized (aVar) {
                        if (aVar.f36865f == this) {
                            aVar.f36863d = f;
                            Iterator it = aVar.f36861b.iterator();
                            while (it.hasNext()) {
                                Pair pair = (Pair) it.next();
                                synchronized (pair) {
                                    ((C14188k) pair.first).mo26403b(f);
                                }
                            }
                        }
                    }
                    if (C14237b.m29187b()) {
                        C14237b.m29185a();
                    }
                } catch (Throwable th) {
                    if (C14237b.m29187b()) {
                        C14237b.m29185a();
                    }
                    throw th;
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo26242a(Throwable th) {
                try {
                    if (C14237b.m29187b()) {
                        C14237b.m29186a("MultiplexProducer#onFailure");
                    }
                    C14118a aVar = C14118a.this;
                    synchronized (aVar) {
                        if (aVar.f36865f == this) {
                            Iterator it = aVar.f36861b.iterator();
                            aVar.f36861b.clear();
                            C14116ag.this.mo26359a(aVar.f36860a, aVar);
                            C14118a.m28916a(aVar.f36862c);
                            aVar.f36862c = null;
                            while (it.hasNext()) {
                                Pair pair = (Pair) it.next();
                                synchronized (pair) {
                                    ((C14188k) pair.first).mo26405b(th);
                                }
                            }
                        }
                    }
                    if (C14237b.m29187b()) {
                        C14237b.m29185a();
                    }
                } catch (Throwable th2) {
                    if (C14237b.m29187b()) {
                        C14237b.m29185a();
                    }
                    throw th2;
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final /* synthetic */ void mo26241a(Object obj, int i) {
                Closeable closeable = (Closeable) obj;
                try {
                    if (C14237b.m29187b()) {
                        C14237b.m29186a("MultiplexProducer#onNewResult");
                    }
                    C14118a.this.mo26361a(this, closeable, i);
                } finally {
                    if (C14237b.m29187b()) {
                        C14237b.m29185a();
                    }
                }
            }
        }

        /* renamed from: b */
        public final synchronized List<C14141ao> mo26363b() {
            if (this.f36864e == null) {
                return null;
            }
            return this.f36864e.mo26408a(m28917e());
        }

        /* renamed from: c */
        public final synchronized List<C14141ao> mo26364c() {
            if (this.f36864e == null) {
                return null;
            }
            return this.f36864e.mo26409b(m28918f());
        }

        /* renamed from: d */
        public final synchronized List<C14141ao> mo26365d() {
            if (this.f36864e == null) {
                return null;
            }
            return this.f36864e.mo26407a(m28919g());
        }

        /* renamed from: e */
        private synchronized boolean m28917e() {
            Iterator it = this.f36861b.iterator();
            while (it.hasNext()) {
                if (!((C14140an) ((Pair) it.next()).second).mo26390f()) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: f */
        private synchronized boolean m28918f() {
            Iterator it = this.f36861b.iterator();
            while (it.hasNext()) {
                if (((C14140an) ((Pair) it.next()).second).mo26392h()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private synchronized C13951c m28919g() {
            C13951c cVar;
            cVar = C13951c.LOW;
            Iterator it = this.f36861b.iterator();
            while (it.hasNext()) {
                cVar = C13951c.getHigherPriority(cVar, ((C14140an) ((Pair) it.next()).second).mo26391g());
            }
            return cVar;
        }

        /* renamed from: a */
        public final void mo26360a() {
            boolean z;
            synchronized (this) {
                boolean z2 = false;
                if (this.f36864e == null) {
                    z = true;
                } else {
                    z = false;
                }
                C13689i.m27655a(z);
                if (this.f36865f == null) {
                    z2 = true;
                }
                C13689i.m27655a(z2);
                if (this.f36861b.isEmpty()) {
                    C14116ag.this.mo26359a(this.f36860a, this);
                    return;
                }
                C14140an anVar = (C14140an) ((Pair) this.f36861b.iterator().next()).second;
                C14177d dVar = new C14177d(anVar.mo26384a(), anVar.mo26386b(), anVar.mo26387c(), anVar.mo26388d(), anVar.mo26389e(), m28917e(), m28918f(), m28919g());
                this.f36864e = dVar;
                this.f36865f = new C14120a();
                C14177d dVar2 = this.f36864e;
                a aVar = this.f36865f;
                C14116ag.this.f36859b.mo26346a(aVar, dVar2);
            }
        }

        /* renamed from: a */
        static void m28916a(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public C14118a(K k) {
            this.f36860a = k;
        }

        /* JADX INFO: used method not loaded: com.facebook.imagepipeline.n.d.a(java.util.List):null, types can be incorrect */
        /* JADX INFO: used method not loaded: com.facebook.imagepipeline.n.d.b(java.util.List):null, types can be incorrect */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
            com.facebook.imagepipeline.p974n.C14177d.m29054a(r1);
            com.facebook.imagepipeline.p974n.C14177d.m29056c(r2);
            com.facebook.imagepipeline.p974n.C14177d.m29055b(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            monitor-enter(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
            if (r4 == r7.f36862c) goto L_0x003b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
            r4 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
            if (r4 == null) goto L_0x0043;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
            r4 = r7.f36866g.mo26357a(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
            monitor-exit(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
            if (r4 == null) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
            if (r5 <= 0.0f) goto L_0x004e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            r8.mo26403b(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x004e, code lost:
            r8.mo26404b(r4, r6);
            m28916a(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0054, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0055, code lost:
            r9.mo26385a(new com.facebook.imagepipeline.p974n.C14116ag.C14118a.C141191(r7));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x005e, code lost:
            return true;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo26362a(com.facebook.imagepipeline.p974n.C14188k<T> r8, com.facebook.imagepipeline.p974n.C14140an r9) {
            /*
                r7 = this;
                android.util.Pair r0 = android.util.Pair.create(r8, r9)
                monitor-enter(r7)
                com.facebook.imagepipeline.n.ag r1 = com.facebook.imagepipeline.p974n.C14116ag.this     // Catch:{ all -> 0x0065 }
                K r2 = r7.f36860a     // Catch:{ all -> 0x0065 }
                com.facebook.imagepipeline.n.ag$a r1 = r1.mo26356a(r2)     // Catch:{ all -> 0x0065 }
                if (r1 == r7) goto L_0x0012
                r8 = 0
                monitor-exit(r7)     // Catch:{ all -> 0x0065 }
                return r8
            L_0x0012:
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.n.k<T>, com.facebook.imagepipeline.n.an>> r1 = r7.f36861b     // Catch:{ all -> 0x0065 }
                r1.add(r0)     // Catch:{ all -> 0x0065 }
                java.util.List r1 = r7.mo26363b()     // Catch:{ all -> 0x0065 }
                java.util.List r2 = r7.mo26365d()     // Catch:{ all -> 0x0065 }
                java.util.List r3 = r7.mo26364c()     // Catch:{ all -> 0x0065 }
                T r4 = r7.f36862c     // Catch:{ all -> 0x0065 }
                float r5 = r7.f36863d     // Catch:{ all -> 0x0065 }
                int r6 = r7.f36867h     // Catch:{ all -> 0x0065 }
                monitor-exit(r7)     // Catch:{ all -> 0x0065 }
                com.facebook.imagepipeline.p974n.C14177d.m29054a(r1)
                com.facebook.imagepipeline.p974n.C14177d.m29056c(r2)
                com.facebook.imagepipeline.p974n.C14177d.m29055b(r3)
                monitor-enter(r0)
                monitor-enter(r7)     // Catch:{ all -> 0x0062 }
                T r1 = r7.f36862c     // Catch:{ all -> 0x005f }
                if (r4 == r1) goto L_0x003b
                r4 = 0
                goto L_0x0043
            L_0x003b:
                if (r4 == 0) goto L_0x0043
                com.facebook.imagepipeline.n.ag r1 = com.facebook.imagepipeline.p974n.C14116ag.this     // Catch:{ all -> 0x005f }
                java.io.Closeable r4 = r1.mo26357a(r4)     // Catch:{ all -> 0x005f }
            L_0x0043:
                monitor-exit(r7)     // Catch:{ all -> 0x005f }
                if (r4 == 0) goto L_0x0054
                r1 = 0
                int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r1 <= 0) goto L_0x004e
                r8.mo26403b(r5)     // Catch:{ all -> 0x0062 }
            L_0x004e:
                r8.mo26404b(r4, r6)     // Catch:{ all -> 0x0062 }
                m28916a(r4)     // Catch:{ all -> 0x0062 }
            L_0x0054:
                monitor-exit(r0)     // Catch:{ all -> 0x0062 }
                com.facebook.imagepipeline.n.ag$a$1 r8 = new com.facebook.imagepipeline.n.ag$a$1
                r8.<init>(r0)
                r9.mo26385a(r8)
                r8 = 1
                return r8
            L_0x005f:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x005f }
                throw r8     // Catch:{ all -> 0x0062 }
            L_0x0062:
                r8 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0062 }
                throw r8
            L_0x0065:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x0065 }
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p974n.C14116ag.C14118a.mo26362a(com.facebook.imagepipeline.n.k, com.facebook.imagepipeline.n.an):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
            if (r3.hasNext() == false) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
            r0 = (android.util.Pair) r3.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            ((com.facebook.imagepipeline.p974n.C14188k) r0.first).mo26404b(r4, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo26361a(com.facebook.imagepipeline.n.ag$a.a r3, T r4, int r5) {
            /*
                r2 = this;
                monitor-enter(r2)
                com.facebook.imagepipeline.n.ag$a.a<> r0 = r2.f36865f     // Catch:{ all -> 0x004d }
                if (r0 == r3) goto L_0x0007
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
                return
            L_0x0007:
                T r3 = r2.f36862c     // Catch:{ all -> 0x004d }
                m28916a(r3)     // Catch:{ all -> 0x004d }
                r3 = 0
                r2.f36862c = r3     // Catch:{ all -> 0x004d }
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.n.k<T>, com.facebook.imagepipeline.n.an>> r3 = r2.f36861b     // Catch:{ all -> 0x004d }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x004d }
                boolean r0 = com.facebook.imagepipeline.p974n.C14168b.m29027b(r5)     // Catch:{ all -> 0x004d }
                if (r0 == 0) goto L_0x0026
                com.facebook.imagepipeline.n.ag r0 = com.facebook.imagepipeline.p974n.C14116ag.this     // Catch:{ all -> 0x004d }
                java.io.Closeable r0 = r0.mo26357a(r4)     // Catch:{ all -> 0x004d }
                r2.f36862c = r0     // Catch:{ all -> 0x004d }
                r2.f36867h = r5     // Catch:{ all -> 0x004d }
                goto L_0x0032
            L_0x0026:
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.n.k<T>, com.facebook.imagepipeline.n.an>> r0 = r2.f36861b     // Catch:{ all -> 0x004d }
                r0.clear()     // Catch:{ all -> 0x004d }
                com.facebook.imagepipeline.n.ag r0 = com.facebook.imagepipeline.p974n.C14116ag.this     // Catch:{ all -> 0x004d }
                K r1 = r2.f36860a     // Catch:{ all -> 0x004d }
                r0.mo26359a(r1, r2)     // Catch:{ all -> 0x004d }
            L_0x0032:
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
            L_0x0033:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x004c
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                monitor-enter(r0)
                java.lang.Object r1 = r0.first     // Catch:{ all -> 0x0049 }
                com.facebook.imagepipeline.n.k r1 = (com.facebook.imagepipeline.p974n.C14188k) r1     // Catch:{ all -> 0x0049 }
                r1.mo26404b(r4, r5)     // Catch:{ all -> 0x0049 }
                monitor-exit(r0)     // Catch:{ all -> 0x0049 }
                goto L_0x0033
            L_0x0049:
                r3 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0049 }
                throw r3
            L_0x004c:
                return
            L_0x004d:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p974n.C14116ag.C14118a.mo26361a(com.facebook.imagepipeline.n.ag$a$a, java.io.Closeable, int):void");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo26357a(T t);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract K mo26358a(C14140an anVar);

    protected C14116ag(C14139am<T> amVar) {
        this.f36859b = amVar;
    }

    /* renamed from: b */
    private synchronized C14118a m28910b(K k) {
        C14118a aVar;
        aVar = new C14118a<>(k);
        this.f36858a.put(k, aVar);
        return aVar;
    }

    /* renamed from: a */
    public final synchronized C14118a mo26356a(K k) {
        return (C14118a) this.f36858a.get(k);
    }

    /* renamed from: a */
    public final synchronized void mo26359a(K k, C14118a aVar) {
        if (this.f36858a.get(k) == aVar) {
            this.f36858a.remove(k);
        }
    }

    /* renamed from: a */
    public final void mo26346a(C14188k<T> kVar, C14140an anVar) {
        boolean z;
        C14118a a;
        try {
            if (C14237b.m29187b()) {
                C14237b.m29186a("MultiplexProducer#produceResults");
            }
            Object a2 = mo26358a(anVar);
            do {
                z = false;
                synchronized (this) {
                    a = mo26356a((K) a2);
                    if (a == null) {
                        a = m28910b(a2);
                        z = true;
                    }
                }
            } while (!a.mo26362a(kVar, anVar));
            if (z) {
                a.mo26360a();
            }
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
        } catch (Throwable th) {
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
            throw th;
        }
    }
}
