package com.google.android.gms.internal.ads;

import android.content.Context;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.ly */
public final class C16064ly {
    /* access modifiers changed from: 0000 */

    /* renamed from: a */
    public final Object f45186a;

    /* renamed from: b */
    final Context f45187b;

    /* renamed from: c */
    final String f45188c;

    /* renamed from: d */
    final zzbgz f45189d;

    /* renamed from: e */
    C15567adm<C16053ln> f45190e;
    /* access modifiers changed from: 0000 */

    /* renamed from: f */
    public int f45191f;

    /* renamed from: g */
    private C15567adm<C16053ln> f45192g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C16085ms f45193h;

    public C16064ly(Context context, zzbgz zzbgz, String str) {
        this.f45186a = new Object();
        this.f45191f = 1;
        this.f45188c = str;
        this.f45187b = context.getApplicationContext();
        this.f45189d = zzbgz;
        this.f45190e = new C16080mn();
        this.f45192g = new C16080mn();
    }

    public C16064ly(Context context, zzbgz zzbgz, String str, C15567adm<C16053ln> adm, C15567adm<C16053ln> adm2) {
        this(context, zzbgz, str);
        this.f45190e = adm;
        this.f45192g = adm2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C16085ms mo31172a(beh beh) {
        C16085ms msVar = new C16085ms(this.f45192g);
        agf.f40430a.execute(new C16065lz(this, beh, msVar));
        msVar.mo28829a(new C16076mj(this, msVar), new C16077mk(this, msVar));
        return msVar;
    }

    /* renamed from: b */
    public final C16081mo mo31173b(beh beh) {
        synchronized (this.f45186a) {
            synchronized (this.f45186a) {
                if (this.f45193h != null && this.f45191f == 0) {
                    if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44372d)).booleanValue()) {
                        this.f45193h.mo28829a(new C16067ma(this), C16068mb.f45198a);
                    }
                }
            }
            if (this.f45193h != null) {
                if (this.f45193h.mo28834e() != -1) {
                    if (this.f45191f == 0) {
                        C16081mo a = this.f45193h.mo31183a();
                        return a;
                    } else if (this.f45191f == 1) {
                        this.f45191f = 2;
                        mo31172a((beh) null);
                        C16081mo a2 = this.f45193h.mo31183a();
                        return a2;
                    } else if (this.f45191f == 2) {
                        C16081mo a3 = this.f45193h.mo31183a();
                        return a3;
                    } else {
                        C16081mo a4 = this.f45193h.mo31183a();
                        return a4;
                    }
                }
            }
            this.f45191f = 2;
            this.f45193h = mo31172a((beh) null);
            C16081mo a5 = this.f45193h.mo31183a();
            return a5;
        }
    }
}
