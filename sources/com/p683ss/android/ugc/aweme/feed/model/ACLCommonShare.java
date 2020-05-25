package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.ACLCommonShare */
public final class ACLCommonShare implements Serializable {
    @C17952c(mo34828a = "code")
    public int code;
    @C17952c(mo34828a = "extra")
    public String extra = "";
    @C17952c(mo34828a = "show_type")
    public int showType = 2;
    @C17952c(mo34828a = "toast_msg")
    public String toastMsg = "";

    public final int getCode() {
        return this.code;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final int getShowType() {
        return this.showType;
    }

    public final String getToastMsg() {
        return this.toastMsg;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setShowType(int i) {
        this.showType = i;
    }

    public final void setToastMsg(String str) {
        this.toastMsg = str;
    }
}
