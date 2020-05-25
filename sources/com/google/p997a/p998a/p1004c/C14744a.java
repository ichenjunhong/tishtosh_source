package com.google.p997a.p998a.p1004c;

import com.taobao.android.dexposed.ClassUtils;

/* renamed from: com.google.a.a.c.a */
public final class C14744a {

    /* renamed from: a */
    public static final Integer f38206a = Integer.valueOf(1);

    /* renamed from: b */
    public static final Integer f38207b = Integer.valueOf(23);

    /* renamed from: c */
    public static final Integer f38208c = Integer.valueOf(0);

    /* renamed from: d */
    public static final String f38209d;

    static {
        String valueOf = String.valueOf(String.valueOf(f38206a));
        String valueOf2 = String.valueOf(String.valueOf(f38207b));
        String valueOf3 = String.valueOf(String.valueOf(f38208c));
        StringBuilder sb = new StringBuilder(valueOf.length() + 2 + valueOf2.length() + valueOf3.length());
        sb.append(valueOf);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(valueOf2);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(valueOf3);
        f38209d = sb.toString().toString();
    }
}
