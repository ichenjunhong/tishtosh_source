package com.p683ss.android.ugc.aweme.account.p1270c;

import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.common.C26865e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.account.c.a */
public class C20940a<T extends C26832a, K extends C26865e> extends C26851b<T, K> {

    /* renamed from: a */
    private List<Object> f56972a;

    /* renamed from: b */
    public void mo44838b() {
        super.mo44838b();
        this.f56972a = null;
    }

    /* renamed from: c */
    public final void mo44935c() {
        if (this.f56972a != null) {
            mo44934a_(this.f56972a.toArray());
        }
    }

    /* renamed from: a_ */
    public boolean mo44934a_(Object... objArr) {
        this.f56972a = new ArrayList();
        for (Object add : objArr) {
            this.f56972a.add(add);
        }
        return super.mo44934a_(objArr);
    }
}
