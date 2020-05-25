package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.C14963ax;
import java.util.concurrent.Future;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.yo */
public final class C16405yo extends C15563abr implements C16411yu, C16414yx, C16419zb {

    /* renamed from: a */
    public final String f45990a;

    /* renamed from: b */
    final Context f45991b;

    /* renamed from: c */
    final String f45992c;

    /* renamed from: d */
    public final C16117nx f45993d;

    /* renamed from: e */
    public volatile C15927gw f45994e;

    /* renamed from: f */
    private final abc f45995f;

    /* renamed from: h */
    private final C16420zc f45996h;

    /* renamed from: i */
    private final C16414yx f45997i;

    /* renamed from: j */
    private final Object f45998j;

    /* renamed from: k */
    private final long f45999k;

    /* renamed from: l */
    private int f46000l;

    /* renamed from: m */
    private int f46001m = 3;

    /* renamed from: n */
    private C16408yr f46002n;

    /* renamed from: o */
    private Future f46003o;

    public C16405yo(Context context, String str, String str2, C16117nx nxVar, abc abc, C16420zc zcVar, C16414yx yxVar, long j) {
        this.f45991b = context;
        this.f45990a = str;
        this.f45992c = str2;
        this.f45993d = nxVar;
        this.f45995f = abc;
        this.f45996h = zcVar;
        this.f45998j = new Object();
        this.f45997i = yxVar;
        this.f45999k = j;
    }

    /* renamed from: x_ */
    public final void mo27697x_() {
    }

    /* renamed from: a */
    public final void mo27696a() {
        int i;
        if (this.f45996h != null && this.f45996h.f46036b != null && this.f45996h.f46035a != null) {
            C16413yw ywVar = this.f45996h.f46036b;
            ywVar.f46020b = null;
            ywVar.f46019a = this;
            ywVar.f46021c = this;
            zzyv zzyv = this.f45995f.f40129a.f46132c;
            C16138or orVar = this.f45996h.f46035a;
            try {
                if (orVar.mo31258g()) {
                    aes.f40377a.post(new C16406yp(this, zzyv, orVar));
                } else {
                    aes.f40377a.post(new C16407yq(this, orVar, zzyv, ywVar));
                }
            } catch (RemoteException e) {
                abv.m32795c("Fail to check if adapter is initialized.", e);
                mo31514a(this.f45990a, 0);
            }
            long b = C14963ax.m30837g().mo28524b();
            while (true) {
                synchronized (this.f45998j) {
                    if (this.f46000l != 0) {
                        C16410yt a = new C16410yt().mo31522a(C14963ax.m30837g().mo28524b() - b);
                        if (1 == this.f46000l) {
                            i = 6;
                        } else {
                            i = this.f46001m;
                        }
                        this.f46002n = a.mo31521a(i).mo31523a(this.f45990a).mo31524b(this.f45993d.f45274d).mo31520a();
                    } else if (!m39144a(b)) {
                        this.f46002n = new C16410yt().mo31521a(this.f46001m).mo31522a(C14963ax.m30837g().mo28524b() - b).mo31523a(this.f45990a).mo31524b(this.f45993d.f45274d).mo31520a();
                    }
                }
            }
            ywVar.f46020b = null;
            ywVar.f46019a = null;
            if (this.f46000l == 1) {
                this.f45997i.mo31513a(this.f45990a);
            } else {
                this.f45997i.mo31514a(this.f45990a, this.f46001m);
            }
        }
    }

    /* renamed from: d */
    public final Future mo31515d() {
        if (this.f46003o != null) {
            return this.f46003o;
        }
        aga aga = (aga) mo28618c();
        this.f46003o = aga;
        return aga;
    }

    /* renamed from: e */
    public final C16408yr mo31516e() {
        C16408yr yrVar;
        synchronized (this.f45998j) {
            yrVar = this.f46002n;
        }
        return yrVar;
    }

    /* renamed from: a */
    private final boolean m39144a(long j) {
        long b = this.f45999k - (C14963ax.m30837g().mo28524b() - j);
        if (b <= 0) {
            this.f46001m = 4;
            return false;
        }
        try {
            this.f45998j.wait(b);
            return true;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.f46001m = 5;
            return false;
        }
    }

    /* renamed from: a */
    public final void mo31513a(String str) {
        synchronized (this.f45998j) {
            this.f46000l = 1;
            this.f45998j.notify();
        }
    }

    /* renamed from: a */
    public final void mo31514a(String str, int i) {
        synchronized (this.f45998j) {
            this.f46000l = 2;
            this.f46001m = i;
            this.f45998j.notify();
        }
    }

    /* renamed from: f */
    public final void mo31517f() {
        mo31512a(this.f45995f.f40129a.f46132c, this.f45996h.f46035a);
    }

    /* renamed from: a */
    public final void mo31510a(int i) {
        mo31514a(this.f45990a, 0);
    }

    /* renamed from: a */
    public final void mo31511a(Bundle bundle) {
        C15927gw gwVar = this.f45994e;
        if (gwVar != null) {
            gwVar.mo27472a("", bundle);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo31512a(zzyv zzyv, C16138or orVar) {
        this.f45996h.f46036b.f46020b = this;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.f45990a)) {
                orVar.mo31249a(zzyv, this.f45992c, this.f45993d.f45271a);
            } else {
                orVar.mo31248a(zzyv, this.f45992c);
            }
        } catch (RemoteException e) {
            abv.m32795c("Fail to load ad from adapter.", e);
            mo31514a(this.f45990a, 0);
        }
    }
}
