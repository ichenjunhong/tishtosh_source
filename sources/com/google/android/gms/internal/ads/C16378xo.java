package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C14964ay;
import com.google.android.gms.p1027a.C14886d;
import java.util.HashMap;
import java.util.Map;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.xo */
public final class C16378xo {

    /* renamed from: d */
    private static final C16133om f45966d = new C16133om();

    /* renamed from: a */
    final Map<String, C16420zc> f45967a = new HashMap();

    /* renamed from: b */
    public final C15927gw f45968b;

    /* renamed from: c */
    public final C16244sp f45969c;

    /* renamed from: e */
    private final C16134on f45970e;

    /* renamed from: f */
    private final C14964ay f45971f;

    /* renamed from: g */
    private final C16412yv f45972g;

    public C16378xo(C14964ay ayVar, C16134on onVar, C16412yv yvVar, C15927gw gwVar, C16244sp spVar) {
        this.f45971f = ayVar;
        this.f45970e = onVar;
        this.f45972g = yvVar;
        this.f45968b = gwVar;
        this.f45969c = spVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C16420zc mo31468a(java.lang.String r5) {
        /*
            r4 = this;
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.zc> r0 = r4.f45967a
            java.lang.Object r0 = r0.get(r5)
            com.google.android.gms.internal.ads.zc r0 = (com.google.android.gms.internal.ads.C16420zc) r0
            if (r0 != 0) goto L_0x0045
            com.google.android.gms.internal.ads.on r1 = r4.f45970e     // Catch:{ Exception -> 0x002b }
            java.lang.String r2 = "com.google.ads.mediation.admob.AdMobAdapter"
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x002b }
            if (r2 == 0) goto L_0x0016
            com.google.android.gms.internal.ads.om r1 = f45966d     // Catch:{ Exception -> 0x002b }
        L_0x0016:
            com.google.android.gms.internal.ads.zc r2 = new com.google.android.gms.internal.ads.zc     // Catch:{ Exception -> 0x002b }
            com.google.android.gms.internal.ads.or r1 = r1.mo31234a(r5)     // Catch:{ Exception -> 0x002b }
            com.google.android.gms.internal.ads.yv r3 = r4.f45972g     // Catch:{ Exception -> 0x002b }
            r2.<init>(r1, r3)     // Catch:{ Exception -> 0x002b }
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.zc> r0 = r4.f45967a     // Catch:{ Exception -> 0x0028 }
            r0.put(r5, r2)     // Catch:{ Exception -> 0x0028 }
            r0 = r2
            goto L_0x0045
        L_0x0028:
            r1 = move-exception
            r0 = r2
            goto L_0x002c
        L_0x002b:
            r1 = move-exception
        L_0x002c:
            java.lang.String r2 = "Fail to instantiate adapter "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r3 = r5.length()
            if (r3 == 0) goto L_0x003d
            java.lang.String r5 = r2.concat(r5)
            goto L_0x0042
        L_0x003d:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L_0x0042:
            com.google.android.gms.internal.ads.abv.m32795c(r5, r1)
        L_0x0045:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16378xo.mo31468a(java.lang.String):com.google.android.gms.internal.ads.zc");
    }

    /* renamed from: a */
    public final void mo31470a() {
        this.f45971f.f38618L = 0;
        C14964ay ayVar = this.f45971f;
        C16415yy yyVar = new C16415yy(this.f45971f.f38629c, this.f45971f.f38637k, this);
        String str = "AdRenderer: ";
        String valueOf = String.valueOf(yyVar.getClass().getName());
        abv.m32792b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        yyVar.mo28618c();
        ayVar.f38634h = yyVar;
    }

    /* renamed from: a */
    public final void mo31472a(boolean z) {
        C16420zc a = mo31468a(this.f45971f.f38636j.f40119q);
        if (!(a == null || a.f46035a == null)) {
            try {
                a.f46035a.mo31250a(z);
                a.f46035a.mo31257f();
            } catch (RemoteException e) {
                abv.m32797d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: a */
    public final void mo31471a(Context context) {
        for (C16420zc zcVar : this.f45967a.values()) {
            try {
                zcVar.f46035a.mo31239a(C14886d.m30544a(context));
            } catch (RemoteException e) {
                abv.m32793b("Unable to call Adapter.onContextChanged.", e);
            }
        }
    }

    /* renamed from: b */
    public final void mo31473b() {
        if (this.f45971f.f38636j != null && this.f45971f.f38636j.f40117o != null) {
            C16127og.m38184a(this.f45971f.f38629c, this.f45971f.f38631e.f46237a, this.f45971f.f38636j, this.f45971f.f38628b, false, this.f45971f.f38636j.f40117o.f45282l);
        }
    }

    /* renamed from: c */
    public final void mo31474c() {
        if (this.f45971f.f38636j != null && this.f45971f.f38636j.f40117o != null) {
            C16127og.m38184a(this.f45971f.f38629c, this.f45971f.f38631e.f46237a, this.f45971f.f38636j, this.f45971f.f38628b, false, this.f45971f.f38636j.f40117o.f45284n);
        }
    }

    /* renamed from: a */
    public final zzbaz mo31469a(zzbaz zzbaz) {
        if (!(this.f45971f.f38636j == null || this.f45971f.f38636j.f40120r == null || TextUtils.isEmpty(this.f45971f.f38636j.f40120r.f45304k))) {
            zzbaz = new zzbaz(this.f45971f.f38636j.f40120r.f45304k, this.f45971f.f38636j.f40120r.f45305l);
        }
        if (!(this.f45971f.f38636j == null || this.f45971f.f38636j.f40117o == null)) {
            C16127og.m38185a(this.f45971f.f38629c, this.f45971f.f38631e.f46237a, this.f45971f.f38636j.f40117o.f45283m, this.f45971f.f38613G, this.f45971f.f38614H, zzbaz);
        }
        return zzbaz;
    }
}
