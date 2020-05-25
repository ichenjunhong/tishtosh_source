package com.p683ss.android.ugc.aweme.live.feedpage;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.app.api.C22982e;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.live.feedpage.h */
public final class C36091h extends BaseResponse implements C22982e {
    @C17952c(mo34828a = "data")

    /* renamed from: a */
    public C36092a f92473a;

    /* renamed from: b */
    private String f92474b;

    /* renamed from: com.ss.android.ugc.aweme.live.feedpage.h$a */
    public static class C36092a {
        @C17952c(mo34828a = "room_id")

        /* renamed from: a */
        public Map<Long, Long> f92475a;

        /* renamed from: a */
        public final Map<Long, Long> mo74842a() {
            if (this.f92475a == null) {
                return new HashMap(0);
            }
            return this.f92475a;
        }
    }

    public final String getRequestId() {
        return this.f92474b;
    }

    /* renamed from: a */
    public final Map<Long, Long> mo74841a() {
        if (this.f92473a == null) {
            return new HashMap(0);
        }
        return this.f92473a.mo74842a();
    }

    public final void setRequestId(String str) {
        this.f92474b = str;
    }
}
