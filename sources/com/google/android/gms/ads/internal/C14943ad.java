package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.support.p030v4.p038f.C0800n;
import android.view.View;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.internal.ads.C15583ak;
import com.google.android.gms.internal.ads.C15606an;
import com.google.android.gms.internal.ads.C15740bx;
import com.google.android.gms.internal.ads.C15806ck;
import com.google.android.gms.internal.ads.C15813cr;
import com.google.android.gms.internal.ads.C15825dc;
import com.google.android.gms.internal.ads.C15828df;
import com.google.android.gms.internal.ads.C15830dh;
import com.google.android.gms.internal.ads.C15832dj;
import com.google.android.gms.internal.ads.C15835dm;
import com.google.android.gms.internal.ads.C15837do;
import com.google.android.gms.internal.ads.C15838dp;
import com.google.android.gms.internal.ads.C15839dq;
import com.google.android.gms.internal.ads.C15842ds;
import com.google.android.gms.internal.ads.C15843dt;
import com.google.android.gms.internal.ads.C15865eo;
import com.google.android.gms.internal.ads.C15889fl;
import com.google.android.gms.internal.ads.C15900fw;
import com.google.android.gms.internal.ads.C15903fz;
import com.google.android.gms.internal.ads.C16118ny;
import com.google.android.gms.internal.ads.C16134on;
import com.google.android.gms.internal.ads.C16138or;
import com.google.android.gms.internal.ads.C16148pa;
import com.google.android.gms.internal.ads.C16151pd;
import com.google.android.gms.internal.ads.C16154pg;
import com.google.android.gms.internal.ads.C16230sb;
import com.google.android.gms.internal.ads.C16243so;
import com.google.android.gms.internal.ads.C16276tu;
import com.google.android.gms.internal.ads.C16280ty;
import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.internal.ads.abb;
import com.google.android.gms.internal.ads.abc;
import com.google.android.gms.internal.ads.abv;
import com.google.android.gms.internal.ads.acb;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.afc;
import com.google.android.gms.internal.ads.aga;
import com.google.android.gms.internal.ads.agl;
import com.google.android.gms.internal.ads.ama;
import com.google.android.gms.internal.ads.amk;
import com.google.android.gms.internal.ads.buy;
import com.google.android.gms.internal.ads.bwh;
import com.google.android.gms.internal.ads.byc;
import com.google.android.gms.internal.ads.caf;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzyv;
import com.google.android.gms.internal.ads.zzyz;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;
import com.taobao.android.dexposed.ClassUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.ads.internal.ad */
public final class C14943ad extends C14967ba implements C15842ds {

    /* renamed from: j */
    public agl<C15843dt> f38514j;

    /* renamed from: k */
    public ama f38515k;

    /* renamed from: l */
    public ama f38516l;

    /* renamed from: m */
    int f38517m;

    /* renamed from: n */
    public final String f38518n;

    /* renamed from: p */
    private final Object f38519p;

    /* renamed from: q */
    private boolean f38520q;

    /* renamed from: r */
    private boolean f38521r;

    /* renamed from: s */
    private C16276tu f38522s;

    public C14943ad(Context context, C14986bt btVar, zzyz zzyz, String str, C16134on onVar, zzbgz zzbgz) {
        this(context, btVar, zzyz, str, onVar, zzbgz, false);
    }

    public C14943ad(Context context, C14986bt btVar, zzyz zzyz, String str, C16134on onVar, zzbgz zzbgz, boolean z) {
        super(context, zzyz, str, onVar, zzbgz, btVar);
        this.f38519p = new Object();
        this.f38514j = new agl<>();
        this.f38517m = 1;
        this.f38518n = UUID.randomUUID().toString();
        this.f38520q = z;
    }

