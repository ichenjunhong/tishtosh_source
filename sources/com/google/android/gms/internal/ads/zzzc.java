package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.ads.C14912d;
import com.ss.android.ugc.trill.R;

@C16299uq
public final class zzzc {

    /* renamed from: a */
    final C14912d[] f46348a;

    /* renamed from: b */
    public final String f46349b;

    /* renamed from: a */
    private static C14912d[] m39305a(String str) {
        int i;
        int i2;
        String[] split = str.split("\\s*,\\s*");
        C14912d[] dVarArr = new C14912d[split.length];
        for (int i3 = 0; i3 < split.length; i3++) {
            String trim = split[i3].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    if ("FULL_WIDTH".equals(split2[0])) {
                        i = -1;
                    } else {
                        i = Integer.parseInt(split2[0]);
                    }
                    if ("AUTO_HEIGHT".equals(split2[1])) {
                        i2 = -2;
                    } else {
                        i2 = Integer.parseInt(split2[1]);
                    }
                    dVarArr[i3] = new C14912d(i, i2);
                } catch (NumberFormatException unused) {
                    String str2 = "Could not parse XML attribute \"adSize\": ";
                    String valueOf = String.valueOf(trim);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                }
            } else if ("BANNER".equals(trim)) {
                dVarArr[i3] = C14912d.f38454a;
            } else if ("LARGE_BANNER".equals(trim)) {
                dVarArr[i3] = C14912d.f38456c;
            } else if ("FULL_BANNER".equals(trim)) {
                dVarArr[i3] = C14912d.f38455b;
            } else if ("LEADERBOARD".equals(trim)) {
                dVarArr[i3] = C14912d.f38457d;
            } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                dVarArr[i3] = C14912d.f38458e;
            } else if ("SMART_BANNER".equals(trim)) {
                dVarArr[i3] = C14912d.f38460g;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                dVarArr[i3] = C14912d.f38459f;
            } else if ("FLUID".equals(trim)) {
                dVarArr[i3] = C14912d.f38461h;
            } else if ("ICON".equals(trim)) {
                dVarArr[i3] = C14912d.f38462i;
            } else {
                String str3 = "Could not parse XML attribute \"adSize\": ";
                String valueOf2 = String.valueOf(trim);
                throw new IllegalArgumentException(valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
            }
        }
        if (dVarArr.length != 0) {
            return dVarArr;
        }
        String str4 = "Could not parse XML attribute \"adSize\": ";
        String valueOf3 = String.valueOf(str);
        throw new IllegalArgumentException(valueOf3.length() != 0 ? str4.concat(valueOf3) : new String(str4));
    }

    public zzzc(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, new int[]{R.attr.aa, R.attr.ab, R.attr.ac});
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(1);
        boolean z = !TextUtils.isEmpty(string);
        boolean isEmpty = true ^ TextUtils.isEmpty(string2);
        if (z && !isEmpty) {
            this.f46348a = m39305a(string);
        } else if (!z && isEmpty) {
            this.f46348a = m39305a(string2);
        } else if (z) {
            throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
        } else {
            throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
        }
        this.f46349b = obtainAttributes.getString(2);
        if (TextUtils.isEmpty(this.f46349b)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }
}
