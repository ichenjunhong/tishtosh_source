package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.formats.C14919c;
import com.google.android.gms.ads.formats.C14919c.C14920a;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.ads.mediation.C15051b;
import com.google.android.gms.p1027a.C14886d;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.ob */
public final class C16122ob implements C16126of {

    /* renamed from: a */
    final String f45318a;

    /* renamed from: b */
    final Object f45319b = new Object();

    /* renamed from: c */
    C16138or f45320c;

    /* renamed from: d */
    int f45321d = -2;

    /* renamed from: e */
    private final C16134on f45322e;

    /* renamed from: f */
    private final long f45323f;

    /* renamed from: g */
    private final C16118ny f45324g;

    /* renamed from: h */
    private final C16117nx f45325h;

    /* renamed from: i */
    private zzyv f45326i;

    /* renamed from: j */
    private final zzyz f45327j;

    /* renamed from: k */
    private final Context f45328k;

    /* renamed from: l */
    private final zzbgz f45329l;

    /* renamed from: m */
    private final boolean f45330m;

    /* renamed from: n */
    private final zzafl f45331n;

    /* renamed from: o */
    private final List<String> f45332o;

    /* renamed from: p */
    private final List<String> f45333p;

    /* renamed from: q */
    private final List<String> f45334q;

    /* renamed from: r */
    private final boolean f45335r;

    /* renamed from: s */
    private final boolean f45336s;

    /* renamed from: t */
    private C16144ox f45337t;

