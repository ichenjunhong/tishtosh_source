package com.p683ss.android.ugc.aweme.promote;

import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.api.C23460b;

/* renamed from: com.ss.android.ugc.aweme.promote.PromoteProgramResponse */
public class PromoteProgramResponse extends BaseResponse {
    @C23460b
    public Boolean confirmed = Boolean.valueOf(false);

    public boolean isConfirmedSuccess() {
        if (this.confirmed == null || !this.confirmed.booleanValue()) {
            return false;
        }
        return true;
    }
}
