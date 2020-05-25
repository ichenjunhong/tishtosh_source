package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.ads.internal.C14986bt;
import com.google.android.gms.ads.internal.C15002n;
import com.google.android.gms.p1027a.C14882b;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.kv */
public final class C16034kv extends C15958i {

    /* renamed from: a */
    private final String f45135a;

    /* renamed from: b */
    private boolean f45136b;

    /* renamed from: c */
    private final C15997jl f45137c;

    /* renamed from: d */
    private C15002n f45138d;

    /* renamed from: e */
    private final C16026kn f45139e;

    private C16034kv(String str, C15997jl jlVar) {
        this.f45135a = str;
        this.f45137c = jlVar;
        this.f45139e = new C16026kn();
        C16029kq l = C14963ax.m30842l();
        if (l.f45115c == null) {
            l.f45115c = new C15997jl(jlVar.f45083a.getApplicationContext(), jlVar.f45084b, jlVar.f45085c, jlVar.f45086d);
            if (l.f45115c != null) {
                SharedPreferences a = C35807d.m80935a(l.f45115c.mo31114a(), "com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0);
                while (l.f45114b.size() > 0) {
                    C16030kr krVar = (C16030kr) l.f45114b.remove();
                    C16031ks ksVar = (C16031ks) l.f45113a.get(krVar);
                    C16029kq.m37925a("Flushing interstitial queue for %s.", krVar);
                    while (ksVar.mo31137a() > 0) {
                        ksVar.mo31138a((zzyv) null).f45122a.mo27660F();
                    }
                    l.f45113a.remove(krVar);
                }
                try {
                    HashMap hashMap = new HashMap();
                    for (Entry entry : a.getAll().entrySet()) {
                        if (!((String) entry.getKey()).equals("PoolKeys")) {
                            C16035kw a2 = C16035kw.m37980a((String) entry.getValue());
                            C16030kr krVar2 = new C16030kr(a2.f45140a, a2.f45141b, a2.f45142c);
                            if (!l.f45113a.containsKey(krVar2)) {
                                l.f45113a.put(krVar2, new C16031ks(a2.f45140a, a2.f45141b, a2.f45142c));
                                hashMap.put(krVar2.toString(), krVar2);
                                C16029kq.m37925a("Restored interstitial queue for %s.", krVar2);
                            }
                        }
                    }
                    for (String str2 : C16029kq.m37926a(a.getString("PoolKeys", ""))) {
                        C16030kr krVar3 = (C16030kr) hashMap.get(str2);
                        if (l.f45113a.containsKey(krVar3)) {
                            l.f45114b.add(krVar3);
                        }
                    }
                } catch (IOException | RuntimeException e) {
                    C14963ax.m30834d().mo28588a(e, "InterstitialAdPool.restore");
                    abv.m32795c("Malformed preferences value for InterstitialAdPool.", e);
                    l.f45113a.clear();
                    l.f45114b.clear();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo27471a(String str) {
    }

    /* renamed from: b */
    public final void mo27480b(String str) {
    }

    public C16034kv(Context context, String str, C16134on onVar, zzbgz zzbgz, C14986bt btVar) {
        this(str, new C15997jl(context, onVar, zzbgz, btVar));
    }

    /* renamed from: h */
    public final C14882b mo27486h() throws RemoteException {
        if (this.f45138d != null) {
            return this.f45138d.mo27486h();
        }
        return null;
    }

    /* renamed from: g */
    public final void mo27485g() throws RemoteException {
        if (this.f45138d != null) {
            this.f45138d.mo27485g();
        }
    }

    /* renamed from: j */
    public final boolean mo27488j() throws RemoteException {
        return this.f45138d != null && this.f45138d.mo27488j();
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01cf  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo27482b(com.google.android.gms.internal.ads.zzyv r12) throws android.os.RemoteException {
        /*
            r11 = this;
            java.util.Set r0 = com.google.android.gms.internal.ads.C16029kq.m37923a(r12)
            java.lang.String r1 = "gw"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x000f
            r11.m37945c()
        L_0x000f:
            java.util.Set r0 = com.google.android.gms.internal.ads.C16029kq.m37923a(r12)
            java.lang.String r1 = "_skipMediation"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x001e
            r11.m37945c()
        L_0x001e:
            com.google.android.gms.internal.ads.zzacm r0 = r12.f46326j
            if (r0 == 0) goto L_0x0025
            r11.m37945c()
        L_0x0025:
            com.google.android.gms.ads.internal.n r0 = r11.f45138d
            if (r0 == 0) goto L_0x0030
            com.google.android.gms.ads.internal.n r0 = r11.f45138d
            boolean r12 = r0.mo27482b(r12)
            return r12
        L_0x0030:
            com.google.android.gms.internal.ads.kq r0 = com.google.android.gms.ads.internal.C14963ax.m30842l()
            java.util.Set r1 = com.google.android.gms.internal.ads.C16029kq.m37923a(r12)
            java.lang.String r2 = "_ad"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x0091
            java.lang.String r1 = r11.f45135a
            com.google.android.gms.internal.ads.jl r2 = r0.f45115c
            if (r2 == 0) goto L_0x0091
            com.google.android.gms.internal.ads.jl r2 = r0.f45115c
            android.content.Context r2 = r2.mo31114a()
            com.google.android.gms.internal.ads.xc r3 = new com.google.android.gms.internal.ads.xc
            r3.<init>(r2)
            com.google.android.gms.internal.ads.xb r2 = r3.mo31464a()
            int r2 = r2.f45913o
            com.google.android.gms.internal.ads.zzyv r3 = com.google.android.gms.internal.ads.C16029kq.m37930c(r12)
            java.lang.String r1 = com.google.android.gms.internal.ads.C16029kq.m37931c(r1)
            com.google.android.gms.internal.ads.kr r4 = new com.google.android.gms.internal.ads.kr
            r4.<init>(r3, r1, r2)
            java.util.Map<com.google.android.gms.internal.ads.kr, com.google.android.gms.internal.ads.ks> r5 = r0.f45113a
            java.lang.Object r5 = r5.get(r4)
            com.google.android.gms.internal.ads.ks r5 = (com.google.android.gms.internal.ads.C16031ks) r5
            if (r5 != 0) goto L_0x007d
            java.lang.String r5 = "Interstitial pool created at %s."
            com.google.android.gms.internal.ads.C16029kq.m37925a(r5, r4)
            com.google.android.gms.internal.ads.ks r5 = new com.google.android.gms.internal.ads.ks
            r5.<init>(r3, r1, r2)
            java.util.Map<com.google.android.gms.internal.ads.kr, com.google.android.gms.internal.ads.ks> r1 = r0.f45113a
            r1.put(r4, r5)
        L_0x007d:
            com.google.android.gms.internal.ads.jl r1 = r0.f45115c
            com.google.android.gms.internal.ads.kt r2 = new com.google.android.gms.internal.ads.kt
            r2.<init>(r5, r1, r12)
            java.util.LinkedList<com.google.android.gms.internal.ads.kt> r1 = r5.f45117a
            r1.add(r2)
            r5.mo31142d()
            java.lang.String r1 = "Inline entry added to the queue at %s."
            com.google.android.gms.internal.ads.C16029kq.m37925a(r1, r4)
        L_0x0091:
            java.lang.String r1 = r11.f45135a
            boolean r2 = com.google.android.gms.internal.ads.C16029kq.m37929b(r1)
            r3 = 0
            if (r2 != 0) goto L_0x019e
            com.google.android.gms.internal.ads.jl r2 = r0.f45115c
            android.content.Context r2 = r2.mo31114a()
            com.google.android.gms.internal.ads.xc r4 = new com.google.android.gms.internal.ads.xc
            r4.<init>(r2)
            com.google.android.gms.internal.ads.xb r2 = r4.mo31464a()
            int r2 = r2.f45913o
            com.google.android.gms.internal.ads.zzyv r4 = com.google.android.gms.internal.ads.C16029kq.m37930c(r12)
            java.lang.String r1 = com.google.android.gms.internal.ads.C16029kq.m37931c(r1)
            com.google.android.gms.internal.ads.kr r5 = new com.google.android.gms.internal.ads.kr
            r5.<init>(r4, r1, r2)
            java.util.Map<com.google.android.gms.internal.ads.kr, com.google.android.gms.internal.ads.ks> r6 = r0.f45113a
            java.lang.Object r6 = r6.get(r5)
            com.google.android.gms.internal.ads.ks r6 = (com.google.android.gms.internal.ads.C16031ks) r6
            if (r6 != 0) goto L_0x00d1
            java.lang.String r6 = "Interstitial pool created at %s."
            com.google.android.gms.internal.ads.C16029kq.m37925a(r6, r5)
            com.google.android.gms.internal.ads.ks r6 = new com.google.android.gms.internal.ads.ks
            r6.<init>(r4, r1, r2)
            java.util.Map<com.google.android.gms.internal.ads.kr, com.google.android.gms.internal.ads.ks> r1 = r0.f45113a
            r1.put(r5, r6)
        L_0x00d1:
            java.util.LinkedList<com.google.android.gms.internal.ads.kr> r1 = r0.f45114b
            r1.remove(r5)
            java.util.LinkedList<com.google.android.gms.internal.ads.kr> r1 = r0.f45114b
            r1.add(r5)
            r6.mo31142d()
        L_0x00de:
            java.util.LinkedList<com.google.android.gms.internal.ads.kr> r1 = r0.f45114b
            int r1 = r1.size()
            com.google.android.gms.internal.ads.bl<java.lang.Integer> r2 = com.google.android.gms.internal.ads.C15740bx.f44230aQ
            com.google.android.gms.internal.ads.bu r7 = com.google.android.gms.internal.ads.caf.m37099d()
            java.lang.Object r2 = r7.mo30717a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r1 <= r2) goto L_0x012f
            java.util.LinkedList<com.google.android.gms.internal.ads.kr> r1 = r0.f45114b
            java.lang.Object r1 = r1.remove()
            com.google.android.gms.internal.ads.kr r1 = (com.google.android.gms.internal.ads.C16030kr) r1
            java.util.Map<com.google.android.gms.internal.ads.kr, com.google.android.gms.internal.ads.ks> r2 = r0.f45113a
            java.lang.Object r2 = r2.get(r1)
            com.google.android.gms.internal.ads.ks r2 = (com.google.android.gms.internal.ads.C16031ks) r2
            java.lang.String r7 = "Evicting interstitial queue for %s."
            com.google.android.gms.internal.ads.C16029kq.m37925a(r7, r1)
        L_0x010b:
            int r7 = r2.mo31137a()
            if (r7 <= 0) goto L_0x0129
            com.google.android.gms.internal.ads.kt r7 = r2.mo31138a(r3)
            boolean r8 = r7.f45126e
            if (r8 == 0) goto L_0x0123
            com.google.android.gms.internal.ads.ku r8 = com.google.android.gms.internal.ads.C16033ku.m37942a()
            int r9 = r8.f45132c
            int r9 = r9 + 1
            r8.f45132c = r9
        L_0x0123:
            com.google.android.gms.ads.internal.n r7 = r7.f45122a
            r7.mo27660F()
            goto L_0x010b
        L_0x0129:
            java.util.Map<com.google.android.gms.internal.ads.kr, com.google.android.gms.internal.ads.ks> r2 = r0.f45113a
            r2.remove(r1)
            goto L_0x00de
        L_0x012f:
            int r0 = r6.mo31137a()
            if (r0 <= 0) goto L_0x019e
            com.google.android.gms.internal.ads.kt r0 = r6.mo31138a(r4)
            boolean r1 = r0.f45126e
            if (r1 == 0) goto L_0x0171
            com.google.android.gms.common.util.e r1 = com.google.android.gms.ads.internal.C14963ax.m30837g()
            long r1 = r1.mo28523a()
            long r7 = r0.f45125d
            long r1 = r1 - r7
            r7 = 1000(0x3e8, double:4.94E-321)
            com.google.android.gms.internal.ads.bl<java.lang.Integer> r9 = com.google.android.gms.internal.ads.C15740bx.f44232aS
            com.google.android.gms.internal.ads.bu r10 = com.google.android.gms.internal.ads.caf.m37099d()
            java.lang.Object r9 = r10.mo30717a(r9)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            long r9 = (long) r9
            long r9 = r9 * r7
            int r7 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x0171
            java.lang.String r0 = "Expired interstitial at %s."
            com.google.android.gms.internal.ads.C16029kq.m37925a(r0, r5)
            com.google.android.gms.internal.ads.ku r0 = com.google.android.gms.internal.ads.C16033ku.m37942a()
            int r1 = r0.f45131b
            int r1 = r1 + 1
            r0.f45131b = r1
            goto L_0x012f
        L_0x0171:
            com.google.android.gms.internal.ads.zzyv r1 = r0.f45123b
            if (r1 == 0) goto L_0x0178
            java.lang.String r1 = " (inline) "
            goto L_0x017a
        L_0x0178:
            java.lang.String r1 = " "
        L_0x017a:
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            int r2 = r2 + 34
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Pooled interstitial"
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = "returned at %s."
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.google.android.gms.internal.ads.C16029kq.m37925a(r1, r5)
            goto L_0x019f
        L_0x019e:
            r0 = r3
        L_0x019f:
            if (r0 == 0) goto L_0x01cf
            boolean r12 = r0.f45126e
            if (r12 != 0) goto L_0x01b0
            r0.mo31143a()
            com.google.android.gms.internal.ads.ku r12 = com.google.android.gms.internal.ads.C16033ku.m37942a()
            r12.mo31145b()
            goto L_0x01ba
        L_0x01b0:
            com.google.android.gms.internal.ads.ku r12 = com.google.android.gms.internal.ads.C16033ku.m37942a()
            int r1 = r12.f45133d
            int r1 = r1 + 1
            r12.f45133d = r1
        L_0x01ba:
            com.google.android.gms.ads.internal.n r12 = r0.f45122a
            r11.f45138d = r12
            com.google.android.gms.internal.ads.jm r12 = r0.f45124c
            com.google.android.gms.internal.ads.kn r1 = r11.f45139e
            r12.mo31116a(r1)
            com.google.android.gms.internal.ads.kn r12 = r11.f45139e
            com.google.android.gms.ads.internal.n r1 = r11.f45138d
            r12.mo31131a(r1)
            boolean r12 = r0.f45127f
            return r12
        L_0x01cf:
            r11.m37945c()
            com.google.android.gms.internal.ads.ku r0 = com.google.android.gms.internal.ads.C16033ku.m37942a()
            r0.mo31145b()
            com.google.android.gms.ads.internal.n r0 = r11.f45138d
            boolean r12 = r0.mo27482b(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16034kv.mo27482b(com.google.android.gms.internal.ads.zzyv):boolean");
    }

    /* renamed from: l */
    public final void mo27490l() throws RemoteException {
        if (this.f45138d != null) {
            this.f45138d.mo27490l();
        }
    }

    /* renamed from: m */
    public final void mo27491m() throws RemoteException {
        if (this.f45138d != null) {
            this.f45138d.mo27491m();
        }
    }

    /* renamed from: a */
    public final void mo27457a(cal cal) throws RemoteException {
        this.f45139e.f45105a = cal;
        if (this.f45138d != null) {
            this.f45139e.mo31131a(this.f45138d);
        }
    }

    /* renamed from: a */
    public final void mo27466a(C16396yf yfVar) {
        this.f45139e.f45110f = yfVar;
        if (this.f45138d != null) {
            this.f45139e.mo31131a(this.f45138d);
        }
    }

    /* renamed from: a */
    public final void mo27461a(C16147p pVar) throws RemoteException {
        this.f45139e.f45107c = pVar;
        if (this.f45138d != null) {
            this.f45139e.mo31131a(this.f45138d);
        }
    }

    /* renamed from: a */
    public final void mo27460a(C16066m mVar) throws RemoteException {
        this.f45139e.f45106b = mVar;
        if (this.f45138d != null) {
            this.f45139e.mo31131a(this.f45138d);
        }
    }

    /* renamed from: n */
    public final Bundle mo27492n() throws RemoteException {
        if (this.f45138d != null) {
            return this.f45138d.mo27492n();
        }
        return new Bundle();
    }

    /* renamed from: E */
    public final void mo27508E() throws RemoteException {
        if (this.f45138d != null) {
            this.f45138d.mo27481b(this.f45136b);
            this.f45138d.mo27508E();
            return;
        }
        abv.m32798e("Interstitial ad must be loaded before showInterstitial().");
    }

    /* renamed from: o */
    public final void mo27493o() throws RemoteException {
        if (this.f45138d != null) {
            this.f45138d.mo27493o();
        }
    }

    /* renamed from: k */
    public final void mo27489k() throws RemoteException {
        if (this.f45138d != null) {
            this.f45138d.mo27489k();
        } else {
            abv.m32798e("Interstitial ad must be loaded before pingManualTrackingUrl().");
        }
    }

    /* renamed from: i */
    public final zzyz mo27487i() throws RemoteException {
        if (this.f45138d != null) {
            return this.f45138d.mo27487i();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo27470a(zzyz zzyz) throws RemoteException {
        if (this.f45138d != null) {
            this.f45138d.mo27470a(zzyz);
        }
    }

    /* renamed from: a */
    public final void mo27462a(C16230sb sbVar) throws RemoteException {
        abv.m32798e("setInAppPurchaseListener is deprecated and should not be called.");
    }

    /* renamed from: a */
    public final void mo27463a(C16234sf sfVar, String str) throws RemoteException {
        abv.m32798e("setPlayStorePurchaseParams is deprecated and should not be called.");
    }

    /* renamed from: a */
    public final String mo27551a() throws RemoteException {
        if (this.f45138d != null) {
            return this.f45138d.mo27551a();
        }
        return null;
    }

    /* renamed from: B_ */
    public final String mo27550B_() throws RemoteException {
        if (this.f45138d != null) {
            return this.f45138d.mo27550B_();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo27459a(C15813cr crVar) throws RemoteException {
        this.f45139e.f45108d = crVar;
        if (this.f45138d != null) {
            this.f45139e.mo31131a(this.f45138d);
        }
    }

    /* renamed from: a */
    public final void mo27456a(cai cai) throws RemoteException {
        this.f45139e.f45109e = cai;
        if (this.f45138d != null) {
            this.f45139e.mo31131a(this.f45138d);
        }
    }

    /* renamed from: a */
    public final void mo27464a(C16309v vVar) throws RemoteException {
        m37945c();
        if (this.f45138d != null) {
            this.f45138d.mo27464a(vVar);
        }
    }

    /* renamed from: a */
    public final void mo27475a(boolean z) throws RemoteException {
        m37945c();
        if (this.f45138d != null) {
            this.f45138d.mo27475a(z);
        }
    }

    /* renamed from: p */
    public final boolean mo27494p() throws RemoteException {
        return this.f45138d != null && this.f45138d.mo27494p();
    }

    /* renamed from: q */
    public final C15583ak mo27495q() {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    /* renamed from: A */
    public final String mo27444A() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    /* renamed from: B */
    public final C16147p mo27445B() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    /* renamed from: C */
    public final cal mo27446C() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    /* renamed from: a */
    public final void mo27468a(zzacq zzacq) {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    /* renamed from: a */
    public final void mo27467a(zzabp zzabp) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: b */
    public final void mo27481b(boolean z) {
        this.f45136b = z;
    }

    /* renamed from: c */
    private final void m37945c() {
        if (this.f45138d == null) {
            this.f45138d = this.f45137c.mo31115a(this.f45135a);
            this.f45139e.mo31131a(this.f45138d);
        }
    }
}
