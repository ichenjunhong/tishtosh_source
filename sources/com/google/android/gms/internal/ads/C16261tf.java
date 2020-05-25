package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.tf */
final class C16261tf implements afl<List<C15827de>, C15819cx> {

    /* renamed from: a */
    private final /* synthetic */ String f45590a;

    /* renamed from: b */
    private final /* synthetic */ Integer f45591b;

    /* renamed from: c */
    private final /* synthetic */ Integer f45592c;

    /* renamed from: d */
    private final /* synthetic */ int f45593d;

    /* renamed from: e */
    private final /* synthetic */ int f45594e;

    /* renamed from: f */
    private final /* synthetic */ int f45595f;

    /* renamed from: g */
    private final /* synthetic */ int f45596g;

    /* renamed from: h */
    private final /* synthetic */ boolean f45597h;

    C16261tf(C16256ta taVar, String str, Integer num, Integer num2, int i, int i2, int i3, int i4, boolean z) {
        this.f45590a = str;
        this.f45591b = num;
        this.f45592c = num2;
        this.f45593d = i;
        this.f45594e = i2;
        this.f45595f = i3;
        this.f45596g = i4;
        this.f45597h = z;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo28739a(Object obj) {
        List list = (List) obj;
        Integer num = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String str = this.f45590a;
        Integer num2 = this.f45591b;
        Integer num3 = this.f45592c;
        if (this.f45593d > 0) {
            num = Integer.valueOf(this.f45593d);
        }
        C15819cx cxVar = new C15819cx(str, list, num2, num3, num, this.f45594e + this.f45595f, this.f45596g, this.f45597h);
        return cxVar;
    }
}
