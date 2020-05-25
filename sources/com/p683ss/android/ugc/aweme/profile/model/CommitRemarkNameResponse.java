package com.p683ss.android.ugc.aweme.profile.model;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.profile.model.CommitRemarkNameResponse */
public class CommitRemarkNameResponse {
    @C17952c(mo34828a = "remark_name")
    public String remarkName;
    @C17952c(mo34828a = "status_code")
    public int statusCode;
    @C17952c(mo34828a = "status_msg")
    public String statusMsg;

    public boolean isOK() {
        if (this.statusCode == 0) {
            return true;
        }
        return false;
    }
}
