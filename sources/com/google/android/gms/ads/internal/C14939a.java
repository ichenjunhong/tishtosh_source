package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.C14912d;
import com.google.android.gms.ads.C14913e;
import com.google.android.gms.ads.internal.overlay.C15023t;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.util.C15518i;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.C15583ak;
import com.google.android.gms.internal.ads.C15740bx;
import com.google.android.gms.internal.ads.C15804ci;
import com.google.android.gms.internal.ads.C15806ck;
import com.google.android.gms.internal.ads.C15813cr;
import com.google.android.gms.internal.ads.C15927gw;
import com.google.android.gms.internal.ads.C15929gy;
import com.google.android.gms.internal.ads.C15958i;
import com.google.android.gms.internal.ads.C16066m;
import com.google.android.gms.internal.ads.C16147p;
import com.google.android.gms.internal.ads.C16230sb;
import com.google.android.gms.internal.ads.C16234sf;
import com.google.android.gms.internal.ads.C16244sp;
import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.internal.ads.C16301us;
import com.google.android.gms.internal.ads.C16309v;
import com.google.android.gms.internal.ads.C16379xp;
import com.google.android.gms.internal.ads.C16385xv;
import com.google.android.gms.internal.ads.C16388xy;
import com.google.android.gms.internal.ads.C16396yf;
import com.google.android.gms.internal.ads.aav;
import com.google.android.gms.internal.ads.abb;
import com.google.android.gms.internal.ads.abc;
import com.google.android.gms.internal.ads.abd;
import com.google.android.gms.internal.ads.abe;
import com.google.android.gms.internal.ads.abn;
import com.google.android.gms.internal.ads.abp;
import com.google.android.gms.internal.ads.abq;
import com.google.android.gms.internal.ads.abt;
import com.google.android.gms.internal.ads.abv;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.aes;
import com.google.android.gms.internal.ads.afc;
import com.google.android.gms.internal.ads.anp;
import com.google.android.gms.internal.ads.buu;
import com.google.android.gms.internal.ads.buv;
import com.google.android.gms.internal.ads.bwk;
import com.google.android.gms.internal.ads.bwl;
import com.google.android.gms.internal.ads.bxh;
import com.google.android.gms.internal.ads.byc;
import com.google.android.gms.internal.ads.byd;
import com.google.android.gms.internal.ads.bye.C15742a.C15744b;
import com.google.android.gms.internal.ads.bzl;
import com.google.android.gms.internal.ads.bzs;
import com.google.android.gms.internal.ads.caf;
import com.google.android.gms.internal.ads.cai;
import com.google.android.gms.internal.ads.cal;
import com.google.android.gms.internal.ads.zzabp;
import com.google.android.gms.internal.ads.zzaco;
import com.google.android.gms.internal.ads.zzacq;
import com.google.android.gms.internal.ads.zzbaz;
import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzyv;
import com.google.android.gms.internal.ads.zzyz;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.ads.internal.a */
public abstract class C14939a extends C15958i implements C15023t, abn, bzl, C15927gw, C15929gy, C16244sp, C16301us {

    /* renamed from: a */
    protected C15806ck f38497a;

    /* renamed from: b */
    protected C15804ci f38498b;

    /* renamed from: c */
    protected boolean f38499c;

    /* renamed from: d */
    protected final C14953an f38500d;

    /* renamed from: e */
    public final C14964ay f38501e;

    /* renamed from: f */
    protected transient zzyv f38502f;

    /* renamed from: g */
    protected final buu f38503g;

    /* renamed from: h */
    protected C14882b f38504h;

    /* renamed from: i */
    public final C14986bt f38505i;

    /* renamed from: j */
    private C15804ci f38506j;

    /* renamed from: k */
    private final Bundle f38507k = new Bundle();

    /* renamed from: l */
    private boolean f38508l = false;

