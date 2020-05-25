package com.p683ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.app.api.C22982e;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.n */
public final class C38101n extends BaseResponse implements C22982e {
    @C17952c(mo34828a = "avatar_list")

    /* renamed from: a */
    public final List<UrlModel> f96933a;
    @C17952c(mo34828a = "enable")

    /* renamed from: b */
    public final boolean f96934b;

    /* renamed from: c */
    private String f96935c;

    public C38101n() {
        this(null, false, 3, null);
    }

    public final String getRequestId() {
        return this.f96935c;
    }

    public final void setRequestId(String str) {
        this.f96935c = str;
    }

    private C38101n(List<? extends UrlModel> list, boolean z) {
        this.f96933a = list;
        this.f96934b = z;
    }

    private /* synthetic */ C38101n(List list, boolean z, int i, C52707g gVar) {
        this(null, false);
    }
}
