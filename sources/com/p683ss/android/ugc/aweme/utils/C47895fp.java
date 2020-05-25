package com.p683ss.android.ugc.aweme.utils;

import android.os.Build.VERSION;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.C27979p;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.utils.fp */
public final class C47895fp implements C27979p {

    /* renamed from: a */
    public static volatile boolean f120489a;

    /* renamed from: b */
    private static Field f120490b;

    /* renamed from: c */
    private static long f120491c;

    /* renamed from: c */
    public final void mo47074c() {
    }

    /* renamed from: a */
    public final void mo47070a() {
        if (VERSION.SDK_INT < 26 && f120491c > 0) {
            try {
                if (f120490b == null) {
                    Field declaredField = Class.forName("java.lang.Daemons").getDeclaredField("MAX_FINALIZE_NANOS");
                    f120490b = declaredField;
                    declaredField.setAccessible(true);
                }
                f120490b.set(null, Long.valueOf(f120491c));
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
            }
        }
    }

    /* renamed from: b */
    public final void mo47072b() {
        if (VERSION.SDK_INT < 26) {
            try {
                if (f120490b == null) {
                    Field declaredField = Class.forName("java.lang.Daemons").getDeclaredField("MAX_FINALIZE_NANOS");
                    f120490b = declaredField;
                    declaredField.setAccessible(true);
                }
                f120491c = ((Long) f120490b.get(null)).longValue();
                f120490b.set(null, Long.valueOf(Long.MAX_VALUE));
            } catch (Exception e) {
                if (VERSION.SDK_INT < 21) {
                    StringBuilder sb = new StringBuilder();
                    try {
                        for (Field field : Class.forName("java.lang.Daemons").getDeclaredFields()) {
                            sb.append(field.toString());
                            sb.append(", ");
                        }
                    } catch (ClassNotFoundException unused) {
                    }
                    if (!TextUtils.isEmpty(sb.toString())) {
                        C32458a.m75150b("SystemCrashManager", sb.toString());
                    }
                }
                C32458a.m75148a((Throwable) e);
            }
        }
    }
}
