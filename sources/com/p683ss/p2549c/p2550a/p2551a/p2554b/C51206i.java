package com.p683ss.p2549c.p2550a.p2551a.p2554b;

import com.p683ss.p2549c.p2550a.p2551a.p2554b.p2555a.C51197a;
import java.util.List;

/* renamed from: com.ss.c.a.a.b.i */
final class C51206i {

    /* renamed from: a */
    public final String f127887a;

    /* renamed from: b */
    public final List<C51197a> f127888b;

    /* renamed from: c */
    public final float f127889c;

    /* renamed from: d */
    public final float f127890d;

    C51206i(String str, List<C51197a> list, int i) {
        this.f127887a = str;
        this.f127888b = list;
        if (list == null || list.isEmpty()) {
            this.f127889c = 1.0f;
            this.f127890d = Float.MAX_VALUE;
            return;
        }
        this.f127889c = 1.0f - ((((float) list.size()) * 1.0f) / ((float) i));
        float f = 0.0f;
        for (C51197a aVar : list) {
            if (aVar != null) {
                f += aVar.f127875c;
            }
        }
        this.f127890d = f / ((float) list.size());
    }
}
