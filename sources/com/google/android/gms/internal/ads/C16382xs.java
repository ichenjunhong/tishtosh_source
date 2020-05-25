package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.ads.internal.C14967ba;
import com.google.android.gms.ads.internal.C14986bt;
import com.google.android.gms.common.internal.C15464q;
import java.util.Arrays;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.xs */
public final class C16382xs extends C14967ba implements C16412yv {

    /* renamed from: j */
    public static C16382xs f45979j;

    /* renamed from: k */
    boolean f45980k;

    /* renamed from: l */
    public final C16378xo f45981l;

    /* renamed from: m */
    private boolean f45982m;

    /* renamed from: n */
    private final aac f45983n;

    /* renamed from: a */
    public final boolean mo27527a(zzyv zzyv, abb abb, boolean z) {
        return false;
    }

    public C16382xs(Context context, C14986bt btVar, zzyz zzyz, C16134on onVar, zzbgz zzbgz) {
        super(context, zzyz, null, onVar, zzbgz, btVar);
        f45979j = this;
        this.f45983n = new aac(context, null);
        C16378xo xoVar = new C16378xo(this.f38501e, this.f38659o, this, this, this);
        this.f45981l = xoVar;
    }

    /* renamed from: a */
    public final void mo31504a(zzbad zzbad) {
        C15464q.m32132b("loadAd must be called on the main UI thread.");
        if (TextUtils.isEmpty(zzbad.f46225b)) {
            abv.m32798e("Invalid ad unit id. Aborting.");
            acd.f40245a.post(new C16383xt(this));
            return;
        }
        this.f45982m = false;
        this.f38501e.f38628b = zzbad.f46225b;
        this.f45983n.f40046a = zzbad.f46225b;
        super.mo27482b(zzbad.f46224a);
    }

    /* renamed from: a */
    public final void mo27455a(abc abc, C15806ck ckVar) {
        if (abc.f40133e != -2) {
            acd.f40245a.post(new C16384xu(this, abc));
            return;
        }
        this.f38501e.f38637k = abc;
        if (abc.f40131c == null) {
            this.f38501e.f38637k = m39038b(abc);
        }
        this.f45981l.mo31470a();
    }

    /* renamed from: a */
    public final boolean mo27477a(abb abb, abb abb2) {
        mo27588b(abb2, false);
        return true;
    }

