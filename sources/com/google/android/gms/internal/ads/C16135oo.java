package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.oo */
public final class C16135oo {

    /* renamed from: a */
    public final int f45385a;

    /* renamed from: b */
    public final int f45386b;

    /* renamed from: c */
    public final InputStream f45387c;

    /* renamed from: d */
    private final List<blz> f45388d;

    public C16135oo(int i, List<blz> list) {
        this(i, list, -1, null);
    }

    public C16135oo(int i, List<blz> list, int i2, InputStream inputStream) {
        this.f45385a = i;
        this.f45388d = list;
        this.f45386b = i2;
        this.f45387c = inputStream;
    }

    /* renamed from: a */
    public final List<blz> mo31237a() {
        return Collections.unmodifiableList(this.f45388d);
    }
}
