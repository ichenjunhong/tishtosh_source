package com.p683ss.android.ugc.aweme.poi.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.app.api.C22982e;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.model.j */
public final class C39126j extends BaseResponse implements C22982e {
    @C17952c(mo34828a = "aweme_list")

    /* renamed from: a */
    public List<Aweme> f99819a;
    @C17952c(mo34828a = "has_more")

    /* renamed from: b */
    public int f99820b;
    @C17952c(mo34828a = "cursor")

    /* renamed from: c */
    public int f99821c;
    @C17952c(mo34828a = "rid")

    /* renamed from: d */
    String f99822d;

    /* renamed from: e */
    public long f99823e;

    public final String getRequestId() {
        return this.f99822d;
    }

    /* renamed from: a */
    public final List<Aweme> mo79703a() {
        if (this.f99819a == null) {
            return new ArrayList();
        }
        return this.f99819a;
    }

    public final void setRequestId(String str) {
        this.f99822d = str;
    }
}
