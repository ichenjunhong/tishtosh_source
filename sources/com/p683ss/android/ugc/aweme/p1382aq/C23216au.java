package com.p683ss.android.ugc.aweme.p1382aq;

import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a;

/* renamed from: com.ss.android.ugc.aweme.aq.au */
public final class C23216au extends C23241k<C23216au> {

    /* renamed from: a */
    protected String f61813a;

    /* renamed from: b */
    private String f61814b;

    /* renamed from: c */
    private String f61815c;

    /* renamed from: d */
    private Aweme f61816d;

    /* renamed from: e */
    private int f61817e;

    public C23216au() {
        super("video_pause");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47948a() {
        mo48072a("author_id", C23198ae.m56846a(this.f61816d), C23232a.f62005a);
        mo48072a("group_id", this.f61814b, C23232a.f62006b);
        mo48078i(this.f61815c);
        mo48072a("enter_from", this.f61813a, C23232a.f62005a);
        if (this.f61817e != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f61817e);
            mo48072a("is_long_item", sb.toString(), C23232a.f62005a);
        }
    }

    /* renamed from: a */
    public final C23216au mo48017a(int i) {
        this.f61817e = 1;
        return this;
    }

    /* renamed from: a */
    public final C23216au mo48018a(String str) {
        this.f61813a = str;
        return this;
    }

    /* renamed from: c */
    public final C23216au mo48019c(Aweme aweme, int i) {
        this.f61816d = aweme;
        this.f61815c = C23325e.m57379a().getRequestId(aweme, i);
        this.f61814b = C23198ae.m56877m(aweme);
        return this;
    }
}
