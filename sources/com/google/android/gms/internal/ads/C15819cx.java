package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.cx */
public final class C15819cx extends C15862el {

    /* renamed from: h */
    private static final int f44797h = Color.rgb(12, 174, 206);

    /* renamed from: i */
    private static final int f44798i;

    /* renamed from: j */
    private static final int f44799j;

    /* renamed from: k */
    private static final int f44800k = f44797h;

    /* renamed from: a */
    public final List<C15827de> f44801a = new ArrayList();

    /* renamed from: b */
    public final int f44802b;

    /* renamed from: c */
    public final int f44803c;

    /* renamed from: d */
    public final int f44804d;

    /* renamed from: e */
    public final int f44805e;

    /* renamed from: f */
    public final int f44806f;

    /* renamed from: g */
    public final boolean f44807g;

    /* renamed from: l */
    private final String f44808l;

    /* renamed from: m */
    private final List<C15865eo> f44809m = new ArrayList();

    public C15819cx(String str, List<C15827de> list, Integer num, Integer num2, Integer num3, int i, int i2, boolean z) {
        this.f44808l = str;
        if (list != null) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                C15827de deVar = (C15827de) list.get(i3);
                this.f44801a.add(deVar);
                this.f44809m.add(deVar);
            }
        }
        this.f44802b = num != null ? num.intValue() : f44799j;
        this.f44803c = num2 != null ? num2.intValue() : f44800k;
        this.f44804d = num3 != null ? num3.intValue() : 12;
        this.f44805e = i;
        this.f44806f = i2;
        this.f44807g = z;
    }

    /* renamed from: a */
    public final String mo30912a() {
        return this.f44808l;
    }

    /* renamed from: b */
    public final List<C15865eo> mo30913b() {
        return this.f44809m;
    }

    static {
        int rgb = Color.rgb(204, 204, 204);
        f44798i = rgb;
        f44799j = rgb;
    }
}
