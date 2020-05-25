package com.p683ss.android.ugc.aweme.p1382aq;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a;
import com.p683ss.android.ugc.aweme.push.C40906h;

/* renamed from: com.ss.android.ugc.aweme.aq.m */
public final class C23243m extends C23241k<C23243m> {

    /* renamed from: O */
    private String f62050O;

    /* renamed from: P */
    private String f62051P;

    /* renamed from: a */
    public String f62052a;

    /* renamed from: b */
    public String f62053b;

    /* renamed from: c */
    private String f62054c;

    /* renamed from: d */
    private String f62055d;

    /* renamed from: e */
    private String f62056e;

    public C23243m() {
        super("dislike");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47948a() {
        mo48074c();
        mo48072a("group_id", this.f62054c, C23232a.f62006b);
        mo48072a("author_id", this.f62055d, C23232a.f62006b);
        mo48072a("enter_method", this.f62056e, C23232a.f62005a);
        if (C40906h.m90485a().mo83391b(this.f62054c)) {
            mo48072a("previous_page", "push", C23232a.f62005a);
        }
        if (C23198ae.m56860d(this.f61985g)) {
            mo48078i(this.f62050O);
        }
        if (!TextUtils.isEmpty(this.f62051P)) {
            mo48072a("impr_type", this.f62051P, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f62052a)) {
            mo48072a("content_type", this.f62052a, C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f62053b)) {
            mo48072a("display_method", this.f62053b, C23232a.f62005a);
        }
    }

    /* renamed from: a */
    public final C23243m mo48110a(String str) {
        this.f61985g = str;
        return this;
    }

    /* renamed from: b */
    public final C23243m mo48111b(String str) {
        this.f62054c = str;
        return this;
    }

    /* renamed from: c */
    public final C23243m mo48112c(String str) {
        this.f62055d = str;
        return this;
    }

    /* renamed from: d */
    public final C23243m mo48113d(String str) {
        this.f62056e = str;
        return this;
    }

    /* renamed from: e */
    public final C23243m mo48114e(String str) {
        this.f62050O = str;
        return this;
    }

    /* renamed from: f */
    public final /* synthetic */ C23241k mo47954f(Aweme aweme) {
        super.mo47954f(aweme);
        this.f62051P = C23198ae.m56883s(aweme);
        return this;
    }
}
