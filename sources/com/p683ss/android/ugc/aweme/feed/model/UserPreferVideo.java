package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;

/* renamed from: com.ss.android.ugc.aweme.feed.model.UserPreferVideo */
public class UserPreferVideo {
    @C17952c(mo34828a = "cover")
    public UrlModel cover;
    @C17952c(mo34828a = "dynamic_cover")
    public UrlModel dynamicCover;
    @C17952c(mo34828a = "gid")
    public String gid;
    @C17952c(mo34828a = "play_addr")
    public UrlModel video;

    public String toString() {
        StringBuilder sb = new StringBuilder("UserPreferVideo{gid='");
        sb.append(this.gid);
        sb.append('\'');
        sb.append(", video=");
        sb.append(this.video);
        sb.append(", cover=");
        sb.append(this.cover);
        sb.append(", dynamicCover=");
        sb.append(this.dynamicCover);
        sb.append('}');
        return sb.toString();
    }
}
