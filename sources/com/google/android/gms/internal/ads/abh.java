package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.common.p1037d.C15377d;
import com.google.android.gms.common.util.C15524o;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

@C16299uq
public final class abh {

    /* renamed from: a */
    final Object f40163a = new Object();

    /* renamed from: b */
    public buu f40164b;

    /* renamed from: c */
    public final abq f40165c = new abq(caf.m37100e(), this.f40171i);

    /* renamed from: d */
    public Context f40166d;

    /* renamed from: e */
    zzbgz f40167e;

    /* renamed from: f */
    C15796ca f40168f = null;

    /* renamed from: g */
    final AtomicInteger f40169g = new AtomicInteger(0);

    /* renamed from: h */
    public final abk f40170h = new abk(null);

    /* renamed from: i */
    private final aby f40171i = new aby();

    /* renamed from: j */
    private boolean f40172j = false;

    /* renamed from: k */
    private Boolean f40173k = null;

    /* renamed from: l */
    private final Object f40174l = new Object();

    /* renamed from: m */
    private aga<ArrayList<String>> f40175m;

    /* renamed from: a */
    public final C15796ca mo28585a() {
        C15796ca caVar;
        synchronized (this.f40163a) {
            caVar = this.f40168f;
        }
        return caVar;
    }

    /* renamed from: a */
    public final void mo28587a(Boolean bool) {
        synchronized (this.f40163a) {
            this.f40173k = bool;
        }
    }

    /* renamed from: b */
    public final Boolean mo28590b() {
        Boolean bool;
        synchronized (this.f40163a) {
            bool = this.f40173k;
        }
        return bool;
    }

    /* renamed from: a */
    public final void mo28589a(boolean z) {
        this.f40170h.mo28600a(z);
    }

    /* renamed from: a */
    public final void mo28586a(Context context, zzbgz zzbgz) {
        synchronized (this.f40163a) {
            if (!this.f40172j) {
                this.f40166d = context.getApplicationContext();
                this.f40167e = zzbgz;
                C14963ax.m30833c().mo30816a(this.f40165c);
                C15796ca caVar = null;
                this.f40171i.mo28654a(this.f40166d, (String) null, true);
                C16293uk.m38893a(this.f40166d, this.f40167e);
                this.f40164b = new buu(context.getApplicationContext(), this.f40167e);
                if (!((Boolean) caf.m37099d().mo30717a(C15740bx.f44200N)).booleanValue()) {
                    abv.m32494a("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                } else {
                    caVar = new C15796ca();
                }
                this.f40168f = caVar;
                if (this.f40168f != null) {
                    afn.m32817a((aga) new abj(this).mo28618c(), "AppState.registerCsiReporter");
                }
                this.f40172j = true;
                mo28596g();
            }
        }
        C14963ax.m30831a().mo28670b(context, zzbgz.f46237a);
    }

    /* renamed from: c */
    public final Resources mo28592c() {
        if (this.f40167e.f46240d) {
            return this.f40166d.getResources();
        }
        try {
            afd.m32799a(this.f40166d).f40033e.getResources();
            return null;
        } catch (aff e) {
            abv.m32795c("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo28588a(Throwable th, String str) {
        C16293uk.m38893a(this.f40166d, this.f40167e).mo31422a(th, str);
    }

    /* renamed from: b */
    public final void mo28591b(Throwable th, String str) {
        C16293uk.m38893a(this.f40166d, this.f40167e).mo31423a(th, str, ((Float) caf.m37099d().mo30717a(C15740bx.f44479i)).floatValue());
    }

    /* renamed from: d */
    public final void mo28593d() {
        this.f40169g.incrementAndGet();
    }

    /* renamed from: e */
    public final void mo28594e() {
        this.f40169g.decrementAndGet();
    }

    /* renamed from: f */
    public final abx mo28595f() {
        aby aby;
        synchronized (this.f40163a) {
            aby = this.f40171i;
        }
        return aby;
    }

    /* renamed from: g */
    public final aga<ArrayList<String>> mo28596g() {
        if (C15524o.m32294b() && this.f40166d != null) {
            if (!((Boolean) caf.m37099d().mo30717a(C15740bx.f44316bx)).booleanValue()) {
                synchronized (this.f40174l) {
                    if (this.f40175m != null) {
                        aga<ArrayList<String>> aga = this.f40175m;
                        return aga;
                    }
                    aga<ArrayList<String>> a = acb.m32567a((Callable<T>) new abi<T>(this));
                    this.f40175m = a;
                    return a;
                }
            }
        }
        return afp.m32820a(new ArrayList());
    }

    /* renamed from: a */
    static ArrayList<String> m32452a(Context context) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            PackageInfo b = C15377d.m31951a(context).mo28321b(context.getApplicationInfo().packageName, 4096);
            if (b.requestedPermissions == null || b.requestedPermissionsFlags == null) {
                return arrayList;
            }
            for (int i = 0; i < b.requestedPermissions.length; i++) {
                if ((b.requestedPermissionsFlags[i] & 2) != 0) {
                    arrayList.add(b.requestedPermissions[i]);
                }
            }
            return arrayList;
        } catch (NameNotFoundException unused) {
            return arrayList;
        }
    }
}
