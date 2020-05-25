package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.ads.p1029b.C14902a;
import com.google.android.gms.ads.p1029b.C14902a.C14903a;
import com.google.android.gms.common.C15373d;
import com.google.android.gms.common.C15382e;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.we */
public final class C16341we extends C15563abr {

    /* renamed from: a */
    static C16064ly f45789a = null;

    /* renamed from: b */
    static C15949hr f45790b = null;
    /* access modifiers changed from: 0000 */

    /* renamed from: c */
    public static C15959ia f45791c = null;

    /* renamed from: d */
    static C15948hq<Object> f45792d = null;

    /* renamed from: f */
    private static final long f45793f = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: h */
    private static final Object f45794h = new Object();

    /* renamed from: i */
    private static boolean f45795i = false;

    /* renamed from: e */
    final C16301us f45796e;

    /* renamed from: j */
    private final C16324vo f45797j;

    /* renamed from: k */
    private final Object f45798k = new Object();

    /* renamed from: l */
    private final Context f45799l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C16081mo f45800m;

    /* renamed from: n */
    private byh f45801n;

    public C16341we(Context context, C16324vo voVar, C16301us usVar, byh byh) {
        super(true);
        this.f45796e = usVar;
        this.f45799l = context;
        this.f45797j = voVar;
        this.f45801n = byh;
        synchronized (f45794h) {
            if (!f45795i) {
                f45791c = new C15959ia();
                f45790b = new C15949hr(context.getApplicationContext(), voVar.f45769j);
                f45792d = new C16350wn();
                C16064ly lyVar = new C16064ly(this.f45799l.getApplicationContext(), this.f45797j.f45769j, (String) caf.m37099d().mo30717a(C15740bx.f44266b), new C16349wm(), new C16348wl());
                f45789a = lyVar;
                f45795i = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo27696a() {
        abv.m32792b("SdkLessAdLoaderBackgroundTask started.");
        String f = C14963ax.m30849s().mo28566f(this.f45799l);
        zzaxe zzaxe = new zzaxe(this.f45797j, -1, C14963ax.m30849s().mo28562d(this.f45799l), C14963ax.m30849s().mo28564e(this.f45799l), f, C14963ax.m30849s().mo28568g(this.f45799l));
        zzaxi a = m38953a(zzaxe);
        if ((a.f46186d == -2 || a.f46186d == 3) && !TextUtils.isEmpty(f)) {
            C14963ax.m30849s().mo28565e(this.f45799l, f);
        }
        long b = C14963ax.m30837g().mo28524b();
        abc abc = new abc(zzaxe, a, null, null, a.f46186d, b, a.f46195m, null, this.f45801n);
        aes.f40377a.post(new C16343wg(this, abc));
    }

    /* renamed from: a */
    private final zzaxi m38953a(zzaxe zzaxe) {
        String a = acd.m32575a();
        JSONObject a2 = m38954a(zzaxe, a);
        if (a2 == null) {
            return new zzaxi(0);
        }
        long b = C14963ax.m30837g().mo28524b();
        C15959ia iaVar = f45791c;
        agl agl = new agl();
        iaVar.f45056a.put(a, agl);
        aes.f40377a.post(new C16344wh(this, a2, a));
        try {
            JSONObject jSONObject = (JSONObject) agl.get(f45793f - (C14963ax.m30837g().mo28524b() - b), TimeUnit.MILLISECONDS);
            if (jSONObject == null) {
                return new zzaxi(-1);
            }
            zzaxi a3 = C16360wx.m38976a(this.f45799l, zzaxe, jSONObject.toString());
            return (a3.f46186d == -3 || !TextUtils.isEmpty(a3.f46184b)) ? a3 : new zzaxi(3);
        } catch (InterruptedException | CancellationException unused) {
            return new zzaxi(-1);
        } catch (TimeoutException unused2) {
            return new zzaxi(2);
        } catch (ExecutionException unused3) {
            return new zzaxi(0);
        }
    }

    /* renamed from: a */
    private final JSONObject m38954a(zzaxe zzaxe, String str) {
        C16365xb xbVar;
        C14903a aVar;
        Bundle bundle = zzaxe.f46132c.f46319c.getBundle("sdk_less_server_data");
        if (bundle == null) {
            return null;
        }
        try {
            xbVar = (C16365xb) C14963ax.m30840j().mo31465a(this.f45799l).get();
        } catch (Exception e) {
            abv.m32795c("Error grabbing device info: ", e);
            xbVar = null;
        }
        Context context = this.f45799l;
        C16352wp wpVar = new C16352wp();
        wpVar.f45818i = zzaxe;
        wpVar.f45819j = xbVar;
        JSONObject a = C16360wx.m38980a(context, wpVar);
        if (a == null) {
            return null;
        }
        try {
            aVar = C14902a.m30575a(this.f45799l);
        } catch (C15373d | C15382e | IOException | IllegalStateException e2) {
            abv.m32795c("Cannot get advertising id info", e2);
            aVar = null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("request_id", str);
        hashMap.put("request_param", a);
        hashMap.put("data", bundle);
        if (aVar != null) {
            hashMap.put("adid", aVar.f38442a);
            hashMap.put("lat", Integer.valueOf(aVar.f38443b ? 1 : 0));
        }
        try {
            return C14963ax.m30831a().mo28664a((Map<String, ?>) hashMap);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: x_ */
    public final void mo27697x_() {
        synchronized (this.f45798k) {
            aes.f40377a.post(new C16347wk(this));
        }
    }
}
