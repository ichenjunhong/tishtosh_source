package com.p683ss.android.ugc.aweme.common.p1594f;

import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.common.f.g */
public class C26881g<T> {

    /* renamed from: a */
    public final List<T> f70735a;

    /* renamed from: b */
    public final int f70736b;

    /* renamed from: c */
    public final int f70737c;

    /* renamed from: d */
    public final boolean f70738d;

    /* renamed from: a */
    public static <T> C26881g<T> m64989a(T t, int i) {
        return new C26881g<>(Collections.singletonList(t), i, true, 1);
    }

    protected C26881g(List<T> list, int i, boolean z, int i2) {
        this.f70735a = list;
        this.f70736b = i;
        this.f70738d = z;
        this.f70737c = i2;
    }
}
