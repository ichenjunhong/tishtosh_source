package com.google.android.gms.common.p1035b;

import android.util.Log;
import com.google.android.gms.common.internal.C15451j;

/* renamed from: com.google.android.gms.common.b.a */
public final class C15368a {

    /* renamed from: a */
    private final String f39650a;

    /* renamed from: b */
    private final String f39651b;

    /* renamed from: c */
    private final C15451j f39652c;

    /* renamed from: d */
    private final int f39653d;

    public C15368a(String str, String... strArr) {
        this(str, "");
    }

    private C15368a(String str, String str2) {
        this.f39651b = str2;
        this.f39650a = str;
        this.f39652c = new C15451j(str);
        int i = 2;
        while (7 >= i && !Log.isLoggable(this.f39650a, i)) {
            i++;
        }
        this.f39653d = i;
    }
}
