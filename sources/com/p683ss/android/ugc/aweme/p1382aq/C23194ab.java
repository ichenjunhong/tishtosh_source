package com.p683ss.android.ugc.aweme.p1382aq;

import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a;

/* renamed from: com.ss.android.ugc.aweme.aq.ab */
public final class C23194ab extends C23231d {

    /* renamed from: a */
    protected String f61668a;

    /* renamed from: b */
    private String f61669b;

    /* renamed from: c */
    private String f61670c;

    public C23194ab() {
        super("click_complete_video_entrance");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47948a() {
        mo48072a("group_id", this.f61669b, C23232a.f62006b);
        mo48078i(this.f61670c);
        mo48072a("enter_from", this.f61668a, C23232a.f62005a);
    }

    /* renamed from: a */
    public final C23194ab mo47955a(String str) {
        this.f61668a = str;
        return this;
    }

    /* renamed from: c */
    public final C23194ab mo47956c(Aweme aweme, int i) {
        this.f61670c = C23325e.m57379a().getRequestId(aweme, i);
        this.f61669b = C23198ae.m56877m(aweme);
        return this;
    }
}
