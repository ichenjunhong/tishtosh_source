package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.aq */
public enum C16546aq {
    NONE,
    GZIP;

    public static C16546aq zzaa(String str) {
        if ("GZIP".equalsIgnoreCase(str)) {
            return GZIP;
        }
        return NONE;
    }
}