    /* renamed from: l */
    public final void mo27490l() {
        C16378xo xoVar = this.f45981l;
        C15464q.m32132b("pause must be called on the main UI thread.");
        for (String str : xoVar.f45967a.keySet()) {
            try {
                C16420zc zcVar = (C16420zc) xoVar.f45967a.get(str);
                if (!(zcVar == null || zcVar.f46035a == null)) {
                    zcVar.f46035a.mo31255d();
                }
            } catch (RemoteException e) {
                abv.m32797d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: m */
    public final void mo27491m() {
        C16378xo xoVar = this.f45981l;
        C15464q.m32132b("resume must be called on the main UI thread.");
        for (String str : xoVar.f45967a.keySet()) {
            try {
                C16420zc zcVar = (C16420zc) xoVar.f45967a.get(str);
                if (!(zcVar == null || zcVar.f46035a == null)) {
                    zcVar.f46035a.mo31256e();
                }
            } catch (RemoteException e) {
                abv.m32797d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: g */
    public final void mo27485g() {
        C16378xo xoVar = this.f45981l;
        C15464q.m32132b("destroy must be called on the main UI thread.");
        for (String str : xoVar.f45967a.keySet()) {
            try {
                C16420zc zcVar = (C16420zc) xoVar.f45967a.get(str);
                if (!(zcVar == null || zcVar.f46035a == null)) {
                    zcVar.f46035a.mo31254c();
                }
            } catch (RemoteException e) {
                abv.m32797d("#007 Could not call remote method.", e);
            }
        }
        super.mo27485g();
    }

    /* renamed from: b */
    public final void mo27481b(boolean z) {
        C15464q.m32132b("setImmersiveMode must be called on the main UI thread.");
        this.f45980k = z;
    }

    /* renamed from: F */
    public final boolean mo31502F() {
        C15464q.m32132b("isLoaded must be called on the main UI thread.");
        return this.f38501e.f38633g == null && this.f38501e.f38634h == null && this.f38501e.f38636j != null;
    }

    /* renamed from: E_ */
    public final void mo27704E_() {
        if (C14963ax.m30849s().mo28557a(this.f38501e.f38629c)) {
            this.f45983n.mo28550a(true);
        }
        mo27583a(this.f38501e.f38636j, false);
        mo27498t();
    }

    /* renamed from: F_ */
    public final void mo27705F_() {
        this.f45981l.mo31473b();
        mo27502x();
    }

    /* renamed from: f */
    public final void mo27710f() {
        this.f45981l.mo31474c();
        mo27503y();
    }

    /* renamed from: G_ */
    public final void mo27706G_() {
        if (C14963ax.m30849s().mo28557a(this.f38501e.f38629c)) {
            this.f45983n.mo28550a(false);
        }
        mo27496r();
    }

    /* renamed from: r */
    public final void mo27496r() {
        this.f38501e.f38636j = null;
        super.mo27496r();
    }

    /* renamed from: a_ */
    public final void mo27709a_(zzbaz zzbaz) {
        zzbaz a = this.f45981l.mo31469a(zzbaz);
        if (C14963ax.m30849s().mo28557a(this.f38501e.f38629c) && a != null) {
            aad s = C14963ax.m30849s();
            Context context = this.f38501e.f38629c;
            String f = C14963ax.m30849s().mo28566f(this.f38501e.f38629c);
            String str = this.f38501e.f38628b;
            String str2 = a.f46226a;
            int i = a.f46227b;
            if (s.mo28557a(context)) {
                Bundle bundle = new Bundle();
                bundle.putString("_ai", str);
                bundle.putString("type", str2);
                bundle.putInt("value", i);
                s.mo28554a(context, "_ar", f, bundle);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 75);
                sb.append("Log a Firebase reward video event, reward type: ");
                sb.append(str2);
                sb.append(", reward value: ");
                sb.append(i);
                abv.m32494a(sb.toString());
            }
        }
        mo27469a(a);
    }

    /* renamed from: H_ */
    public final void mo27707H_() {
        mo27201e();
    }

    /* renamed from: I_ */
    public final void mo27708I_() {
        mo27497s();
    }

    /* renamed from: a */
    public final void mo31503a(Context context) {
        this.f45981l.mo31471a(context);
    }

    /* renamed from: b */
    private static abc m39038b(abc abc) {
        abc abc2 = abc;
        abv.m32494a("Creating mediation ad response for non-mediated rewarded ad.");
        try {
            JSONObject a = C16360wx.m38981a(abc2.f40130b);
            a.remove("impression_urls");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pubid", abc2.f40129a.f46134e);
            String jSONObject2 = jSONObject.toString();
            C16117nx nxVar = new C16117nx(a.toString(), null, Arrays.asList(new String[]{"com.google.ads.mediation.admob.AdMobAdapter"}), null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject2, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), "", "", null, null, null, null, null, Collections.emptyList(), null, -1);
            C16118ny nyVar = new C16118ny(Arrays.asList(new C16117nx[]{nxVar}), ((Long) caf.m37099d().mo30717a(C15740bx.f44308bp)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), false, "", -1, 0, 1, null, 0, -1, -1, false);
            abc abc3 = new abc(abc2.f40129a, abc2.f40130b, nyVar, abc2.f40132d, abc2.f40133e, abc2.f40134f, abc2.f40135g, abc2.f40136h, abc2.f40137i, null);
            return abc3;
        } catch (JSONException e) {
            abv.m32793b("Unable to generate ad state for non-mediated rewarded video.", e);
            abc abc4 = new abc(abc2.f40129a, abc2.f40130b, null, abc2.f40132d, 0, abc2.f40134f, abc2.f40135g, abc2.f40136h, abc2.f40137i, null);
            return abc4;
        }
    }
}
