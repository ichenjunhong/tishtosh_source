package com.p683ss.android.ugc.aweme.p1382aq;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a;
import com.p683ss.android.ugc.aweme.push.C40906h;

/* renamed from: com.ss.android.ugc.aweme.aq.x */
public final class C23254x extends C23241k<C23254x> {

    /* renamed from: O */
    private String f62148O;

    /* renamed from: P */
    private String f62149P;

    /* renamed from: Q */
    private String f62150Q;

    /* renamed from: R */
    private String f62151R;

    /* renamed from: a */
    private String f62152a;

    /* renamed from: b */
    private String f62153b;

    /* renamed from: c */
    private String f62154c;

    /* renamed from: d */
    private String f62155d;

    /* renamed from: e */
    private String f62156e;

    public C23254x() {
        super("unlogin_follow");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47948a() {
        mo48074c();
        mo48072a("previous_page", this.f62152a, C23232a.f62005a);
        mo48072a("previous_page_position", this.f62153b, C23232a.f62005a);
        mo48072a("enter_method", this.f62150Q, C23232a.f62005a);
        mo48072a("to_user_id", this.f62154c, C23232a.f62006b);
        mo48072a("group_id", this.f62155d, C23232a.f62006b);
        mo48072a("author_id", this.f62154c, C23232a.f62006b);
        mo48072a("request_id", this.f62156e, C23232a.f62006b);
        mo48072a("enter_type", this.f62149P, C23232a.f62005a);
        if (!TextUtils.isEmpty(this.f62148O)) {
            mo48072a("enter_from_request", this.f62148O, C23232a.f62006b);
        }
        if (C23198ae.m56860d(this.f61985g) || "homepage_hot".equals(this.f62152a)) {
            mo48078i(this.f62156e);
        }
        if (!TextUtils.equals(this.f61984f, "follow_cancel")) {
            TextUtils.equals(this.f61984f, "unlogin_follow");
        }
        if (C40906h.m90485a().mo83391b(this.f62155d)) {
            mo48072a("previous_page", "push", C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f62151R)) {
            mo48072a("impr_type", this.f62151R, C23232a.f62005a);
        }
    }

    /* renamed from: a */
    public final C23254x mo48171a(String str) {
        this.f61985g = str;
        return this;
    }

    /* renamed from: b */
    public final C23254x mo48172b(String str) {
        this.f62150Q = str;
        return this;
    }

    /* renamed from: c */
    public final C23254x mo48174c(String str) {
        this.f62152a = str;
        return this;
    }

    /* renamed from: d */
    public final C23254x mo48175d(String str) {
        this.f62153b = str;
        return this;
    }

    /* renamed from: e */
    public final C23254x mo48176e(String str) {
        this.f62154c = str;
        return this;
    }

    /* renamed from: c */
    public final C23254x mo48173c(Aweme aweme, int i) {
        super.mo47954f(aweme);
        if (aweme != null) {
            this.f62155d = aweme.getAid();
            this.f62156e = m57042a(aweme, i);
            this.f62154c = aweme.getAuthorUid();
            this.f62151R = C23198ae.m56883s(aweme);
        }
        return this;
    }
}
