package com.p683ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.FriendNotice */
public class FriendNotice {
    @C17952c(mo34828a = "content")
    private String content;
    @C17952c(mo34828a = "schema_url")
    private String openUrl;
    @C17952c(mo34828a = "type")
    private int type;
    @C17952c(mo34828a = "from_user")
    private User user;

    public String getContent() {
        return this.content;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public int getType() {
        return this.type;
    }

    public User getUser() {
        return this.user;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUser(User user2) {
        this.user = user2;
    }
}
