package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.C14963ax;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.bz */
public final class C15794bz {

    /* renamed from: a */
    public String f44635a = ((String) caf.m37099d().mo30717a(C15740bx.f44201O));

    /* renamed from: b */
    public Map<String, String> f44636b = new LinkedHashMap();

    /* renamed from: c */
    public Context f44637c;

    /* renamed from: d */
    public String f44638d;

    public C15794bz(Context context, String str) {
        String str2;
        this.f44637c = context;
        this.f44638d = str;
        this.f44636b.put("s", "gmob_sdk");
        this.f44636b.put("v", "3");
        this.f44636b.put("os", VERSION.RELEASE);
        this.f44636b.put("sdk", VERSION.SDK);
        this.f44636b.put("device", acd.m32597b());
        Map<String, String> map = this.f44636b;
        String str3 = "app";
        if (context.getApplicationContext() != null) {
            str2 = context.getApplicationContext().getPackageName();
        } else {
            str2 = context.getPackageName();
        }
        map.put(str3, str2);
        this.f44636b.put("is_lite_sdk", acd.m32614j(context) ? "1" : "0");
        Future a = C14963ax.m30840j().mo31465a(this.f44637c);
        try {
            this.f44636b.put("network_coarse", Integer.toString(((C16365xb) a.get()).f45913o));
            this.f44636b.put("network_fine", Integer.toString(((C16365xb) a.get()).f45914p));
        } catch (Exception e) {
            C14963ax.m30834d().mo28588a((Throwable) e, "CsiConfiguration.CsiConfiguration");
        }
    }
}
