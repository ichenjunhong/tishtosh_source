package com.facebook.imagepipeline.p964d;

import com.facebook.common.p920d.C13689i;
import com.facebook.common.p921e.C13697a;
import com.facebook.common.p923g.C13709h;
import com.facebook.common.p923g.C13711i;
import com.facebook.common.p923g.C13714l;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.imagepipeline.p976p.C14237b;
import com.facebook.p913b.C13613a;
import com.facebook.p914c.p915a.C13619c;
import com.facebook.p914c.p915a.C13625i;
import com.facebook.p914c.p916b.C13651i;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p001a.C0013i;

/* renamed from: com.facebook.imagepipeline.d.e */
public class C13962e {

    /* renamed from: c */
    public static final Class<?> f36418c = C13962e.class;

    /* renamed from: a */
    private final C13711i f36419a;

    /* renamed from: b */
    private final Executor f36420b;

    /* renamed from: d */
    public final C13651i f36421d;

    /* renamed from: e */
    public final C13714l f36422e;

    /* renamed from: f */
    public final C13992u f36423f = new C13992u();

    /* renamed from: g */
    public final C13984n f36424g;

    /* renamed from: h */
    private final Executor f36425h;

    /* renamed from: a */
    public final C0013i<Void> mo26132a() {
        this.f36423f.mo26168a();
        try {
            return C0013i.m18a((Callable<TResult>) new Callable<Void>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void call() throws Exception {
                    C13962e.this.f36423f.mo26168a();
                    C13962e.this.f36421d.mo25506a();
                    return null;
                }
            }, this.f36425h);
        } catch (Exception e) {
            C13697a.m27679a(f36418c, (Throwable) e, "Failed to schedule disk-cache clear", new Object[0]);
            return C0013i.m13a(e);
        }
    }

    /* renamed from: e */
    public final boolean mo26136e(C13619c cVar) {
        if (mo26134c(cVar)) {
            return true;
        }
        return mo26137f(cVar);
    }

    /* renamed from: c */
    public final boolean mo26134c(C13619c cVar) {
        if (this.f36423f.mo26173c(cVar) || this.f36421d.mo25510c(cVar)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final C0013i<Boolean> mo26135d(C13619c cVar) {
        if (mo26134c(cVar)) {
            return C0013i.m14a(Boolean.valueOf(true));
        }
        return mo25531b(cVar);
    }

    /* renamed from: b */
    private C0013i<Boolean> mo25531b(final C13619c cVar) {
        try {
            return C0013i.m18a((Callable<TResult>) new Callable<Boolean>() {
                public final /* synthetic */ Object call() throws Exception {
                    return Boolean.valueOf(C13962e.this.mo26137f(cVar));
                }
            }, this.f36420b);
        } catch (Exception e) {
            C13697a.m27679a(f36418c, (Throwable) e, "Failed to schedule disk-cache read for %s", cVar.mo25470a());
            return C0013i.m13a(e);
        }
    }

    /* renamed from: f */
    public final boolean mo26137f(C13619c cVar) {
        C14044e b = this.f36423f.mo26171b(cVar);
        if (b != null) {
            b.close();
            C13697a.m27673a(f36418c, "Found image for %s in staging area", (Object) cVar.mo25470a());
            return true;
        }
        C13697a.m27673a(f36418c, "Did not find image for %s in staging area", (Object) cVar.mo25470a());
        try {
            return this.f36421d.mo25512d(cVar);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: g */
    public final C0013i<Void> mo26138g(final C13619c cVar) {
        C13689i.m27652a(cVar);
        this.f36423f.mo26170a(cVar);
        try {
            return C0013i.m18a((Callable<TResult>) new Callable<Void>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void call() throws Exception {
                    try {
                        if (C14237b.m29187b()) {
                            C14237b.m29186a("BufferedDiskCache#remove");
                        }
                        C13962e.this.f36423f.mo26170a(cVar);
                        C13962e.this.f36421d.mo25508b(cVar);
                        return null;
                    } finally {
                        if (C14237b.m29187b()) {
                            C14237b.m29185a();
                        }
                    }
                }
            }, this.f36425h);
        } catch (Exception e) {
            C13697a.m27679a(f36418c, (Throwable) e, "Failed to schedule disk-cache remove for %s", cVar.mo25470a());
            return C0013i.m13a(e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C13709h mo25530a(C13619c cVar) throws IOException {
        InputStream a;
        try {
            C13697a.m27673a(f36418c, "Disk cache read for %s", (Object) cVar.mo25470a());
            C13613a a2 = this.f36421d.mo25504a(cVar);
            if (a2 == null) {
                C13697a.m27673a(f36418c, "Disk cache miss for %s", (Object) cVar.mo25470a());
                return null;
            }
            C13697a.m27673a(f36418c, "Found entry in disk cache for %s", (Object) cVar.mo25470a());
            a = a2.mo25466a();
            C13709h a3 = this.f36419a.mo25614a(a, (int) a2.mo25467b());
            a.close();
            C13697a.m27673a(f36418c, "Successful read from disk cache for %s", (Object) cVar.mo25470a());
            return a3;
        } catch (IOException e) {
            C13697a.m27679a(f36418c, (Throwable) e, "Exception reading from cache for %s", cVar.mo25470a());
            throw e;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: b */
    private C0013i<C14044e> m28440b(final C13619c cVar, final AtomicBoolean atomicBoolean) {
        try {
            return C0013i.m18a((Callable<TResult>) new Callable<C14044e>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public C14044e call() throws Exception {
                    C13715a a;
                    try {
                        if (C14237b.m29187b()) {
                            C14237b.m29186a("BufferedDiskCache#getAsync");
                        }
                        if (!atomicBoolean.get()) {
                            C14044e b = C13962e.this.f36423f.mo26171b(cVar);
                            if (b != null) {
                                C13697a.m27673a(C13962e.f36418c, "Found image for %s in staging area", (Object) cVar.mo25470a());
                            } else {
                                C13697a.m27673a(C13962e.f36418c, "Did not find image for %s in staging area", (Object) cVar.mo25470a());
                                try {
                                    a = C13715a.m27746a(C13962e.this.mo25530a(cVar));
                                    C14044e eVar = new C14044e(a);
                                    C13715a.m27752c(a);
                                    b = eVar;
                                } catch (Exception unused) {
                                    if (C14237b.m29187b()) {
                                        C14237b.m29185a();
                                    }
                                    return null;
                                } catch (Throwable th) {
                                    C13715a.m27752c(a);
                                    throw th;
                                }
                            }
                            if (!Thread.interrupted()) {
                                return b;
                            }
                            C13697a.m27672a(C13962e.f36418c, "Host thread was interrupted, decreasing reference count");
                            if (b != null) {
                                b.close();
                            }
                            throw new InterruptedException();
                        }
                        throw new CancellationException();
                    } finally {
                        if (C14237b.m29187b()) {
                            C14237b.m29185a();
                        }
                    }
                }
            }, this.f36420b);
        } catch (Exception e) {
            C13697a.m27679a(f36418c, (Throwable) e, "Failed to schedule disk-cache read for %s", cVar.mo25470a());
            return C0013i.m13a(e);
        }
    }

    /* renamed from: a */
    public C0013i<C14044e> mo25528a(C13619c cVar, AtomicBoolean atomicBoolean) {
        try {
            if (C14237b.m29187b()) {
                C14237b.m29186a("BufferedDiskCache#get");
            }
            C14044e b = this.f36423f.mo26171b(cVar);
            if (b != null) {
                C13697a.m27673a(f36418c, "Found image for %s in staging area", (Object) cVar.mo25470a());
                return C0013i.m14a(b);
            }
            C0013i<C14044e> b2 = m28440b(cVar, atomicBoolean);
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
            return b2;
        } finally {
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
        }
    }

    /* renamed from: a */
    public final void mo26133a(final C13619c cVar, C14044e eVar) {
        final C14044e a;
        try {
            if (C14237b.m29187b()) {
                C14237b.m29186a("BufferedDiskCache#put");
            }
            C13689i.m27652a(cVar);
            C13689i.m27655a(C14044e.m28706e(eVar));
            this.f36423f.mo26169a(cVar, eVar);
            a = C14044e.m28703a(eVar);
            this.f36425h.execute(new Runnable() {
                public final void run() {
                    C13619c cVar;
                    try {
                        if (C14237b.m29187b()) {
                            C14237b.m29186a("BufferedDiskCache#putAsync");
                        }
                        C13962e eVar = C13962e.this;
                        cVar = cVar;
                        C14044e eVar2 = a;
                        C13697a.m27673a(C13962e.f36418c, "About to write to disk-cache for key %s", (Object) cVar.mo25470a());
                        eVar.f36421d.mo25505a(cVar, new C13625i(eVar2) {

                            /* renamed from: a */
                            final /* synthetic */ C14044e f36437a;

                            /* renamed from: a */
                            public final void mo25475a(OutputStream outputStream) throws IOException {
                                C13962e.this.f36422e.mo25629a(this.f36437a.mo26265c(), outputStream);
                            }

                            {
                                this.f36437a = r2;
                            }
                        });
                        C13697a.m27673a(C13962e.f36418c, "Successful disk-cache write for key %s", (Object) cVar.mo25470a());
                    } catch (IOException e) {
                        C13697a.m27679a(C13962e.f36418c, (Throwable) e, "Failed to write to disk-cache for key %s", cVar.mo25470a());
                    } catch (Throwable th) {
                        C13962e.this.f36423f.mo26172b(cVar, a);
                        C14044e.m28705d(a);
                        if (C14237b.m29187b()) {
                            C14237b.m29185a();
                        }
                        throw th;
                    }
                    C13962e.this.f36423f.mo26172b(cVar, a);
                    C14044e.m28705d(a);
                    if (C14237b.m29187b()) {
                        C14237b.m29185a();
                    }
                }
            });
        } catch (Exception e) {
            C13697a.m27679a(f36418c, (Throwable) e, "Failed to schedule disk-cache write for %s", cVar.mo25470a());
            this.f36423f.mo26172b(cVar, eVar);
            C14044e.m28705d(a);
        } catch (Throwable th) {
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
            throw th;
        }
        if (C14237b.m29187b()) {
            C14237b.m29185a();
        }
    }

    public C13962e(C13651i iVar, C13711i iVar2, C13714l lVar, Executor executor, Executor executor2, C13984n nVar) {
        this.f36421d = iVar;
        this.f36419a = iVar2;
        this.f36422e = lVar;
        this.f36420b = executor;
        this.f36425h = executor2;
        this.f36424g = nVar;
    }
}
