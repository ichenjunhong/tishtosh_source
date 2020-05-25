package com.p683ss.android.ugc.aweme.discover.mob.p1658a;

import com.p683ss.android.ugc.aweme.p1382aq.C23231d;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.a.e */
public final class C28377e extends C23231d<C28377e> {

    /* renamed from: A */
    private String f74492A;

    /* renamed from: a */
    private String f74493a;

    /* renamed from: b */
    private Integer f74494b = Integer.valueOf(0);

    /* renamed from: c */
    private String f74495c;

    /* renamed from: d */
    private String f74496d;

    /* renamed from: e */
    private String f74497e;

    public C28377e() {
        super("trending_show");
    }

    /* renamed from: a */
    public final void mo47948a() {
        String str;
        mo48072a("raw_query", this.f74495c, C23232a.f62005a);
        mo48072a("search_id", this.f74496d, C23232a.f62005a);
        mo48072a("impr_id", this.f74497e, C23232a.f62005a);
        mo48072a("log_pb", this.f74492A, C23232a.f62005a);
        mo48072a("rank", "-1", C23232a.f62005a);
        mo48072a("words_source", this.f74493a, C23232a.f62005a);
        String str2 = "words_num";
        Integer num = this.f74494b;
        if (num != null) {
            str = String.valueOf(num.intValue());
        } else {
            str = null;
        }
        mo48072a(str2, str, C23232a.f62005a);
    }

    /* renamed from: a */
    public final C28377e mo56797a(Integer num) {
        this.f74494b = num;
        return this;
    }

    /* renamed from: b */
    public final C28377e mo56799b(String str) {
        this.f74495c = str;
        return this;
    }

    /* renamed from: c */
    public final C28377e mo56800c(String str) {
        this.f74497e = str;
        return this;
    }

    /* renamed from: d */
    public final C28377e mo56801d(String str) {
        this.f74492A = str;
        return this;
    }

    /* renamed from: a */
    public final C28377e mo56798a(String str) {
        this.f74493a = str;
        return this;
    }
}
