package com.p683ss.android.ugc.aweme.p1807im.sdk.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.model.ShareStateResponse */
public class ShareStateResponse extends BaseResponse {
    @C17952c(mo34828a = "share_user")
    public C34543a[] mShareUserStructs;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.model.ShareStateResponse$a */
    public static class C34543a implements Serializable {
        @C17952c(mo34828a = "sec_user_id")

        /* renamed from: a */
        String f89046a;
        @C17952c(mo34828a = "follow_status")

        /* renamed from: b */
        int f89047b = -1;
        @C17952c(mo34828a = "share_status")

        /* renamed from: c */
        int f89048c = 2;

        public final int getFollowStatus() {
            return this.f89047b;
        }

        public final String getSecUserId() {
            return this.f89046a;
        }

        public final int getShareStatus() {
            return this.f89048c;
        }

        public final String toUidString() {
            StringBuilder sb = new StringBuilder("ShareUserStruct{sec_user_id=");
            sb.append(this.f89046a);
            sb.append(", follow_status=");
            sb.append(this.f89047b);
            sb.append(", share_status=");
            sb.append(this.f89048c);
            sb.append('}');
            return sb.toString();
        }
    }
}
