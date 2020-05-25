package com.p683ss.android.ugc.aweme.feed.model.live;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.LiveUser */
public class LiveUser implements Serializable, Cloneable {
    public static final int UNLIVE = 0;
    @C17952c(mo34828a = "avatar_large")
    UrlModel avatarLarger;
    @C17952c(mo34828a = "avatar_medium")
    UrlModel avatarMedium;
    @C17952c(mo34828a = "avatar_thumb")
    UrlModel avatarThumb;
    @C17952c(mo34828a = "follow_info")
    FollowInfo followInfo;
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    long f79736id;
    @C17952c(mo34828a = "nickname")
    String nickname;
    @C17952c(mo34828a = "sec_uid")
    String secUid;
    @C17952c(mo34828a = "short_id")
    long shortId;
    @C17952c(mo34828a = "display_id")
    String uniqueId;

    public String getSecUid() {
        return this.secUid;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }
}
