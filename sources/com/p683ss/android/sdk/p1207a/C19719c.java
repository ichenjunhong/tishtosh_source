package com.p683ss.android.sdk.p1207a;

import android.text.TextUtils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.sdk.a.c */
public final class C19719c {

    /* renamed from: a */
    public static final C19719c[] f54292a = {f54295d, f54296e, f54297f, f54298g, f54299h, f54300i, f54301j, f54294c};

    /* renamed from: b */
    public static final C19719c[] f54293b = {f54295d, f54296e, f54297f, f54298g, f54299h, f54300i, f54301j};

    /* renamed from: c */
    public static final C19719c f54294c = new C19719c("mobile", R.drawable.cbw, R.string.do3);

    /* renamed from: d */
    public static final C19719c f54295d = new C19719c("facebook", R.drawable.cbx, R.string.dnx);

    /* renamed from: e */
    public static final C19719c f54296e = new C19719c("twitter", R.drawable.cc2, R.string.do8, new String[]{"twitter", "m_twitter"});

    /* renamed from: f */
    public static final C19719c f54297f = new C19719c("google", R.drawable.cby, R.string.dny);

    /* renamed from: g */
    public static final C19719c f54298g = new C19719c("line", R.drawable.cc1, R.string.do2);

    /* renamed from: h */
    public static final C19719c f54299h = new C19719c("kakaotalk", R.drawable.cc0, R.string.do1);

    /* renamed from: i */
    public static final C19719c f54300i = new C19719c("instagram", R.drawable.cbz, R.string.do1);

    /* renamed from: j */
    public static final C19719c f54301j = new C19719c("vk", R.drawable.cc3, R.string.do9);

    /* renamed from: k */
    public static final C19719c f54302k = new C19719c("flipchat", -1, -1);

    /* renamed from: l */
    public int f54303l;

    /* renamed from: m */
    public String f54304m;

    /* renamed from: n */
    public String[] f54305n;

    /* renamed from: o */
    public final int f54306o;

    /* renamed from: p */
    public boolean f54307p;

    /* renamed from: q */
    public String f54308q;

    /* renamed from: r */
    public String f54309r;

    /* renamed from: s */
    public String f54310s;

    /* renamed from: t */
    public long f54311t;

    /* renamed from: u */
    public long f54312u;

    /* renamed from: v */
    public long f54313v;

    /* renamed from: a */
    public static C19719c m48215a(String str) {
        C19719c[] cVarArr;
        for (C19719c cVar : f54292a) {
            if (TextUtils.equals(cVar.f54304m, str)) {
                return cVar;
            }
        }
        return null;
    }

    public C19719c(String str, int i, int i2) {
        this(str, i, i2, null);
    }

    private C19719c(String str, int i, int i2, String[] strArr) {
        this.f54313v = -1;
        this.f54303l = i;
        this.f54304m = str;
        this.f54306o = i2;
        this.f54308q = "";
        this.f54310s = "";
        this.f54305n = strArr;
    }
}
