package com.p683ss.android.socialbase.downloader.p1218g;

import android.os.Process;
import com.p683ss.android.socialbase.downloader.downloader.C19884b;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.p1221j.C19994e;
import java.io.InputStream;
import java.util.concurrent.Future;

/* renamed from: com.ss.android.socialbase.downloader.g.a */
public final class C19932a implements C19935c {

    /* renamed from: a */
    public final InputStream f54761a;

    /* renamed from: b */
    public final Object f54762b = new Object();

    /* renamed from: c */
    C19934b f54763c;

    /* renamed from: d */
    C19934b f54764d;

    /* renamed from: e */
    public volatile boolean f54765e;

    /* renamed from: f */
    public volatile Throwable f54766f;

    /* renamed from: g */
    private final int f54767g;

    /* renamed from: h */
    private final int f54768h;

    /* renamed from: i */
    private final Object f54769i = new Object();

    /* renamed from: j */
    private C19934b f54770j;

    /* renamed from: k */
    private C19934b f54771k;

    /* renamed from: l */
    private C19934b f54772l;

    /* renamed from: m */
    private C19934b f54773m;

    /* renamed from: n */
    private volatile boolean f54774n;

    /* renamed from: o */
    private volatile Future f54775o;

    /* renamed from: p */
    private int f54776p;

    /* renamed from: q */
    private final Runnable f54777q = new Runnable() {
        public final void run() {
            C19934b c;
            Process.setThreadPriority(10);
            do {
                try {
                    c = C19932a.this.mo41656c();
                    c.f54780b = C19932a.this.f54761a.read(c.f54779a);
                    C19932a aVar = C19932a.this;
                    synchronized (aVar.f54762b) {
                        C19934b bVar = aVar.f54764d;
                        if (bVar == null) {
                            aVar.f54764d = c;
                            aVar.f54763c = c;
                            aVar.f54762b.notify();
                        } else {
                            bVar.f54781c = c;
                            aVar.f54764d = c;
                        }
                    }
                } catch (Throwable th) {
                    try {
                        C19932a.this.f54766f = th;
                        synchronized (C19932a.this.f54762b) {
                            C19932a.this.f54765e = true;
                            C19932a.this.f54762b.notify();
                            try {
                                C19932a.this.f54761a.close();
                                return;
                            } catch (Throwable unused) {
                                return;
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                }
            } while (c.f54780b != -1);
            synchronized (C19932a.this.f54762b) {
                C19932a.this.f54765e = true;
                C19932a.this.f54762b.notify();
            }
            try {
                C19932a.this.f54761a.close();
                return;
            } catch (Throwable unused3) {
                return;
            }
            throw th;
        }
    };

    /* renamed from: a */
    public final C19934b mo41653a() throws BaseException, InterruptedException {
        return m48918d();
    }

    /* renamed from: b */
    public final void mo41655b() {
        synchronized (this.f54769i) {
            this.f54774n = true;
            this.f54769i.notify();
        }
        Future future = this.f54775o;
        if (future != null) {
            try {
                future.cancel(true);
            } catch (Throwable unused) {
            }
            this.f54775o = null;
        }
    }

    /* renamed from: d */
    private C19934b m48918d() throws BaseException, InterruptedException {
        C19934b bVar;
        C19934b bVar2 = this.f54773m;
        if (bVar2 != null) {
            this.f54773m = bVar2.f54781c;
            bVar2.f54781c = null;
            return bVar2;
        }
        synchronized (this.f54762b) {
            bVar = this.f54763c;
            if (bVar == null) {
                while (!this.f54765e) {
                    this.f54762b.wait();
                    bVar = this.f54763c;
                    if (bVar != null) {
                    }
                }
                Throwable th = this.f54766f;
                if (th != null) {
                    if (th instanceof C19936d) {
                        throw new BaseException(1068, "async reader closed!");
                    }
                    C19994e.m49346a(th, "async_read");
                }
                throw new BaseException(1069, "async reader terminated!");
            }
            this.f54773m = bVar.f54781c;
            this.f54764d = null;
            this.f54763c = null;
            bVar.f54781c = null;
        }
        return bVar;
    }

    /* renamed from: c */
    public final C19934b mo41656c() throws C19936d, InterruptedException {
        C19934b bVar = this.f54772l;
        if (bVar == null) {
            synchronized (this.f54769i) {
                if (!this.f54774n) {
                    C19934b bVar2 = this.f54770j;
                    if (bVar2 != null || this.f54776p >= this.f54768h) {
                        while (bVar2 == null) {
                            this.f54769i.wait();
                            if (!this.f54774n) {
                                bVar2 = this.f54770j;
                            } else {
                                throw new C19936d();
                            }
                        }
                        this.f54772l = bVar2.f54781c;
                        this.f54771k = null;
                        this.f54770j = null;
                        bVar2.f54781c = null;
                        return bVar2;
                    }
                    this.f54776p++;
                    C19934b bVar3 = new C19934b(this.f54767g);
                    return bVar3;
                }
                throw new C19936d();
            }
        } else if (!this.f54774n) {
            this.f54772l = bVar.f54781c;
            bVar.f54781c = null;
            return bVar;
        } else {
            throw new C19936d();
        }
    }

    /* renamed from: a */
    public final void mo41654a(C19934b bVar) {
        synchronized (this.f54769i) {
            C19934b bVar2 = this.f54771k;
            if (bVar2 == null) {
                this.f54771k = bVar;
                this.f54770j = bVar;
                this.f54769i.notify();
            } else {
                bVar2.f54781c = bVar;
                this.f54771k = bVar;
            }
        }
    }

    public C19932a(InputStream inputStream, int i, int i2) throws Throwable {
        this.f54761a = inputStream;
        this.f54767g = i;
        if (i2 <= 0) {
            i2 = 1;
        } else if (i2 > 64) {
            i2 = 64;
        }
        this.f54768h = i2;
        this.f54775o = C19884b.m48612i().submit(this.f54777q);
    }
}
