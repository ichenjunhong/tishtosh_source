package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34388c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.UserExtra */
public class UserExtra {
    @C17952c(mo34828a = "is_disable_show_follow_bar")
    private boolean isDisableShowFollowBar;
    private boolean isSayHelloLogger;
    @C17952c(mo34828a = "uid")
    String uid;

    public UserExtra() {
    }

    public boolean getIsDisableShowFollowBar() {
        return this.isDisableShowFollowBar;
    }

    public boolean getIsSayHelloLogger() {
        return this.isSayHelloLogger;
    }

    public String getUid() {
        return this.uid;
    }

    public void setIsDisableShowFollowBar(boolean z) {
        this.isDisableShowFollowBar = z;
    }

    public void setIsSayHelloLogger(boolean z) {
        this.isSayHelloLogger = z;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public static boolean isDisableShowFollowBar(String str) {
        UserExtra a = C34388c.m78316a().mo72395a(str);
        if (a == null || !a.isDisableShowFollowBar) {
            return false;
        }
        return true;
    }

    public UserExtra(String str, boolean z, boolean z2) {
        this.uid = str;
        this.isDisableShowFollowBar = z;
        this.isSayHelloLogger = z2;
    }
}