    public C16122ob(Context context, String str, C16134on onVar, C16118ny nyVar, C16117nx nxVar, zzyv zzyv, zzyz zzyz, zzbgz zzbgz, boolean z, boolean z2, zzafl zzafl, List<String> list, List<String> list2, List<String> list3, boolean z3) {
        String str2 = str;
        C16118ny nyVar2 = nyVar;
        C16117nx nxVar2 = nxVar;
        this.f45328k = context;
        this.f45322e = onVar;
        this.f45325h = nxVar2;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            this.f45318a = m38168d();
        } else {
            this.f45318a = str2;
        }
        this.f45324g = nyVar2;
        if (nxVar2.f45292v != -1) {
            this.f45323f = nxVar2.f45292v;
        } else if (nyVar2.f45295b != -1) {
            this.f45323f = nyVar2.f45295b;
        } else {
            this.f45323f = 10000;
        }
        this.f45326i = zzyv;
        this.f45327j = zzyz;
        this.f45329l = zzbgz;
        this.f45330m = z;
        this.f45335r = z2;
        this.f45331n = zzafl;
        this.f45332o = list;
        this.f45333p = list2;
        this.f45334q = list3;
        this.f45336s = z3;
    }

    /* renamed from: a */
    public final void mo31223a() {
        synchronized (this.f45319b) {
            try {
                if (this.f45320c != null) {
                    this.f45320c.mo31254c();
                }
            } catch (RemoteException e) {
                abv.m32795c("Could not destroy mediation adapter.", e);
            }
            this.f45321d = -1;
            this.f45319b.notify();
        }
    }

    /* renamed from: d */
    private final String m38168d() {
        try {
            if (!TextUtils.isEmpty(this.f45325h.f45275e)) {
                return this.f45322e.mo31235b(this.f45325h.f45275e) ? "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter" : "com.google.ads.mediation.customevent.CustomEventAdapter";
            }
        } catch (RemoteException unused) {
            abv.m32798e("Fail to determine the custom event's version, assuming the old one.");
        }
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
    }

    /* renamed from: a */
    public final void mo31224a(int i) {
        synchronized (this.f45319b) {
            this.f45321d = i;
            this.f45319b.notify();
        }
    }

    /* renamed from: a */
    public final void mo31225a(int i, C16144ox oxVar) {
        synchronized (this.f45319b) {
            this.f45321d = 0;
            this.f45337t = oxVar;
            this.f45319b.notify();
        }
    }

    /* renamed from: a */
    private static C16138or m38164a(C15051b bVar) {
        return new C16159pl(bVar);
    }

    /* renamed from: a */
    public final C16125oe mo31222a(long j, long j2) {
        C16125oe oeVar;
        synchronized (this.f45319b) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C16121oa oaVar = new C16121oa();
            acd.f40245a.post(new C16123oc(this, oaVar));
            long j3 = this.f45323f;
            while (this.f45321d == -2) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j4 = j3 - (elapsedRealtime2 - elapsedRealtime);
                long j5 = j2 - (elapsedRealtime2 - j);
                if (j4 <= 0 || j5 <= 0) {
                    abv.m32796d("Timed out waiting for adapter.");
                    this.f45321d = 3;
                } else {
                    try {
                        this.f45319b.wait(Math.min(j4, j5));
                    } catch (InterruptedException unused) {
                        this.f45321d = 5;
                    }
                }
            }
            oeVar = new C16125oe(this.f45325h, this.f45320c, this.f45318a, oaVar, this.f45321d, m38169e(), C14963ax.m30837g().mo28524b() - elapsedRealtime);
        }
        return oeVar;
    }

    /* renamed from: e */
    private final C16144ox m38169e() {
        if (this.f45321d != 0 || !mo31228c()) {
            return null;
        }
        try {
            if (!(!mo31227b(4) || this.f45337t == null || this.f45337t.mo31230a() == 0)) {
                return this.f45337t;
            }
        } catch (RemoteException unused) {
            abv.m32798e("Could not get cpm value from MediationResponseMetadata");
        }
        return new C16124od(m38170f());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C16138or mo31226b() {
        String str = "Instantiating mediation adapter: ";
        String valueOf = String.valueOf(this.f45318a);
        abv.m32796d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        if (!this.f45330m && !this.f45325h.mo31200b()) {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.f45318a)) {
                return m38164a((C15051b) new AdMobAdapter());
            }
            if ("com.google.ads.mediation.AdUrlAdapter".equals(this.f45318a)) {
                return m38164a((C15051b) new AdUrlAdapter());
            }
            if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(this.f45318a)) {
                return new C16159pl((C15051b) new zzasq());
            }
        }
        try {
            return this.f45322e.mo31234a(this.f45318a);
        } catch (RemoteException e) {
            String str2 = "Could not instantiate mediation adapter: ";
            String valueOf2 = String.valueOf(this.f45318a);
            abv.m32790a(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), e);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo31227b(int i) {
        Bundle bundle;
        try {
            if (this.f45330m) {
                bundle = this.f45320c.mo31263l();
            } else if (this.f45327j.f46341d) {
                bundle = this.f45320c.mo31262k();
            } else {
                bundle = this.f45320c.mo31261j();
            }
            if (bundle == null || (bundle.getInt("capabilities", 0) & i) != i) {
                return false;
            }
            return true;
        } catch (RemoteException unused) {
            abv.m32798e("Could not get adapter info. Returning false");
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo31228c() {
        return this.f45324g.f45306m != -1;
    }

    /* renamed from: a */
    private final String m38165a(String str) {
        if (str == null || !mo31228c() || mo31227b(2)) {
            return str;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.remove("cpm_floor_cents");
            return jSONObject.toString();
        } catch (JSONException unused) {
            abv.m32798e("Could not remove field. Returning the original value");
            return str;
        }
    }

    /* renamed from: f */
    private final int m38170f() {
        if (this.f45325h.f45281k == null) {
            return 0;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.f45325h.f45281k);
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.f45318a)) {
                return jSONObject.optInt("cpm_cents", 0);
            }
            int optInt = mo31227b(2) ? jSONObject.optInt("cpm_floor_cents", 0) : 0;
            if (optInt == 0) {
                optInt = jSONObject.optInt("penalized_average_cpm_cents", 0);
            }
            return optInt;
        } catch (JSONException unused) {
            abv.m32798e("Could not convert to json. Returning 0");
            return 0;
        }
    }

    /* renamed from: b */
    private static C14919c m38167b(String str) {
        C14920a aVar = new C14920a();
        if (str == null) {
            return aVar.mo27354a();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = 0;
            aVar.mo27355b(jSONObject.optBoolean("multiple_images", false));
            aVar.mo27353a(jSONObject.optBoolean("only_urls", false));
            String optString = jSONObject.optString("native_image_orientation", "any");
            if ("landscape".equals(optString)) {
                i = 2;
            } else if ("portrait".equals(optString)) {
                i = 1;
            } else if (!"any".equals(optString)) {
                i = -1;
            }
            aVar.mo27352a(i);
        } catch (JSONException e) {
            abv.m32795c("Exception occurred when creating native ad options", e);
        }
        return aVar.mo27354a();
    }

    /* renamed from: a */
    static /* synthetic */ void m38166a(C16122ob obVar, C16121oa oaVar) {
        String a = obVar.m38165a(obVar.f45325h.f45281k);
        try {
            if (obVar.f45329l.f46239c >= 4100000) {
                if (!obVar.f45330m) {
                    if (!obVar.f45325h.mo31200b()) {
                        if (obVar.f45327j.f46341d) {
                            obVar.f45320c.mo31244a(C14886d.m30544a(obVar.f45328k), obVar.f45326i, a, obVar.f45325h.f45271a, (C16141ou) oaVar);
                            return;
                        } else if (!obVar.f45335r) {
                            obVar.f45320c.mo31247a(C14886d.m30544a(obVar.f45328k), obVar.f45327j, obVar.f45326i, a, obVar.f45325h.f45271a, oaVar);
                            return;
                        } else if (obVar.f45325h.f45287q != null) {
                            obVar.f45320c.mo31245a(C14886d.m30544a(obVar.f45328k), obVar.f45326i, a, obVar.f45325h.f45271a, oaVar, new zzafl(m38167b(obVar.f45325h.f45291u)), obVar.f45325h.f45290t);
                            return;
                        } else {
                            obVar.f45320c.mo31247a(C14886d.m30544a(obVar.f45328k), obVar.f45327j, obVar.f45326i, a, obVar.f45325h.f45271a, oaVar);
                            return;
                        }
                    }
                }
                ArrayList arrayList = new ArrayList(obVar.f45332o);
                if (obVar.f45333p != null) {
                    for (String str : obVar.f45333p) {
                        String str2 = ":false";
                        if (obVar.f45334q != null && obVar.f45334q.contains(str)) {
                            str2 = ":true";
                        }
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(str2).length());
                        sb.append("custom:");
                        sb.append(str);
                        sb.append(str2);
                        arrayList.add(sb.toString());
                    }
                }
                obVar.f45320c.mo31245a(C14886d.m30544a(obVar.f45328k), obVar.f45326i, a, obVar.f45325h.f45271a, oaVar, obVar.f45331n, arrayList);
            } else if (obVar.f45327j.f46341d) {
                obVar.f45320c.mo31242a(C14886d.m30544a(obVar.f45328k), obVar.f45326i, a, oaVar);
            } else {
                obVar.f45320c.mo31246a(C14886d.m30544a(obVar.f45328k), obVar.f45327j, obVar.f45326i, a, (C16141ou) oaVar);
            }
        } catch (RemoteException e) {
            abv.m32795c("Could not request ad from mediation adapter.", e);
            obVar.mo31224a(5);
        }
    }
}
