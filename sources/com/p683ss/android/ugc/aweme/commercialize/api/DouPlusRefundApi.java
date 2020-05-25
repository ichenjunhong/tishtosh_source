package com.p683ss.android.ugc.aweme.commercialize.api;

import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import java.io.Serializable;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.commercialize.api.DouPlusRefundApi */
public final class DouPlusRefundApi {

    /* renamed from: com.ss.android.ugc.aweme.commercialize.api.DouPlusRefundApi$IApi */
    public interface IApi {
        @C53075f(mo110603a = "/aweme/v2/douplus/refund/check/")
        C17832m<C25641a> check(@C53089t(mo110619a = "sec_uid") String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.api.DouPlusRefundApi$a */
    public static class C25641a implements Serializable {
        @C17952c(mo34828a = "can_refund")
        public boolean canRefund;
        @C17952c(mo34828a = "url")
        public String url;

        public final boolean hasUrl() {
            if (!TextUtils.isEmpty(this.url)) {
                return true;
            }
            return false;
        }

        public final String getFullUrl() {
            if (!hasUrl()) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(Api.f61282b);
            sb.append(this.url);
            return sb.toString();
        }
    }
}
