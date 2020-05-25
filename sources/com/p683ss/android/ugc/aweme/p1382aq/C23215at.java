package com.p683ss.android.ugc.aweme.p1382aq;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a;

/* renamed from: com.ss.android.ugc.aweme.aq.at */
public final class C23215at extends C23241k<C23215at> {

    /* renamed from: a */
    public String f61809a;

    /* renamed from: b */
    public String f61810b;

    /* renamed from: c */
    private String f61811c;

    /* renamed from: d */
    private Aweme f61812d;

    public C23215at() {
        super("tab_stay_time");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47948a() {
        mo48072a("duration", this.f61811c, C23232a.f62005a);
        mo48072a("enter_from", this.f61985g, C23232a.f62005a);
        mo48072a("group_id", C23198ae.m56877m(this.f61812d), C23232a.f62005a);
        mo48072a("author_id", C23198ae.m56846a(this.f61812d), C23232a.f62005a);
        mo48072a("city_info", C23198ae.m56845a(), C23232a.f62005a);
        mo48072a("enter_method", this.f61810b, C23232a.f62005a);
        if (!TextUtils.isEmpty(this.f61809a)) {
            mo48072a("page_type", this.f61809a, C23232a.f62005a);
        }
    }

    /* renamed from: a */
    public final C23215at mo48015a(String str) {
        this.f61811c = str;
        return this;
    }

    /* renamed from: b */
    public final C23215at mo48016b(String str) {
        this.f61985g = str;
        return this;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C23241k mo47954f(Aweme aweme) {
        super.mo47954f(aweme);
        this.f61812d = aweme;
        return this;
    }
}
