package com.p683ss.android.ugc.aweme.p1807im.sdk.feedupdate;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.feedupdate.FeedUpdateInfo */
public class FeedUpdateInfo {
    @C17952c(mo34828a = "last_aweme_info")

    /* renamed from: a */
    Object f88288a;
    @C17952c(mo34828a = "aweme_id")
    String aid;
    @C17952c(mo34828a = "author")
    User author;
    @C17952c(mo34828a = "create_time")
    long timeStamp;
    @C17952c(mo34828a = "desc")
    String title;
    @C17952c(mo34828a = "video")
    C34168a videoTemp;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.feedupdate.FeedUpdateInfo$a */
    class C34168a {
        @C17952c(mo34828a = "cover")

        /* renamed from: a */
        public UrlModel f88289a;
    }

    public String getAid() {
        return this.aid;
    }

    public User getAuthor() {
        return this.author;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public String getTitle() {
        return this.title;
    }

    public C34168a getVideoTemp() {
        return this.videoTemp;
    }

    public UrlModel getCoverUrl() {
        if (this.videoTemp == null) {
            return null;
        }
        return this.videoTemp.f88289a;
    }

    public String getUid() {
        if (this.author == null) {
            return null;
        }
        return this.author.getUid();
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setAuthor(User user) {
        this.author = user;
    }

    public void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setVideoTemp(C34168a aVar) {
        this.videoTemp = aVar;
    }
}
