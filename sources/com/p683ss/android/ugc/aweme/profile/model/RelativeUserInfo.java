package com.p683ss.android.ugc.aweme.profile.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.RelativeUserInfo */
public class RelativeUserInfo implements Serializable {
    @C17952c(mo34828a = "avatar")
    public UrlModel avatar;
    @C17952c(mo34828a = "uid")
    public String uid;

    public UrlModel getAvatar() {
        return this.avatar;
    }

    public String getUid() {
        return this.uid;
    }

    public void setAvatar(UrlModel urlModel) {
        this.avatar = urlModel;
    }

    public void setUid(String str) {
        this.uid = str;
    }
}
