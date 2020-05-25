package com.google.android.gms.internal.ads;

import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;

public enum ayk {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, Integer.valueOf(0)),
    LONG(Long.TYPE, Long.class, Long.valueOf(0)),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(ProfileUiInitOptimizeEnterThreshold.DEFAULT)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.valueOf(false)),
    STRING(String.class, String.class, ""),
    BYTE_STRING(awo.class, awo.class, awo.zzfuo),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    

    /* renamed from: a */
    private final Class<?> f41634a;

    /* renamed from: b */
    private final Class<?> f41635b;

    /* renamed from: c */
    private final Object f41636c;

    private ayk(Class<?> cls, Class<?> cls2, Object obj) {
        this.f41634a = cls;
        this.f41635b = cls2;
        this.f41636c = obj;
    }

    public final Class<?> zzauc() {
        return this.f41635b;
    }
}
