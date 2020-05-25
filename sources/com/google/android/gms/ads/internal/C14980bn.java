package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.internal.ads.C15583ak;
import com.google.android.gms.internal.ads.C15806ck;
import com.google.android.gms.internal.ads.C15813cr;
import com.google.android.gms.internal.ads.C15828df;
import com.google.android.gms.internal.ads.C15830dh;
import com.google.android.gms.internal.ads.C15835dm;
import com.google.android.gms.internal.ads.C15837do;
import com.google.android.gms.internal.ads.C15838dp;
import com.google.android.gms.internal.ads.C15839dq;
import com.google.android.gms.internal.ads.C15842ds;
import com.google.android.gms.internal.ads.C15843dt;
import com.google.android.gms.internal.ads.C15865eo;
import com.google.android.gms.internal.ads.C15889fl;
import com.google.android.gms.internal.ads.C15900fw;
import com.google.android.gms.internal.ads.C16118ny;
import com.google.android.gms.internal.ads.C16134on;
import com.google.android.gms.internal.ads.C16148pa;
import com.google.android.gms.internal.ads.C16151pd;
import com.google.android.gms.internal.ads.C16154pg;
import com.google.android.gms.internal.ads.C16243so;
import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.internal.ads.abb;
import com.google.android.gms.internal.ads.abc;
import com.google.android.gms.internal.ads.abv;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.afc;
import com.google.android.gms.internal.ads.ama;
import com.google.android.gms.internal.ads.byc;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzyv;
import com.google.android.gms.internal.ads.zzyz;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;
import java.util.List;

@C16299uq
/* renamed from: com.google.android.gms.ads.internal.bn */
public final class C14980bn extends C14967ba implements C15842ds {

    /* renamed from: j */
    abb f38677j;

    /* renamed from: k */
    private boolean f38678k;

    /* renamed from: l */
    private boolean f38679l;

