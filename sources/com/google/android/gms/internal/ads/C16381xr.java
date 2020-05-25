package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.C14986bt;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.xr */
public final class C16381xr extends C16392yb {

    /* renamed from: a */
    private final Context f45975a;

    /* renamed from: b */
    private final Object f45976b;

    /* renamed from: c */
    private final zzbgz f45977c;

    /* renamed from: d */
    private final C16382xs f45978d;

    public C16381xr(Context context, C14986bt btVar, C16134on onVar, zzbgz zzbgz) {
        C16382xs xsVar = new C16382xs(context, btVar, zzyz.m39302a(), onVar, zzbgz);
        this(context, zzbgz, xsVar);
    }

    private C16381xr(Context context, zzbgz zzbgz, C16382xs xsVar) {
        this.f45976b = new Object();
        this.f45975a = context;
        this.f45977c = zzbgz;
        this.f45978d = xsVar;
    }

    /* renamed from: a */
    public final void mo31489a(String str) throws RemoteException {
        if (this.f45975a instanceof C16380xq) {
            try {
                throw new NoSuchMethodError();
            } catch (NameNotFoundException unused) {
                if (VERSION.SDK_INT > 15) {
                    throw new RemoteException(NameNotFoundException.class.getSimpleName());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo31488a(zzbad zzbad) {
        synchronized (this.f45976b) {
            this.f45978d.mo31504a(zzbad);
        }
    }

    /* renamed from: a */
    public final void mo31483a() {
        synchronized (this.f45976b) {
            C16382xs xsVar = this.f45978d;
            C15464q.m32132b("showAd must be called on the main UI thread.");
            if (!xsVar.mo31502F()) {
                abv.m32798e("The reward video has not loaded.");
            } else {
                xsVar.f45981l.mo31472a(xsVar.f45980k);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo31484a(C14882b bVar) throws RemoteException {
        if (!(this.f45975a instanceof C16380xq)) {
            mo31483a();
        } else {
            Activity activity = (Activity) C14886d.m30545a(bVar);
            throw new NoSuchMethodError();
        }
    }

    /* renamed from: a */
    public final void mo31487a(C16396yf yfVar) {
        synchronized (this.f45976b) {
            this.f45978d.mo27466a(yfVar);
        }
    }

    /* renamed from: a */
    public final void mo31486a(C16388xy xyVar) {
        synchronized (this.f45976b) {
            this.f45978d.mo27465a(xyVar);
        }
    }

    /* renamed from: a */
    public final void mo31485a(C16066m mVar) {
        if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44214aA)).booleanValue()) {
            synchronized (this.f45976b) {
                this.f45978d.mo27460a(mVar);
            }
        }
    }

    /* renamed from: b */
    public final Bundle mo31491b() {
        Bundle n;
        if (!((Boolean) caf.m37099d().mo30717a(C15740bx.f44214aA)).booleanValue()) {
            return new Bundle();
        }
        synchronized (this.f45976b) {
            n = this.f45978d.mo27492n();
        }
        return n;
    }

    /* renamed from: b */
    public final void mo31493b(String str) {
        synchronized (this.f45976b) {
            this.f45978d.mo27471a(str);
        }
    }

    /* renamed from: c */
    public final void mo31495c(String str) {
        if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44215aB)).booleanValue()) {
            synchronized (this.f45976b) {
                this.f45978d.mo27480b(str);
            }
        }
    }

    /* renamed from: c */
    public final boolean mo31496c() {
        boolean F;
        synchronized (this.f45976b) {
            F = this.f45978d.mo31502F();
        }
        return F;
    }

    /* renamed from: d */
    public final void mo31497d() {
        mo31492b((C14882b) null);
    }

    /* renamed from: b */
    public final void mo31492b(C14882b bVar) {
        synchronized (this.f45976b) {
            this.f45978d.mo27490l();
        }
    }

    /* renamed from: e */
    public final void mo31499e() {
        mo31494c((C14882b) null);
    }

    /* renamed from: c */
    public final void mo31494c(C14882b bVar) {
        Context context;
        synchronized (this.f45976b) {
            if (bVar == null) {
                context = null;
            } else {
                try {
                    context = (Context) C14886d.m30545a(bVar);
                } catch (Exception e) {
                    abv.m32795c("Unable to extract updated context.", e);
                }
            }
            if (context != null) {
                this.f45978d.mo31503a(context);
            }
            this.f45978d.mo27491m();
        }
    }

    /* renamed from: f */
    public final void mo31500f() {
        mo31498d(null);
    }

    /* renamed from: d */
    public final void mo31498d(C14882b bVar) {
        synchronized (this.f45976b) {
            this.f45978d.mo27485g();
        }
    }

    /* renamed from: g */
    public final String mo31501g() {
        String a;
        synchronized (this.f45976b) {
            a = this.f45978d.mo27551a();
        }
        return a;
    }

    /* renamed from: a */
    public final void mo31490a(boolean z) {
        synchronized (this.f45976b) {
            this.f45978d.mo27481b(z);
        }
    }
}
