package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.measurement.fb */
public final class C16674fb {
    /* renamed from: a */
    public static Uri m39831a(String str) {
        String str2 = "content://com.google.android.gms.phenotype/";
        String valueOf = String.valueOf(Uri.encode(str));
        return Uri.parse(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }
}
