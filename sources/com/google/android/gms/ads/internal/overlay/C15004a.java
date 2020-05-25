package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C15740bx;
import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.internal.ads.abv;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.caf;

@C16299uq
/* renamed from: com.google.android.gms.ads.internal.overlay.a */
public final class C15004a {
    /* renamed from: a */
    public static boolean m31022a(Context context, zzc zzc, C15023t tVar) {
        int i;
        if (zzc == null) {
            abv.m32798e("No intent data for launcher overlay.");
            return false;
        }
        C15740bx.m36941a(context);
        if (zzc.f38833f != null) {
            return m31021a(context, zzc.f38833f, tVar);
        }
        Intent intent = new Intent();
        if (TextUtils.isEmpty(zzc.f38828a)) {
            abv.m32798e("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(zzc.f38829b)) {
            intent.setDataAndType(Uri.parse(zzc.f38828a), zzc.f38829b);
        } else {
            intent.setData(Uri.parse(zzc.f38828a));
        }
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(zzc.f38830c)) {
            intent.setPackage(zzc.f38830c);
        }
        if (!TextUtils.isEmpty(zzc.f38831d)) {
            String[] split = zzc.f38831d.split("/", 2);
            if (split.length < 2) {
                String str = "Could not parse component name from open GMSG: ";
                String valueOf = String.valueOf(zzc.f38831d);
                abv.m32798e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                return false;
            }
            intent.setClassName(split[0], split[1]);
        }
        String str2 = zzc.f38832e;
        if (!TextUtils.isEmpty(str2)) {
            try {
                i = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                abv.m32798e("Could not parse intent flags.");
                i = 0;
            }
            intent.addFlags(i);
        }
        if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44366cu)).booleanValue()) {
            intent.addFlags(268435456);
            intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44365ct)).booleanValue()) {
                acd.m32598b(context, intent);
            }
        }
        return m31021a(context, intent, tVar);
    }

    /* renamed from: a */
    private static boolean m31021a(Context context, Intent intent, C15023t tVar) {
        String str = "Launching an intent: ";
        try {
            String valueOf = String.valueOf(intent.toURI());
            abv.m32494a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            acd.m32581a(context, intent);
            if (tVar != null) {
                tVar.mo27448J_();
            }
            return true;
        } catch (ActivityNotFoundException e) {
            abv.m32798e(e.getMessage());
            return false;
        }
    }
}
