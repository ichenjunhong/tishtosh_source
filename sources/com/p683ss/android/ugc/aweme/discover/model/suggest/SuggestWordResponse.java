package com.p683ss.android.ugc.aweme.discover.model.suggest;

import com.bytedance.frameworks.baselib.network.http.C9831a;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.app.api.C22982e;
import com.p683ss.android.ugc.aweme.app.api.C22990h;
import com.p683ss.android.ugc.aweme.app.api.C22991i;
import com.p683ss.android.ugc.aweme.app.api.C22992j;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse */
public final class SuggestWordResponse implements C22982e, C22990h {
    @C17952c(mo34828a = "data")
    public final List<TypeWords> data;
    @C17952c(mo34828a = "errno")
    public final int errno;
    @C17952c(mo34828a = "msg")
    public final String msg;
    private String requestId = "";
    private C9831a<?> requestInfo;

    public final String getRequestId() {
        return this.requestId;
    }

    public final C9831a<?> getRequestInfo() {
        return this.requestInfo;
    }

    public final C22992j getRequestLog() {
        return C22991i.m56510a(this);
    }

    public final void setRequestId(String str) {
        this.requestId = str;
    }

    public final void setRequestInfo(C9831a<?> aVar) {
        this.requestInfo = aVar;
    }
}
