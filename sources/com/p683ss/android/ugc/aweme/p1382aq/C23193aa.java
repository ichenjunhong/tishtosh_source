package com.p683ss.android.ugc.aweme.p1382aq;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a;
import com.p683ss.android.ugc.aweme.push.C40906h;

/* renamed from: com.ss.android.ugc.aweme.aq.aa */
public final class C23193aa extends C23241k<C23193aa> {

    /* renamed from: O */
    private int f61661O;

    /* renamed from: P */
    private int f61662P;

    /* renamed from: a */
    private String f61663a;

    /* renamed from: b */
    private String f61664b;

    /* renamed from: c */
    private String f61665c;

    /* renamed from: d */
    private String f61666d;

    /* renamed from: e */
    private int f61667e;

    public C23193aa() {
        super("unlogin_like");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47948a() {
        mo48074c();
        mo48072a("group_id", this.f61663a, C23232a.f62006b);
        mo48072a("author_id", this.f61664b, C23232a.f62006b);
        mo48072a("request_id", this.f61665c, C23232a.f62006b);
        if (C23198ae.m56860d(this.f61985g)) {
            mo48078i(this.f61665c);
        }
        if (!TextUtils.equals(this.f61984f, "like_cancel")) {
            TextUtils.equals(this.f61984f, "unlogin_like");
        }
        if (C40906h.m90485a().mo83391b(this.f61663a)) {
            mo48072a("previous_page", "push", C23232a.f62005a);
        }
        if (!TextUtils.isEmpty(this.f61666d)) {
            mo48072a("enter_method", this.f61666d, C23232a.f62005a);
        }
        mo48072a("is_first", String.valueOf(this.f61667e), C23232a.f62005a);
        mo48072a("is_login_notify", String.valueOf(this.f61661O), C23232a.f62005a);
    }

    /* renamed from: a */
    public final C23193aa mo47946a(int i) {
        this.f61662P = i;
        return this;
    }

    /* renamed from: b */
    public final C23193aa mo47949b(int i) {
        this.f61667e = i;
        return this;
    }

    /* renamed from: c */
    public final C23193aa mo47951c(int i) {
        this.f61661O = i;
        return this;
    }

    /* renamed from: a */
    public final C23193aa mo47947a(String str) {
        this.f61985g = str;
        return this;
    }

    /* renamed from: b */
    public final C23193aa mo47950b(String str) {
        this.f61663a = str;
        return this;
    }

    /* renamed from: c */
    public final C23193aa mo47952c(String str) {
        this.f61666d = str;
        return this;
    }

    /* renamed from: e */
    public final C23193aa mo47954f(Aweme aweme) {
        String str;
        super.mo47954f(aweme);
        if (aweme != null) {
            this.f61663a = aweme.getAid();
            this.f61664b = m57044d(aweme);
            if (TextUtils.isEmpty(C23198ae.m56847a(aweme, this.f61662P))) {
                str = aweme.getRequestId();
            } else {
                str = C23198ae.m56847a(aweme, this.f61662P);
            }
            this.f61665c = str;
        }
        return this;
    }
}
