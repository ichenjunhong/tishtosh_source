package com.bytedance.android.live.core.setting;

import java.lang.reflect.Type;

/* renamed from: com.bytedance.android.live.core.setting.p */
public class C4097p<T> {

    /* renamed from: a */
    public final String f11267a;

    /* renamed from: b */
    public final String f11268b;

    /* renamed from: c */
    public final T f11269c;

    /* renamed from: d */
    public final T f11270d;

    /* renamed from: e */
    public final Type f11271e;

    /* renamed from: f */
    public final String[] f11272f;

    /* renamed from: a */
    public T mo9431a() {
        if (C4098q.m10221b()) {
            return this.f11270d;
        }
        return C4098q.m10215a("key_ttlive_sdk_setting", this.f11267a, this.f11271e, this.f11269c);
    }

    public C4097p(String str, Class<T> cls) {
        this(str, cls, "");
    }

    public C4097p(String str, T t) {
        this(str, t, "");
    }

    public C4097p(String str, T t, String str2) {
        this(str, str2, t, t);
    }

    public C4097p(String str, Class<T> cls, String str2) {
        this(str, cls, str2, (T) null, (T) null);
    }

    public C4097p(String str, Type type, T t) {
        this.f11267a = str;
        this.f11269c = null;
        this.f11270d = null;
        this.f11271e = type;
    }

    public C4097p(String str, T t, String str2, String... strArr) {
        this(str, str2, t, t, strArr);
    }

    public C4097p(String str, String str2, T t, T t2) {
        this(str, t.getClass(), str2, t, t2, null);
    }

    public C4097p(String str, Class<T> cls, String str2, T t, T t2) {
        this(str, cls, str2, null, null, null);
    }

    public C4097p(String str, String str2, T t, T t2, String... strArr) {
        this(str, t.getClass(), str2, t, t2, strArr);
    }

    private C4097p(String str, Class<T> cls, String str2, T t, T t2, String[] strArr) {
        this.f11267a = str;
        this.f11268b = str2;
        this.f11269c = t;
        this.f11270d = t2;
        this.f11271e = cls;
        this.f11272f = strArr;
    }
}