    /* renamed from: a */
    protected static boolean m30670a(zzyv zzyv) {
        Bundle bundle = zzyv.f46329m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        return bundle == null || !bundle.containsKey("gw");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo27455a(abc abc, C15806ck ckVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo27476a(abb abb) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo27477a(abb abb, abb abb2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo27478a(zzyv zzyv, C15806ck ckVar);

    /* renamed from: q */
    public C15583ak mo27495q() {
        return null;
    }

    C14939a(C14964ay ayVar, C14953an anVar, C14986bt btVar) {
        this.f38501e = ayVar;
        this.f38500d = new C14953an(this);
        this.f38505i = btVar;
        acd a = C14963ax.m30831a();
        Context context = this.f38501e.f38629c;
        Application application = null;
        if (!a.f40247c) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            context.getApplicationContext().registerReceiver(new zzbee(a, null), intentFilter);
            a.f40247c = true;
        }
        C14963ax.m30831a().mo28672b(this.f38501e.f38629c);
        abt.m32491a(this.f38501e.f38629c);
        C14963ax.m30841k().mo31157a(this.f38501e.f38629c);
        C14963ax.m30834d().mo28586a(this.f38501e.f38629c, this.f38501e.f38631e);
        C14963ax.m30836f().mo30847a(this.f38501e.f38629c);
        this.f38503g = C14963ax.m30834d().f40164b;
        bwk c = C14963ax.m30833c();
        Context context2 = this.f38501e.f38629c;
        synchronized (c.f44135a) {
            if (!c.f44137c) {
                Context applicationContext = context2.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context2;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                }
                if (application == null) {
                    abv.m32798e("Can not cast Context to Application");
                } else {
                    if (c.f44136b == null) {
                        c.f44136b = new bwl();
                    }
                    bwl bwl = c.f44136b;
                    if (!bwl.f44144g) {
                        application.registerActivityLifecycleCallbacks(bwl);
                        if (context2 instanceof Activity) {
                            bwl.mo30818a((Activity) context2);
                        }
                        bwl.f44139b = application;
                        bwl.f44145h = ((Long) caf.m37099d().mo30717a(C15740bx.f44216aC)).longValue();
                        bwl.f44144g = true;
                    }
                    c.f44137c = true;
                }
            }
        }
        C14963ax.m30847q().mo28752a(this.f38501e.f38629c);
    }

    /* renamed from: a */
    public final void mo27458a(C15804ci ciVar) {
        this.f38497a = new C15806ck(((Boolean) caf.m37099d().mo30717a(C15740bx.f44200N)).booleanValue(), "load_ad", this.f38501e.f38635i.f46338a);
        this.f38506j = new C15804ci(-1, null, null);
        if (ciVar == null) {
            this.f38498b = new C15804ci(-1, null, null);
        } else {
            this.f38498b = new C15804ci(ciVar.f44776a, ciVar.f44777b, ciVar.f44778c);
        }
    }

    /* renamed from: g */
    public void mo27485g() {
        C15464q.m32132b("#008 Must be called on the main UI thread.: destroy");
        this.f38500d.mo27540a();
        buu buu = this.f38503g;
        abb abb = this.f38501e.f38636j;
        synchronized (buu.f43991a) {
            buv buv = (buv) buu.f43992b.get(abb);
            if (buv != null) {
                buv.mo30760d();
            }
        }
        C14964ay ayVar = this.f38501e;
        if (ayVar.f38632f != null) {
            C14965az azVar = ayVar.f38632f;
            abv.m32494a("Disable position monitoring on adFrame.");
            if (azVar.f38654b != null) {
                azVar.f38654b.mo28758b();
            }
        }
        ayVar.f38640n = null;
        ayVar.f38642p = null;
        ayVar.f38641o = null;
        ayVar.f38610D = null;
        ayVar.f38643q = null;
        ayVar.mo27566a(false);
        if (ayVar.f38632f != null) {
            ayVar.f38632f.removeAllViews();
        }
        ayVar.mo27564a();
        ayVar.mo27567b();
        ayVar.f38636j = null;
        this.f38504h = null;
    }

    /* renamed from: h */
    public final C14882b mo27486h() {
        C15464q.m32132b("#008 Must be called on the main UI thread.: getAdFrame");
        return C14886d.m30544a(this.f38501e.f38632f);
    }

    /* renamed from: i */
    public final zzyz mo27487i() {
        C15464q.m32132b("#008 Must be called on the main UI thread.: getAdSize");
        if (this.f38501e.f38635i == null) {
            return null;
        }
        return new zzaco(this.f38501e.f38635i);
    }

    /* renamed from: j */
    public final boolean mo27488j() {
        C15464q.m32132b("#008 Must be called on the main UI thread.: isLoaded");
        return this.f38501e.f38633g == null && this.f38501e.f38634h == null && this.f38501e.f38636j != null;
    }

    /* renamed from: a */
    public void mo27475a(boolean z) {
        abv.m32798e("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
    }

    /* renamed from: b */
    public boolean mo27482b(zzyv zzyv) {
        C15464q.m32132b("#008 Must be called on the main UI thread.: loadAd");
        bxh f = C14963ax.m30836f();
        if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44356ck)).booleanValue()) {
            synchronized (f.f44512b) {
                f.mo30846a();
                acd.f40245a.removeCallbacks(f.f44511a);
                acd.f40245a.postDelayed(f.f44511a, ((Long) caf.m37099d().mo30717a(C15740bx.f44357cl)).longValue());
            }
        }
        this.f38507k.clear();
        this.f38508l = false;
        zzyv a = zzyv.mo31643a();
        a.f46319c.putInt("dv", DynamiteModule.m32339b(this.f38501e.f38629c, ModuleDescriptor.MODULE_ID));
        a.f46319c.putBoolean(AdMobAdapter.NEW_BUNDLE, true);
        if (this.f38501e.f38650x != null) {
            if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44282bP)).booleanValue() && this.f38501e.f38650x.f46065a > 3) {
                a.f46319c.putBoolean("enable_native_media_orientation", true);
                String a2 = this.f38501e.f38650x.mo31570a();
                if (!"unknown".equals(a2)) {
                    a.f46319c.putString("native_media_orientation", a2);
                }
            }
        }
        if (C15518i.m32286c(this.f38501e.f38629c) && a.f46327k != null) {
            bzs bzs = new bzs(a);
            bzs.f44708j = null;
            a = new zzyv(8, bzs.f44699a, bzs.f44700b, bzs.f44701c, bzs.f44702d, bzs.f44703e, bzs.f44704f, bzs.f44705g, bzs.f44706h, bzs.f44707i, bzs.f44708j, bzs.f44709k, bzs.f44710l, bzs.f44711m, bzs.f44712n, bzs.f44713o, bzs.f44714p, bzs.f44715q, bzs.f44716r, bzs.f44717s, bzs.f44718t);
        }
        if (this.f38501e.f38633g == null && this.f38501e.f38634h == null) {
            abv.m32796d("Starting ad request.");
            String str = "SDK version: ";
            String valueOf = String.valueOf(this.f38501e.f38631e.f46237a);
            abv.m32796d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            mo27458a((C15804ci) null);
            this.f38498b = this.f38497a.mo30897a();
            if (a.f46322f) {
                abv.m32796d("This request is sent from a test device.");
            } else {
                String a3 = aes.m32750a(this.f38501e.f38629c);
                StringBuilder sb = new StringBuilder(String.valueOf(a3).length() + 71);
                sb.append("Use AdRequest.Builder.addTestDevice(\"");
                sb.append(a3);
                sb.append("\") to get test ads on this device.");
                abv.m32796d(sb.toString());
            }
            this.f38500d.f38548a = a;
            this.f38499c = mo27478a(a, this.f38497a);
            return this.f38499c;
        }
        if (this.f38502f != null) {
            abv.m32798e("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
        } else {
            abv.m32798e("Loading already in progress, saving this object for future refreshes.");
        }
        this.f38502f = a;
        return false;
    }

    /* renamed from: a */
    public final void mo27454a(abc abc) {
        if (abc.f40130b.f46195m != -1 && !TextUtils.isEmpty(abc.f40130b.f46205w)) {
            long c = mo27530c(abc.f40130b.f46205w);
            if (c != -1) {
                C15804ci a = this.f38497a.mo30898a(abc.f40130b.f46195m + c);
                this.f38497a.mo30902a(a, "stc");
            }
        }
        C15806ck ckVar = this.f38497a;
        String str = abc.f40130b.f46205w;
        if (ckVar.f44781a) {
            synchronized (ckVar.f44782b) {
                ckVar.f44783c = str;
            }
        }
        this.f38497a.mo30902a(this.f38498b, "arf");
        this.f38506j = this.f38497a.mo30897a();
        this.f38497a.mo30900a("gqi", abc.f40130b.f46206x);
        this.f38501e.f38633g = null;
        this.f38501e.f38637k = abc;
        abc.f40137i.mo30860a((byd) new C14940aa(this, abc));
        abc.f40137i.mo30861a(C15744b.AD_LOADED);
        mo27455a(abc, this.f38497a);
    }

    /* renamed from: b */
    public void mo27479b(abb abb) {
        this.f38497a.mo30902a(this.f38506j, "awr");
        this.f38501e.f38634h = null;
        if (!(abb.f40106d == -2 || abb.f40106d == 3 || this.f38501e.f38620N == null)) {
            abq abq = C14963ax.m30834d().f40165c;
            HashSet<abd> hashSet = this.f38501e.f38620N;
            synchronized (abq.f40202a) {
                abq.f40204c.addAll(hashSet);
            }
        }
        if (abb.f40106d == -1) {
            this.f38499c = false;
            return;
        }
        if (mo27476a(abb)) {
            abv.m32792b("Ad refresh scheduled.");
        }
        if (abb.f40106d != -2) {
            mo27451a(abb.f40106d, abb.f40092K);
            return;
        }
        if (this.f38501e.f38616J == null) {
            this.f38501e.f38616J = new abp(this.f38501e.f38628b);
        }
        if (this.f38501e.f38632f != null) {
            this.f38501e.f38632f.f38653a.f40274e = abb.f40083B;
        }
        this.f38503g.mo30740a(this.f38501e.f38636j);
        if (mo27477a(this.f38501e.f38636j, abb)) {
            this.f38501e.f38636j = abb;
            C14964ay ayVar = this.f38501e;
            if (ayVar.f38638l != null) {
                if (ayVar.f38636j != null) {
                    abd abd = ayVar.f38638l;
                    long j = ayVar.f38636j.f40127y;
                    synchronized (abd.f40142d) {
                        abd.f40150l = j;
                        if (abd.f40150l != -1) {
                            abd.f40140b.mo28612a(abd);
                        }
                    }
                    abd abd2 = ayVar.f38638l;
                    long j2 = ayVar.f38636j.f40128z;
                    synchronized (abd2.f40142d) {
                        if (abd2.f40150l != -1) {
                            abd2.f40144f = j2;
                            abd2.f40140b.mo28612a(abd2);
                        }
                    }
                    abd abd3 = ayVar.f38638l;
                    boolean z = ayVar.f38636j.f40116n;
                    synchronized (abd3.f40142d) {
                        if (abd3.f40150l != -1) {
                            abd3.f40146h = z;
                            abd3.f40140b.mo28612a(abd3);
                        }
                    }
                }
                abd abd4 = ayVar.f38638l;
                boolean z2 = ayVar.f38635i.f46341d;
                synchronized (abd4.f40142d) {
                    if (abd4.f40150l != -1) {
                        abd4.f40147i = abd4.f40139a.mo28524b();
                        if (!z2) {
                            abd4.f40145g = abd4.f40147i;
                            abd4.f40140b.mo28612a(abd4);
                        }
                    }
                }
            }
            this.f38497a.mo30900a("is_mraid", this.f38501e.f38636j.mo28583a() ? "1" : "0");
            this.f38497a.mo30900a("is_mediation", this.f38501e.f38636j.f40116n ? "1" : "0");
            if (!(this.f38501e.f38636j.f40104b == null || this.f38501e.f38636j.f40104b.mo29197w() == null)) {
                this.f38497a.mo30900a("is_delay_pl", this.f38501e.f38636j.f40104b.mo29197w().mo29220f() ? "1" : "0");
            }
            this.f38497a.mo30902a(this.f38498b, "ttc");
            if (C14963ax.m30834d().mo28585a() != null) {
                C14963ax.m30834d().mo28585a().mo30890a(this.f38497a);
            }
            mo27504z();
            if (this.f38501e.mo27568c()) {
                mo27499u();
            }
        }
        if (abb.f40091J != null) {
            C14963ax.m30831a().mo28668a(this.f38501e.f38629c, abb.f40091J);
        }
    }

    /* renamed from: e */
    public void mo27201e() {
        if (this.f38501e.f38636j == null) {
            abv.m32798e("Ad state was null when trying to ping click URLs.");
            return;
        }
        abv.m32792b("Pinging click URLs.");
        if (this.f38501e.f38638l != null) {
            abd abd = this.f38501e.f38638l;
            synchronized (abd.f40142d) {
                if (abd.f40150l != -1) {
                    abe abe = new abe(abd);
                    abe.f40152a = abe.f40154c.f40139a.mo28524b();
                    abd.f40141c.add(abe);
                    abd.f40148j++;
                    abd.f40140b.mo28611a();
                    abd.f40140b.mo28612a(abd);
                }
            }
        }
        if (this.f38501e.f38636j.f40105c != null) {
            acd.m32584a(this.f38501e.f38629c, this.f38501e.f38631e.f46237a, mo27450a(this.f38501e.f38636j.f40105c, this.f38501e.f38636j.f40097P));
        }
        if (this.f38501e.f38639m != null) {
            try {
                this.f38501e.f38639m.mo30866a();
            } catch (RemoteException e) {
                abv.m32797d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: J_ */
    public final void mo27448J_() {
        mo27497s();
    }

    /* renamed from: a */
    public final void mo27472a(String str, Bundle bundle) {
        this.f38507k.putAll(bundle);
        if (this.f38508l && this.f38501e.f38642p != null) {
            try {
                this.f38501e.f38642p.mo30878a();
            } catch (RemoteException e) {
                abv.m32797d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: a */
    public final void mo27473a(String str, String str2) {
        if (this.f38501e.f38641o != null) {
            try {
                this.f38501e.f38641o.mo30883a(str, str2);
            } catch (RemoteException e) {
                abv.m32797d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: k */
    public final void mo27489k() {
        C15464q.m32132b("#008 Must be called on the main UI thread.: recordManualImpression");
        if (this.f38501e.f38636j == null) {
            abv.m32798e("Ad state was null when trying to ping manual tracking URLs.");
            return;
        }
        abv.m32792b("Pinging manual tracking URLs.");
        if (!this.f38501e.f38636j.f40089H) {
            ArrayList arrayList = new ArrayList();
            if (this.f38501e.f38636j.f40109g != null) {
                arrayList.addAll(this.f38501e.f38636j.f40109g);
            }
            if (!(this.f38501e.f38636j.f40117o == null || this.f38501e.f38636j.f40117o.f45279i == null)) {
                arrayList.addAll(this.f38501e.f38636j.f40117o.f45279i);
            }
            if (!arrayList.isEmpty()) {
                acd.m32584a(this.f38501e.f38629c, this.f38501e.f38631e.f46237a, (List<String>) arrayList);
                this.f38501e.f38636j.f40089H = true;
            }
        }
    }

    /* renamed from: l */
    public void mo27490l() {
        C15464q.m32132b("#008 Must be called on the main UI thread.: pause");
    }

    /* renamed from: m */
    public void mo27491m() {
        C15464q.m32132b("#008 Must be called on the main UI thread.: resume");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo27484c(zzyv zzyv) {
        if (this.f38501e.f38632f == null) {
            return false;
        }
        ViewParent parent = this.f38501e.f38632f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        return C14963ax.m30831a().mo28669a(view, view.getContext());
    }

    /* renamed from: a */
    public final void mo27457a(cal cal) {
        C15464q.m32132b("#008 Must be called on the main UI thread.: setAdListener");
        this.f38501e.f38640n = cal;
    }

    /* renamed from: a */
    public final void mo27466a(C16396yf yfVar) {
        C15464q.m32132b("#008 Must be called on the main UI thread.: setRewardedVideoAdListener");
        this.f38501e.f38611E = yfVar;
    }

    /* renamed from: a */
    public final void mo27465a(C16388xy xyVar) {
        C15464q.m32132b("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f38501e.f38612F = xyVar;
    }

    /* renamed from: a */
    public final void mo27471a(String str) {
        C15464q.m32132b("#008 Must be called on the main UI thread.: setUserId");
        this.f38501e.f38613G = str;
    }

    /* renamed from: b */
    public final void mo27480b(String str) {
        C15464q.m32132b("#008 Must be called on the main UI thread.: setCustomData");
        this.f38501e.f38614H = str;
    }

    /* renamed from: a */
    public final void mo27456a(cai cai) {
        C15464q.m32132b("#008 Must be called on the main UI thread.: setAdClickListener");
        this.f38501e.f38639m = cai;
    }

    /* renamed from: a */
    public final void mo27470a(zzyz zzyz) {
        C15464q.m32132b("#008 Must be called on the main UI thread.: setAdSize");
        this.f38501e.f38635i = zzyz;
        if (!(this.f38501e.f38636j == null || this.f38501e.f38636j.f40104b == null || this.f38501e.f38618L != 0)) {
            this.f38501e.f38636j.f40104b.mo29153a(anp.m33673a(zzyz));
        }
        if (this.f38501e.f38632f != null) {
            if (this.f38501e.f38632f.getChildCount() > 1) {
                this.f38501e.f38632f.removeView(this.f38501e.f38632f.getNextView());
            }
            this.f38501e.f38632f.setMinimumWidth(zzyz.f46343f);
            this.f38501e.f38632f.setMinimumHeight(zzyz.f46340c);
            this.f38501e.f38632f.requestLayout();
            if (this.f38501e.f38636j != null && this.f38501e.f38636j.f40116n && (this.f38501e.f38632f.getCurrentView() instanceof C14913e)) {
                ((C14913e) this.f38501e.f38632f.getCurrentView()).mo27332a(new C14912d[]{new C14912d(zzyz.f46342e, zzyz.f46339b)});
            }
        }
    }

    /* renamed from: a */
    public final void mo27461a(C16147p pVar) {
        C15464q.m32132b("#008 Must be called on the main UI thread.: setAppEventListener");
        this.f38501e.f38641o = pVar;
    }

    /* renamed from: a */
    public final void mo27460a(C16066m mVar) {
        this.f38501e.f38642p = mVar;
    }

    /* renamed from: n */
    public final Bundle mo27492n() {
        if (this.f38508l) {
            return this.f38507k;
        }
        return new Bundle();
    }

    /* renamed from: a */
    public void mo27462a(C16230sb sbVar) {
        abv.m32798e("#006 Unexpected call to a deprecated method.");
    }

    /* renamed from: a */
    public void mo27459a(C15813cr crVar) {
        throw new IllegalStateException("#005 Unexpected call to an abstract (unimplemented) method.");
    }

    /* renamed from: a */
    public final void mo27463a(C16234sf sfVar, String str) {
        abv.m32798e("#006 Unexpected call to a deprecated method.");
    }

    /* renamed from: a */
    public final void mo27464a(C16309v vVar) {
        C15464q.m32132b("#008 Must be called on the main UI thread.: setCorrelationIdProvider");
        this.f38501e.f38643q = vVar;
    }

    /* renamed from: o */
    public final void mo27493o() {
        C15464q.m32132b("#008 Must be called on the main UI thread.: stopLoading");
        this.f38499c = false;
        this.f38501e.mo27566a(true);
    }

    /* renamed from: p */
    public final boolean mo27494p() {
        return this.f38499c;
    }

    /* renamed from: a */
    public final void mo27468a(zzacq zzacq) {
        C15464q.m32132b("#008 Must be called on the main UI thread.: setVideoOptions");
        this.f38501e.f38651y = zzacq;
    }

    /* renamed from: a */
    public final void mo27467a(zzabp zzabp) {
        C15464q.m32132b("#008 Must be called on the main UI thread.: setIconAdOptions");
        this.f38501e.f38607A = zzabp;
    }

    /* renamed from: b */
    public void mo27481b(boolean z) {
        throw new IllegalStateException("#005 Unexpected call to an abstract (unimplemented) method.");
    }

    /* renamed from: c */
    private static long mo27530c(String str) {
        int indexOf = str.indexOf("ufe");
        int indexOf2 = str.indexOf(44, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        try {
            return Long.parseLong(str.substring(indexOf + 4, indexOf2));
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            afc.m32793b("", e);
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27453a(View view) {
        C14965az azVar = this.f38501e.f38632f;
        if (azVar != null) {
            azVar.addView(view, C14963ax.m30832b().mo28694b());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo27496r() {
        abv.m32494a("Ad closing.");
        if (this.f38501e.f38640n != null) {
            try {
                this.f38501e.f38640n.mo30869a();
            } catch (RemoteException e) {
                abv.m32797d("#007 Could not call remote method.", e);
            }
        }
        if (this.f38501e.f38611E != null) {
            try {
                this.f38501e.f38611E.mo31124d();
            } catch (RemoteException e2) {
                abv.m32797d("#007 Could not call remote method.", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo27497s() {
        abv.m32494a("Ad leaving application.");
        if (this.f38501e.f38640n != null) {
            try {
                this.f38501e.f38640n.mo30871b();
            } catch (RemoteException e) {
                abv.m32797d("#007 Could not call remote method.", e);
            }
        }
        if (this.f38501e.f38611E != null) {
            try {
                this.f38501e.f38611E.mo31125e();
            } catch (RemoteException e2) {
                abv.m32797d("#007 Could not call remote method.", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo27498t() {
        abv.m32494a("Ad opening.");
        if (this.f38501e.f38640n != null) {
            try {
                this.f38501e.f38640n.mo30873d();
            } catch (RemoteException e) {
                abv.m32797d("#007 Could not call remote method.", e);
            }
        }
        if (this.f38501e.f38611E != null) {
            try {
                this.f38501e.f38611E.mo31122b();
            } catch (RemoteException e2) {
                abv.m32797d("#007 Could not call remote method.", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo27499u() {
        mo27483c(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo27483c(boolean z) {
        abv.m32494a("Ad finished loading.");
        this.f38499c = z;
        this.f38508l = true;
        if (this.f38501e.f38640n != null) {
            try {
                this.f38501e.f38640n.mo30872c();
            } catch (RemoteException e) {
                abv.m32797d("#007 Could not call remote method.", e);
            }
        }
        if (this.f38501e.f38611E != null) {
            try {
                this.f38501e.f38611E.mo31119a();
            } catch (RemoteException e2) {
                abv.m32797d("#007 Could not call remote method.", e2);
            }
        }
        if (this.f38501e.f38642p != null) {
            try {
                this.f38501e.f38642p.mo30878a();
            } catch (RemoteException e3) {
                abv.m32797d("#007 Could not call remote method.", e3);
            }
        }
    }

    /* renamed from: a */
    public void mo27451a(int i, byc byc) {
        mo27452a(i, false, byc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo27452a(int i, boolean z, byc byc) {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Failed to load ad: ");
        sb.append(i);
        abv.m32798e(sb.toString());
        this.f38499c = z;
        if (byc != null) {
            switch (i) {
                case 1:
                    byc.mo30861a(C15744b.AD_FAILED_TO_LOAD_INVALID_REQUEST);
                    break;
                case 2:
                    byc.mo30861a(C15744b.AD_FAILED_TO_LOAD_NETWORK_ERROR);
                    break;
                case 3:
                    byc.mo30861a(C15744b.AD_FAILED_TO_LOAD_NO_FILL);
                    break;
                case 4:
                    byc.mo30861a(C15744b.AD_FAILED_TO_LOAD_TIMEOUT);
                    break;
                case 5:
                    byc.mo30861a(C15744b.AD_FAILED_TO_LOAD_CANCELLED);
                    break;
                case 6:
                    byc.mo30861a(C15744b.AD_FAILED_TO_LOAD_NO_ERROR);
                    break;
                case 7:
                    byc.mo30861a(C15744b.AD_FAILED_TO_LOAD_NOT_FOUND);
                    break;
                default:
                    byc.mo30861a(C15744b.AD_FAILED_TO_LOAD);
                    break;
            }
        }
        if (this.f38501e.f38640n != null) {
            try {
                this.f38501e.f38640n.mo30870a(i);
            } catch (RemoteException e) {
                abv.m32797d("#007 Could not call remote method.", e);
            }
        }
        if (this.f38501e.f38611E != null) {
            try {
                this.f38501e.f38611E.mo31120a(i);
            } catch (RemoteException e2) {
                abv.m32797d("#007 Could not call remote method.", e2);
            }
        }
        if (this.f38501e.f38647u != null) {
            try {
                this.f38501e.f38647u.mo31111a(i);
            } catch (RemoteException e3) {
                abv.m32797d("#007 Could not call remote method.", e3);
            }
        }
    }

    /* renamed from: v */
    public final void mo27500v() {
        abv.m32796d("Ad impression.");
        if (this.f38501e.f38640n != null) {
            try {
                this.f38501e.f38640n.mo30874e();
            } catch (RemoteException e) {
                abv.m32797d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: w */
    public final void mo27501w() {
        abv.m32796d("Ad clicked.");
        if (this.f38501e.f38640n != null) {
            try {
                this.f38501e.f38640n.mo30875f();
            } catch (RemoteException e) {
                abv.m32797d("#007 Could not call remote method.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo27502x() {
        if (this.f38501e.f38611E != null) {
            try {
                this.f38501e.f38611E.mo31123c();
            } catch (RemoteException e) {
                abv.m32797d("#007 Could not call remote method.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27469a(zzbaz zzbaz) {
        if (this.f38501e.f38611E != null) {
            String str = "";
            int i = 1;
            if (zzbaz != null) {
                try {
                    str = zzbaz.f46226a;
                    i = zzbaz.f46227b;
                } catch (RemoteException e) {
                    abv.m32797d("#007 Could not call remote method.", e);
                    return;
                }
            }
            C16379xp xpVar = new C16379xp(str, i);
            this.f38501e.f38611E.mo31121a((C16385xv) xpVar);
            if (this.f38501e.f38612F != null) {
                this.f38501e.f38612F.mo31507a(xpVar, this.f38501e.f38636j.f40117o.f45285o, this.f38501e.f38636j.f40117o.f45286p);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo27503y() {
        if (this.f38501e.f38611E != null) {
            try {
                this.f38501e.f38611E.mo31126f();
            } catch (RemoteException e) {
                abv.m32797d("#007 Could not call remote method.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List<String> mo27449a(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            Context context = this.f38501e.f38629c;
            if (C14963ax.m30849s().mo28557a(context) && !TextUtils.isEmpty(str)) {
                String f = C14963ax.m30849s().mo28566f(context);
                if (f != null && C14963ax.m30831a().mo28674c(str)) {
                    if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44248ai)).booleanValue()) {
                        String str2 = (String) caf.m37099d().mo30717a(C15740bx.f44249aj);
                        if (str.contains(str2)) {
                            str = str.replace(str2, f);
                        }
                    } else if (!str.contains("fbs_aeid")) {
                        str = aav.m32438a(str, "fbs_aeid", f).toString();
                    }
                }
            }
            arrayList.add(str);
        }
        return arrayList;
    }

    /* renamed from: z */
    public final void mo27504z() {
        abb abb = this.f38501e.f38636j;
        if (abb != null && !TextUtils.isEmpty(abb.f40083B) && !abb.f40090I && C14963ax.m30839i().mo28721b()) {
            abv.m32792b("Sending troubleshooting signals to the server.");
            C14963ax.m30839i().mo28718a(this.f38501e.f38629c, this.f38501e.f38631e.f46237a, abb.f40083B, this.f38501e.f38628b);
            abb.f40090I = true;
        }
    }

    /* renamed from: a */
    public final void mo27474a(HashSet<abd> hashSet) {
        this.f38501e.f38620N = hashSet;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List<String> mo27450a(List<String> list, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String a : list) {
            arrayList.add(aav.m32439a(a, this.f38501e.f38629c, z));
        }
        return arrayList;
    }

    /* renamed from: A */
    public String mo27444A() {
        return this.f38501e.f38628b;
    }

    /* renamed from: B */
    public final C16147p mo27445B() {
        return this.f38501e.f38641o;
    }

    /* renamed from: C */
    public final cal mo27446C() {
        return this.f38501e.f38640n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final String mo27447D() {
        abc abc = this.f38501e.f38637k;
        if (abc == null) {
            return "javascript";
        }
        if (abc.f40130b == null) {
            return "javascript";
        }
        String str = abc.f40130b.f46175T;
        if (TextUtils.isEmpty(str)) {
            return "javascript";
        }
        try {
            if (new JSONObject(str).optInt("media_type", -1) == 0) {
                return null;
            }
            return "javascript";
        } catch (JSONException e) {
            afc.m32795c("", e);
            return "javascript";
        }
    }
}
