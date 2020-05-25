package com.p683ss.android.ugc.aweme.friends.model;

import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.friends.model.UnRegisteredUser */
public class UnRegisteredUser {
    @C17952c(mo34828a = "invite_status")
    public int inviteStatus;
    @C17952c(mo34828a = "mobile_id")
    public String mobileId;
    @C17952c(mo34828a = "remark_name")
    public String remarkName;

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof UnRegisteredUser) && TextUtils.equals(this.mobileId, ((UnRegisteredUser) obj).mobileId)) {
            return super.equals(obj);
        }
        return false;
    }
}