    public C14980bn(Context context, C14986bt btVar, zzyz zzyz, String str, C16134on onVar, zzbgz zzbgz) {
        super(context, zzyz, str, onVar, zzbgz, btVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27527a(zzyv zzyv, abb abb, boolean z) {
        return false;
    }

    /* renamed from: q */
    public final C15583ak mo27495q() {
        return null;
    }

    /* renamed from: b */
    public final boolean mo27482b(zzyv zzyv) {
        zzyv zzyv2 = zzyv;
        if (this.f38501e.f38609C != null && this.f38501e.f38609C.size() == 1 && ((Integer) this.f38501e.f38609C.get(0)).intValue() == 2) {
            abv.m32794c("Requesting only banner Ad from AdLoader or calling loadAd on returned banner is not yet supported");
            byc byc = null;
            if (this.f38501e.f38636j != null) {
                byc = this.f38501e.f38636j.f40092K;
            }
            mo27451a(0, byc);
            return false;
        } else if (this.f38501e.f38608B == null) {
            return super.mo27482b(zzyv);
        } else {
            if (zzyv2.f46324h != this.f38678k) {
                zzyv zzyv3 = new zzyv(zzyv2.f46317a, zzyv2.f46318b, zzyv2.f46319c, zzyv2.f46320d, zzyv2.f46321e, zzyv2.f46322f, zzyv2.f46323g, zzyv2.f46324h || this.f38678k, zzyv2.f46325i, zzyv2.f46326j, zzyv2.f46327k, zzyv2.f46328l, zzyv2.f46329m, zzyv2.f46330n, zzyv2.f46331o, zzyv2.f46332p, zzyv2.f46333q, zzyv2.f46334r, null, zzyv2.f46336t, zzyv2.f46337u);
                zzyv2 = zzyv3;
            }
            return super.mo27482b(zzyv2);
        }
    }

    /* renamed from: a */
    public final void mo27455a(abc abc, C15806ck ckVar) {
        this.f38677j = null;
        if (abc.f40133e != -2) {
            this.f38677j = m30910a(abc, abc.f40133e);
        } else if (!abc.f40130b.f46189g) {
            abv.m32798e("partialAdState is not mediation");
            this.f38677j = m30910a(abc, 0);
        }
        if (this.f38677j != null) {
            acd.f40245a.post(new C14981bo(this));
            return;
        }
        if (abc.f40132d != null) {
            this.f38501e.f38635i = abc.f40132d;
        }
        this.f38501e.f38618L = 0;
        this.f38501e.f38634h = C16243so.m38791a(this.f38501e.f38629c, this, abc, this.f38501e.f38630d, null, this.f38659o, this, ckVar);
    }

    /* renamed from: a */
    private static abb m30910a(abc abc, int i) {
        abc abc2 = abc;
        abb abb = new abb(abc2.f40129a.f46132c, null, abc2.f40130b.f46185c, i, abc2.f40130b.f46187e, abc2.f40130b.f46191i, abc2.f40130b.f46193k, abc2.f40130b.f46192j, abc2.f40129a.f46138i, abc2.f40130b.f46189g, null, null, null, abc2.f40131c, null, abc2.f40130b.f46190h, abc2.f40132d, abc2.f40130b.f46188f, abc2.f40134f, abc2.f40135g, abc2.f40130b.f46196n, abc2.f40136h, null, abc2.f40130b.f46156A, abc2.f40130b.f46157B, abc2.f40130b.f46157B, abc2.f40130b.f46159D, abc2.f40130b.f46160E, null, abc2.f40130b.f46163H, abc2.f40130b.f46167L, abc2.f40137i, abc2.f40130b.f46170O, abc2.f40138j, abc2.f40130b.f46172Q, abc2.f40130b.f46173R, abc2.f40130b.f46174S, abc2.f40130b.f46175T, abc2.f40130b.f46177V, abc2.f40130b.f46178W);
        return abb;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0067 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0068  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo27477a(com.google.android.gms.internal.ads.abb r5, com.google.android.gms.internal.ads.abb r6) {
        /*
            r4 = this;
            com.google.android.gms.ads.internal.ay r0 = r4.f38501e
            boolean r0 = r0.mo27568c()
            if (r0 == 0) goto L_0x009f
            boolean r0 = r6.f40116n
            r1 = 0
            if (r0 != 0) goto L_0x0018
            com.google.android.gms.internal.ads.byc r5 = r6.f40092K
            r4.mo27451a(r1, r5)
            java.lang.String r5 = "newState is not mediation."
            com.google.android.gms.internal.ads.abv.m32798e(r5)
            return r1
        L_0x0018:
            com.google.android.gms.internal.ads.nx r0 = r6.f40117o
            r2 = 1
            if (r0 == 0) goto L_0x006b
            com.google.android.gms.internal.ads.nx r0 = r6.f40117o
            boolean r0 = r0.mo31199a()
            if (r0 == 0) goto L_0x006b
            com.google.android.gms.ads.internal.ay r0 = r4.f38501e
            boolean r0 = r0.mo27568c()
            if (r0 == 0) goto L_0x003d
            com.google.android.gms.ads.internal.ay r0 = r4.f38501e
            com.google.android.gms.ads.internal.az r0 = r0.f38632f
            if (r0 == 0) goto L_0x003d
            com.google.android.gms.ads.internal.ay r0 = r4.f38501e
            com.google.android.gms.ads.internal.az r0 = r0.f38632f
            com.google.android.gms.internal.ads.ada r0 = r0.f38653a
            java.lang.String r3 = r6.f40082A
            r0.f40271b = r3
        L_0x003d:
            boolean r0 = super.mo27477a(r5, r6)
            if (r0 != 0) goto L_0x0045
        L_0x0043:
            r5 = 0
            goto L_0x0065
        L_0x0045:
            com.google.android.gms.ads.internal.ay r0 = r4.f38501e
            boolean r0 = r0.mo27568c()
            if (r0 == 0) goto L_0x0059
            boolean r5 = r4.m30913c(r5, r6)
            if (r5 != 0) goto L_0x0059
            com.google.android.gms.internal.ads.byc r5 = r6.f40092K
            r4.mo27451a(r1, r5)
            goto L_0x0043
        L_0x0059:
            com.google.android.gms.ads.internal.ay r5 = r4.f38501e
            boolean r5 = r5.mo27569d()
            if (r5 != 0) goto L_0x0064
            super.mo27583a(r6, r1)
        L_0x0064:
            r5 = 1
        L_0x0065:
            if (r5 != 0) goto L_0x0068
            return r1
        L_0x0068:
            r4.f38679l = r2
            goto L_0x007e
        L_0x006b:
            com.google.android.gms.internal.ads.nx r0 = r6.f40117o
            if (r0 == 0) goto L_0x0094
            com.google.android.gms.internal.ads.nx r0 = r6.f40117o
            boolean r0 = r0.mo31200b()
            if (r0 == 0) goto L_0x0094
            boolean r5 = r4.m30912b(r5, r6)
            if (r5 != 0) goto L_0x007e
            return r1
        L_0x007e:
            java.util.ArrayList r5 = new java.util.ArrayList
            java.lang.Integer[] r6 = new java.lang.Integer[r2]
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r1] = r0
            java.util.List r6 = java.util.Arrays.asList(r6)
            r5.<init>(r6)
            r4.mo27614c(r5)
            return r2
        L_0x0094:
            com.google.android.gms.internal.ads.byc r5 = r6.f40092K
            r4.mo27451a(r1, r5)
            java.lang.String r5 = "Response is neither banner nor native."
            com.google.android.gms.internal.ads.abv.m32798e(r5)
            return r1
        L_0x009f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "AdLoader API does not support custom rendering."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C14980bn.mo27477a(com.google.android.gms.internal.ads.abb, com.google.android.gms.internal.ads.abb):boolean");
    }

    /* renamed from: b */
    private final boolean m30912b(abb abb, abb abb2) {
        abb abb3 = abb2;
        View view = null;
        mo27613b(null);
        if (!this.f38501e.mo27568c()) {
            abv.m32798e("Native ad does not have custom rendering mode.");
            mo27451a(0, abb3.f40092K);
            return false;
        }
        try {
            C16154pg p = abb3.f40118p != null ? abb3.f40118p.mo31267p() : null;
            C16148pa h = abb3.f40118p != null ? abb3.f40118p.mo31259h() : null;
            C16151pd i = abb3.f40118p != null ? abb3.f40118p.mo31260i() : null;
            C15889fl n = abb3.f40118p != null ? abb3.f40118p.mo31265n() : null;
            String c = m30859c(abb2);
            if (p != null && this.f38501e.f38646t != null) {
                String a = p.mo31308a();
                List b = p.mo31311b();
                String c2 = p.mo31313c();
                C15865eo d = p.mo31314d() != null ? p.mo31314d() : null;
                String e = p.mo31315e();
                String f = p.mo31316f();
                double g = p.mo31317g();
                String h2 = p.mo31318h();
                String i2 = p.mo31319i();
                C15583ak j = p.mo31320j();
                if (p.mo31323m() != null) {
                    view = (View) C14886d.m30545a(p.mo31323m());
                }
                C15835dm dmVar = new C15835dm(a, b, c2, d, e, f, g, h2, i2, null, j, view, p.mo31324n(), c, p.mo31325o());
                C15838dp dpVar = new C15838dp(this.f38501e.f38629c, (C15842ds) this, this.f38501e.f38630d, p, (C15843dt) dmVar);
                dmVar.mo30919a((C15839dq) dpVar);
                m30911a(dmVar);
            } else if (h != null && this.f38501e.f38646t != null) {
                String a2 = h.mo31268a();
                List b2 = h.mo31271b();
                String c3 = h.mo31273c();
                C15865eo d2 = h.mo31275d() != null ? h.mo31275d() : null;
                String e2 = h.mo31276e();
                double f2 = h.mo31277f();
                String g2 = h.mo31278g();
                String h3 = h.mo31279h();
                C15583ak m = h.mo31284m();
                if (h.mo31287p() != null) {
                    view = (View) C14886d.m30545a(h.mo31287p());
                }
                C15835dm dmVar2 = new C15835dm(a2, b2, c3, d2, e2, null, f2, g2, h3, null, m, view, h.mo31288q(), c, h.mo31283l());
                C15838dp dpVar2 = new C15838dp(this.f38501e.f38629c, (C15842ds) this, this.f38501e.f38630d, h, (C15843dt) dmVar2);
                dmVar2.mo30919a((C15839dq) dpVar2);
                m30911a(dmVar2);
            } else if (h != null && this.f38501e.f38644r != null) {
                String a3 = h.mo31268a();
                List b3 = h.mo31271b();
                String c4 = h.mo31273c();
                C15865eo d3 = h.mo31275d() != null ? h.mo31275d() : null;
                String e3 = h.mo31276e();
                double f3 = h.mo31277f();
                String g3 = h.mo31278g();
                String h4 = h.mo31279h();
                Bundle l = h.mo31283l();
                C15583ak m2 = h.mo31284m();
                if (h.mo31287p() != null) {
                    view = (View) C14886d.m30545a(h.mo31287p());
                }
                C15828df dfVar = new C15828df(a3, b3, c4, d3, e3, f3, g3, h4, null, l, m2, view, h.mo31288q(), c);
                C15838dp dpVar3 = new C15838dp(this.f38501e.f38629c, (C15842ds) this, this.f38501e.f38630d, h, (C15843dt) dfVar);
                dfVar.mo30919a((C15839dq) dpVar3);
                acd.f40245a.post(new C14983bq(this, dfVar));
            } else if (i != null && this.f38501e.f38646t != null) {
                String a4 = i.mo31289a();
                List b4 = i.mo31292b();
                String c5 = i.mo31294c();
                C15865eo d4 = i.mo31296d() != null ? i.mo31296d() : null;
                String e4 = i.mo31297e();
                String f4 = i.mo31298f();
                C15583ak l2 = i.mo31304l();
                if (i.mo31306n() != null) {
                    view = (View) C14886d.m30545a(i.mo31306n());
                }
                C15835dm dmVar3 = new C15835dm(a4, b4, c5, d4, e4, f4, -1.0d, null, null, null, l2, view, i.mo31307o(), c, i.mo31302j());
                C16151pd pdVar = i;
                C15835dm dmVar4 = dmVar3;
                C15838dp dpVar4 = new C15838dp(this.f38501e.f38629c, (C15842ds) this, this.f38501e.f38630d, pdVar, (C15843dt) dmVar3);
                dmVar4.mo30919a((C15839dq) dpVar4);
                m30911a(dmVar4);
            } else if (i != null && this.f38501e.f38645s != null) {
                String a5 = i.mo31289a();
                List b5 = i.mo31292b();
                String c6 = i.mo31294c();
                C15865eo d5 = i.mo31296d() != null ? i.mo31296d() : null;
                String e5 = i.mo31297e();
                String f5 = i.mo31298f();
                Bundle j2 = i.mo31302j();
                C15583ak l3 = i.mo31304l();
                if (i.mo31306n() != null) {
                    view = (View) C14886d.m30545a(i.mo31306n());
                }
                C15830dh dhVar = new C15830dh(a5, b5, c6, d5, e5, f5, null, j2, l3, view, i.mo31307o(), c);
                C16151pd pdVar2 = i;
                C15830dh dhVar2 = dhVar;
                C15838dp dpVar5 = new C15838dp(this.f38501e.f38629c, (C15842ds) this, this.f38501e.f38630d, pdVar2, (C15843dt) dhVar);
                dhVar2.mo30919a((C15839dq) dpVar5);
                acd.f40245a.post(new C14984br(this, dhVar2));
            } else if (n == null || this.f38501e.f38649w == null || this.f38501e.f38649w.get(n.mo30921c()) == null) {
                abv.m32798e("No matching mapper/listener for retrieved native ad template.");
                mo27451a(0, abb3.f40092K);
                return false;
            } else {
                acd.f40245a.post(new C14985bs(this, n));
            }
            return super.mo27477a(abb, abb2);
        } catch (RemoteException e6) {
            abv.m32797d("#007 Could not call remote method.", e6);
            mo27451a(0, abb3.f40092K);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27612a(C14882b bVar) {
        Object a = bVar != null ? C14886d.m30545a(bVar) : null;
        if (a instanceof C15839dq) {
            ((C15839dq) a).mo31022e();
        }
        super.mo27588b(this.f38501e.f38636j, false);
    }

    /* renamed from: a */
    private final void m30911a(C15835dm dmVar) {
        acd.f40245a.post(new C14982bp(this, dmVar));
    }

    /* renamed from: b */
    public final void mo27528b(View view) {
        afc.m32797d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    /* renamed from: H */
    public final void mo27511H() {
        afc.m32797d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    /* renamed from: M */
    public final void mo27516M() {
        afc.m32797d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    /* renamed from: a */
    public final void mo27526a(C15839dq dqVar) {
        afc.m32797d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    /* renamed from: L */
    public final void mo27515L() {
        afc.m32797d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    /* renamed from: a */
    public final void mo27525a(C15837do doVar) {
        afc.m32797d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    /* renamed from: O */
    public final boolean mo27518O() {
        if (m30908F() != null) {
            return m30908F().f45309p;
        }
        return false;
    }

    /* renamed from: P */
    public final boolean mo27519P() {
        if (m30908F() != null) {
            return m30908F().f45310q;
        }
        return false;
    }

    /* renamed from: Q */
    public final boolean mo27520Q() {
        if (m30908F() != null) {
            return m30908F().f45311r;
        }
        return false;
    }

    /* renamed from: F */
    private final C16118ny m30908F() {
        if (this.f38501e.f38636j == null || !this.f38501e.f38636j.f40116n) {
            return null;
        }
        return this.f38501e.f38636j.f40120r;
    }

    /* renamed from: c */
    private final boolean m30913c(abb abb, abb abb2) {
        View a = C15033t.m31088a(abb2);
        if (a == null) {
            return false;
        }
        View nextView = this.f38501e.f38632f.getNextView();
        if (nextView != null) {
            if (nextView instanceof ama) {
                ((ama) nextView).destroy();
            }
            this.f38501e.f38632f.removeView(nextView);
        }
        if (!C15033t.m31097b(abb2)) {
            try {
                mo27453a(a);
            } catch (Throwable th) {
                C14963ax.m30834d().mo28588a(th, "AdLoaderManager.swapBannerViews");
                abv.m32795c("Could not add mediation view to view hierarchy.", th);
                return false;
            }
        }
        if (this.f38501e.f38632f.getChildCount() > 1) {
            this.f38501e.f38632f.showNext();
        }
        if (abb != null) {
            View nextView2 = this.f38501e.f38632f.getNextView();
            if (nextView2 != null) {
                this.f38501e.f38632f.removeView(nextView2);
            }
            this.f38501e.mo27567b();
        }
        this.f38501e.f38632f.setMinimumWidth(mo27487i().f46343f);
        this.f38501e.f38632f.setMinimumHeight(mo27487i().f46340c);
        this.f38501e.f38632f.requestLayout();
        this.f38501e.f38632f.setVisibility(0);
        return true;
    }

    /* renamed from: l */
    public final void mo27490l() {
        if (this.f38679l) {
            super.mo27490l();
            return;
        }
        throw new IllegalStateException("Native Ad does not support pause().");
    }

    /* renamed from: m */
    public final void mo27491m() {
        if (this.f38679l) {
            super.mo27491m();
            return;
        }
        throw new IllegalStateException("Native Ad does not support resume().");
    }

    /* renamed from: b */
    public final void mo27613b(List<String> list) {
        C15464q.m32132b("setNativeTemplates must be called on the main UI thread.");
        this.f38501e.f38615I = list;
    }

    /* renamed from: c */
    public final C15900fw mo27530c(String str) {
        C15464q.m32132b("getOnCustomClickListener must be called on the main UI thread.");
        return (C15900fw) this.f38501e.f38648v.get(str);
    }

    /* renamed from: a */
    public final void mo27475a(boolean z) {
        C15464q.m32132b("setManualImpressionsEnabled must be called from the main thread.");
        this.f38678k = z;
    }

    /* renamed from: a */
    public final void mo27459a(C15813cr crVar) {
        throw new IllegalStateException("CustomRendering is not supported by AdLoaderManager.");
    }

    /* renamed from: E */
    public final void mo27508E() {
        throw new IllegalStateException("Interstitial is not supported by AdLoaderManager.");
    }

    /* renamed from: c */
    public final void mo27614c(List<Integer> list) {
        C15464q.m32132b("setAllowedAdTypes must be called on the main UI thread.");
        this.f38501e.f38609C = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo27499u() {
        super.mo27499u();
        abb abb = this.f38501e.f38636j;
        if (!(abb == null || abb.f40117o == null || !abb.f40117o.mo31199a() || this.f38501e.f38608B == null)) {
            try {
                this.f38501e.f38608B.mo31080a(this, C14886d.m30544a(this.f38501e.f38629c));
                super.mo27588b(this.f38501e.f38636j, false);
            } catch (RemoteException e) {
                abv.m32797d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: R */
    public final void mo27521R() {
        if (this.f38501e.f38636j == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.f38501e.f38636j.f40119q) || !m30909G()) {
            super.mo27521R();
            if (m30909G()) {
                mo27501w();
            }
            return;
        }
        mo27501w();
    }

    /* renamed from: S */
    public final void mo27522S() {
        if (this.f38501e.f38636j == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.f38501e.f38636j.f40119q) || !m30909G()) {
            super.mo27522S();
        } else {
            mo27500v();
        }
    }

    /* renamed from: G */
    private final boolean m30909G() {
        return (this.f38501e.f38636j == null || this.f38501e.f38636j.f40117o == null || !this.f38501e.f38636j.f40117o.mo31200b()) ? false : true;
    }
}
