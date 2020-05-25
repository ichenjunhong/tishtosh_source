package com.p683ss.android.ugc.aweme.follow.presenter;

import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.follow.presenter.e */
public final class C31882e {

    /* renamed from: b */
    public static final C31883a f83311b = new C31883a(null);

    /* renamed from: a */
    public Integer f83312a = Integer.valueOf(0);

    /* renamed from: c */
    private String f83313c = "";

    /* renamed from: d */
    private String f83314d = "";

    /* renamed from: e */
    private String f83315e = "";

    /* renamed from: f */
    private String f83316f = "";

    /* renamed from: g */
    private int f83317g;

    /* renamed from: h */
    private List<Long> f83318h = C52575l.m112097a();

    /* renamed from: i */
    private final int f83319i;

    /* renamed from: j */
    private final int f83320j;

    /* renamed from: k */
    private final int f83321k;

    /* renamed from: l */
    private final String f83322l;

    /* renamed from: com.ss.android.ugc.aweme.follow.presenter.e$a */
    public static final class C31883a {
        private C31883a() {
        }

        public /* synthetic */ C31883a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C31882e m74317a(int i, int i2, int i3, String str) {
            C52711k.m112240b(str, "impressionIds");
            return new C31882e(i, i2, i3, str);
        }
    }

    /* renamed from: a */
    public static final C31882e m74310a(int i, int i2, int i3, String str) {
        return C31883a.m74317a(i, i2, i3, str);
    }

    /* renamed from: a */
    public final C31881d mo65085a() {
        C31881d dVar = new C31881d(this.f83319i, this.f83320j, this.f83321k, this.f83322l, this.f83313c, this.f83312a, this.f83314d, this.f83315e, this.f83316f, this.f83317g, this.f83318h);
        return dVar;
    }

    /* renamed from: a */
    public final C31882e mo65086a(String str) {
        this.f83313c = str;
        return this;
    }

    /* renamed from: b */
    public final C31882e mo65088b(String str) {
        this.f83314d = str;
        return this;
    }

    /* renamed from: c */
    public final C31882e mo65089c(String str) {
        this.f83315e = str;
        return this;
    }

    /* renamed from: d */
    public final C31882e mo65090d(String str) {
        this.f83316f = str;
        return this;
    }

    /* renamed from: a */
    public final C31882e mo65087a(boolean z) {
        if (z) {
            this.f83317g = 1;
        } else {
            this.f83317g = 0;
        }
        return this;
    }

    public C31882e(int i, int i2, int i3, String str) {
        C52711k.m112240b(str, "impressionIds");
        this.f83319i = i;
        this.f83320j = i2;
        this.f83321k = i3;
        this.f83322l = str;
    }
}
