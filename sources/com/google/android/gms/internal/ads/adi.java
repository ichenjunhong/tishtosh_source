package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C14963ax;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
public final class adi {

    /* renamed from: a */
    String f40305a = "";

    /* renamed from: b */
    private final Object f40306b = new Object();

    /* renamed from: c */
    private String f40307c = "";

    /* renamed from: d */
    private String f40308d = "";

    /* renamed from: e */
    private boolean f40309e = false;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo28720a(Context context, String str, String str2) {
        String d = m32689d(context, m32688b(context, (String) caf.m37099d().mo30717a(C15740bx.f44369cx), str, str2).toString(), str2);
        if (TextUtils.isEmpty(d)) {
            abv.m32792b("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(d.trim());
            String optString = jSONObject.optString("gct");
            this.f40305a = jSONObject.optString("status");
            synchronized (this.f40306b) {
                this.f40308d = optString;
            }
            return true;
        } catch (JSONException e) {
            abv.m32795c("Fail to get in app preview response json.", e);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo28722b(Context context, String str, String str2) {
        String d = m32689d(context, m32688b(context, (String) caf.m37099d().mo30717a(C15740bx.f44370cy), str, str2).toString(), str2);
        if (TextUtils.isEmpty(d)) {
            abv.m32792b("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(d.trim()).optString("debug_mode"));
            synchronized (this.f40306b) {
                this.f40309e = equals;
            }
            return equals;
        } catch (JSONException e) {
            abv.m32795c("Fail to get debug mode response json.", e);
            return false;
        }
    }

    /* renamed from: d */
    private static String m32689d(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", C14963ax.m30831a().mo28670b(context, str2));
        aga a = new adr(context).mo28736a(str, (Map<String, String>) hashMap);
        try {
            return (String) a.get((long) ((Integer) caf.m37099d().mo30717a(C15740bx.f44320cA)).intValue(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            String str3 = "Timeout while retriving a response from: ";
            String valueOf = String.valueOf(str);
            abv.m32793b(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), e);
            a.cancel(true);
            return null;
        } catch (InterruptedException e2) {
            String str4 = "Interrupted while retriving a response from: ";
            String valueOf2 = String.valueOf(str);
            abv.m32793b(valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4), e2);
            a.cancel(true);
            return null;
        } catch (Exception e3) {
            String str5 = "Error retriving a response from: ";
            String valueOf3 = String.valueOf(str);
            abv.m32793b(valueOf3.length() != 0 ? str5.concat(valueOf3) : new String(str5), e3);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo28723c(Context context, String str, String str2) {
        acd.m32582a(context, m32688b(context, (String) caf.m37099d().mo30717a(C15740bx.f44368cw), str, str2));
    }

    /* renamed from: a */
    public final void mo28718a(Context context, String str, String str2, String str3) {
        Builder buildUpon = m32688b(context, (String) caf.m37099d().mo30717a(C15740bx.f44371cz), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        acd.m32583a(context, str, buildUpon.build().toString());
    }

    /* renamed from: b */
    private final Uri m32688b(Context context, String str, String str2, String str3) {
        Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("linkedDeviceId", m32687a(context));
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    /* renamed from: a */
    private final String m32687a(Context context) {
        String str;
        synchronized (this.f40306b) {
            if (TextUtils.isEmpty(this.f40307c)) {
                this.f40307c = acd.m32602c(context, "debug_signals_id.txt");
                if (TextUtils.isEmpty(this.f40307c)) {
                    this.f40307c = acd.m32575a();
                    String str2 = "debug_signals_id.txt";
                    String str3 = this.f40307c;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput(str2, 0);
                        openFileOutput.write(str3.getBytes("UTF-8"));
                        openFileOutput.close();
                    } catch (Exception e) {
                        abv.m32793b("Error writing to file in internal storage.", e);
                    }
                }
            }
            str = this.f40307c;
        }
        return str;
    }

    /* renamed from: a */
    public final String mo28717a() {
        String str;
        synchronized (this.f40306b) {
            str = this.f40308d;
        }
        return str;
    }

    /* renamed from: b */
    public final boolean mo28721b() {
        boolean z;
        synchronized (this.f40306b) {
            z = this.f40309e;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo28719a(Context context, String str, boolean z, boolean z2) {
        if (!(context instanceof Activity)) {
            abv.m32796d("Can not create dialog without Activity Context");
            return;
        }
        Handler handler = acd.f40245a;
        adj adj = new adj(this, context, str, z, z2);
        handler.post(adj);
    }
}
