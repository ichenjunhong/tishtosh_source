package com.google.android.gms.internal.measurement;

import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;

/* renamed from: com.google.android.gms.internal.measurement.hm */
public enum C16750hm {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, Integer.valueOf(0)),
    LONG(Long.TYPE, Long.class, Long.valueOf(0)),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(ProfileUiInitOptimizeEnterThreshold.DEFAULT)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.valueOf(false)),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C16691fs.class, C16691fs.class, C16691fs.zzbtq),
    ENUM(Integer.TYPE, Integer.class, null),
    zzbzn(Object.class, Object.class, null);
    

    /* renamed from: a */
    private final Class<?> f47114a;

    /* renamed from: b */
    private final Class<?> f47115b;

    /* renamed from: c */
    private final Object f47116c;

    private C16750hm(Class<?> cls, Class<?> cls2, Object obj) {
        this.f47114a = cls;
        this.f47115b = cls2;
        this.f47116c = obj;
    }

    public final Class<?> zzwy() {
        return this.f47115b;
    }
}
