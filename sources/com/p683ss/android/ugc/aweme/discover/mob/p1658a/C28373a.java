package com.p683ss.android.ugc.aweme.discover.mob.p1658a;

import com.p683ss.android.ugc.aweme.discover.mob.p1658a.C28373a;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.a.a */
public abstract class C28373a<T extends C28373a<T>> extends C23231d<T> {

    /* renamed from: A */
    private String f74482A;

    /* renamed from: B */
    private String f74483B;

    /* renamed from: C */
    private String f74484C;

    /* renamed from: D */
    private Integer f74485D;

    /* renamed from: a */
    private String f74486a;

    /* renamed from: b */
    private String f74487b;

    /* renamed from: c */
    private String f74488c;

    /* renamed from: d */
    private String f74489d;

    /* renamed from: e */
    private String f74490e;

    /* renamed from: b */
    public final void mo47945b() {
        super.mo47945b();
        String str = this.f74486a;
        if (str != null) {
            mo48069a("enter_from", str);
        }
        String str2 = this.f74487b;
        if (str2 != null) {
            mo48069a("enter_method", str2);
        }
        String str3 = this.f74488c;
        if (str3 != null) {
            mo48069a("search_type", str3);
        }
        String str4 = this.f74489d;
        if (str4 != null) {
            mo48069a("words_type", str4);
        }
        String str5 = this.f74490e;
        if (str5 != null) {
            mo48069a("input_keyword", str5);
        }
        String str6 = this.f74482A;
        if (str6 != null) {
            mo48069a("search_keyword", str6);
        }
        String str7 = this.f74483B;
        if (str7 != null) {
            mo48069a("query_id", str7);
        }
        String str8 = this.f74484C;
        if (str8 != null) {
            mo48069a("group_id", str8);
        }
        Integer num = this.f74485D;
        if (num != null) {
            mo48069a("order", String.valueOf(num.intValue()));
        }
    }

    /* renamed from: a */
    public final T mo56788a(Integer num) {
        this.f74485D = num;
        return this;
    }

    /* renamed from: b */
    public final T mo56790b(String str) {
        this.f74487b = str;
        return this;
    }

    /* renamed from: c */
    public final T mo56791c(String str) {
        this.f74488c = str;
        return this;
    }

    /* renamed from: d */
    public final T mo56792d(String str) {
        this.f74489d = str;
        return this;
    }

    /* renamed from: e */
    public final T mo56793e(String str) {
        this.f74490e = str;
        return this;
    }

    /* renamed from: f */
    public final T mo56794f(String str) {
        this.f74482A = str;
        return this;
    }

    /* renamed from: g */
    public final T mo56795g(String str) {
        this.f74484C = str;
        return this;
    }

    public C28373a(String str) {
        C52711k.m112240b(str, "event");
        super(str);
    }

    /* renamed from: a */
    public final T mo56789a(String str) {
        this.f74486a = str;
        return this;
    }
}
