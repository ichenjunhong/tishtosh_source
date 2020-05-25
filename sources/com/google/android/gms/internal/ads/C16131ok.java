package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.ok */
public final class C16131ok implements C16116nw {

    /* renamed from: a */
    private final zzaxe f45367a;

    /* renamed from: b */
    private final C16134on f45368b;

    /* renamed from: c */
    private final Context f45369c;

    /* renamed from: d */
    private final Object f45370d = new Object();

    /* renamed from: e */
    private final C16118ny f45371e;

    /* renamed from: f */
    private final boolean f45372f;

    /* renamed from: g */
    private final long f45373g;

    /* renamed from: h */
    private final long f45374h;

    /* renamed from: i */
    private final C15806ck f45375i;

    /* renamed from: j */
    private final boolean f45376j;

    /* renamed from: k */
    private final String f45377k;

    /* renamed from: l */
    private boolean f45378l = false;

    /* renamed from: m */
    private C16122ob f45379m;

    /* renamed from: n */
    private List<C16125oe> f45380n = new ArrayList();

    /* renamed from: o */
    private final boolean f45381o;

    public C16131ok(Context context, zzaxe zzaxe, C16134on onVar, C16118ny nyVar, boolean z, boolean z2, String str, long j, long j2, C15806ck ckVar, boolean z3) {
        this.f45369c = context;
        this.f45367a = zzaxe;
        this.f45368b = onVar;
        this.f45371e = nyVar;
        this.f45372f = z;
        this.f45376j = z2;
        this.f45377k = str;
        this.f45373g = j;
        this.f45374h = j2;
        this.f45375i = ckVar;
        this.f45381o = z3;
    }

    /* renamed from: a */
    public final C16125oe mo31196a(List<C16117nx> list) {
        Object obj;
        C16125oe oeVar;
        abv.m32792b("Starting mediation.");
        ArrayList arrayList = new ArrayList();
        C15804ci a = this.f45375i.mo30897a();
        zzyz zzyz = this.f45367a.f46133d;
        int[] iArr = new int[2];
        if (zzyz.f46344g != null && C16127og.m38186a(this.f45377k, iArr)) {
            int i = iArr[0];
            int i2 = iArr[1];
            zzyz[] zzyzArr = zzyz.f46344g;
            int length = zzyzArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                zzyz zzyz2 = zzyzArr[i3];
                if (i == zzyz2.f46342e && i2 == zzyz2.f46339b) {
                    zzyz = zzyz2;
                    break;
                }
                i3++;
            }
        }
        Iterator it = list.iterator();
        int i4 = 1;
        while (it.hasNext()) {
            C16117nx nxVar = (C16117nx) it.next();
            String str = "Trying mediation network: ";
            String valueOf = String.valueOf(nxVar.f45272b);
            abv.m32796d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            Iterator it2 = nxVar.f45273c.iterator();
            while (true) {
                if (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    C15804ci a2 = this.f45375i.mo30897a();
                    Object obj2 = this.f45370d;
                    synchronized (obj2) {
                        try {
                            if (this.f45378l) {
                                oeVar = new C16125oe(-1);
                            } else {
                                Iterator it3 = it;
                                Iterator it4 = it2;
                                C15804ci ciVar = a;
                                r11 = r11;
                                C15804ci ciVar2 = a2;
                                C16122ob obVar = r11;
                                obj = obj2;
                                try {
                                    C16122ob obVar2 = new C16122ob(this.f45369c, str2, this.f45368b, this.f45371e, nxVar, this.f45367a.f46132c, zzyz, this.f45367a.f46140k, this.f45372f, this.f45376j, this.f45367a.f46154y, this.f45367a.f46143n, this.f45367a.f46155z, this.f45367a.f46120X, this.f45381o);
                                    this.f45379m = obVar;
                                    C16125oe a3 = this.f45379m.mo31222a(this.f45373g, this.f45374h);
                                    this.f45380n.add(a3);
                                    if (a3.f45341a == 0) {
                                        abv.m32792b("Adapter succeeded.");
                                        this.f45375i.mo30900a("mediation_network_succeed", str2);
                                        if (!arrayList.isEmpty()) {
                                            this.f45375i.mo30900a("mediation_networks_fail", TextUtils.join(",", arrayList));
                                        }
                                        this.f45375i.mo30902a(ciVar2, "mls");
                                        this.f45375i.mo30902a(ciVar, "ttm");
                                        return a3;
                                    }
                                    C15804ci ciVar3 = ciVar;
                                    C15804ci ciVar4 = ciVar2;
                                    int i5 = a3.f45341a;
                                    arrayList.add(str2);
                                    this.f45375i.mo30902a(ciVar4, "mlf");
                                    if (a3.f45343c != null) {
                                        acd.f40245a.post(new C16132ol(this, a3));
                                    }
                                    a = ciVar3;
                                    i4 = i5;
                                    it = it3;
                                    it2 = it4;
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            obj = obj2;
                            throw th;
                        }
                    }
                    return oeVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f45375i.mo30900a("mediation_networks_fail", TextUtils.join(",", arrayList));
        }
        if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44337cR)).booleanValue()) {
            return new C16125oe(i4);
        }
        return new C16125oe(1);
    }

    /* renamed from: a */
    public final void mo31197a() {
        synchronized (this.f45370d) {
            this.f45378l = true;
            if (this.f45379m != null) {
                this.f45379m.mo31223a();
            }
        }
    }

    /* renamed from: b */
    public final List<C16125oe> mo31198b() {
        return this.f45380n;
    }
}
