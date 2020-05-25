package com.p683ss.android.ugc.aweme.miniapp.anchor.p1953d;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.miniapp.anchor.p1953d.p1954a.C36831b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.d.b */
public final class C36832b extends C36829a<C36831b> {
    @C17952c(mo34828a = "anchor_list")

    /* renamed from: a */
    public final List<C36831b> f94144a;
    @C17952c(mo34828a = "total")

    /* renamed from: b */
    public int f94145b;
    @C17952c(mo34828a = "offset")

    /* renamed from: c */
    public int f94146c;
    @C17952c(mo34828a = "limit")

    /* renamed from: d */
    public int f94147d;

    /* renamed from: c */
    public final int mo76022c() {
        return this.f94146c;
    }

    /* renamed from: a */
    public final List<C36831b> mo76020a() {
        return m82895d();
    }

    /* renamed from: d */
    private List<C36831b> m82895d() {
        List<C36831b> list = this.f94144a;
        if (list == null) {
            return new ArrayList<>();
        }
        return list;
    }

    /* renamed from: b */
    public final boolean mo76021b() {
        if (m82895d().size() < this.f94145b) {
            return true;
        }
        return false;
    }
}