    /* renamed from: a */
    public final boolean mo27478a(zzyv zzyv, C15806ck ckVar) {
        try {
            mo27509F();
            return super.mo27586a(zzyv, ckVar, this.f38517m);
        } catch (Exception unused) {
            afc.m32791a(4);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public final void mo27509F() throws amk {
        synchronized (this.f38519p) {
            abv.m32494a("Initializing webview native ads utills");
            C16280ty tyVar = new C16280ty(this.f38501e.f38629c, this, this.f38518n, this.f38501e.f38630d, this.f38501e.f38631e);
            this.f38522s = tyVar;
        }
    }

    /* renamed from: G */
    public final C16276tu mo27510G() {
        C16276tu tuVar;
        synchronized (this.f38519p) {
            tuVar = this.f38522s;
        }
        return tuVar;
    }

    /* renamed from: a */
    public final void mo27455a(abc abc, C15806ck ckVar) {
        if (abc.f40132d != null) {
            this.f38501e.f38635i = abc.f40132d;
        }
        if (abc.f40133e != -2) {
            acd.f40245a.post(new C14944ae(this, abc));
            return;
        }
        int i = abc.f40129a.f46121Y;
        if (i == 1) {
            this.f38501e.f38618L = 0;
            this.f38501e.f38634h = C16243so.m38791a(this.f38501e.f38629c, this, abc, this.f38501e.f38630d, null, this.f38659o, this, ckVar);
            String str = "AdRenderer: ";
            String valueOf = String.valueOf(this.f38501e.f38634h.getClass().getName());
            abv.m32792b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            return;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray jSONArray2 = new JSONObject(abc.f40130b.f46184b).getJSONArray("slots");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONArray optJSONArray = jSONArray2.getJSONObject(i2).optJSONArray("ads");
                int i3 = 0;
                while (optJSONArray != null && i3 < optJSONArray.length()) {
                    jSONArray.put(optJSONArray.get(i3));
                    i3++;
                }
            }
            m30742ac();
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < i; i4++) {
                C14946ag agVar = new C14946ag(this, i4, jSONArray, i, abc);
                arrayList.add(acb.m32567a((Callable<T>) agVar));
            }
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                try {
                    C15843dt dtVar = (C15843dt) ((aga) arrayList.get(i5)).get(((Long) caf.m37099d().mo30717a(C15740bx.f44308bp)).longValue(), TimeUnit.MILLISECONDS);
                    Handler handler = acd.f40245a;
                    C14947ah ahVar = new C14947ah(this, dtVar, i5, arrayList, abc);
                    handler.post(ahVar);
                } catch (InterruptedException e) {
                    afc.m32795c("", e);
                    Thread.currentThread().interrupt();
                } catch (CancellationException | ExecutionException | TimeoutException e2) {
                    afc.m32795c("", e2);
                }
            }
        } catch (JSONException e3) {
            abv.m32795c("Malformed native ad response", e3);
            mo27451a(0, abc.f40137i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27451a(int i, byc byc) {
        mo27452a(i, false, byc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27452a(int i, boolean z, byc byc) {
        m30742ac();
        super.mo27452a(i, z, byc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27527a(zzyv zzyv, abb abb, boolean z) {
        return this.f38500d.f38549b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27477a(abb abb, abb abb2) {
        abb abb3 = abb2;
        View view = null;
        mo27529b(null);
        if (this.f38501e.mo27568c()) {
            if (abb3.f40116n) {
                m30742ac();
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
                        m30738a(dmVar);
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
                        m30738a(dmVar2);
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
                        m30736a(dfVar);
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
                        m30738a(dmVar4);
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
                        m30737a(dhVar2);
                    } else if (n == null || this.f38501e.f38649w == null || this.f38501e.f38649w.get(n.mo30921c()) == null) {
                        abv.m32798e("No matching mapper/listener for retrieved native ad template.");
                        mo27451a(0, abb3.f40092K);
                        return false;
                    } else {
                        acd.f40245a.post(new C14952am(this, n));
                    }
                } catch (RemoteException e6) {
                    abv.m32797d("#007 Could not call remote method.", e6);
                }
            } else {
                C15843dt dtVar = abb3.f40084C;
                if (this.f38520q) {
                    m30739a("Google", abb3.f40095N);
                    this.f38514j.mo28823b(dtVar);
                } else {
                    boolean z = dtVar instanceof C15830dh;
                    if (z && this.f38501e.f38646t != null) {
                        m30739a("Google", abb3.f40095N);
                        m30738a(m30743b(abb3.f40084C));
                    } else if (!z || this.f38501e.f38645s == null) {
                        boolean z2 = dtVar instanceof C15828df;
                        if (z2 && this.f38501e.f38646t != null) {
                            m30739a("Google", abb3.f40095N);
                            m30738a(m30743b(abb3.f40084C));
                        } else if (!z2 || this.f38501e.f38644r == null) {
                            if ((dtVar instanceof C15832dj) && this.f38501e.f38649w != null) {
                                C15832dj djVar = (C15832dj) dtVar;
                                if (this.f38501e.f38649w.get(djVar.mo30921c()) != null) {
                                    acd.f40245a.post(new C14951al(this, djVar.mo30921c(), abb3));
                                }
                            }
                            if (!(dtVar instanceof C15825dc) || this.f38501e.f38647u == null) {
                                abv.m32798e("No matching listener for retrieved native ad template.");
                                mo27451a(0, abb3.f40092K);
                                return false;
                            }
                            acd.f40245a.post(new C14945af(this, (C15825dc) dtVar));
                        } else {
                            m30739a("Google", abb3.f40095N);
                            m30736a((C15828df) abb3.f40084C);
                        }
                    } else {
                        m30739a("Google", abb3.f40095N);
                        m30737a((C15830dh) abb3.f40084C);
                    }
                }
            }
            return super.mo27477a(abb, abb2);
        }
        throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27524a(C14882b bVar) {
        Object a = bVar != null ? C14886d.m30545a(bVar) : null;
        if (a instanceof C15839dq) {
            ((C15839dq) a).mo31022e();
        }
        super.mo27588b(this.f38501e.f38636j, false);
    }

    /* renamed from: l */
    public final void mo27490l() {
        throw new IllegalStateException("Native Ad DOES NOT support pause().");
    }

    /* renamed from: m */
    public final void mo27491m() {
        throw new IllegalStateException("Native Ad DOES NOT support resume().");
    }

    /* renamed from: a */
    private final void m30736a(C15828df dfVar) {
        acd.f40245a.post(new C14948ai(this, dfVar));
    }

    /* renamed from: a */
    private final void m30738a(C15835dm dmVar) {
        acd.f40245a.post(new C14949aj(this, dmVar));
    }

    /* renamed from: a */
    private final void m30737a(C15830dh dhVar) {
        acd.f40245a.post(new C14950ak(this, dhVar));
    }

    /* renamed from: a */
    private final void m30739a(String str, boolean z) {
        String str2;
        if (z) {
            if (this.f38516l != null || this.f38515k != null) {
                boolean z2 = false;
                boolean z3 = this.f38516l != null;
                if (this.f38515k != null) {
                    z2 = true;
                }
                ama ama = null;
                if (z3) {
                    str2 = null;
                    ama = this.f38516l;
                } else if (z2) {
                    ama = this.f38515k;
                    str2 = "javascript";
                } else {
                    str2 = null;
                }
                if (ama.getWebView() != null && C14963ax.m30845o().mo31372a(this.f38501e.f38629c)) {
                    int i = this.f38501e.f38631e.f46238b;
                    int i2 = this.f38501e.f38631e.f46239c;
                    StringBuilder sb = new StringBuilder(23);
                    sb.append(i);
                    sb.append(ClassUtils.PACKAGE_SEPARATOR);
                    sb.append(i2);
                    this.f38504h = C14963ax.m30845o().mo31369a(sb.toString(), ama.getWebView(), "", "javascript", str2, str);
                    if (this.f38504h != null) {
                        ama.mo29151a(this.f38504h);
                        if (z2) {
                            C14882b bVar = this.f38504h;
                            View view = this.f38515k.getView();
                            if (view != null) {
                                C14963ax.m30845o().mo31371a(bVar, view);
                            }
                        }
                        C14963ax.m30845o().mo31370a(this.f38504h);
                    }
                }
            }
        }
    }

    /* renamed from: aa */
    private final boolean m30740aa() {
        return this.f38501e.f38636j != null && this.f38501e.f38636j.f40095N;
    }

    /* renamed from: b */
    public final void mo27528b(View view) {
        boolean z = this.f38516l != null;
        if (m30740aa() && this.f38504h != null && z && view != null) {
            C14963ax.m30845o().mo31371a(this.f38504h, view);
        }
    }

    /* renamed from: H */
    public final void mo27511H() {
        if (m30740aa() && this.f38504h != null) {
            ama ama = null;
            if (this.f38516l != null) {
                ama = this.f38516l;
            } else if (this.f38515k != null) {
                ama = this.f38515k;
            }
            if (ama != null) {
                ama.mo29242a("onSdkImpression", (Map) new HashMap());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo27499u() {
        mo27483c(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo27483c(boolean z) {
        super.mo27483c(z);
        if (this.f38521r) {
            if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44284bR)).booleanValue()) {
                mo27512I();
            }
        }
    }

    /* renamed from: a */
    public final void mo27526a(C15839dq dqVar) {
        if (this.f38501e.f38636j.f40113k != null && this.f38501e.f38652z == null) {
            C14963ax.m30834d().f40164b.mo30745a(this.f38501e.f38635i, this.f38501e.f38636j, (bwh) new buy(dqVar), (ama) null);
        }
    }

    /* renamed from: I */
    public final void mo27512I() {
        if (this.f38501e.f38636j == null || this.f38515k == null) {
            this.f38521r = true;
            abv.m32798e("Request to enable ActiveView before adState is available.");
            return;
        }
        C14963ax.m30834d().f40164b.mo30744a(this.f38501e.f38635i, this.f38501e.f38636j, this.f38515k.getView(), this.f38515k);
        this.f38521r = false;
    }

    /* renamed from: J */
    public final void mo27513J() {
        this.f38521r = false;
        if (this.f38501e.f38636j == null || this.f38515k == null) {
            abv.m32798e("Request to enable ActiveView before adState is available.");
        } else {
            C14963ax.m30834d().f40164b.mo30740a(this.f38501e.f38636j);
        }
    }

    /* renamed from: A */
    public final String mo27444A() {
        return this.f38501e.f38628b;
    }

    /* renamed from: b */
    public final void mo27529b(List<String> list) {
        C15464q.m32132b("setNativeTemplates must be called on the main UI thread.");
        this.f38501e.f38615I = list;
    }

    /* renamed from: c */
    public final C15900fw mo27530c(String str) {
        C15464q.m32132b("getOnCustomClickListener must be called on the main UI thread.");
        if (this.f38501e.f38648v == null) {
            return null;
        }
        return (C15900fw) this.f38501e.f38648v.get(str);
    }

    /* renamed from: K */
    public final C0800n<String, C15903fz> mo27514K() {
        C15464q.m32132b("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        return this.f38501e.f38649w;
    }

    /* renamed from: L */
    public final void mo27515L() {
        if (this.f38515k != null) {
            this.f38515k.destroy();
            this.f38515k = null;
        }
    }

    /* renamed from: M */
    public final void mo27516M() {
        this.f38504h = null;
        if (this.f38516l != null) {
            this.f38516l.destroy();
            this.f38516l = null;
        }
    }

    /* renamed from: a */
    public final void mo27525a(C15837do doVar) {
        if (this.f38515k != null) {
            this.f38515k.mo29155a(doVar);
        }
    }

    /* renamed from: N */
    public final void mo27517N() {
        if (this.f38515k == null || this.f38515k.mo28936b() == null || this.f38501e.f38650x == null || this.f38501e.f38650x.f46070f == null) {
            if (!(this.f38501e.f38647u == null || this.f38515k == null || this.f38515k.mo28936b() == null)) {
                this.f38515k.mo28936b().mo29351a(false, true, false);
            }
            return;
        }
        this.f38515k.mo28936b().mo29350a(this.f38501e.f38650x.f46070f);
    }

    /* renamed from: O */
    public final boolean mo27518O() {
        if (m30741ab() != null) {
            return m30741ab().f45309p;
        }
        return false;
    }

    /* renamed from: P */
    public final boolean mo27519P() {
        if (m30741ab() != null) {
            return m30741ab().f45310q;
        }
        return false;
    }

    /* renamed from: Q */
    public final boolean mo27520Q() {
        if (m30741ab() != null) {
            return m30741ab().f45311r;
        }
        return false;
    }

    /* renamed from: ab */
    private final C16118ny m30741ab() {
        if (this.f38501e.f38636j == null || !this.f38501e.f38636j.f40116n) {
            return null;
        }
        return this.f38501e.f38636j.f40120r;
    }

    /* renamed from: a */
    public final void mo27462a(C16230sb sbVar) {
        throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
    }

    /* renamed from: a */
    public final void mo27459a(C15813cr crVar) {
        throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
    }

    /* renamed from: E */
    public final void mo27508E() {
        throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
    }

    /* renamed from: R */
    public final void mo27521R() {
        if (this.f38501e.f38636j == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.f38501e.f38636j.f40119q)) {
            super.mo27521R();
            mo27501w();
            return;
        }
        mo27501w();
    }

    /* renamed from: S */
    public final void mo27522S() {
        if (this.f38501e.f38636j == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.f38501e.f38636j.f40119q)) {
            super.mo27522S();
        } else {
            mo27500v();
        }
    }

    /* renamed from: T */
    public final void mo27523T() {
        abb abb = this.f38501e.f38636j;
        if (abb.f40118p == null) {
            super.mo27523T();
            return;
        }
        try {
            C16138or orVar = abb.f40118p;
            C15583ak akVar = null;
            C16148pa h = orVar.mo31259h();
            if (h != null) {
                akVar = h.mo31284m();
            } else {
                C16151pd i = orVar.mo31260i();
                if (i != null) {
                    akVar = i.mo31304l();
                } else {
                    C15889fl n = orVar.mo31265n();
                    if (n != null) {
                        akVar = n.mo30975g();
                    }
                }
            }
            if (akVar != null) {
                C15606an i2 = akVar.mo29072i();
                if (i2 != null) {
                    i2.mo29358d();
                }
            }
        } catch (RemoteException e) {
            abv.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00ac  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.C15835dm m30743b(com.google.android.gms.internal.ads.C15843dt r20) {
        /*
            r0 = r20
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.C15830dh
            r2 = 0
            if (r1 == 0) goto L_0x0053
            com.google.android.gms.internal.ads.dh r0 = (com.google.android.gms.internal.ads.C15830dh) r0
            com.google.android.gms.internal.ads.dm r1 = new com.google.android.gms.internal.ads.dm
            r3 = r1
            java.lang.String r4 = r0.mo30953a()
            java.util.List r5 = r0.mo30938f()
            java.lang.String r6 = r0.mo30959i()
            com.google.android.gms.internal.ads.eo r7 = r0.mo30960j()
            java.lang.String r8 = r0.mo30961k()
            java.lang.String r9 = r0.mo30962l()
            r10 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r12 = 0
            r13 = 0
            com.google.android.gms.internal.ads.cx r14 = r0.mo30922d()
            com.google.android.gms.internal.ads.ak r15 = r0.mo30963m()
            android.view.View r16 = r0.mo30923e()
            com.google.android.gms.a.b r17 = r0.mo30957g()
            java.lang.String r18 = r0.mo30958h()
            android.os.Bundle r19 = r0.mo30965o()
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19)
            com.google.android.gms.a.b r3 = r0.mo30964n()
            if (r3 == 0) goto L_0x00a8
            com.google.android.gms.a.b r0 = r0.mo30964n()
            java.lang.Object r0 = com.google.android.gms.p1027a.C14886d.m30545a(r0)
        L_0x0051:
            r2 = r0
            goto L_0x00a8
        L_0x0053:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.C15828df
            if (r1 == 0) goto L_0x00a7
            com.google.android.gms.internal.ads.df r0 = (com.google.android.gms.internal.ads.C15828df) r0
            com.google.android.gms.internal.ads.dm r1 = new com.google.android.gms.internal.ads.dm
            r3 = r1
            java.lang.String r4 = r0.mo30934a()
            java.util.List r5 = r0.mo30938f()
            java.lang.String r6 = r0.mo30939g()
            com.google.android.gms.internal.ads.eo r7 = r0.mo30940h()
            java.lang.String r8 = r0.mo30941i()
            r9 = 0
            double r10 = r0.mo30942j()
            java.lang.String r12 = r0.mo30943k()
            java.lang.String r13 = r0.mo30944l()
            com.google.android.gms.internal.ads.cx r14 = r0.mo30922d()
            com.google.android.gms.internal.ads.ak r15 = r0.mo30945m()
            android.view.View r16 = r0.mo30923e()
            com.google.android.gms.a.b r17 = r0.mo30948p()
            java.lang.String r18 = r0.mo30949q()
            android.os.Bundle r19 = r0.mo30947o()
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19)
            com.google.android.gms.a.b r3 = r0.mo30946n()
            if (r3 == 0) goto L_0x00a8
            com.google.android.gms.a.b r0 = r0.mo30946n()
            java.lang.Object r0 = com.google.android.gms.p1027a.C14886d.m30545a(r0)
            goto L_0x0051
        L_0x00a7:
            r1 = r2
        L_0x00a8:
            boolean r0 = r2 instanceof com.google.android.gms.internal.ads.C15845dv
            if (r0 == 0) goto L_0x00b1
            com.google.android.gms.internal.ads.dv r2 = (com.google.android.gms.internal.ads.C15845dv) r2
            r1.mo30919a(r2)
        L_0x00b1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C14943ad.m30743b(com.google.android.gms.internal.ads.dt):com.google.android.gms.internal.ads.dm");
    }

    /* renamed from: ac */
    private final void m30742ac() {
        C16276tu G = mo27510G();
        if (G != null) {
            G.mo31414a();
        }
    }
}
