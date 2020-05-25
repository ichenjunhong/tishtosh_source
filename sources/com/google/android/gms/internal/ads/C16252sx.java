package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C14943ad;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.sx */
public final class C16252sx extends C15563abr {

    /* renamed from: a */
    final C16244sp f45559a;

    /* renamed from: b */
    private final zzaxi f45560b;

    /* renamed from: c */
    private final abc f45561c;

    /* renamed from: d */
    private final C16256ta f45562d;

    /* renamed from: e */
    private final Object f45563e;

    /* renamed from: f */
    private Future<abb> f45564f;

    public C16252sx(Context context, C14943ad adVar, abc abc, beh beh, C16244sp spVar, C15806ck ckVar) {
        C16256ta taVar = new C16256ta(context, adVar, new adr(context), beh, abc, ckVar);
        this(abc, spVar, taVar);
    }

    private C16252sx(abc abc, C16244sp spVar, C16256ta taVar) {
        this.f45563e = new Object();
        this.f45561c = abc;
        this.f45560b = abc.f40130b;
        this.f45559a = spVar;
        this.f45562d = taVar;
    }

    /* renamed from: a */
    public final void mo27696a() {
        int i;
        abb abb = null;
        try {
            synchronized (this.f45563e) {
                this.f45564f = acb.m32567a((Callable<T>) this.f45562d);
            }
            abb = (abb) this.f45564f.get(60000, TimeUnit.MILLISECONDS);
            i = -2;
        } catch (TimeoutException unused) {
            abv.m32798e("Timed out waiting for native ad.");
            this.f45564f.cancel(true);
            i = 2;
        } catch (InterruptedException | CancellationException | ExecutionException unused2) {
            i = 0;
        }
        acd.f40245a.post(new C16253sy(this, abb != null ? abb : new abb(this.f45561c.f40129a.f46132c, null, null, i, null, null, this.f45560b.f46193k, this.f45560b.f46192j, this.f45561c.f40129a.f46138i, false, null, null, null, null, null, this.f45560b.f46190h, this.f45561c.f40132d, this.f45560b.f46188f, this.f45561c.f40134f, this.f45560b.f46195m, this.f45560b.f46196n, this.f45561c.f40136h, null, null, null, null, this.f45561c.f40130b.f46159D, this.f45561c.f40130b.f46160E, null, null, this.f45560b.f46167L, this.f45561c.f40137i, this.f45561c.f40130b.f46170O, false, this.f45561c.f40130b.f46172Q, null, this.f45561c.f40130b.f46174S, this.f45561c.f40130b.f46175T, this.f45561c.f40130b.f46177V, this.f45561c.f40130b.f46178W)));
    }

    /* renamed from: x_ */
    public final void mo27697x_() {
        synchronized (this.f45563e) {
            if (this.f45564f != null) {
                this.f45564f.cancel(true);
            }
        }
    }
}
