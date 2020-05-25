package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C15740bx;
import com.google.android.gms.internal.ads.C16095nb;
import com.google.android.gms.internal.ads.C16099nf;
import com.google.android.gms.internal.ads.C16100ng;
import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.internal.ads.abf;
import com.google.android.gms.internal.ads.abv;
import com.google.android.gms.internal.ads.afn;
import com.google.android.gms.internal.ads.afp;
import com.google.android.gms.internal.ads.aga;
import com.google.android.gms.internal.ads.agf;
import com.google.android.gms.internal.ads.caf;
import com.google.android.gms.internal.ads.zzbgz;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.ads.internal.f */
public final class C14994f {

    /* renamed from: a */
    private Context f38706a;

    /* renamed from: b */
    private long f38707b;

    /* renamed from: a */
    public final void mo27631a(Context context, zzbgz zzbgz, String str, Runnable runnable) {
        mo27632a(context, zzbgz, true, null, str, null, runnable);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27632a(Context context, zzbgz zzbgz, boolean z, abf abf, String str, String str2, Runnable runnable) {
        if (C14963ax.m30837g().mo28524b() - this.f38707b < 5000) {
            abv.m32798e("Not retrying to fetch app settings");
            return;
        }
        this.f38707b = C14963ax.m30837g().mo28524b();
        boolean z2 = true;
        if (abf != null) {
            if (!(C14963ax.m30837g().mo28523a() - abf.f40155a > ((Long) caf.m37099d().mo30717a(C15740bx.f44292bZ)).longValue()) && abf.f40159e) {
                z2 = false;
            }
        }
        if (z2) {
            if (context == null) {
                abv.m32798e("Context not provided to fetch application settings");
            } else if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                this.f38706a = applicationContext;
                C16099nf<JSONObject> nfVar = C16100ng.f45246b;
                C16095nb a = C14963ax.m30843m().mo31190b(this.f38706a, zzbgz).mo31193a("google.afma.config.fetchAppSettings", nfVar, nfVar);
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put("app_id", str);
                    } else if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put("ad_unit_id", str2);
                    }
                    jSONObject.put("is_init", z);
                    jSONObject.put("pn", context.getPackageName());
                    aga b = a.mo31188b(jSONObject);
                    aga a2 = afp.m32822a(b, C14995g.f38708a, agf.f40431b);
                    if (runnable != null) {
                        b.mo28797a(runnable, agf.f40431b);
                    }
                    afn.m32817a(a2, "ConfigLoader.maybeFetchNewAppSettings");
                } catch (Exception e) {
                    abv.m32793b("Error requesting application settings", e);
                }
            } else {
                abv.m32798e("App settings could not be fetched. Required parameters missing");
            }
        }
    }
}
