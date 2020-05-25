package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C14963ax;

@C16299uq
public final class aav {
    /* renamed from: a */
    public static String m32439a(String str, Context context, boolean z) {
        if ((((Boolean) caf.m37099d().mo30717a(C15740bx.f44256aq)).booleanValue() && !z) || !C14963ax.m30849s().mo28557a(context) || TextUtils.isEmpty(str)) {
            return str;
        }
        String f = C14963ax.m30849s().mo28566f(context);
        if (f == null) {
            return str;
        }
        if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44248ai)).booleanValue()) {
            String str2 = (String) caf.m37099d().mo30717a(C15740bx.f44249aj);
            if (str.contains(str2)) {
                if (C14963ax.m30831a().mo28673b(str)) {
                    C14963ax.m30849s().mo28561c(context, f);
                    return str.replace(str2, f);
                } else if (C14963ax.m30831a().mo28674c(str)) {
                    C14963ax.m30849s().mo28563d(context, f);
                    return str.replace(str2, f);
                }
            }
        } else if (!str.contains("fbs_aeid")) {
            if (C14963ax.m30831a().mo28673b(str)) {
                C14963ax.m30849s().mo28561c(context, f);
                return m32438a(str, "fbs_aeid", f).toString();
            } else if (C14963ax.m30831a().mo28674c(str)) {
                C14963ax.m30849s().mo28563d(context, f);
                return m32438a(str, "fbs_aeid", f).toString();
            }
        }
        return str;
    }

    /* renamed from: a */
    public static Uri m32438a(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = indexOf + 1;
        StringBuilder sb = new StringBuilder(str.substring(0, i));
        sb.append(str2);
        sb.append("=");
        sb.append(str3);
        sb.append("&");
        sb.append(str.substring(i));
        return Uri.parse(sb.toString());
    }
}
