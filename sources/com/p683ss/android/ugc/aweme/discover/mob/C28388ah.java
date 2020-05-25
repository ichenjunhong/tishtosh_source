package com.p683ss.android.ugc.aweme.discover.mob;

import com.p683ss.android.ugc.aweme.p1382aq.C23231d;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.ah */
public final class C28388ah extends C23231d<C28388ah> {

    /* renamed from: a */
    private String f74548a;

    /* renamed from: b */
    private String f74549b;

    public C28388ah() {
        super("search_mode");
    }

    /* renamed from: a */
    public final void mo47948a() {
        String str = this.f74548a;
        if (str != null) {
            mo48069a("enter_method", str);
        }
        String str2 = this.f74549b;
        if (str2 != null) {
            mo48069a("fe_flag", str2);
        }
    }

    /* renamed from: a */
    public final C28388ah mo56819a(String str) {
        this.f74548a = str;
        return this;
    }

    /* renamed from: b */
    public final C28388ah mo56820b(String str) {
        this.f74549b = str;
        return this;
    }
}
