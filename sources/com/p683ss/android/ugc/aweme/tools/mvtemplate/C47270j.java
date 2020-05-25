package com.p683ss.android.ugc.aweme.tools.mvtemplate;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.j */
public final class C47270j {

    /* renamed from: a */
    public final C47272b f119351a;

    /* renamed from: b */
    public final C47271a f119352b;

    /* renamed from: c */
    public final int f119353c;

    /* renamed from: d */
    public final float f119354d;

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.j$a */
    public enum C47271a {
        MAIN_TEMPLATE,
        ICON_LIST
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.j$b */
    public enum C47272b {
        START,
        SCROLL
    }

    public C47270j(C47272b bVar, C47271a aVar) {
        this(bVar, aVar, 0, 0.0f, 12, null);
    }

    public C47270j(C47272b bVar, C47271a aVar, int i, float f) {
        C52711k.m112240b(bVar, "state");
        C52711k.m112240b(aVar, "producer");
        this.f119351a = bVar;
        this.f119352b = aVar;
        this.f119353c = i;
        this.f119354d = f;
    }

    public /* synthetic */ C47270j(C47272b bVar, C47271a aVar, int i, float f, int i2, C52707g gVar) {
        this(bVar, aVar, 0, 0.0f);
    }
}
