package com.facebook.p914c.p916b;

import com.facebook.common.p921e.C13697a;
import com.facebook.common.p923g.C13709h;
import com.facebook.common.p923g.C13711i;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p964d.C13962e;
import com.facebook.imagepipeline.p964d.C13992u;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.p913b.C13613a;
import com.facebook.p914c.p915a.C13619c;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p001a.C0013i;

/* renamed from: com.facebook.c.b.k */
public class C13653k extends C13962e {

    /* renamed from: a */
    public static final Class<?> f35632a = C13653k.class;

    /* renamed from: b */
    public final C13992u f35633b;

    /* renamed from: h */
    private final C13651i f35634h;

    /* renamed from: i */
    private final C13711i f35635i;

    /* renamed from: j */
    private final Executor f35636j;

    /* renamed from: a */
    public final C13709h mo25530a(C13619c cVar) throws IOException {
        InputStream a;
        try {
            C13697a.m27673a(f35632a, "Disk cache read for %s", (Object) cVar.toString());
            C13613a a2 = this.f35634h.mo25504a(cVar);
            if (a2 == null) {
                C13697a.m27673a(f35632a, "Disk cache miss for %s", (Object) cVar.toString());
                return null;
            }
            C13697a.m27673a(f35632a, "Found entry in disk cache for %s", (Object) cVar.toString());
            a = a2.mo25466a();
            C13709h a3 = this.f35635i.mo25614a(a, (int) a2.mo25467b());
            a.close();
            C13697a.m27673a(f35632a, "Successful read from disk cache for %s", (Object) cVar.toString());
            return a3;
        } catch (IOException e) {
            C13697a.m27679a(f35632a, (Throwable) e, "Exception reading from cache for %s", cVar.toString());
            throw e;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: b */
    public final C13709h mo25531b(C13619c cVar) {
        InputStream a;
        try {
            C13697a.m27673a(f35632a, "Disk temp file cache read for %s", (Object) cVar.toString());
            if (!(this.f35634h instanceof C13655l)) {
                return null;
            }
            C13613a e = ((C13655l) this.f35634h).mo25533e(cVar);
            if (e == null) {
                C13697a.m27673a(f35632a, "Disk temp file cache miss for %s", (Object) cVar.toString());
                return null;
            }
            C13697a.m27673a(f35632a, "Found temp file entry in disk cache for %s", (Object) cVar.toString());
            a = e.mo25466a();
            C13709h a2 = this.f35635i.mo25614a(a, (int) e.mo25467b());
            a.close();
            C13697a.m27673a(f35632a, "Successful read temp file from disk cache for %s", (Object) cVar.toString());
            return a2;
        } catch (IOException e2) {
            C13697a.m27679a(f35632a, (Throwable) e2, "Exception reading temp file from cache for %s", cVar.toString());
            return null;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: b */
    private C0013i<C14044e> m27601b(C13619c cVar, C14044e eVar) {
        C13697a.m27673a(f35632a, "Found image for %s in staging area", (Object) cVar.toString());
        return C0013i.m14a(eVar);
    }

    /* renamed from: a */
    public final C0013i<C14044e> mo25528a(C13619c cVar, AtomicBoolean atomicBoolean) {
        C14044e b = this.f35633b.mo26171b(cVar);
        if (b != null) {
            return m27601b(cVar, b);
        }
        return m27602b(cVar, atomicBoolean, true);
    }

    /* renamed from: b */
    private C0013i<C14044e> m27602b(final C13619c cVar, final AtomicBoolean atomicBoolean, final boolean z) {
        try {
            return C0013i.m18a((Callable<TResult>) new Callable<C14044e>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public C14044e call() throws Exception {
                    C13715a a;
                    C13715a a2;
                    if (!atomicBoolean.get()) {
                        C14044e b = C13653k.this.f35633b.mo26171b(cVar);
                        if (b != null) {
                            C13697a.m27673a(C13653k.f35632a, "Found image for %s in staging area", (Object) cVar.toString());
                        } else {
                            C13697a.m27673a(C13653k.f35632a, "Did not find image for %s in staging area", (Object) cVar.toString());
                            try {
                                C13709h a3 = C13653k.this.mo25530a(cVar);
                                if (a3 != null || z) {
                                    a = C13715a.m27746a(a3);
                                    C14044e eVar = new C14044e(a);
                                    C13715a.m27752c(a);
                                    b = eVar;
                                } else {
                                    C13709h b2 = C13653k.this.mo25531b(cVar);
                                    if (b2 != null) {
                                        a2 = C13715a.m27746a(b2);
                                        C14044e mVar = new C13656m(a2);
                                        C13715a.m27752c(a2);
                                        b = mVar;
                                    }
                                    return b;
                                }
                            } catch (Exception unused) {
                                return null;
                            } catch (Throwable th) {
                                C13715a.m27752c(a2);
                                throw th;
                            }
                        }
                        if (!Thread.interrupted()) {
                            return b;
                        }
                        C13697a.m27672a(C13653k.f35632a, "Host thread was interrupted, decreasing reference count");
                        if (b != null) {
                            b.close();
                        }
                        throw new InterruptedException();
                    }
                    throw new CancellationException();
                }
            }, this.f35636j);
        } catch (Exception e) {
            C13697a.m27679a(f35632a, (Throwable) e, "Failed to schedule disk-cache read for %s", cVar.toString());
            return C0013i.m13a(e);
        }
    }

    /* renamed from: a */
    public final C0013i<C14044e> mo25529a(C13619c cVar, AtomicBoolean atomicBoolean, boolean z) {
        C14044e b = this.f35633b.mo26171b(cVar);
        if (b != null) {
            return m27601b(cVar, b);
        }
        return m27602b(cVar, atomicBoolean, false);
    }
}
