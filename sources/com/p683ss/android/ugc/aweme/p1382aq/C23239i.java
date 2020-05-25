package com.p683ss.android.ugc.aweme.p1382aq;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.forward.p1777e.C32401a;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.aq.i */
public final class C23239i extends C23231d {

    /* renamed from: A */
    private String f62027A;

    /* renamed from: B */
    private String f62028B;

    /* renamed from: C */
    private Aweme f62029C;

    /* renamed from: a */
    public String f62030a;

    /* renamed from: b */
    private String f62031b;

    /* renamed from: c */
    private String f62032c;

    /* renamed from: d */
    private String f62033d;

    /* renamed from: e */
    private String f62034e;

    public C23239i() {
        super("poi_click");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47948a() {
        mo48072a("enter_from", this.f62031b, C23232a.f62005a);
        mo48072a("group_id", this.f62027A, C23232a.f62005a);
        mo48072a("content_type", this.f62033d, C23232a.f62005a);
        mo48072a("poi_id", this.f62034e, C23232a.f62005a);
        mo48072a("poi_type", this.f62028B, C23232a.f62005a);
        mo48072a("request_id", this.f62032c, C23232a.f62005a);
        mo48070a((Map<String, String>) C32401a.m74903b(this.f62029C, this.f62030a));
    }

    /* renamed from: a */
    public final C23239i mo48092a(String str) {
        this.f62031b = str;
        return this;
    }

    /* renamed from: b */
    public final C23239i mo48093b(String str) {
        this.f62032c = str;
        return this;
    }

    /* renamed from: c */
    public final C23239i mo48094c(String str) {
        this.f62034e = str;
        return this;
    }

    /* renamed from: d */
    public final C23239i mo48095d(String str) {
        this.f62028B = str;
        return this;
    }

    /* renamed from: e */
    public final C23239i mo48096e(Aweme aweme) {
        String str;
        if (aweme != null) {
            this.f62029C = aweme;
            this.f62027A = aweme.getAid();
            if (aweme.isImage()) {
                str = "photo";
            } else {
                str = "video";
            }
            this.f62033d = str;
        }
        return this;
    }
}
